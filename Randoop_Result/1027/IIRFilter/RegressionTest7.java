package IIRFilter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0);
        double[] doubleArray14 = new double[] { 0, (byte) 10 };
        double[] doubleArray16 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double double11 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) 1L);
        double[] doubleArray12 = new double[] { 'a', 32.0d };
        double[] doubleArray17 = new double[] { 1.0f, 0, 97.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 0.0, 97.0, 100.0]");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(32.0d);
        double[] doubleArray16 = new double[] { 1, ' ', 52.0d, (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 10, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 32.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray22 = new double[] { (-1.0d), 100.0d, 1.0d, 35.0d };
        double[] doubleArray23 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process(35.0d);
        double[] doubleArray8 = new double[] { 100.0f, 1L };
        double[] doubleArray14 = new double[] { 1.0d, (byte) 100, (short) 1, (-1), 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 1.0, -1.0, 100.0]");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray16 = new double[] { (byte) 10, 32.0d, (-1L), 10.0f, (byte) 1, (-1.0f) };
        double[] doubleArray18 = new double[] { (-1) };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 32.0, -1.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray9 = new double[] { 1L, (byte) 0, 10 };
        double[] doubleArray11 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        double[] doubleArray23 = new double[] { (-1.0f) };
        double[] doubleArray29 = new double[] { 0.0d, ' ', 10, (-1.0d), (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 32.0, 10.0, -1.0, -1.0]");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        double double25 = iIRFilter1.process((double) '4');
        double[] doubleArray31 = new double[] { 32.0d, (byte) 1, 100.0d, 10, 1.0f };
        double[] doubleArray32 = new double[] {};
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray22 = new double[] { (byte) 100, 0.0d, (short) 0, 0L, (-1.0f), 32.0d };
        double[] doubleArray29 = new double[] { (byte) 0, (short) -1, (short) 10, (byte) -1, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0, 0.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, -1.0, 10.0, -1.0, 1.0, 10.0]");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray16 = new double[] { 1.0d, (-1.0d), 1, (-1.0f), 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 1.0, -1.0, 10.0]");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        double[] doubleArray26 = new double[] { 10L, (-1), (short) 100, 35.0d };
        double[] doubleArray30 = new double[] { '4', 1.0f, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, -1.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[52.0, 1.0, 10.0]");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        double[] doubleArray23 = new double[] { 'a', (byte) 100, (byte) 0 };
        double[] doubleArray27 = new double[] { 1, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, 0.0]");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process(97.0d);
        double double17 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (-1));
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process((double) 1);
        double[] doubleArray14 = new double[] { (byte) 0, (byte) -1, 10.0d, (short) 0 };
        double[] doubleArray20 = new double[] { 100L, 0L, 1.0f, 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 0.0, 1.0, 1.0, -1.0]");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray23 = new double[] { (short) 0, (short) 1, 52.0d, (-1.0d), 10 };
        double[] doubleArray29 = new double[] { 32.0d, (short) -1, 0.0f, 10.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 52.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[32.0, -1.0, 0.0, 10.0, 1.0]");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((-1.0d));
        double[] doubleArray12 = new double[] {};
        double[] doubleArray18 = new double[] { 100.0f, 'a', 10, (byte) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 97.0, 10.0, 1.0, 0.0]");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process(97.0d);
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray16 = new double[] { 1.0f, 0L, 10.0f, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, 10.0, 35.0]");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process(1.0d);
        double[] doubleArray10 = new double[] { (-1.0f), 1.0d, (-1L), (short) 100 };
        double[] doubleArray15 = new double[] { 0.0d, 10.0d, (byte) 0, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, 0.0, 32.0]");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray14 = new double[] { (-1), (short) 10, (short) -1, 0.0f };
        double[] doubleArray20 = new double[] { 100.0f, (short) 0, 10.0d, 52.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 0.0, 10.0, 52.0, 10.0]");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double[] doubleArray19 = new double[] { (-1.0f), (-1), 100, 100.0f, '#' };
        double[] doubleArray26 = new double[] { (-1.0f), (-1), (short) 0, 0, (-1.0d), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 0.0, 0.0, -1.0, 0.0]");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        double double27 = iIRFilter1.process((double) (short) 100);
        double double29 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray34 = new double[] { (-1), (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray34);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray18 = null;
        double[] doubleArray21 = new double[] { (short) 10, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 1.0]");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray18 = new double[] { ' ', '4', 0.0f, 1.0f };
        double[] doubleArray22 = new double[] { (byte) 10, 0.0f, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 52.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 0.0, 100.0]");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        double double25 = iIRFilter1.process((-1.0d));
        double double27 = iIRFilter1.process((double) 100.0f);
        double double29 = iIRFilter1.process(35.0d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 35.0d + "'", double29 == 35.0d);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double[] doubleArray20 = new double[] { 1.0f, 0.0d, 10.0d, (-1) };
        double[] doubleArray22 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0]");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (byte) 100);
        double double9 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0]");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) '4');
        double double17 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (-1));
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0]");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { 35.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0]");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((-1.0d));
        double[] doubleArray19 = new double[] { 10L, 0.0d, 32.0d, (-1L), (byte) -1 };
        double[] doubleArray23 = new double[] { 100, 0, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0, 32.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 0.0, 100.0]");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process((double) 100.0f);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) 100);
        double[] doubleArray21 = new double[] { (byte) 0, 0L, 1L, (byte) 1, 100.0f };
        double[] doubleArray28 = new double[] { (byte) 1, (-1), (-1.0f), (short) 10, (short) -1, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, -1.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 0);
        double double17 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray21 = new double[] { '#' };
        double[] doubleArray27 = new double[] { 0.0f, 100L, 10L, 32.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 100.0, 10.0, 32.0, -1.0]");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray13 = new double[] { 1.0d, (byte) 100, (byte) 1, 35.0d, (short) 10 };
        double[] doubleArray15 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray18 = new double[] { (short) -1, (byte) -1, 100, 10.0d };
        double[] doubleArray22 = new double[] { (-1.0d), (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 10.0]");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        double[] doubleArray29 = new double[] { 0.0d, 0, (short) 10 };
        double[] doubleArray31 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray29, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0]");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { 1.0d, (-1L) };
        double[] doubleArray18 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0]");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process(32.0d);
        double[] doubleArray13 = new double[] { 10.0d, 100.0d, (short) 0, (short) 10, 10.0d };
        double[] doubleArray20 = new double[] { 97.0d, 100.0d, 97.0d, (-1L), (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 100.0, 97.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 'a');
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) (short) 10);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray19 = new double[] { 10.0f };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process(35.0d);
        double double19 = iIRFilter1.process((double) 100);
        double double21 = iIRFilter1.process(97.0d);
        double[] doubleArray28 = new double[] { 97.0d, 100.0f, 100, 0L, (byte) 0, (byte) 0 };
        double[] doubleArray34 = new double[] { 0.0f, 100.0f, 100L, (-1.0f), 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray34);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 100.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 100.0, 100.0, -1.0, 100.0]");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        double double21 = iIRFilter1.process((double) (short) -1);
        double double23 = iIRFilter1.process((double) (short) -1);
        double double25 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray28 = new double[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0]");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        double double23 = iIRFilter1.process((double) (short) -1);
        double double25 = iIRFilter1.process((double) 10.0f);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 100.0f);
        double double11 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray18 = new double[] { 100L, 1, 100, 0.0f, 35.0d, (byte) 100 };
        double[] doubleArray20 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, 100.0, 0.0, 35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0]");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        double[] doubleArray25 = new double[] { (byte) 100, 10, 100L, 1L, 10L };
        double[] doubleArray31 = new double[] { 1, 0.0d, 100, 10.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 0.0, 100.0, 10.0, -1.0]");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        double[] doubleArray25 = new double[] { ' ', (byte) -1, (-1), (byte) 0, 35.0d };
        double[] doubleArray31 = new double[] { 52.0d, (-1.0d), (short) 10, (byte) 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, -1.0, -1.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, -1.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        double[] doubleArray24 = null;
        double[] doubleArray31 = new double[] { 1.0f, 100.0d, ' ', 0, 0.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, 32.0, 0.0, 0.0, 52.0]");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (short) -1);
        double double17 = iIRFilter1.process(100.0d);
        double[] doubleArray19 = new double[] { 1L };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray20);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray8 = new double[] { (-1.0d), 1L };
        double[] doubleArray13 = new double[] { 10, 0, 0, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 0L);
        double[] doubleArray17 = new double[] { (byte) 10 };
        double[] doubleArray23 = new double[] { (byte) 0, 1L, 10.0f, 1L, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 10.0, 1.0, 1.0]");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (-1.0f));
        double double19 = iIRFilter1.process(100.0d);
        double double21 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process((double) 1);
        double[] doubleArray22 = new double[] { (byte) 10, 1.0d };
        double[] doubleArray25 = new double[] { 10, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0]");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process((double) 0);
        double double15 = iIRFilter1.process(97.0d);
        double[] doubleArray19 = new double[] { 10.0d, (-1.0d), (short) -1 };
        double[] doubleArray26 = new double[] { (-1.0d), 0, (-1.0d), 100, (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, -1.0, 100.0, 0.0, 97.0]");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) '4');
        double[] doubleArray21 = new double[] { 100.0f, 1L, 0.0d, '4', 1.0f };
        double[] doubleArray27 = new double[] { (short) -1, (-1), '4', 97.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 52.0, 97.0, 100.0]");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process(10.0d);
        double[] doubleArray17 = new double[] { (short) 100, 10L, '#', ' ', 35.0d };
        double[] doubleArray22 = new double[] { (short) 10, '4', (-1), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 35.0, 32.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, -1.0, 1.0]");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process(100.0d);
        double double7 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray13 = new double[] { 10.0f, 10, 1L, 35.0d, 100.0f };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0, 35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray20 = new double[] { 10.0d, (byte) 100, (short) 1, 0.0d };
        double[] doubleArray26 = new double[] { 10, 97.0d, (byte) 100, (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 97.0, 100.0, -1.0, 10.0]");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray17 = new double[] { '#', 100.0d, 1, 1.0f, 52.0d };
        double[] doubleArray22 = new double[] { 0, (byte) 100, (short) 100, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 100.0, 1.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 100.0, 100.0, 1.0]");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        double double23 = iIRFilter1.process(0.0d);
        double[] doubleArray25 = new double[] { 0.0f };
        double[] doubleArray28 = new double[] { ' ', (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, -1.0]");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray18 = new double[] { 100.0f, (byte) 0, 10L, 10, (byte) 100, 32.0d };
        double[] doubleArray23 = new double[] { 0.0f, 35.0d, 0.0f, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0, 10.0, 10.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 35.0, 0.0, 97.0]");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray14 = new double[] { 1L, 35.0d, 1, '#' };
        double[] doubleArray17 = new double[] { ' ', 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 35.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 1.0]");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        double[] doubleArray21 = new double[] { (short) 10 };
        double[] doubleArray24 = new double[] { 0L, 35.0d };
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 35.0]");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray17 = new double[] { 10.0d, 0L, 1.0d, 0.0d, (byte) 1, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 0.0, 1.0, 0.0, 1.0, 97.0]");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray17 = new double[] { 100.0f, 10, 1.0d };
        double[] doubleArray23 = new double[] { 0L, 10.0f, 10.0f, (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray23);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 10.0, 10.0, 1.0, -1.0]");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray17 = new double[] { 35.0d, (-1L), 100.0f };
        double[] doubleArray20 = new double[] { 100, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 32.0]");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray12 = new double[] { (byte) 100, 100.0d };
        double[] doubleArray18 = new double[] { 100.0d, 0, 10.0d, '4', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0, 10.0, 52.0, -1.0]");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) 'a');
        double[] doubleArray17 = new double[] { 100.0d };
        double[] doubleArray19 = new double[] { (-1L) };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0L);
        double[] doubleArray14 = new double[] { 35.0d, 100L, (byte) -1, 0, 1, 0.0f };
        double[] doubleArray18 = new double[] { (short) 0, 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, -1.0, 0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 100.0]");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process((double) ' ');
        double[] doubleArray20 = new double[] {};
        double[] doubleArray26 = new double[] { (byte) 1, (byte) -1, (short) 10, 35.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, 10.0, 35.0, 100.0]");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        double[] doubleArray26 = new double[] { 100.0d, 1L, 1.0f, 10, 0.0f, (-1L) };
        double[] doubleArray28 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
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
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, 1.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0]");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double[] doubleArray11 = new double[] { 0L, 10.0f, 1L };
        double[] doubleArray16 = new double[] { 10.0d, 0.0d, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 0.0, 10.0, 0.0]");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray17 = new double[] { 0, (short) 100, 10, 0, 10 };
        double[] doubleArray24 = new double[] { '4', (short) 0, (short) -1, 100.0d, (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 100.0, 10.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[52.0, 0.0, -1.0, 100.0, -1.0, 32.0]");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 1);
        double[] doubleArray12 = new double[] { (short) 10, ' ' };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray21 = new double[] { (-1L), (short) 1, 10, 1, (byte) 100 };
        double[] doubleArray26 = new double[] { (short) 0, 10, 1L, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 10.0, 1.0, 32.0]");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) '4');
        double[] doubleArray10 = null;
        double[] doubleArray15 = new double[] { 'a', 100.0f, 35.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 100.0, 35.0, 0.0]");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(97.0d);
        double[] doubleArray11 = new double[] { (short) 1, 10, 0L, 10L, (byte) -1 };
        double[] doubleArray16 = new double[] { (short) -1, 35.0d, (-1), 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0, 0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 35.0, -1.0, 10.0]");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 'a');
        double[] doubleArray17 = new double[] { (short) 0, (byte) -1, 0.0f };
        double[] doubleArray20 = new double[] { 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0]");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(32.0d);
        double double7 = iIRFilter1.process((double) '4');
        double double9 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray19 = new double[] { 100L, (short) 10, ' ', 32.0d, 10 };
        double[] doubleArray22 = new double[] { (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 32.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 1.0]");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) (short) -1);
        double double17 = iIRFilter1.process(100.0d);
        double double19 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double[] doubleArray12 = new double[] { (-1.0d), (-1.0f), 0L, 'a', 10L, 1 };
        double[] doubleArray15 = new double[] { (byte) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 0.0, 97.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 0.0]");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        double double21 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process(35.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray23 = new double[] { 100, (-1), 1.0f, (short) 0, (short) 10 };
        double[] doubleArray25 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, -1.0, 1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0]");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double[] doubleArray8 = new double[] { 100.0d, 1.0d };
        double[] doubleArray11 = new double[] { (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0]");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0]");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double[] doubleArray14 = new double[] { 0.0f, 0.0d, 100, (short) 1, 100, 100 };
        double[] doubleArray20 = new double[] { (byte) 0, 0.0f, 100.0f, (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 100.0, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 100.0, 10.0, 10.0]");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) '4');
        double double15 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray20 = new double[] { (-1L), 1L, (short) 100, 1.0d, 100.0d, (-1.0d) };
        double[] doubleArray25 = new double[] { (-1), 0, 1L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 1.0, 100.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 1.0, 10.0]");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process((double) 1L);
        double[] doubleArray11 = new double[] { 100L };
        double[] doubleArray16 = new double[] { (byte) 0, 0L, 1L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 1.0, 97.0]");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((-1.0d));
        double[] doubleArray16 = new double[] {};
        double[] doubleArray21 = new double[] { (short) 0, (short) 0, 100.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 100.0, 10.0]");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        double[] doubleArray23 = new double[] { 1, (-1.0d), 100.0f };
        double[] doubleArray27 = new double[] { 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, -1.0, 10.0]");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        double[] doubleArray22 = new double[] {};
        double[] doubleArray26 = new double[] { 52.0d, 97.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, 97.0, 100.0]");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double[] doubleArray12 = new double[] {};
        double[] doubleArray19 = new double[] { 100, 'a', (-1), 10.0d, 10.0f, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 97.0, -1.0, 10.0, 10.0, 100.0]");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 10L);
        double[] doubleArray16 = new double[] { (-1), (short) 1, '4', 97.0d };
        double[] doubleArray19 = new double[] { (-1.0d), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 1.0, 52.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(97.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        double double27 = iIRFilter1.process((double) 1);
        double double29 = iIRFilter1.process((-1.0d));
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        double double23 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(97.0d);
        double[] doubleArray15 = new double[] { (short) 1 };
        double[] doubleArray18 = new double[] { (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 97.0]");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (short) 1);
        double double9 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray12 = null;
        double[] doubleArray16 = new double[] { (byte) 100, (short) 10, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0, 97.0]");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray12 = new double[] { (short) 1, (byte) 100 };
        double[] doubleArray17 = new double[] { '#', (byte) 100, 1L, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 100.0, 1.0, 97.0]");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray20 = new double[] { (-1), (-1.0f), '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 52.0]");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        java.lang.Class<?> wildcardClass30 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray19 = new double[] { (short) -1, 10.0d, 1L };
        double[] doubleArray23 = new double[] { 1.0f, (byte) 0, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray23);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 0.0, 1.0]");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) ' ');
        double[] doubleArray14 = new double[] { ' ', 10L, (byte) 0, 0.0d };
        double[] doubleArray16 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((double) 100.0f);
        double double11 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        double double23 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        double[] doubleArray23 = new double[] { (-1L), 100, 'a' };
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((-1.0d));
        double[] doubleArray22 = new double[] { (short) 10, (byte) -1, (-1.0f), 0.0d };
        double[] doubleArray28 = new double[] { '#', 0, 1.0d, 0L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 0.0, 1.0, 0.0, -1.0]");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) '4');
        double[] doubleArray13 = new double[] { 10, (byte) 10, '4' };
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 52.0]");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double[] doubleArray11 = new double[] { (short) 0, 10.0f, 52.0d };
        double[] doubleArray13 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
        double double29 = iIRFilter1.process(1.0d);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((-1.0d));
        double[] doubleArray9 = new double[] { (-1), ' ', '4' };
        double[] doubleArray13 = new double[] { 100L, 1L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 32.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, 10.0]");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1L);
        double[] doubleArray14 = new double[] { ' ', 'a' };
        double[] doubleArray20 = new double[] { (short) 10, 0.0d, 0.0f, (short) 10, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 0.0, 0.0, 10.0, -1.0]");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) ' ');
        double[] doubleArray24 = new double[] { 1L, 10.0f, (-1.0d), (-1L), 32.0d, (short) 0 };
        double[] doubleArray30 = new double[] { (byte) 100, (byte) -1, (-1.0f), 1.0d, 1.0d };
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 10.0, -1.0, -1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, -1.0, -1.0, 1.0, 1.0]");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(100.0d);
        double[] doubleArray26 = new double[] { (byte) 100, (short) 10, ' ', 97.0d, 0, (byte) 0 };
        double[] doubleArray33 = new double[] { 0.0d, 32.0d, 35.0d, (short) 0, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 10.0, 32.0, 97.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 32.0, 35.0, 0.0, 100.0, 100.0]");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray14 = null;
        double[] doubleArray21 = new double[] { 10, '4', (short) 1, (-1), 52.0d, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0, -1.0, 52.0, 52.0]");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(52.0d);
        double[] doubleArray18 = new double[] { 0.0d, 100.0f, (byte) 100, 10L, 1.0d, '#' };
        double[] doubleArray25 = new double[] { (-1L), 0.0f, ' ', 97.0d, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 100.0, 100.0, 10.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 32.0, 97.0, 100.0, 10.0]");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray13 = new double[] { 32.0d, 100.0f, (byte) 100, (-1.0d), 0 };
        double[] doubleArray15 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 100.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process(100.0d);
        double double7 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray12 = new double[] { 1.0f, (-1.0f), 'a', '4' };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        double[] doubleArray25 = new double[] { 1.0f, (short) 10, (short) 10, 100.0d, (short) 0 };
        double[] doubleArray29 = new double[] { (-1.0f), 100.0f, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 10.0]");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) (-1.0f));
        double double19 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 'a');
        double[] doubleArray19 = new double[] { (-1.0d), ' ', (short) 10, 1.0f, (byte) 10 };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 32.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) ' ');
        double[] doubleArray18 = new double[] {};
        double[] doubleArray22 = new double[] { (byte) 10, 0, (short) 0 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 0.0, 0.0]");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) ' ');
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { (byte) -1, 100.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 100.0]");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(52.0d);
        double[] doubleArray18 = new double[] { 35.0d, (-1.0f), 'a', (short) 0, (byte) 1, '4' };
        double[] doubleArray21 = new double[] { 10L, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, -1.0, 97.0, 0.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 32.0]");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray16 = new double[] { 1L, 1, (-1L), 1, 100.0d, 10L };
        double[] doubleArray21 = new double[] { (short) 0, 10.0d, '4', 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, -1.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 10.0, 52.0, 0.0]");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        double double25 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray28 = new double[] { (short) 0, (-1.0f) };
        double[] doubleArray35 = new double[] { 1.0f, (-1.0d), 100L, (byte) 100, (-1.0d), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray35);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, -1.0, 100.0, 100.0, -1.0, 10.0]");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray14 = new double[] { (-1.0f), 100 };
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0]");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray17 = new double[] { 100L };
        double[] doubleArray19 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray19);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray18 = new double[] { 0L, 1, 0L, 1.0f, 1.0f, (short) -1 };
        double[] doubleArray25 = new double[] { (byte) -1, (short) 1, 32.0d, 10, (-1.0f), 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0, 0.0, 1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0, 32.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) '4');
        double[] doubleArray10 = null;
        double[] doubleArray16 = new double[] { (byte) 10, 100L, '#', (byte) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0, 35.0, 1.0, 1.0]");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process(97.0d);
        double[] doubleArray21 = new double[] { 100 };
        double[] doubleArray27 = new double[] { (short) 0, (-1.0f), '#', 100.0f, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, -1.0, 35.0, 100.0, 10.0]");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        double double25 = iIRFilter1.process((double) 0.0f);
        double double27 = iIRFilter1.process(0.0d);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray16 = new double[] { 10.0d, 1.0d };
        double[] doubleArray20 = new double[] { (-1L), 0.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process(100.0d);
        double[] doubleArray16 = new double[] { 32.0d, 'a', 35.0d, 'a', 10.0f, 1.0d };
        double[] doubleArray22 = new double[] { 0, ' ', 100.0f, 10, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 97.0, 35.0, 97.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 32.0, 100.0, 10.0, 97.0]");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(1.0d);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray13 = new double[] { 35.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 1.0]");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray18 = new double[] { 52.0d, (byte) 10, (-1.0d), 35.0d };
        double[] doubleArray24 = new double[] { 0, (byte) 0, 'a', 10, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 10.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 97.0, 10.0, 52.0]");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray23 = new double[] { 97.0d, 100L, 1.0d, 97.0d, 0.0f };
        double[] doubleArray29 = new double[] { 10.0f, 52.0d, 10L, (-1.0f), 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray29);
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 100.0, 1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray21 = new double[] { (short) 100, 100.0f, 97.0d, (short) 100, '4' };
        double[] doubleArray23 = new double[] { 0 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 97.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process((double) 100);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1L);
        double[] doubleArray14 = new double[] { (-1.0f), (-1.0d), 97.0d, '4' };
        double[] doubleArray19 = new double[] { (byte) 100, (-1), (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, -1.0, -1.0, 32.0]");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray8 = new double[] { 10L, 1, (byte) -1, 52.0d };
        double[] doubleArray13 = new double[] { 1L, (short) 100, (-1.0d), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 1.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 1.0]");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) ' ');
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        double[] doubleArray23 = new double[] { 100 };
        double[] doubleArray26 = new double[] { 10.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 10.0]");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray10 = new double[] { 10, (short) 1 };
        double[] doubleArray14 = new double[] { (byte) 0, 1.0d, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0, 0.0]");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        double double21 = iIRFilter1.process(0.0d);
        double[] doubleArray28 = new double[] { 1, (-1.0d), '#', 1.0f, 35.0d, 10L };
        double[] doubleArray31 = new double[] { (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, 35.0, 1.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 35.0]");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray19 = new double[] { 32.0d, 32.0d, (short) 100, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 32.0, 100.0, -1.0]");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) ' ');
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray13 = new double[] { 32.0d };
        double[] doubleArray18 = new double[] { 10, 100.0f, (-1.0d), 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0, -1.0, 100.0]");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        double[] doubleArray22 = new double[] {};
        double[] doubleArray28 = new double[] { (byte) 100, 0.0d, 0, (byte) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 0.0, 0.0, 100.0, 10.0]");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double[] doubleArray15 = new double[] { '4', 0L, 0.0d };
        double[] doubleArray19 = new double[] { (byte) 0, 10.0f, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 10.0]");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((-1.0d));
        double[] doubleArray18 = new double[] { '#', 100.0f, 100L, ' ', (short) 0, 10.0f };
        double[] doubleArray24 = new double[] { 0.0d, 0, (short) 1, (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 100.0, 100.0, 32.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 1.0, 1.0, -1.0]");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) (short) -1);
        double double5 = iIRFilter1.process((double) (-1.0f));
        double double7 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray14 = new double[] { 52.0d, 100, 100.0f, 1.0d, 10.0d, (byte) -1 };
        double[] doubleArray20 = new double[] { 100.0f, (short) 10, ' ', 52.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, 100.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 10.0, 32.0, 52.0, 100.0]");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        double double21 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray19 = new double[] { (-1.0d), (byte) 0, 0.0d };
        double[] doubleArray20 = new double[] {};
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        double[] doubleArray26 = new double[] { (-1.0f), '4', (byte) 10, (-1.0d) };
        double[] doubleArray33 = new double[] { ' ', 97.0d, (byte) 100, 10.0d, (byte) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
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
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 52.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 97.0, 100.0, 10.0, 100.0, 32.0]");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 'a');
        double[] doubleArray15 = new double[] { 10.0f, 1.0d, (short) 10 };
        double[] doubleArray17 = new double[] { 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0]");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
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
        double[] doubleArray22 = new double[] { (byte) 10, (short) 100 };
        double[] doubleArray24 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray24);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0]");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        double double25 = iIRFilter1.process(35.0d);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { '#', (byte) 0 };
        double[] doubleArray21 = new double[] { (-1), (-1L), '4', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 52.0, 100.0]");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray13 = new double[] { ' ' };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bCoeffs must be of size 1, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double double7 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray11 = new double[] { (short) 1, 100.0d, 35.0d };
        double[] doubleArray17 = new double[] { (short) 10, (byte) -1, (byte) -1, 0.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray17 = new double[] { 10.0f, 10L, 10.0d, 0, '#' };
        double[] doubleArray24 = new double[] { (short) 1, (byte) 10, 0.0f, 10, 100, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 10.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 10.0, 0.0, 10.0, 100.0, 10.0]");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(10.0d);
        double[] doubleArray16 = new double[] { (short) 100, (-1) };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, -1.0]");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(100.0d);
        double double21 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray24 = new double[] { 10L, 100L };
        double[] doubleArray25 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray18 = new double[] { 10.0f, '#' };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        double double21 = iIRFilter1.process((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray16 = new double[] { (short) 100, 10, (short) 0, (short) 10 };
        double[] doubleArray19 = new double[] { 10L, (short) 10 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0]");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) 100L);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        double double21 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray22 = null;
        double[] doubleArray27 = new double[] { (byte) -1, 0.0d, 1.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 1.0, 100.0]");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(32.0d);
        double[] doubleArray9 = new double[] { (-1.0d) };
        double[] doubleArray16 = new double[] { 100.0f, (byte) 100, 10.0d, 100L, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, 10.0, 100.0, 1.0, 100.0]");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray18 = new double[] { 10.0d, 0L };
        double[] doubleArray25 = new double[] { (short) 1, 0.0f, 'a', ' ', 1.0d, (byte) 1 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 0.0, 97.0, 32.0, 1.0, 1.0]");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double[] doubleArray19 = new double[] { (-1), (byte) 10, 35.0d, (-1.0f), (short) 0 };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 35.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        double[] doubleArray22 = new double[] {};
        double[] doubleArray29 = new double[] { 1.0f, 1, '#', 0.0d, (byte) 0, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 0");
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 1.0, 35.0, 0.0, 0.0, -1.0]");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double double9 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray12 = new double[] { 97.0d, 52.0d };
        double[] doubleArray18 = new double[] { 35.0d, 100.0d, (byte) 100, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 100.0, 100.0, 32.0, 100.0]");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0L);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray12 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
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
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray8 = null;
        double[] doubleArray11 = new double[] { 10.0d, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 97.0]");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(32.0d);
        double double7 = iIRFilter1.process((double) '4');
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process(97.0d);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray18 = new double[] { 10L, '4', 52.0d, 0.0d };
        double[] doubleArray20 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray16 = new double[] { 10L, 'a', 1.0f, 0.0d, 10, 1 };
        double[] doubleArray22 = new double[] { 'a', (byte) 1, 100L, '#', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 97.0, 1.0, 0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 1.0, 100.0, 35.0, 10.0]");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double[] doubleArray11 = new double[] { 1 };
        double[] doubleArray18 = new double[] { 'a', (-1L), '4', '#', 97.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, -1.0, 52.0, 35.0, 97.0, 35.0]");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        double double27 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray28 = null;
        double[] doubleArray30 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        double double21 = iIRFilter1.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) (byte) 100);
        double double15 = iIRFilter1.process((double) (short) 10);
        double double17 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double[] doubleArray6 = new double[] { 10.0f, 100.0f };
        double[] doubleArray11 = new double[] { 10L, (-1.0f), (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0, 100.0, 1.0]");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
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
        double[] doubleArray24 = new double[] { (-1), (-1.0d), 35.0d, 10.0f };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray18 = null;
        double[] doubleArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process(1.0d);
        double[] doubleArray17 = new double[] { 10L, 100, 1.0d };
        double[] doubleArray21 = new double[] { (short) 100, 'a', (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 97.0, -1.0]");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(32.0d);
        double[] doubleArray15 = new double[] { (byte) 0, '#', 0L };
        double[] doubleArray21 = new double[] { (short) 1, (-1L), 0, 100.0d, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, -1.0, 0.0, 100.0, 0.0]");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process(1.0d);
        double[] doubleArray23 = new double[] { (byte) 100, 10.0d, 10L };
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray24);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        double[] doubleArray30 = new double[] { (short) 100, (byte) 1, ' ', 100.0f, (-1), 0.0f };
        double[] doubleArray36 = new double[] { (short) 10, 100, 1.0f, (short) 1, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray36);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, 32.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 100.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(52.0d);
        double[] doubleArray14 = new double[] { 1.0d, 10 };
        double[] doubleArray19 = new double[] { (short) 1, (short) 100, 100.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 100.0, 10.0]");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 1L);
        double[] doubleArray14 = new double[] { (short) -1, 0.0f };
        double[] doubleArray17 = new double[] { (short) 1, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0]");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray9 = new double[] { 1.0f, 97.0d, (short) -1 };
        double[] doubleArray16 = new double[] { (short) 100, (short) 1, (short) -1, 0.0d, '#', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0, 0.0, 35.0, -1.0]");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process((double) 0);
        double[] doubleArray14 = new double[] { (short) 0, (-1.0d), 100, 'a', (-1L), (short) -1 };
        double[] doubleArray16 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, -1.0, 100.0, 97.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process((double) (byte) 10);
        double double21 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray10 = new double[] { 35.0d, 100 };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray20 = new double[] { 10, 10.0d };
        double[] doubleArray24 = new double[] { 1L, (short) -1, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0, 35.0]");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double[] doubleArray14 = new double[] { (short) 1, (byte) -1 };
        double[] doubleArray19 = new double[] { 10.0f, 52.0d, 1.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0, 0.0]");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray21 = new double[] { 32.0d, 10.0d, 0.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 10.0, 0.0, 100.0]");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray7 = new double[] { (short) 100 };
        double[] doubleArray9 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0]");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(100.0d);
        double[] doubleArray16 = new double[] { 'a', (short) 100, (short) 0, (-1.0d), (short) 1, 0L };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0, 0.0, -1.0, 1.0, 0.0]");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process(32.0d);
        double double19 = iIRFilter1.process((double) 10L);
        double double21 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray19 = new double[] { 1.0f, 0, (-1L), (short) 0, 35.0d };
        double[] doubleArray22 = new double[] { (byte) 100, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 0.0, -1.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0]");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process((double) 100);
        double double19 = iIRFilter1.process(100.0d);
        double[] doubleArray23 = new double[] { 1, (short) 1, 52.0d };
        double[] doubleArray25 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0]");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) (short) 100);
        double double11 = iIRFilter1.process((double) '#');
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0]");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process(97.0d);
        double[] doubleArray24 = new double[] { 100.0d, 97.0d, (short) 1, 100 };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) 10, 10, (short) 10, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 97.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 10.0, 10.0, 1.0, 10.0]");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray16 = new double[] { 0.0f, 100.0d };
        double[] doubleArray21 = new double[] { 100.0d, (short) 1, 0, 0 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, 0.0, 0.0]");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { 1.0d, 0, (byte) -1, (-1.0f), 52.0d, 1L };
        double[] doubleArray21 = new double[] { 52.0d, 0L, 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, -1.0, -1.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 0.0, 100.0, -1.0]");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process(1.0d);
        double double19 = iIRFilter1.process((double) 10);
        double[] doubleArray23 = new double[] { 1L, 0, 100.0f };
        double[] doubleArray26 = new double[] { 97.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 10.0]");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 0);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0]");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process(35.0d);
        double[] doubleArray12 = new double[] { (-1), 0 };
        double[] doubleArray16 = new double[] { 100, 100L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, 100.0]");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) '4');
        double double7 = iIRFilter1.process((double) (byte) 100);
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray22 = new double[] { 10, (-1.0f), (short) 10, 35.0d, (-1.0d), 10.0d };
        double[] doubleArray26 = new double[] { 1, 1, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, 10.0, 35.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, 97.0]");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 100);
        double double9 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (byte) 100);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((double) (-1));
        double[] doubleArray21 = new double[] { (byte) 100, 'a', 10, (short) 1, (short) -1 };
        double[] doubleArray27 = new double[] { 0L, 0.0f, 1, (byte) 10, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 97.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 0.0, 1.0, 10.0, 52.0]");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray21 = new double[] { 0.0f, (-1L), (short) 10, (byte) 0, 35.0d };
        double[] doubleArray25 = new double[] { 52.0d, 35.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0, 10.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 35.0, 1.0]");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
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
        double double21 = iIRFilter1.process(0.0d);
        double[] doubleArray24 = new double[] { '#', (byte) 1 };
        double[] doubleArray30 = new double[] { 0.0d, (-1.0f), (short) 100, 97.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, -1.0, 100.0, 97.0, 0.0]");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
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
        double double21 = iIRFilter1.process(10.0d);
        double[] doubleArray24 = new double[] { 'a', 1L };
        double[] doubleArray27 = new double[] { (byte) -1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0]");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { (-1.0d), (short) -1, 1L, 10L, (-1.0d), 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 1.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { (-1.0f), 1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0, -1.0]");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray15 = new double[] { 100, (byte) -1, 10.0d };
        double[] doubleArray21 = new double[] { 1.0f, (short) 10, (short) 10, (-1.0f), 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 10.0, -1.0, 32.0]");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process(1.0d);
        double[] doubleArray18 = new double[] { 0, (byte) 0, '#', 35.0d };
        double[] doubleArray23 = new double[] { (byte) 1, 100.0d, (-1L), 10 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 35.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0, -1.0, 10.0]");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) 100L);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray22 = new double[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double[] doubleArray13 = new double[] { 10.0f };
        double[] doubleArray14 = new double[] {};
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray17 = new double[] { 1, ' ', (short) 10 };
        double[] doubleArray23 = new double[] { (short) 10, 10.0f, 0L, 100L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 0.0, 100.0, -1.0]");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10);
        double[] doubleArray19 = new double[] { 100.0d, 35.0d, 100.0f };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 35.0, 100.0]");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray17 = new double[] { (-1), (byte) -1, (byte) 10 };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double[] doubleArray14 = new double[] { 97.0d, (-1) };
        double[] doubleArray20 = new double[] { '4', 100.0f, (byte) 0, 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 100.0, 0.0, 10.0, 10.0]");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (-1L));
        double[] doubleArray16 = new double[] { 32.0d, ' ', 'a', 0L, 1.0f, '4' };
        double[] doubleArray21 = new double[] { 0, 100.0f, 0.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 32.0, 97.0, 0.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 100.0, 0.0, 35.0]");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 100.0f);
        double double17 = iIRFilter1.process((double) 100);
        double[] doubleArray24 = new double[] { 0L, 1.0f, (-1.0d), (short) 1, (short) 10, 'a' };
        double[] doubleArray27 = new double[] { 100L, 97.0d };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0, -1.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 97.0]");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
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
        double double25 = iIRFilter1.process(52.0d);
        double[] doubleArray32 = new double[] { 52.0d, (byte) 100, ' ', 10, '#', (byte) -1 };
        double[] doubleArray33 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray32, doubleArray33);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[52.0, 100.0, 32.0, 10.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
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
        double double23 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray16 = new double[] { 100.0f, (short) 100, (-1.0f), ' ' };
        double[] doubleArray19 = new double[] { (byte) 1, (byte) 10 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0]");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double[] doubleArray13 = new double[] { 10, 1.0d, (short) 1, (byte) 1, (-1.0f) };
        double[] doubleArray15 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (short) 0);
        double double19 = iIRFilter1.process((double) ' ');
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((-1.0d));
        double double17 = iIRFilter1.process((double) 10L);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray25 = new double[] { (-1), 0L, 10.0f, (short) 0, 1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0, 0.0, 1.0, 100.0]");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process(1.0d);
        double double7 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        double double23 = iIRFilter1.process((double) 0);
        double[] doubleArray28 = new double[] { (byte) -1, ' ', 1, (-1) };
        double[] doubleArray30 = new double[] { ' ' };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0]");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        double double21 = iIRFilter1.process(0.0d);
        double[] doubleArray27 = new double[] { 35.0d, (-1L), ' ', (short) 100, '4' };
        double[] doubleArray33 = new double[] { (byte) 0, (-1.0f), 10L, 1.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray33);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, -1.0, 32.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, -1.0, 10.0, 1.0, 0.0]");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray20 = new double[] { 10, (-1L), 32.0d, (byte) 100 };
        double[] doubleArray26 = new double[] { (short) 10, 52.0d, (short) 10, (-1.0f), (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 10.0, -1.0, -1.0]");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process(1.0d);
        double[] doubleArray20 = new double[] { (-1.0f), ' ', (-1L), '4', 'a', 10.0f };
        double[] doubleArray25 = new double[] { 52.0d, 0.0d, (short) -1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray25);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 32.0, -1.0, 52.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 0.0, -1.0, 1.0]");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
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
        double[] doubleArray24 = new double[] { (short) 100, 100L, (byte) 0, 0.0d };
        double[] doubleArray29 = new double[] { (-1.0d), (-1L), (-1L), (-1L) };
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, -1.0]");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(52.0d);
        double[] doubleArray18 = new double[] { '4', 0.0d, 0, (short) -1, 10L, 100 };
        double[] doubleArray20 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 0.0, 0.0, -1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process(35.0d);
        double[] doubleArray9 = new double[] { '#' };
        double[] doubleArray13 = new double[] { (-1L), 10.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0]");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray20 = new double[] { (byte) 0, (short) 10, 1.0d, 0, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 10.0, 1.0, 0.0, 100.0]");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
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
        double double25 = iIRFilter1.process((double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        double[] doubleArray26 = new double[] { (short) -1, (byte) 1, (byte) 0, 100L };
        double[] doubleArray32 = new double[] { 100, (short) 1, (-1), (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray32);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, -1.0, 100.0, 1.0]");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        double[] doubleArray27 = new double[] { 10, 100L, 32.0d };
        double[] doubleArray32 = new double[] { 1, 32.0d, 1.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray32);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 32.0, 1.0, 52.0]");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
        double double25 = iIRFilter1.process((double) 100);
        double[] doubleArray32 = new double[] { 35.0d, (short) 10, 1.0f, (short) 100, 10.0d, '4' };
        double[] doubleArray35 = new double[] { 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray32, doubleArray35);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[35.0, 10.0, 1.0, 100.0, 10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0]");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 10);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray20 = new double[] { 1.0d, (byte) 10, (byte) 0 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0, 0.0]");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        double[] doubleArray31 = new double[] { 10, (short) 10, (short) 1, (short) 0, 52.0d };
        double[] doubleArray38 = new double[] { (-1), 10, (-1.0f), (short) 0, 1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray31, doubleArray38);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 1.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 10.0, -1.0, 0.0, 1.0, -1.0]");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (short) 1);
        double double9 = iIRFilter1.process((double) 1);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray16 = new double[] { (byte) 10, ' ', 100.0f, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 32.0, 100.0, 97.0, -1.0]");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process((double) 0);
        double[] doubleArray12 = new double[] { 35.0d, 0L, '#', 52.0d };
        double[] doubleArray17 = new double[] { 'a', 10.0d, 10L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 0.0, 35.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 10.0, 10.0, 0.0]");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 0);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray21 = new double[] { 1L };
        double[] doubleArray23 = new double[] { '#' };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0]");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
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
        double double25 = iIRFilter1.process(100.0d);
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
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        double double25 = iIRFilter1.process((double) (short) 100);
        double double27 = iIRFilter1.process((double) (-1));
        double double29 = iIRFilter1.process(35.0d);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray33 = new double[] { (short) 10, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray33);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 35.0d + "'", double29 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 35.0]");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((double) 100.0f);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray20 = new double[] { (byte) 0, (short) 1, (-1), 32.0d };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10L);
        double[] doubleArray7 = new double[] { 0.0f };
        double[] doubleArray14 = new double[] { 1, 10L, 0, 100.0d, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0, 0.0, 100.0, 1.0, 10.0]");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray17 = new double[] { 10, 100.0f, 0.0f, 1.0f, 0L };
        double[] doubleArray21 = new double[] { ' ', 1L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 1.0, 52.0]");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        double double23 = iIRFilter1.process((double) 10);
        double[] doubleArray30 = new double[] { (byte) -1, 97.0d, 0L, 1L, 100.0f, 10.0f };
        double[] doubleArray31 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 97.0, 0.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double[] doubleArray4 = new double[] { 100.0d, 35.0d };
        double[] doubleArray9 = new double[] { 10L, 0, 52.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 0.0, 52.0, 100.0]");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
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
        double double21 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray21 = new double[] { (byte) -1, 100L, 100.0d };
        double[] doubleArray27 = new double[] { '#', (byte) 10, (-1), 1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 10.0, -1.0, 1.0, -1.0]");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) '4');
        double double7 = iIRFilter1.process((double) (byte) 100);
        double double9 = iIRFilter1.process((double) 'a');
        double[] doubleArray11 = new double[] { '4' };
        double[] doubleArray17 = new double[] { (short) -1, (short) 1, ' ', '4', 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 32.0, 52.0, 97.0]");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process((double) (-1));
        double[] doubleArray17 = new double[] { (-1L), 0.0f, 1 };
        double[] doubleArray21 = new double[] { 0.0f, ' ', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 32.0, 10.0]");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(100.0d);
        double[] doubleArray14 = null;
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 0);
        double[] doubleArray21 = new double[] { (-1), 32.0d, 52.0d, 100.0d, 'a' };
        double[] doubleArray23 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 32.0, 52.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0]");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 1);
        double double9 = iIRFilter1.process((double) '4');
        double[] doubleArray15 = new double[] { 52.0d, 'a', 0, 1L, (byte) 0 };
        double[] doubleArray22 = new double[] { ' ', (-1.0d), (byte) 100, (byte) 10, (byte) 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, 97.0, 0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, -1.0, 100.0, 10.0, 10.0, 100.0]");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        double double29 = iIRFilter1.process((double) 0L);
        double[] doubleArray34 = new double[] { 1.0d, (byte) 10, (byte) -1, (short) 1 };
        double[] doubleArray37 = new double[] { (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray34, doubleArray37);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 32.0d + "'", double27 == 32.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0]");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray11 = new double[] { 10 };
        double[] doubleArray13 = new double[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        double double29 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray35 = new double[] { 100, 100.0f, 10L, 10, (short) -1 };
        double[] doubleArray36 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray35, doubleArray36);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
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
        double[] doubleArray23 = new double[] { ' ', 10.0d, (short) 0 };
        double[] doubleArray25 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray25);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        double double23 = iIRFilter1.process((double) 1L);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(52.0d);
        double[] doubleArray14 = new double[] { 10L, 10 };
        double[] doubleArray21 = new double[] { (short) 0, (-1L), (-1.0f), (-1L), (-1.0d), 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0, -1.0, -1.0, -1.0, 32.0]");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray21 = new double[] { (short) 1, (short) 0, (short) -1, 35.0d, 32.0d };
        double[] doubleArray28 = new double[] { ' ', ' ', '4', (byte) 10, 35.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 0.0, -1.0, 35.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 32.0, 52.0, 10.0, 35.0, 10.0]");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) (byte) 100);
        double double11 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray19 = new double[] { 1.0f, 0.0d, '4', 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 0.0, 52.0, 100.0]");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10);
        double[] doubleArray9 = new double[] { (byte) -1, 35.0d, 1.0f };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 35.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray10 = new double[] { (byte) 1, (short) 0 };
        double[] doubleArray14 = new double[] { (short) -1, (-1.0f), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0]");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass4 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        double[] doubleArray23 = new double[] { 97.0d };
        double[] doubleArray30 = new double[] { 1, (byte) 10, 0.0d, (byte) 10, 52.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0, 0.0, 10.0, 52.0, 1.0]");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray17 = new double[] { 0, 0, 52.0d };
        double[] doubleArray23 = new double[] { 1.0d, (-1L), (short) 100, 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, -1.0, 100.0, 10.0, 0.0]");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(10.0d);
        double[] doubleArray12 = new double[] { (byte) 10, ' ', 100, 52.0d };
        double[] doubleArray17 = new double[] { 97.0d, (short) 100, 0.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 32.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
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
        double double23 = iIRFilter1.process((double) 0.0f);
        double double25 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass26 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(100.0d);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { 'a', (short) 1, 100L, 1L, (-1.0d), 'a' };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 1.0, 100.0, 1.0, -1.0, 97.0]");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 'a');
        double[] doubleArray12 = new double[] {};
        double[] doubleArray16 = new double[] { (byte) -1, (byte) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 10.0]");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray15 = new double[] { ' ' };
        double[] doubleArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0]");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) '4');
        double double5 = iIRFilter1.process((double) '4');
        double double7 = iIRFilter1.process((double) (byte) 100);
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) (-1L));
        double[] doubleArray24 = new double[] { 1.0d, 0.0f, (byte) -1, 100, (short) 100, 0.0f };
        double[] doubleArray26 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 0.0, -1.0, 100.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray20 = new double[] { 100.0d, (byte) 1 };
        double[] doubleArray23 = new double[] { 0, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 35.0]");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process(97.0d);
        double double11 = iIRFilter1.process(100.0d);
        double[] doubleArray17 = new double[] { '4', 10L, 32.0d, (byte) 10, 52.0d };
        double[] doubleArray20 = new double[] { 0L, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, 10.0, 32.0, 10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 35.0]");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { 100.0d, (short) 100, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 1.0]");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process((double) 'a');
        double double7 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double[] doubleArray7 = new double[] { 100L, 10.0f, 10L, 1.0f, ' ' };
        double[] doubleArray9 = new double[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 10.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double[] doubleArray7 = new double[] { (byte) 10, 0.0d, '4', '4', (byte) 10 };
        double[] doubleArray11 = new double[] { (-1.0d), (byte) 10, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 0.0, 52.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, 0.0]");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray14 = new double[] { '#', (byte) 100, 'a', 10 };
        double[] doubleArray20 = new double[] { '4', (-1.0f), (short) 100, 35.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, -1.0, 100.0, 35.0, 100.0]");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray12 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double[] doubleArray6 = new double[] { (byte) 100, 0 };
        double[] doubleArray12 = new double[] { 100.0d, (byte) 0, 1L, 1L, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 0.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(35.0d);
        double[] doubleArray11 = new double[] { (short) 100 };
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        double[] doubleArray25 = new double[] { (short) 100, 35.0d, 1L, (byte) -1, 10.0f };
        double[] doubleArray32 = new double[] { 97.0d, 100.0f, 10, 32.0d, 10.0d, 0L };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 35.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 100.0, 10.0, 32.0, 10.0, 0.0]");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process(1.0d);
        double[] doubleArray24 = new double[] { (byte) 100, 1.0f, 10.0f, ' ', ' ', (byte) 10 };
        double[] doubleArray28 = new double[] { (byte) 0, (byte) 10, 'a' };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0, 10.0, 32.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 10.0, 97.0]");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (short) -1);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) 100.0f);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { 1.0d, 0L, (short) 10, (byte) -1 };
        double[] doubleArray23 = new double[] { (-1L), (short) -1, 10.0f, (byte) -1, 1.0d, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 10.0, -1.0, 1.0, 52.0]");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double[] doubleArray16 = new double[] { (short) 0, (byte) -1, (short) 1, (-1) };
        double[] doubleArray22 = new double[] { 1L, '4', (byte) 0, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 52.0, 0.0, 1.0, 100.0]");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        double double21 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray18 = new double[] { (-1.0d), '#', 35.0d, 10.0f };
        double[] doubleArray25 = new double[] { 100, (short) 10, 0L, 1L, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 35.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, 0.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (-1L));
        double double17 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process(35.0d);
        double[] doubleArray18 = new double[] { 100.0f, 1.0d, 0.0d, (-1L), '4', 97.0d };
        double[] doubleArray20 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, 0.0, -1.0, 52.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1L);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray8 = new double[] { 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[32.0]");
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process(97.0d);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) ' ');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray23 = new double[] { 0, (byte) 1, 100L, (short) 1, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 100.0, 1.0, 10.0, 100.0]");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray15 = new double[] { 35.0d };
        double[] doubleArray17 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray14 = new double[] { 1, '#', 100, (byte) -1, '4', 100.0f };
        double[] doubleArray18 = new double[] { 52.0d, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 35.0, 100.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, -1.0, 10.0]");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(100.0d);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray23 = new double[] { (byte) -1, 10.0f, (-1L), (short) 1, 97.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 1.0, 97.0, 0.0]");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        double double21 = iIRFilter1.process((double) 1L);
        double double23 = iIRFilter1.process(100.0d);
        double double25 = iIRFilter1.process((double) ' ');
        double double27 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray34 = new double[] { (byte) 100, (-1L), 10.0f, 10L, 0.0f, (byte) -1 };
        double[] doubleArray36 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray34, doubleArray36);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, -1.0, 10.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0]");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(10.0d);
        double[] doubleArray20 = new double[] { 10, (short) -1, '#', 97.0d, (byte) 10, 97.0d };
        double[] doubleArray27 = new double[] { 100, (short) -1, 0, (short) -1, 10L, 100 };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 35.0, 97.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, -1.0, 0.0, -1.0, 10.0, 100.0]");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        double[] doubleArray22 = new double[] { (short) -1, (byte) 10 };
        double[] doubleArray25 = new double[] { 35.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[35.0, 0.0]");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double[] doubleArray8 = new double[] { 0.0f, 97.0d, 100.0f, 1.0f };
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 97.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) '#');
        double[] doubleArray18 = new double[] { '4', 35.0d };
        double[] doubleArray22 = new double[] { 32.0d, (byte) -1, (short) 1 };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, -1.0, 1.0]");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 1L);
        double[] doubleArray16 = new double[] { '#', 0.0d, 'a', (-1.0f) };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 0.0, 97.0, -1.0]");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process((double) ' ');
        double[] doubleArray22 = new double[] { 100.0f, 97.0d, 10L, (-1) };
        double[] doubleArray23 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 97.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray18 = new double[] { 0.0f, '4', 32.0d, '#' };
        double[] doubleArray21 = new double[] { (-1.0d), 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 52.0, 32.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0]");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        double double21 = iIRFilter1.process(10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (byte) -1);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1L);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray23 = new double[] { 0.0d, (short) 0, (short) 0, 0L, ' ', 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 32.0, 0.0]");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray10 = new double[] { 97.0d, (byte) 0, 1, (-1L), 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray4, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 0.0, 1.0, -1.0, 0.0]");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray23 = new double[] { 0L, 1.0f, (-1.0d), 100.0d, '#' };
        double[] doubleArray29 = new double[] { 10, (-1), 10, 10.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, -1.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, -1.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(1.0d);
        double[] doubleArray10 = new double[] { (byte) 1, 32.0d, 0, 10.0d };
        double[] doubleArray17 = new double[] { 97.0d, (-1.0d), 0L, ' ', 0L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 32.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, -1.0, 0.0, 32.0, 0.0, 0.0]");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double[] doubleArray17 = new double[] { (-1.0d), 10L, 10.0f };
        double[] doubleArray21 = new double[] { 100.0f, '#', 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 35.0, 1.0]");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        double double29 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass30 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray22 = new double[] { 0, (byte) 100, '4', (-1.0f), 0.0d };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 100.0, 52.0, -1.0, 0.0]");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process(0.0d);
        double[] doubleArray12 = new double[] { (-1.0f), (-1.0f), (short) 1, 97.0d };
        double[] doubleArray14 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        double[] doubleArray22 = new double[] { 100L, (byte) 0 };
        double[] doubleArray25 = new double[] { (short) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 32.0]");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process(100.0d);
        double[] doubleArray14 = new double[] { 1.0d, 0L, 1, (byte) 0 };
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 1.0, 0.0]");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) (-1L));
        double[] doubleArray22 = new double[] { (short) 100, 100, (short) 100, 10 };
        double[] doubleArray23 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (-1));
        double[] doubleArray18 = new double[] { 100.0d, '#', 0, (short) 0 };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 35.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        double double21 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 100);
        double double17 = iIRFilter1.process((double) ' ');
        double[] doubleArray19 = new double[] { 10.0d };
        double[] doubleArray22 = new double[] { 1.0f, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 0.0]");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 100);
        double double9 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray10 = null;
        double[] doubleArray17 = new double[] { (byte) -1, 10.0f, (-1.0d), 100L, 32.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 100.0, 32.0, 100.0]");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        double[] doubleArray20 = null;
        double[] doubleArray23 = new double[] { (byte) 1, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 97.0]");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = new double[] { 35.0d, 10.0d };
        double[] doubleArray22 = new double[] { (short) 100, 1.0f, 1.0d, 1.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
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
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
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
        double[] doubleArray31 = new double[] { (-1.0f), 10, (byte) 0 };
        double[] doubleArray37 = new double[] { 52.0d, (short) 0, (short) 10, (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray31, doubleArray37);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 32.0d + "'", double27 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[52.0, 0.0, 10.0, -1.0, 10.0]");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray21 = new double[] { 100.0d, (short) 10, (byte) 1, (short) 100, 100L };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 10.0, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray15 = new double[] { (short) 10, (byte) 0, 0L };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) 0.0f);
        double double5 = iIRFilter1.process(97.0d);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { (short) 0, 10.0d, 0L, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, 0.0, -1.0]");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray15 = new double[] { 35.0d };
        double[] doubleArray17 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 0);
        double[] doubleArray23 = new double[] { '4', (-1.0f), 1.0f, '4', (short) 10 };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, -1.0, 1.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) 1L);
        double double17 = iIRFilter1.process((double) 10);
        double[] doubleArray20 = new double[] { (-1L), 100 };
        double[] doubleArray23 = new double[] { (-1L), 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray23);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0]");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray14 = new double[] { 100, (byte) -1, (short) 100, ' ' };
        double[] doubleArray18 = new double[] { 10L, (-1.0f), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 1.0]");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double[] doubleArray13 = new double[] { (short) 10, 0.0f, (byte) 1 };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray12 = new double[] { (short) -1, 1.0f, (-1.0d), (byte) -1 };
        double[] doubleArray16 = new double[] { (-1.0f), (-1L), '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 35.0]");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double[] doubleArray8 = new double[] { (-1.0d), 0, 10L, (byte) 100 };
        double[] doubleArray15 = new double[] { (short) 0, (short) 10, '#', 10L, '#', 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, 35.0, 10.0, 35.0, 100.0]");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray16 = null;
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
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
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray25 = new double[] { (short) -1 };
        double[] doubleArray28 = new double[] { ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 52.0]");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 10);
        double[] doubleArray6 = null;
        double[] doubleArray12 = new double[] { 100.0f, 100.0f, '4', 100.0f, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 52.0, 100.0, 1.0]");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray17 = new double[] { (byte) 0, '4', (short) 10, 10.0f, 10.0f };
        double[] doubleArray20 = new double[] { 1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 52.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0]");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) ' ');
        double[] doubleArray16 = new double[] { (short) 0, 0, 100.0d, 100.0f, 1.0d, 10L };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 100.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray19 = new double[] { (short) 100, 100.0d, 100.0d };
        double[] doubleArray21 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) 1);
        double[] doubleArray13 = new double[] { ' ', (short) -1, (short) 1, 35.0d, (-1.0f) };
        double[] doubleArray16 = new double[] { (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, -1.0, 1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0]");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray21 = new double[] { (-1), (byte) 1, 35.0d, 0.0d, 35.0d };
        double[] doubleArray26 = new double[] { 35.0d, '#', (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 35.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 35.0, 0.0, 10.0]");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray19 = new double[] { (short) 100, (byte) 100, (short) 100 };
        double[] doubleArray26 = new double[] { (short) 1, (-1.0f), (short) -1, 100.0d, '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, -1.0, 100.0, 52.0, 10.0]");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(1.0d);
        double[] doubleArray15 = new double[] { (byte) -1, 35.0d, 52.0d, 10.0f, 1 };
        double[] doubleArray20 = new double[] { (byte) 10, 10.0f, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 35.0, 52.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 100.0, 100.0]");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
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
        double[] doubleArray34 = new double[] { 10, (byte) 10, (-1L), (-1.0f), 'a', 0.0d };
        double[] doubleArray39 = new double[] { (byte) 10, (-1L), 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray34, doubleArray39);
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
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 10.0, -1.0, -1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, -1.0, 0.0, 10.0]");
    }
}

