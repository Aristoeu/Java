package IIRFilter;

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
        double[] doubleArray29 = new double[] { (byte) -1, (byte) 100, 52.0d, (-1.0f), 1L };
        double[] doubleArray31 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray29, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 52.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) 0, (-1.0d), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, -1.0, 1.0]");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (-1));
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 100L);
        double[] doubleArray17 = new double[] { 10.0f };
        double[] doubleArray23 = new double[] { (-1), (short) 0, 10, (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray23);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 10.0, -1.0, -1.0]");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        double double21 = iIRFilter1.process((double) (-1L));
        double double23 = iIRFilter1.process((double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
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
        double double25 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass26 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray11 = new double[] { (byte) 100 };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) 0L);
        double double19 = iIRFilter1.process((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
        double double21 = iIRFilter1.process((double) 0.0f);
        double double23 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray28 = new double[] { 0L, 35.0d, (-1.0f), 0L };
        double[] doubleArray33 = new double[] { 100L, (byte) 1, 52.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray33);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 35.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 1.0, 52.0, 0.0]");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 0L);
        double double7 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
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
        double double21 = iIRFilter1.process(0.0d);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray25 = new double[] { 52.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 0.0]");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
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
        double double21 = iIRFilter1.process(1.0d);
        double double23 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((-1.0d));
        double[] doubleArray24 = new double[] { (short) -1, (short) 1, 100L, 0.0d, 35.0d, 0L };
        double[] doubleArray29 = new double[] { (short) 0, 10.0d, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0, 100.0, 0.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 10.0, 10.0, 1.0]");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
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
        double[] doubleArray27 = new double[] { 100.0d, (byte) 10, '#', (short) 1, (-1) };
        double[] doubleArray29 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 10.0, 35.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0]");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 1);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
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
        double double25 = iIRFilter1.process(1.0d);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) (-1));
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray13 = new double[] { 1.0d, 'a', 100 };
        double[] doubleArray20 = new double[] { (byte) 1, 32.0d, 'a', (short) 1, (-1L), (byte) 100 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 32.0, 97.0, 1.0, -1.0, 100.0]");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 'a');
        double[] doubleArray13 = new double[] { 0.0d };
        double[] doubleArray17 = new double[] { ' ', (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 0.0, 10.0]");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) ' ');
        double[] doubleArray10 = new double[] {};
        double[] doubleArray13 = new double[] { 32.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, -1.0]");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(1.0d);
        double double5 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) 100);
        double[] doubleArray16 = new double[] { ' ', (-1.0d), 100L, 0 };
        double[] doubleArray21 = new double[] { (-1L), 0.0d, 97.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, -1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 97.0, 1.0]");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
        double double23 = iIRFilter1.process((double) (short) 1);
        double double25 = iIRFilter1.process(10.0d);
        double[] doubleArray30 = new double[] { 35.0d, (byte) 10, 100.0d, (short) 0 };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process(35.0d);
        double[] doubleArray20 = new double[] { (byte) -1, 1.0d, (short) 0, (short) -1, 32.0d, '4' };
        double[] doubleArray23 = new double[] { (-1L), 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 1.0, 0.0, -1.0, 32.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0]");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
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
        double double21 = iIRFilter1.process((double) 1);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray24 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0]");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        double double29 = iIRFilter1.process((double) 100.0f);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double[] doubleArray13 = new double[] { 97.0d, 1.0f, (-1.0d), ' ', (-1L) };
        double[] doubleArray16 = new double[] { 100.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 1.0, -1.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 52.0]");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) ' ');
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) (short) 1);
        double double21 = iIRFilter1.process(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process((double) 10L);
        double[] doubleArray13 = new double[] { ' ', (short) 100, ' ', (byte) 100, 0.0f };
        double[] doubleArray19 = new double[] { (short) 10, '#', 0L, (byte) 0, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 100.0, 32.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 35.0, 0.0, 0.0, 97.0]");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 'a');
        double[] doubleArray10 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) 1, 100L, 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 1.0]");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray23 = new double[] { 100L, 10, (short) -1, 0.0f };
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) (-1));
        double[] doubleArray16 = null;
        double[] doubleArray17 = new double[] {};
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray17 = new double[] { (-1.0d) };
        double[] doubleArray19 = new double[] { (short) -1 };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray18 = null;
        double[] doubleArray25 = new double[] { ' ', 100L, 100.0f, (byte) -1, 0, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 100.0, 100.0, -1.0, 0.0, 100.0]");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 0L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) 'a');
        double double19 = iIRFilter1.process((double) ' ');
        double[] doubleArray26 = new double[] { 1.0d, 10.0f, 0.0d, 97.0d, (byte) 0, 32.0d };
        double[] doubleArray30 = new double[] { 10.0f, (short) 0, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 10.0, 0.0, 97.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 0.0, 1.0]");
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray17 = new double[] { 32.0d };
        double[] doubleArray24 = new double[] { (short) 100, 0L, 1, 'a', (-1L), 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray24);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 0.0, 1.0, 97.0, -1.0, 32.0]");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (-1L));
        double double19 = iIRFilter1.process(32.0d);
        double[] doubleArray25 = new double[] { (byte) 10, (byte) 10, 0.0f, (-1.0d), 1.0d };
        double[] doubleArray29 = new double[] { 0.0d, 100L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 100.0, 10.0]");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 0);
        double double17 = iIRFilter1.process((double) 100);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray25 = new double[] { '#', (byte) 100, (short) 100, 'a', 10L, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray25);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[35.0, 100.0, 100.0, 97.0, 10.0, -1.0]");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) '4');
        double[] doubleArray11 = new double[] { (short) -1 };
        double[] doubleArray15 = new double[] { (byte) 100, 0.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 0.0, 10.0]");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray13 = new double[] { 1L, 10L, 52.0d };
        double[] doubleArray18 = new double[] { (short) 100, 32.0d, 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 32.0, 0.0, 100.0]");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process(1.0d);
        double[] doubleArray20 = new double[] { (-1L), 0.0d, 0.0f, 52.0d };
        double[] doubleArray26 = new double[] { 35.0d, (byte) 10, (short) 0, 0.0f, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 10.0, 0.0, 0.0, 1.0]");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 0L);
        double double7 = iIRFilter1.process(10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray13 = new double[] { (-1.0f) };
        double[] doubleArray20 = new double[] { 0.0d, 1L, 100L, 97.0d, (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0, 100.0, 97.0, -1.0, 100.0]");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        double double23 = iIRFilter1.process((double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray9 = new double[] { '4' };
        double[] doubleArray14 = new double[] { 1L, 10, 'a', 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0, 97.0, 1.0]");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
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
        double double21 = iIRFilter1.process(0.0d);
        double[] doubleArray28 = new double[] { 52.0d, (short) 100, 100.0f, (byte) -1, (byte) 100, 100.0d };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[52.0, 100.0, 100.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0]");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) 10);
        double double19 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray14 = new double[] { 0L, 1L, 10, (byte) 10 };
        double[] doubleArray17 = new double[] { 100L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0]");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray10 = new double[] { 0, '#', 1, '4' };
        double[] doubleArray14 = new double[] { (byte) 1, 52.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 35.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 52.0, 10.0]");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray11 = new double[] { (short) 10 };
        double[] doubleArray13 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
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
        double double27 = iIRFilter1.process((double) 'a');
        double[] doubleArray28 = new double[] {};
        double[] doubleArray31 = new double[] { (short) 1, 100L };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0]");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((-1.0d));
        double[] doubleArray8 = new double[] { (byte) 10, (short) -1 };
        double[] doubleArray11 = new double[] { 32.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 0.0]");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray22 = new double[] { (short) 1, 0, 35.0d, (short) -1 };
        double[] doubleArray25 = new double[] { 10.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 0.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0]");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray11 = new double[] { 35.0d, 100, 0.0f, 'a', 10.0f };
        double[] doubleArray14 = new double[] { ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 35.0]");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
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
        double double23 = iIRFilter1.process((double) 100L);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray14 = new double[] { 52.0d, 97.0d };
        double[] doubleArray20 = new double[] { (byte) 1, 0.0f, 1.0f, (-1L), (byte) 100 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 0.0, 1.0, -1.0, 100.0]");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray16 = new double[] { (byte) -1, 100.0f };
        double[] doubleArray20 = new double[] { (-1L), (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray20);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 1.0, 100.0]");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
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
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(35.0d);
        double[] doubleArray9 = new double[] { (short) -1, 10L, 1L };
        double[] doubleArray16 = new double[] { 1.0f, 1L, 32.0d, (short) 0, 1.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 32.0, 0.0, 1.0, 0.0]");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray7 = new double[] { '#', 1.0d, 10L };
        double[] doubleArray12 = new double[] { 10.0d, (-1L), 10L, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 10);
        double double17 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray24 = new double[] { (short) -1, 0L, (byte) 0, 100.0d, 1, (short) 1 };
        double[] doubleArray29 = new double[] { 10.0f, 32.0d, 0.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 0.0, 100.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 32.0, 0.0, 1.0]");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 1);
        double[] doubleArray13 = new double[] { (byte) -1 };
        double[] doubleArray17 = new double[] { 0L, 35.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 35.0, 1.0]");
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 0L);
        double[] doubleArray19 = new double[] { 0.0d, (-1.0f), (-1L), (short) 0, 100 };
        double[] doubleArray24 = new double[] { 1, 1, 1.0f, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, -1.0, -1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 1.0, 1.0, 0.0]");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
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
        double double21 = iIRFilter1.process((double) 100.0f);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
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
        double[] doubleArray30 = new double[] { 35.0d, (-1.0d), (byte) -1, 0L, 100.0d, 100.0f };
        double[] doubleArray36 = new double[] { 100L, 'a', 10.0d, (byte) 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray36);
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
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, -1.0, -1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 97.0, 10.0, 1.0, 1.0]");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray23 = new double[] { 1L, 1.0f, 35.0d, 0, (short) 0 };
        double[] doubleArray24 = null;
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 1.0, 35.0, 0.0, 0.0]");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
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
        double double29 = iIRFilter1.process((double) 1L);
        double double31 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray35 = new double[] { (short) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray32, doubleArray35);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 97.0]");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process((double) '#');
        double[] doubleArray12 = new double[] { (short) -1, 100L };
        double[] doubleArray16 = new double[] { '4', 100.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 100.0, 100.0]");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process(1.0d);
        double[] doubleArray20 = new double[] { (short) 1, (byte) 1 };
        double[] doubleArray25 = new double[] { 0L, (short) -1, 100.0f, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 2");
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, -1.0, 100.0, 10.0]");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process(10.0d);
        double[] doubleArray23 = new double[] { 0.0f, '4', (short) 10, '4', (-1) };
        double[] doubleArray24 = null;
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 52.0, 10.0, 52.0, -1.0]");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) (byte) -1);
        double double15 = iIRFilter1.process((double) 1);
        double double17 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray16 = new double[] { 97.0d, 10.0f, 10L, '#' };
        double[] doubleArray17 = new double[] {};
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 10.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        double double21 = iIRFilter1.process((double) (short) 100);
        double double23 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray20 = new double[] { 100, 1L, 100, 10.0f, 97.0d, (byte) 0 };
        double[] doubleArray22 = new double[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, 100.0, 10.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 0L);
        double[] doubleArray7 = new double[] { 10.0f };
        double[] doubleArray14 = new double[] { 35.0d, (short) 10, 0L, '4', (-1.0f), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 10.0, 0.0, 52.0, -1.0, 100.0]");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) ' ');
        double[] doubleArray11 = new double[] { 10.0f, 100L, (byte) 10, '#', (byte) 0 };
        double[] doubleArray14 = new double[] { (byte) -1, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0, 10.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0]");
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (-1.0f));
        double double13 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray16 = new double[] { 10.0d, 35.0d };
        double[] doubleArray21 = new double[] { 100.0d, (byte) 1, 1, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, 1.0, 97.0]");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
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
        double double21 = iIRFilter1.process((double) (byte) 100);
        double double23 = iIRFilter1.process((double) (-1L));
        double[] doubleArray28 = new double[] { (-1L), 'a', 10.0f, (-1.0f) };
        double[] doubleArray29 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 97.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 'a');
        double double19 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(100.0d);
        double[] doubleArray19 = new double[] { (short) 10, 10L, 97.0d };
        double[] doubleArray22 = new double[] { (byte) 0, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 32.0]");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray5 = new double[] { 1 };
        double[] doubleArray12 = new double[] { 1.0f, 52.0d, 10.0f, 1.0f, '4', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray5, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 52.0, 10.0, 1.0, 52.0, 0.0]");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray24 = new double[] { 1, (byte) -1, (-1.0f), 100, 'a', 100L };
        double[] doubleArray26 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0, -1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process(35.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) 10L);
        double double19 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray17 = new double[] { (short) 1 };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process(52.0d);
        double[] doubleArray14 = new double[] { 'a', ' ' };
        double[] doubleArray16 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray15 = new double[] { (byte) 100, (byte) 10, 10L, 10, '4' };
        double[] doubleArray17 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 10.0, 10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0]");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process((double) 0);
        double[] doubleArray16 = new double[] { 97.0d, (-1) };
        double[] doubleArray18 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(32.0d);
        double double21 = iIRFilter1.process(100.0d);
        double[] doubleArray23 = new double[] { 0.0f };
        double[] doubleArray26 = new double[] { 35.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 0.0]");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 0L);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process((double) (-1L));
        double double19 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
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
        double double27 = iIRFilter1.process((double) (short) 10);
        double double29 = iIRFilter1.process(97.0d);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray18 = new double[] { 10, 52.0d, 100, 0L, 10.0d, (byte) 10 };
        double[] doubleArray24 = new double[] { 35.0d, (short) -1, 10L, 0, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 100.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0, -1.0, 10.0, 0.0, 32.0]");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) 'a');
        double double19 = iIRFilter1.process(32.0d);
        double double21 = iIRFilter1.process((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 100);
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { '4', 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, 100.0]");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (short) -1);
        double double5 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
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
        double[] doubleArray26 = new double[] { 10.0f, (byte) -1, 100L, 10.0d, 10L, (short) 100 };
        double[] doubleArray32 = new double[] { (short) 100, 10.0d, 'a', ' ', 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 6");
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
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, -1.0, 100.0, 10.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 97.0, 32.0, 100.0]");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) ' ');
        double[] doubleArray17 = new double[] { (short) 10, (byte) 10, 1.0d };
        double[] doubleArray22 = new double[] { 100.0d, 'a', 10L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 97.0, 10.0, -1.0]");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
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
        double double23 = iIRFilter1.process((double) 0);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray29 = new double[] { 'a', (byte) 0, 1L, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 0.0, 1.0, 10.0]");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
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
        double double29 = iIRFilter1.process(0.0d);
        double double31 = iIRFilter1.process((double) (short) -1);
        double double33 = iIRFilter1.process((double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((-1.0d));
        double[] doubleArray24 = new double[] { 10L, (byte) 1, (byte) -1, 1, 10.0d, 35.0d };
        double[] doubleArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0, -1.0, 1.0, 10.0, 35.0]");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray15 = new double[] { (-1.0d), 0.0d, (byte) 100, ' ', (-1.0d) };
        double[] doubleArray21 = new double[] { (byte) 0, (byte) 100, (byte) 100, 10L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 100.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 100.0, 100.0, 10.0, -1.0]");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
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
        double[] doubleArray22 = null;
        double[] doubleArray27 = new double[] { 'a', (byte) 10, (-1.0f), 97.0d };
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 10.0, -1.0, 97.0]");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 'a');
        double[] doubleArray14 = new double[] { 10L, '4' };
        double[] doubleArray19 = new double[] { (short) 1, 100, (short) -1, 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, 52.0]");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process((double) 1L);
        double[] doubleArray22 = new double[] { 35.0d, 97.0d, '#', 10.0d };
        double[] doubleArray29 = new double[] { (byte) -1, 35.0d, 100.0d, 0.0d, 0.0d, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 97.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 35.0, 100.0, 0.0, 0.0, 10.0]");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10);
        double[] doubleArray15 = new double[] { (byte) 10, (short) 0, (short) -1, (byte) 10, (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 0.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
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
        double[] doubleArray27 = new double[] { 10L, (byte) 100, 1L, 1.0d, 1 };
        double[] doubleArray34 = new double[] { 97.0d, (short) 100, '4', 0.0f, (short) -1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray34);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[97.0, 100.0, 52.0, 0.0, -1.0, 100.0]");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) '#');
        double[] doubleArray17 = new double[] { (short) 1, 0L, 52.0d };
        double[] doubleArray22 = new double[] { 0.0d, 97.0d, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 97.0, 1.0, 10.0]");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(97.0d);
        double double9 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray13 = new double[] { (short) -1, 1L, 97.0d };
        double[] doubleArray18 = new double[] { (byte) -1, (byte) 10, '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, 35.0, -1.0]");
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(0.0d);
        double[] doubleArray10 = new double[] { (short) 0, 'a' };
        double[] doubleArray12 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process(10.0d);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray22 = new double[] { 0, 10, ' ', 0.0d, (short) 1, ' ' };
        double[] doubleArray29 = new double[] { (-1.0f), 100L, 32.0d, 0L, (byte) 100, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 10.0, 32.0, 0.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 32.0, 0.0, 100.0, 100.0]");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1));
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) ' ');
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) '#');
        double[] doubleArray20 = new double[] { 0.0f, '#', 'a', 1, 0.0d, 100 };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 35.0, 97.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) (-1L));
        double double17 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray6 = new double[] { 0L, 1.0d };
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((-1.0d));
        double[] doubleArray12 = new double[] { (-1.0d), 10, 100.0f, 1.0f, 1L, (short) 1 };
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, 100.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray15 = new double[] { '#', (-1L), (short) 100 };
        double[] doubleArray19 = new double[] { (byte) 0, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, -1.0, -1.0]");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) 0);
        double[] doubleArray21 = new double[] { 0L, '4', 10L };
        double[] doubleArray24 = new double[] { (short) 1, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 97.0]");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray15 = new double[] { 52.0d, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray15);
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, -1.0]");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) 1L);
        double double11 = iIRFilter1.process(35.0d);
        double[] doubleArray16 = new double[] { 10.0d, 0L, (short) 10, 1.0f };
        double[] doubleArray19 = new double[] { 0.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 100.0]");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
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
        double[] doubleArray23 = new double[] { 10.0d };
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray23 = new double[] { 10L, (-1L), (byte) 10 };
        double[] doubleArray26 = new double[] { (short) 100, (short) 10 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 10.0]");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (byte) 0);
        double double17 = iIRFilter1.process(32.0d);
        double[] doubleArray20 = new double[] { 0.0d, (byte) -1 };
        double[] doubleArray25 = new double[] { 100, (byte) 10, (-1), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, -1.0, 1.0]");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
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
        double double21 = iIRFilter1.process(32.0d);
        double double23 = iIRFilter1.process((double) '#');
        double[] doubleArray24 = new double[] {};
        double[] doubleArray26 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray11 = new double[] { (byte) 100, 1.0d, '4' };
        double[] doubleArray13 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process(1.0d);
        double[] doubleArray14 = new double[] { 100.0d, 0, 10L, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process(52.0d);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (short) 0, (short) 0, 0.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 0.0, 10.0]");
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process(10.0d);
        double[] doubleArray22 = new double[] { 10.0d, 1.0d, (short) 10, (short) 100 };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) (byte) -1);
        double double21 = iIRFilter1.process(0.0d);
        double[] doubleArray24 = new double[] { (short) 0, (-1L) };
        double[] doubleArray27 = new double[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 10.0]");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process((double) 100.0f);
        double[] doubleArray22 = new double[] { (short) -1, 1.0f, 0, 35.0d };
        double[] doubleArray29 = new double[] { 100L, (byte) 10, (byte) 10, ' ', (byte) 10, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 1.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 10.0, 10.0, 32.0, 10.0, 100.0]");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray13 = new double[] { 32.0d, 100L, 1 };
        double[] doubleArray16 = new double[] { 1.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0]");
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process(32.0d);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) 'a');
        double[] doubleArray23 = new double[] { '4', 10.0f, 100 };
        double[] doubleArray28 = new double[] { 10L, 'a', 52.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 97.0, 52.0, -1.0]");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (short) -1);
        double double17 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray15 = new double[] { 1.0d, (byte) -1, 1L };
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray12 = null;
        double[] doubleArray16 = new double[] { 0L, 10.0d, 1L };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 10.0, 1.0]");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process(32.0d);
        double[] doubleArray17 = new double[] { 1 };
        double[] doubleArray20 = new double[] { 10, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray20);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0]");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (short) 100);
        double double19 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray22 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray22);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0]");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) 'a');
        double double15 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray17 = new double[] { (byte) 10 };
        double[] doubleArray23 = new double[] { 0.0f, 1.0f, 0L, (byte) 10, (byte) 0 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 0.0, 10.0, 0.0]");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double[] doubleArray19 = new double[] { 1.0f, 1L, (byte) 1, (short) 100, (short) 10 };
        double[] doubleArray24 = new double[] { (byte) 1, (short) 1, 100L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray24);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 1.0, 100.0, 10.0]");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(10.0d);
        double[] doubleArray18 = new double[] { 10L, 1L };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process((double) 'a');
        double[] doubleArray18 = new double[] { 0.0d, 'a' };
        double[] doubleArray23 = new double[] { '#', (-1.0d), 1.0d, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray23);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, -1.0, 1.0, 100.0]");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (short) -1);
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray24 = new double[] { (byte) 10, 100.0f, 10L, (short) 1, 'a', (-1) };
        double[] doubleArray27 = new double[] { (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0, 10.0, 1.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process(32.0d);
        double double21 = iIRFilter1.process(97.0d);
        double[] doubleArray23 = new double[] { 1 };
        double[] doubleArray29 = new double[] { 52.0d, (short) 10, 1.0d, 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, 10.0, 1.0, 10.0, 0.0]");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process(10.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray10 = new double[] { 10, 100 };
        double[] doubleArray13 = new double[] { '#', 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 1.0]");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) 0L);
        double[] doubleArray21 = new double[] { (short) 1, '#', (byte) 0, (byte) -1, (byte) 1 };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 35.0, 0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process(0.0d);
        double[] doubleArray17 = new double[] { (byte) 1, 100L, 0L };
        double[] doubleArray22 = new double[] { (byte) 1, (byte) 0, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray22);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 0.0, 100.0, 52.0]");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) 10L);
        double double19 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
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
        double double25 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray27 = new double[] { 100.0f };
        double[] doubleArray30 = new double[] { (short) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 52.0]");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(97.0d);
        double[] doubleArray18 = new double[] { 1L, 97.0d, '#', (-1.0d) };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 97.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 10L);
        double[] doubleArray17 = new double[] { 0, 1.0f, 1.0f, (short) 0, (short) 100 };
        double[] doubleArray19 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 1L);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10);
        double[] doubleArray21 = new double[] { (byte) 0, 35.0d, 52.0d, 97.0d, 100L };
        double[] doubleArray23 = new double[] { '#' };
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 35.0, 52.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0]");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) 1);
        double double19 = iIRFilter1.process((double) '4');
        double double21 = iIRFilter1.process((double) 10L);
        double[] doubleArray24 = new double[] { (-1L), (byte) 100 };
        double[] doubleArray26 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0]");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 1);
        double double19 = iIRFilter1.process((double) 1.0f);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
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
        double double23 = iIRFilter1.process((double) 0L);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray31 = new double[] { 100.0d, 'a', 52.0d, 10, (short) -1, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 97.0, 52.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process((double) 100.0f);
        double double15 = iIRFilter1.process((double) 10);
        double[] doubleArray21 = new double[] { 0.0f, 1, 0L, 35.0d, (-1.0d) };
        double[] doubleArray28 = new double[] { 10, 1, (short) 0, 52.0d, (byte) 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0, 0.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 1.0, 0.0, 52.0, 10.0, 0.0]");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
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
        double double21 = iIRFilter1.process(1.0d);
        double double23 = iIRFilter1.process((double) 1);
        double[] doubleArray29 = new double[] { 10L, 100L, 97.0d, (byte) 1, (short) -1 };
        double[] doubleArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray29, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 100.0, 97.0, 1.0, -1.0]");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((-1.0d));
        double double19 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray18 = new double[] { 100.0f, '#', 10.0d, (short) 0, 'a', 0.0f };
        double[] doubleArray21 = new double[] { (short) 1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 35, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 35.0, 10.0, 0.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0]");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 10);
        double[] doubleArray21 = new double[] { 10L, 0, 52.0d, 1L, 10 };
        double[] doubleArray25 = new double[] { (short) 10, 10, 97.0d };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 0.0, 52.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 97.0]");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((double) (-1));
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray21 = new double[] { (-1), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 0");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0]");
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) (-1L));
        double[] doubleArray17 = new double[] { 'a' };
        double[] doubleArray24 = new double[] { 32.0d, (byte) 10, (short) 10, (-1L), 0L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[32.0, 10.0, 10.0, -1.0, 0.0, 100.0]");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(35.0d);
        double double7 = iIRFilter1.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) 10);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
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
        java.lang.Class<?> wildcardClass26 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray22 = new double[] { 1.0f, 1L, (short) 10 };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 1.0, 10.0]");
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process((double) (-1));
        double double7 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray14 = new double[] { 'a', (-1L), 'a', (byte) 0, (-1), 32.0d };
        double[] doubleArray18 = new double[] { (byte) 0, 10L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, -1.0, 97.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 97.0]");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 0);
        double double13 = iIRFilter1.process((double) 'a');
        double[] doubleArray19 = new double[] { (byte) 100, 0.0d, (byte) 1, (short) 100, (byte) 1 };
        double[] doubleArray25 = new double[] { '4', ' ', 0.0d, (short) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 32.0, 0.0, 1.0, -1.0]");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) 'a');
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
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
        double double21 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray28 = new double[] { ' ', 97.0d, 1, 10.0f, 1L, 52.0d };
        double[] doubleArray30 = new double[] { (-1) };
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 97.0, 1.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray17 = new double[] { '4' };
        double[] doubleArray18 = null;
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0]");
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process(32.0d);
        double double17 = iIRFilter1.process((double) (short) 100);
        double double19 = iIRFilter1.process((double) (-1L));
        double double21 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray27 = new double[] { (-1L), 52.0d, (short) 1, ' ', (short) 100 };
        double[] doubleArray30 = new double[] { '#', 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 52.0, 1.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 10.0]");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
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
        double double27 = iIRFilter1.process((double) 0L);
        double[] doubleArray28 = null;
        double[] doubleArray31 = new double[] { 0L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0]");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray19 = new double[] { '4', 100, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 100.0, 0.0, 100.0]");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (short) -1);
        double double15 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(1.0d);
        double double13 = iIRFilter1.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) '4');
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process((double) (byte) 1);
        double double19 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double[] doubleArray10 = new double[] {};
        double[] doubleArray12 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 100);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray17 = new double[] { 97.0d };
        double[] doubleArray23 = new double[] { (short) 1, 100, 10.0f, 10.0f, (-1.0d) };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
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
        double double21 = iIRFilter1.process(100.0d);
        double double23 = iIRFilter1.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process(1.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
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
        double double21 = iIRFilter1.process(100.0d);
        double double23 = iIRFilter1.process((double) 1);
        double[] doubleArray25 = new double[] { 100.0f };
        double[] doubleArray28 = new double[] { 1, (byte) 0 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 0.0]");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double[] doubleArray10 = new double[] { 10L, 35.0d, (short) 100, 1L };
        double[] doubleArray17 = new double[] { (byte) -1, 0, 0.0d, (byte) 10, (short) 0, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 35.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 0.0, 10.0, 0.0, -1.0]");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
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
        double double21 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray21 = new double[] { 0, 0, 1.0d };
        double[] doubleArray24 = new double[] { 100, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray24);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0]");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) (byte) 100);
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process(35.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(97.0d);
        double double5 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (short) -1);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process(0.0d);
        double[] doubleArray24 = new double[] { 35.0d, 32.0d, (-1.0d), 0.0f };
        double[] doubleArray29 = new double[] { 1.0d, 0.0d, (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 0.0, 100.0, -1.0]");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
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
        double[] doubleArray25 = new double[] { (short) 10, 0.0d, 100.0d, 1.0d, (short) -1 };
        double[] doubleArray26 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray26);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 0.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
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
        double[] doubleArray20 = new double[] {};
        double[] doubleArray23 = new double[] { 10, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray23);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0]");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 0);
        double double7 = iIRFilter1.process(0.0d);
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray15 = new double[] { 0.0f, 100, 1.0f, 100.0d, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 1.0, 100.0, 35.0]");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 100.0f);
        double double17 = iIRFilter1.process((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process(1.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
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
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray11 = new double[] { 0.0f, (short) 1, '#', 1.0f, 32.0d };
        double[] doubleArray13 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0, 35.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) (byte) -1);
        double double19 = iIRFilter1.process(35.0d);
        double double21 = iIRFilter1.process((double) (short) 10);
        double double23 = iIRFilter1.process((double) (short) 10);
        double double25 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray26 = null;
        double[] doubleArray30 = new double[] { (byte) 1, '4', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 52.0, 100.0]");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
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
        double double27 = iIRFilter1.process((double) ' ');
        double[] doubleArray29 = new double[] { (-1.0d) };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 32.0d + "'", double27 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process((double) 10.0f);
        double double15 = iIRFilter1.process((double) (-1L));
        double[] doubleArray19 = new double[] { 10.0f, 0L, 1 };
        double[] doubleArray22 = new double[] { (byte) 1, (byte) -1 };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, -1.0]");
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 10);
        double double3 = iIRFilter1.process((double) (short) 100);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray15 = new double[] { (-1.0f) };
        double[] doubleArray20 = new double[] { 1L, (byte) -1, 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 52.0]");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(100.0d);
        double[] doubleArray11 = new double[] { 0L };
        double[] doubleArray15 = new double[] { (byte) 100, 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, 97.0]");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) ' ');
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
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
        double[] doubleArray30 = new double[] { 0L, (byte) 0, (-1L), 10L, 35.0d, (-1L) };
        double[] doubleArray31 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, -1.0, 10.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
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
        double[] doubleArray28 = new double[] { ' ', 10L, 1.0d, 0L, 1.0f, 1.0d };
        double[] doubleArray32 = new double[] { 10.0d, (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray32);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 10.0, 1.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 0.0, 100.0]");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray20 = new double[] { 1.0f, 10L, 100.0d, 1.0f };
        double[] doubleArray26 = new double[] { (short) 100, (byte) -1, '4', 52.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, -1.0, 52.0, 52.0, 1.0]");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((-1.0d));
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double[] doubleArray14 = new double[] { 1, (-1), (-1.0d), 52.0d, ' ', 35.0d };
        double[] doubleArray20 = new double[] { 97.0d, 10, '#', 10, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, -1.0, 52.0, 32.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 10.0, 35.0, 10.0, 1.0]");
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process(32.0d);
        double[] doubleArray21 = new double[] { '4', 0.0d, 100L, 1.0d, 100 };
        double[] doubleArray28 = new double[] { ' ', 100.0f, 1, 100.0f, (byte) 1, 0L };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 0.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 100.0, 1.0, 100.0, 1.0, 0.0]");
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
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
        double double21 = iIRFilter1.process((double) 100L);
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
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(10.0d);
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
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(52.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 0);
        double[] doubleArray17 = new double[] { 0 };
        double[] doubleArray23 = new double[] { 'a', 100.0d, (short) 0, 97.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs.get(0) must not be zero");
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 100.0, 0.0, 97.0, 0.0]");
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) (short) 10);
        double double17 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray23 = new double[] { (byte) 1, 97.0d, ' ', 97.0d, 1L };
        double[] doubleArray25 = new double[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 97.0, 32.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(0.0d);
        double[] doubleArray10 = new double[] { 100L, 35.0d, (short) 100, (short) 0 };
        double[] doubleArray14 = new double[] { 100.0f, (-1L), '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 35.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 52.0]");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 10L);
        double double13 = iIRFilter1.process((double) 0);
        double double15 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) 'a');
        double[] doubleArray18 = new double[] { (byte) 100, 0L, 1.0f, 100.0f, (byte) -1, (-1.0d) };
        double[] doubleArray22 = new double[] { 100, (byte) 10, (short) 100 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0, 1.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 100.0]");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process(97.0d);
        double[] doubleArray5 = new double[] { (short) 1 };
        double[] doubleArray9 = new double[] { 35.0d, '4', 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray5, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 52.0, 0.0]");
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) (short) -1);
        double double5 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process(97.0d);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double double17 = iIRFilter1.process((double) 0L);
        double[] doubleArray23 = new double[] { 1L, 1L, (short) 100, 32.0d, 100 };
        double[] doubleArray30 = new double[] { 100L, (short) 1, 1.0f, (short) -1, (short) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 1.0, 100.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, 1.0, -1.0, 100.0, 97.0]");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process(32.0d);
        double[] doubleArray15 = new double[] { (byte) 100 };
        double[] doubleArray21 = new double[] { (byte) 1, (short) 1, 0, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 0.0, 100.0, -1.0]");
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process((double) 0L);
        double double17 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) (short) -1);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(100.0d);
        double[] doubleArray17 = new double[] { (byte) -1 };
        double[] doubleArray19 = new double[] { 97.0d };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0]");
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (byte) 0);
        double double5 = iIRFilter1.process(35.0d);
        double double7 = iIRFilter1.process(32.0d);
        double[] doubleArray13 = new double[] { 0.0f, (short) 100, 10, 0, (-1L) };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 100.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (short) 100);
        double double15 = iIRFilter1.process((double) (short) 0);
        double double17 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray19);
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray24 = new double[] { 'a', (-1.0d), 10.0f, (byte) 100, 0.0f, '#' };
        double[] doubleArray29 = new double[] { (short) 1, '4', (short) 10, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, -1.0, 10.0, 100.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 52.0, 10.0, 97.0]");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(97.0d);
        double double9 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((-1.0d));
        double[] doubleArray15 = new double[] { (byte) 0, (byte) 10, (-1L), 100, (byte) 100 };
        double[] doubleArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, -1.0, 100.0, 100.0]");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) ' ');
        double double11 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (-1.0f));
        double double15 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray18 = new double[] { (short) -1, (short) 1 };
        double[] doubleArray21 = new double[] { 10.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) 1.0f);
        double double17 = iIRFilter1.process((double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (byte) -1);
        double double17 = iIRFilter1.process(0.0d);
        double[] doubleArray24 = new double[] { 0, '#', 100.0d, 0.0f, (short) 100, 1 };
        double[] doubleArray31 = new double[] { (short) 10, (-1.0d), 100L, ' ', 100.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 35.0, 100.0, 0.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -1.0, 100.0, 32.0, 100.0, 35.0]");
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 0);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(100.0d);
        double double15 = iIRFilter1.process((double) 0L);
        double[] doubleArray22 = new double[] { 1.0f, 100.0d, 100, (short) 10, (short) 10, 35.0d };
        double[] doubleArray24 = new double[] { (byte) 0 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, 100.0, 10.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0]");
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (short) 100);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((double) (byte) 10);
        double double9 = iIRFilter1.process((double) (byte) 10);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
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
        double double21 = iIRFilter1.process((double) 0);
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
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
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
        double[] doubleArray22 = null;
        double[] doubleArray26 = new double[] { 97.0d, (byte) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 0.0, 1.0]");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
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
        double double23 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass24 = iIRFilter1.getClass();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process(1.0d);
        double double9 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double[] doubleArray19 = new double[] { 10, (byte) 0, (short) 100, 52.0d, ' ' };
        double[] doubleArray21 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0, 100.0, 52.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0]");
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray17 = new double[] { 1.0f };
        double[] doubleArray22 = new double[] { (byte) 100, 97.0d, (byte) 0, 100.0f };
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 97.0, 0.0, 100.0]");
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) (short) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
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
        double[] doubleArray29 = new double[] { (byte) 100, (-1), (byte) 1, 100.0d, (short) 1 };
        double[] doubleArray33 = new double[] { (short) 10, (-1L), (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray29, doubleArray33);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, -1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, -1.0, -1.0]");
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process((double) 100L);
        double[] doubleArray25 = new double[] { 10.0f, (byte) 100, 10.0d, 0.0f, 10.0d };
        double[] doubleArray27 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0, 10.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0]");
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(35.0d);
        double[] doubleArray14 = new double[] { (byte) 1, (byte) 1, (byte) 10, 0.0d, 10.0f, (byte) 10 };
        double[] doubleArray19 = new double[] { 100, (byte) -1, 10.0f, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 10.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 0);
        double double19 = iIRFilter1.process((double) (byte) -1);
        double double21 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process((double) (short) 1);
        double double17 = iIRFilter1.process((double) (byte) 10);
        double double19 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(35.0d);
        double[] doubleArray17 = new double[] { (short) 0, 10, 100, 10.0d, 0L };
        double[] doubleArray24 = new double[] { 35.0d, (short) -1, 100, 1, (short) 0, 10 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 10.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0, -1.0, 100.0, 1.0, 0.0, 10.0]");
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray20 = new double[] { 10.0f, 32.0d };
        double[] doubleArray23 = new double[] { 0L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, -1.0]");
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) (short) 0);
        double[] doubleArray15 = new double[] { (short) 10, 32.0d, '#', (short) 0, ' ' };
        double[] doubleArray17 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 32.0, 35.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
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
        double[] doubleArray27 = new double[] { (-1L), (byte) 10, 1.0f, (-1), 100.0f };
        double[] doubleArray32 = new double[] { 1L, 0.0d, (short) 10, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray32);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 10.0, 1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 0.0, 10.0, 100.0]");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(10.0d);
        double double11 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(100.0d);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray26 = new double[] { 0.0d, 0L, 100.0d, 0L, 10.0f, (byte) 0 };
        double[] doubleArray33 = new double[] { 0.0d, (byte) 100, 1.0f, ' ', 100.0d, 1.0d };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 100.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 100.0, 1.0, 32.0, 100.0, 1.0]");
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double[] doubleArray6 = new double[] { 97.0d, 100.0f, (short) 100, 10 };
        double[] doubleArray9 = new double[] { 10, 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 97.0]");
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray17 = new double[] { 100L, 1L, (-1L), 100.0d, 1.0f };
        double[] doubleArray20 = new double[] { 100.0f, (byte) 1 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0]");
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
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
        double double21 = iIRFilter1.process(0.0d);
        double[] doubleArray27 = new double[] { (byte) 100, 1.0d, 10.0f, 0L, 32.0d };
        double[] doubleArray32 = new double[] { 1.0d, 100L, (short) 0, 1L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray32);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, 10.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray7 = new double[] { 0.0d };
        double[] doubleArray12 = new double[] { (byte) 100, (short) 10, (byte) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 32, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 0.0, 52.0]");
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((-1.0d));
        double[] doubleArray17 = new double[] { 35.0d };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process(100.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) (short) -1);
        double double5 = iIRFilter1.process((double) 100);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(10.0d);
        double double9 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray10 = null;
        double[] doubleArray16 = new double[] { (-1L), (-1L), 1L, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 1.0, -1.0, 0.0]");
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) -1);
        double double7 = iIRFilter1.process((-1.0d));
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) 1L);
        double[] doubleArray13 = new double[] { (short) 0 };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(100.0d);
        double[] doubleArray21 = new double[] { (short) -1, (byte) 1, 1.0d, (short) -1, (-1.0f) };
        double[] doubleArray28 = new double[] { (-1L), (byte) 0, 32.0d, 10.0d, (byte) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 32.0, 10.0, 1.0, 97.0]");
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
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
        double double21 = iIRFilter1.process(0.0d);
        double double23 = iIRFilter1.process(0.0d);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray26 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0]");
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (byte) 100);
        double double7 = iIRFilter1.process((double) 10.0f);
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process((double) (short) 1);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process(32.0d);
        double double15 = iIRFilter1.process((double) 1.0f);
        double[] doubleArray21 = new double[] { 10L, (-1.0f), 0.0f, (-1.0d), 10L };
        double[] doubleArray23 = new double[] { 0.0f };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, -1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) ' ');
        double[] doubleArray21 = new double[] { (short) -1, 100.0d, '4' };
        double[] doubleArray28 = new double[] { 1.0d, 'a', 32.0d, (byte) 100, 10L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 97.0, 32.0, 100.0, 10.0, 0.0]");
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        double double13 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) -1);
        double double13 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process(32.0d);
        double[] doubleArray8 = null;
        double[] doubleArray11 = new double[] { (-1L), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0]");
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
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
        double double21 = iIRFilter1.process((double) (short) 0);
        double double23 = iIRFilter1.process((double) (short) 100);
        double[] doubleArray27 = new double[] { 35.0d, (-1), 'a' };
        double[] doubleArray29 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 'a');
        double double11 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray13 = new double[] { 1.0f };
        double[] doubleArray15 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100L);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray17 = new double[] { (byte) 1, 100.0d, '#' };
        double[] doubleArray19 = new double[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray19);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
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
        double double25 = iIRFilter1.process((double) 10);
        double double27 = iIRFilter1.process((double) (byte) -1);
        double double29 = iIRFilter1.process(97.0d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) '4');
        double double15 = iIRFilter1.process((double) 10);
        double[] doubleArray19 = new double[] { 1, 32.0d, 0L };
        double[] doubleArray22 = new double[] { (short) 10, (-1.0d) };
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) (-1.0f));
        double double9 = iIRFilter1.process((double) ' ');
        double[] doubleArray11 = new double[] { 10.0d };
        double[] doubleArray15 = new double[] { (byte) 10, 97.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bCoeffs must be of size 1, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 97.0, 10.0]");
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray17 = new double[] { 1, 0.0f, (short) 1 };
        double[] doubleArray20 = new double[] { 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray21 = new double[] { (short) 100, 100, ' ' };
        double[] doubleArray25 = new double[] { 1, 100L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray25);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, 100.0]");
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass8 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
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
        double[] doubleArray26 = new double[] { (short) 1, (short) 100, 0, 0, (byte) -1, (-1.0d) };
        double[] doubleArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray26, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, 0.0, 0.0, -1.0, -1.0]");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 100L);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (-1));
        double double9 = iIRFilter1.process((double) (-1));
        double[] doubleArray13 = new double[] { 1L, 100.0f, 10L };
        double[] doubleArray19 = new double[] { (-1), 97.0d, (-1.0f), (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 97.0, -1.0, 100.0, 100.0]");
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process(52.0d);
        double double11 = iIRFilter1.process((double) 1.0f);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double double17 = iIRFilter1.process((double) 10L);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
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
        double[] doubleArray25 = new double[] { 10.0d, 10.0d, 0.0f, (short) -1, 10 };
        double[] doubleArray30 = new double[] { ' ', 1, (byte) 100, (byte) 0 };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, 1.0, 100.0, 0.0]");
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
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
        double[] doubleArray24 = new double[] { '#', 0.0f, 32.0d, (short) 1 };
        double[] doubleArray26 = new double[] { (byte) -1 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0, 0.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) (-1));
        double double13 = iIRFilter1.process((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) ' ');
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process((double) ' ');
        double double7 = iIRFilter1.process((double) 0.0f);
        double double9 = iIRFilter1.process((double) (byte) 1);
        double double11 = iIRFilter1.process((double) 100L);
        double double13 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
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
        double double21 = iIRFilter1.process(32.0d);
        double double23 = iIRFilter1.process((double) '#');
        double[] doubleArray25 = new double[] { 100.0f };
        double[] doubleArray31 = new double[] { (short) 1, 0.0d, 52.0d, (-1), 0 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 0.0, 52.0, -1.0, 0.0]");
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) (byte) -1);
        double[] doubleArray16 = new double[] { 1.0f, 'a' };
        double[] doubleArray18 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (-1));
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) 1);
        double double11 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(1.0d);
        double[] doubleArray19 = new double[] { (short) 100, 0L, 10L };
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 0);
        double double11 = iIRFilter1.process(0.0d);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
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
        double double25 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray27 = new double[] { 100.0d };
        double[] doubleArray30 = new double[] { (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (short) 0);
        double double13 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray19 = new double[] { 0L, (short) 0, 10.0d, (short) 0, 0.0f };
        double[] doubleArray25 = new double[] { 0.0f, 35.0d, 100.0f, 1.0f, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 35.0, 100.0, 1.0, 10.0]");
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray15 = new double[] { '4' };
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray16);
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
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
        double double21 = iIRFilter1.process(52.0d);
        double[] doubleArray23 = new double[] { (-1L) };
        double[] doubleArray26 = new double[] { 35.0d, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray26);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 10.0]");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(97.0d);
        double[] doubleArray15 = new double[] { (short) 10, 0L, 0.0f, (short) 1, (-1) };
        double[] doubleArray17 = new double[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 0.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0]");
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process(97.0d);
        double[] doubleArray11 = new double[] { 'a', (short) 10, (byte) -1 };
        double[] doubleArray18 = new double[] { 10, (short) 100, (byte) -1, '#', 1.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0, -1.0, 35.0, 1.0, 100.0]");
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((-1.0d));
        double[] doubleArray6 = new double[] {};
        double[] doubleArray10 = new double[] { (-1.0d), (-1), 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 52.0]");
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
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
        double[] doubleArray25 = new double[] { 0 };
        double[] doubleArray27 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray25, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0]");
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process((double) 0.0f);
        double double17 = iIRFilter1.process(0.0d);
        double double19 = iIRFilter1.process((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process(52.0d);
        double double17 = iIRFilter1.process((double) ' ');
        double double19 = iIRFilter1.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
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
        double double33 = iIRFilter1.process((double) 100L);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray40 = new double[] { (byte) 0, '#', (-1), (byte) 0, '4' };
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 35.0, -1.0, 0.0, 52.0]");
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process(0.0d);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) (byte) 0);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
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
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, 100.0f, 0L, (byte) 1, (short) -1 };
        double[] doubleArray24 = new double[] { 35.0d, 10L, (byte) 10, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 100.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0, 10.0, 10.0, 32.0]");
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) 1);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray24 = new double[] { (byte) 0, (byte) 10, (-1.0f), '#', 0.0d, (-1.0d) };
        double[] doubleArray25 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray25);
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 10.0, -1.0, 35.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
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
        double double21 = iIRFilter1.process((double) (short) 0);
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((-1.0d));
        double double13 = iIRFilter1.process(35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process(97.0d);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
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
        double double21 = iIRFilter1.process((double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
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
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
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
        double[] doubleArray23 = new double[] { (short) 10, 10, (short) 0 };
        double[] doubleArray30 = new double[] { '#', 32.0d, '4', (-1L), 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 3");
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 32.0, 52.0, -1.0, 0.0, 10.0]");
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
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
        double double23 = iIRFilter1.process((double) 10);
        double double25 = iIRFilter1.process((double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 1);
        double double3 = iIRFilter1.process((double) (short) 10);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray9 = new double[] { 0 };
        double[] doubleArray16 = new double[] { (byte) -1, (-1.0d), (-1L), (short) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs.get(0) must not be zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, -1.0, 100.0, -1.0, -1.0]");
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (short) 10);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process((double) 10);
        double double17 = iIRFilter1.process((double) (short) 1);
        double double19 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass20 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process(97.0d);
        double double19 = iIRFilter1.process((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 10);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) 10L);
        double[] doubleArray21 = new double[] { (-1.0d), 0L, 'a', 10.0f, 35.0d };
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray22);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 97.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 0);
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process(1.0d);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) -1, (-1) };
        double[] doubleArray24 = new double[] { 97.0d, (short) 10, 10L, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 10.0, 10.0, 32.0]");
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) 100L);
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process((double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process(35.0d);
        double double13 = iIRFilter1.process((-1.0d));
        double[] doubleArray15 = new double[] { (short) 10 };
        double[] doubleArray20 = new double[] { '#', 1.0f, (byte) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 1.0, 0.0, -1.0]");
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
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
        double double23 = iIRFilter1.process(100.0d);
        double double25 = iIRFilter1.process((double) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 1);
        double double9 = iIRFilter1.process((double) 0L);
        double[] doubleArray15 = new double[] { (byte) 10, (short) 10, 100, 0.0d, 32.0d };
        double[] doubleArray18 = new double[] { 10L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 100.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0]");
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) 10);
        double double15 = iIRFilter1.process(0.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(0.0d);
        double double11 = iIRFilter1.process((double) (-1));
        double double13 = iIRFilter1.process((double) 0);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray22 = new double[] { 35.0d, '4', 10.0d, 100L, 100.0f, 100L };
        double[] doubleArray27 = new double[] { (byte) 1, (short) 0, (-1.0f), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 52.0, 10.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 0.0, -1.0, 32.0]");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(1);
        double double3 = iIRFilter1.process((double) (short) -1);
        double double5 = iIRFilter1.process((double) (-1.0f));
        double double7 = iIRFilter1.process((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 0);
        double double11 = iIRFilter1.process(0.0d);
        double[] doubleArray17 = new double[] { (short) 1, (-1), (byte) 10, 1.0f, 10L };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(52.0d);
        double double15 = iIRFilter1.process((-1.0d));
        double[] doubleArray17 = new double[] { (short) 10 };
        double[] doubleArray24 = new double[] { 1L, 1, (-1L), 10.0f, 32.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 1.0, -1.0, 10.0, 32.0, 10.0]");
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
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
        double double21 = iIRFilter1.process((double) 100);
        double[] doubleArray28 = new double[] { (byte) 0, 32.0d, (-1L), 100, 1L, 0.0f };
        double[] doubleArray34 = new double[] { 52.0d, 100.0d, 0.0f, (-1.0f), 10L };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray34);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 32.0, -1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[52.0, 100.0, 0.0, -1.0, 10.0]");
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) 0L);
        double double21 = iIRFilter1.process(0.0d);
        double[] doubleArray27 = new double[] { (byte) 10, '#', 1L, (short) -1, (byte) 1 };
        double[] doubleArray29 = new double[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 35.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
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
        double[] doubleArray38 = new double[] { 10L, 32.0d, 32.0d, 0, (byte) -1, (-1.0f) };
        double[] doubleArray43 = new double[] { (short) 0, (-1), (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray38, doubleArray43);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 97.0d + "'", double31 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 32.0, 32.0, 0.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, -1.0, -1.0, 10.0]");
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray21 = new double[] { (short) 100, (short) -1, 100L, 32.0d, 10.0f };
        double[] doubleArray28 = new double[] { 0.0f, 10L, (byte) 100, 1L, (-1.0f), '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray28);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, -1.0, 100.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 10.0, 100.0, 1.0, -1.0, 52.0]");
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
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
        double[] doubleArray21 = new double[] { 97.0d };
        double[] doubleArray27 = new double[] { 52.0d, 10L, 100, 97.0d, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 10.0, 100.0, 97.0, 32.0]");
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) (-1));
        double double15 = iIRFilter1.process((double) 'a');
        double double17 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(32.0d);
        double double5 = iIRFilter1.process(10.0d);
        double[] doubleArray7 = new double[] { 100.0f };
        double[] doubleArray11 = new double[] { 10.0d, (byte) 100, 32.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0, 32.0]");
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (byte) 10);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process((double) (byte) 0);
        double[] doubleArray19 = new double[] { 1L, 100.0d, (byte) 0 };
        double[] doubleArray21 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray21);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 0);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) (short) 100);
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process((double) (short) 1);
        double[] doubleArray17 = new double[] { 1.0f };
        double[] doubleArray23 = new double[] { 52.0d, '4', 0.0f, (byte) 1, 100.0d };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, 52.0, 0.0, 1.0, 100.0]");
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 10);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process((double) (byte) 1);
        double[] doubleArray14 = new double[] { 1.0f, 52.0d, (-1), 0.0f, (byte) -1, 'a' };
        double[] doubleArray20 = new double[] { '4', (short) 1, 1.0f, 0L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 52.0, -1.0, 0.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 1.0, 1.0, 0.0, -1.0]");
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
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
        double[] doubleArray24 = null;
        double[] doubleArray30 = new double[] { (byte) 1, 1.0d, (byte) 10, ' ', 52.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 1.0, 10.0, 32.0, 52.0]");
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) '4');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray18 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(10.0d);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray19 = new double[] { 1.0f, 0, 0L, 0.0f, (-1.0f), (short) 100 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 0.0, 0.0, 0.0, -1.0, 100.0]");
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 0);
        double double7 = iIRFilter1.process((double) (-1));
        double[] doubleArray10 = new double[] { (-1.0f), 35.0d };
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 10);
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 1.0f);
        double double19 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray23 = new double[] { 10.0f, (short) 1, 0.0d };
        double[] doubleArray25 = new double[] { 'a' };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0]");
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(97.0d);
        double double13 = iIRFilter1.process((double) (-1L));
        double[] doubleArray20 = new double[] { (-1.0d), (byte) 10, ' ', 10.0d, (-1L), 1L };
        double[] doubleArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, 32.0, 10.0, -1.0, 1.0]");
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) 0L);
        double[] doubleArray18 = new double[] { (short) 0, 0.0f, 0.0d, '#', 100L, 0L };
        double[] doubleArray24 = new double[] { (byte) 0, 100.0f, (short) 100, (-1L), (short) -1 };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 35.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 100.0, 100.0, -1.0, -1.0]");
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) ' ');
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
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
        double double21 = iIRFilter1.process((double) '#');
        java.lang.Class<?> wildcardClass22 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) (-1));
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) '#');
        double double15 = iIRFilter1.process(0.0d);
        double double17 = iIRFilter1.process((double) 100);
        java.lang.Class<?> wildcardClass18 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process(32.0d);
        double[] doubleArray5 = new double[] { 10.0d };
        double[] doubleArray6 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) 1.0f);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((double) (-1L));
        java.lang.Class<?> wildcardClass10 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) (byte) 1);
        double double7 = iIRFilter1.process((double) (short) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) 0.0f);
        double double13 = iIRFilter1.process((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) ' ');
        double double15 = iIRFilter1.process(52.0d);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process(10.0d);
        double[] doubleArray19 = new double[] { (byte) 100 };
        double[] doubleArray21 = new double[] { 97.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0]");
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) ' ');
        double double5 = iIRFilter1.process(1.0d);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { 10.0f, 0L, 1.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 1.0, -1.0]");
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
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
        double double23 = iIRFilter1.process((double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(52.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process(35.0d);
        double double11 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
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
        double double25 = iIRFilter1.process(1.0d);
        double[] doubleArray30 = new double[] { '#', '#', (short) 1, 10L };
        double[] doubleArray34 = new double[] { 52.0d, (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray34);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 35.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[52.0, 1.0, -1.0]");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) '4');
        double double11 = iIRFilter1.process((double) (byte) -1);
        double double13 = iIRFilter1.process((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) (short) 100);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10L);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray22 = new double[] { (-1.0f), 100L };
        double[] doubleArray28 = new double[] { 10.0d, (-1.0d), (byte) -1, (-1L), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, -1.0, -1.0, 10.0]");
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (byte) 1);
        double double15 = iIRFilter1.process((double) 10);
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
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(100);
        double double3 = iIRFilter1.process((double) (short) -1);
        double double5 = iIRFilter1.process((double) 'a');
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
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
        double[] doubleArray32 = new double[] { (short) 0, 10.0f, (short) 100, 100, 10, (short) 10 };
        double[] doubleArray39 = new double[] { 0.0f, (byte) 1, (-1L), (byte) -1, 10.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray32, doubleArray39);
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
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 10.0, 100.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0, -1.0, -1.0, 10.0, 1.0]");
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((-1.0d));
        double double5 = iIRFilter1.process((double) '4');
        java.lang.Class<?> wildcardClass6 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) 10L);
        double double11 = iIRFilter1.process((double) 1L);
        double double13 = iIRFilter1.process(100.0d);
        double[] doubleArray18 = new double[] { 100.0d, (byte) -1, (short) 1, 100.0f };
        double[] doubleArray24 = new double[] { '4', (-1.0f), 1.0f, 32.0d, 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[52.0, -1.0, 1.0, 32.0, 35.0]");
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(100.0d);
        double[] doubleArray12 = new double[] { ' ', (byte) 1, (-1.0f), (-1) };
        double[] doubleArray15 = new double[] { (short) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 1, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0]");
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
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
        double double29 = iIRFilter1.process((double) (-1L));
        double[] doubleArray30 = new double[] {};
        double[] doubleArray33 = new double[] { 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray30, doubleArray33);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 97.0]");
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (byte) 100);
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) ' ');
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) (-1L));
        double[] doubleArray17 = new double[] { 1L };
        double[] doubleArray19 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 100L);
        double double7 = iIRFilter1.process(52.0d);
        double double9 = iIRFilter1.process((double) 10.0f);
        double double11 = iIRFilter1.process((double) 0.0f);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) '#');
        double double5 = iIRFilter1.process((double) (short) 10);
        double[] doubleArray8 = new double[] { '4', 1.0d };
        double[] doubleArray10 = new double[] { 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0]");
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process(0.0d);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { 10.0f, 52.0d, 1L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0, 100.0]");
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (-1L));
        double double7 = iIRFilter1.process((double) 0L);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) '4');
        double double13 = iIRFilter1.process((double) 1.0f);
        double double15 = iIRFilter1.process((double) 10.0f);
        double[] doubleArray20 = new double[] { 1.0d, 32.0d, '4', 1L };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray20, doubleArray21);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 32.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process(32.0d);
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process((double) 1);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray19 = new double[] { (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 35.0]");
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
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
        double double23 = iIRFilter1.process((double) 1);
        double[] doubleArray27 = new double[] { '4', (short) -1, 1L };
        double[] doubleArray30 = new double[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 10.0]");
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) 10L);
        double double15 = iIRFilter1.process(35.0d);
        double double17 = iIRFilter1.process((double) (-1L));
        double[] doubleArray24 = new double[] { 0.0f, 100L, 1.0f, 10L, ' ', '4' };
        double[] doubleArray29 = new double[] { 10L, 100L, 97.0d, (short) 100 };
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 100.0, 1.0, 10.0, 32.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 100.0, 97.0, 100.0]");
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) 1.0f);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((-1.0d));
        double double13 = iIRFilter1.process((double) (short) 100);
        java.lang.Class<?> wildcardClass14 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
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
        double double25 = iIRFilter1.process((double) (short) -1);
        double[] doubleArray30 = new double[] { 1.0f, 0L, (short) 100, 1.0f };
        double[] doubleArray31 = null;
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 0.0, 100.0, 1.0]");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double[] doubleArray18 = new double[] { (short) -1, 97.0d, 'a', (short) 1 };
        double[] doubleArray24 = new double[] { (short) -1, 1L, (byte) 100, 0L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 97, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0, 100.0, 0.0, 10.0]");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) 10.0f);
        double double7 = iIRFilter1.process((double) 10);
        double double9 = iIRFilter1.process(0.0d);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 10);
        double double11 = iIRFilter1.process((double) '#');
        double double13 = iIRFilter1.process((double) '4');
        double[] doubleArray14 = new double[] {};
        double[] doubleArray17 = new double[] { (byte) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, -1.0]");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
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
        double double21 = iIRFilter1.process((double) 1);
        double[] doubleArray24 = new double[] { (-1L), '#' };
        double[] doubleArray31 = new double[] { (-1.0f), (-1.0d), (-1.0d), 1.0d, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray31);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 100.0, 1.0]");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(32.0d);
        double double13 = iIRFilter1.process(35.0d);
        double double15 = iIRFilter1.process(10.0d);
        double double17 = iIRFilter1.process((double) (short) 0);
        double double19 = iIRFilter1.process((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter(10);
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (byte) 10);
        double double7 = iIRFilter1.process((double) 0);
        double double9 = iIRFilter1.process((double) (byte) -1);
        double double11 = iIRFilter1.process((double) 100.0f);
        double double13 = iIRFilter1.process((double) (short) 10);
        double double15 = iIRFilter1.process((double) '4');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray18 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 10, got 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0]");
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) (short) 1);
        double double15 = iIRFilter1.process((double) 0.0f);
        double[] doubleArray22 = new double[] { (byte) 100, (byte) 100, 1.0f, 'a', 10.0f, 0L };
        double[] doubleArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 1.0, 97.0, 10.0, 0.0]");
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) 1L);
        double double5 = iIRFilter1.process((double) (byte) -1);
        double double7 = iIRFilter1.process((double) 100.0f);
        double double9 = iIRFilter1.process((-1.0d));
        double double11 = iIRFilter1.process((double) 10.0f);
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process(0.0d);
        double[] doubleArray16 = null;
        double[] doubleArray19 = new double[] { (short) -1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray19);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0]");
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) '#');
        double double11 = iIRFilter1.process((double) (byte) 1);
        double double13 = iIRFilter1.process((double) 0.0f);
        double double15 = iIRFilter1.process(1.0d);
        double double17 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray22 = new double[] { (byte) 100, 10, 0, 'a' };
        double[] doubleArray26 = new double[] { (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, 1.0]");
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) 1);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
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
        double[] doubleArray29 = new double[] { (short) 1, 'a', 1.0f };
        double[] doubleArray32 = new double[] { 10L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray29, doubleArray32);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0]");
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(97.0d);
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process((double) (short) 0);
        double double11 = iIRFilter1.process(32.0d);
        java.lang.Class<?> wildcardClass12 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) 100);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process((double) (-1L));
        double double15 = iIRFilter1.process((double) 10.0f);
        double double17 = iIRFilter1.process((double) (short) -1);
        double double19 = iIRFilter1.process((double) 100L);
        double[] doubleArray24 = new double[] { 100L, 10.0f, 100.0f, 10.0d };
        double[] doubleArray26 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray24, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0]");
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
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
        double double23 = iIRFilter1.process((double) 100L);
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
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process((double) 100L);
        double double21 = iIRFilter1.process(35.0d);
        double[] doubleArray23 = new double[] { '#' };
        double[] doubleArray26 = new double[] { 52.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray23, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 1");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, -1.0]");
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((-1.0d));
        double double7 = iIRFilter1.process((double) '#');
        double double9 = iIRFilter1.process(1.0d);
        double double11 = iIRFilter1.process((double) 1);
        double[] doubleArray18 = new double[] { 100.0d, (byte) -1, (byte) -1, ' ', (byte) -1, 35.0d };
        double[] doubleArray24 = new double[] { 10.0f, (short) 0, (short) 0, '#', 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0, -1.0, 32.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 0.0, 0.0, 35.0, 10.0]");
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) (short) 10);
        double double9 = iIRFilter1.process((double) (byte) 0);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process((double) (byte) 0);
        double double15 = iIRFilter1.process((double) (-1.0f));
        double[] doubleArray16 = null;
        double[] doubleArray18 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"aCoeffs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0]");
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10L);
        double double5 = iIRFilter1.process((double) 10);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process((double) 0L);
        double double13 = iIRFilter1.process((-1.0d));
        double double15 = iIRFilter1.process((double) 100);
        double double17 = iIRFilter1.process((double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process(0.0d);
        double double9 = iIRFilter1.process((double) 0.0f);
        double double11 = iIRFilter1.process(100.0d);
        double double13 = iIRFilter1.process((double) 100);
        double double15 = iIRFilter1.process((double) (short) 100);
        double double17 = iIRFilter1.process((double) ' ');
        double[] doubleArray19 = new double[] { 100.0d };
        double[] doubleArray24 = new double[] { 0L, 10.0f, '4', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray19, doubleArray24);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 10.0, 52.0, 0.0]");
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 1L);
        double double7 = iIRFilter1.process((double) 1L);
        double double9 = iIRFilter1.process((double) 1.0f);
        double double11 = iIRFilter1.process((double) (byte) 100);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 10.0f);
        java.lang.Class<?> wildcardClass16 = iIRFilter1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 1);
        double double3 = iIRFilter1.process((double) (short) 0);
        double double5 = iIRFilter1.process((double) (short) 1);
        double double7 = iIRFilter1.process(100.0d);
        double double9 = iIRFilter1.process((double) (-1L));
        double double11 = iIRFilter1.process((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (short) 100);
        double double9 = iIRFilter1.process((double) 100L);
        double double11 = iIRFilter1.process(10.0d);
        double[] doubleArray17 = new double[] { (byte) 100, 1L, (short) -1, 1.0f, (short) 10 };
        double[] doubleArray20 = new double[] { 'a', 32.0d };
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 32.0]");
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) 'a');
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process(0.0d);
        double double7 = iIRFilter1.process(35.0d);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 1);
        double double13 = iIRFilter1.process((double) 1L);
        double double15 = iIRFilter1.process((double) (byte) 10);
        double[] doubleArray21 = new double[] { 1, (byte) 1, 1, '4', 1 };
        double[] doubleArray25 = new double[] { (short) 100, 100.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray25);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 1.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0, 100.0]");
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '#');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process(10.0d);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process((double) 0L);
        double double11 = iIRFilter1.process((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
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
        double double25 = iIRFilter1.process(52.0d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) (short) 100);
        double double3 = iIRFilter1.process((double) (byte) 1);
        double double5 = iIRFilter1.process((double) 0L);
        double double7 = iIRFilter1.process((double) 100L);
        double double9 = iIRFilter1.process((double) (short) 10);
        double double11 = iIRFilter1.process((double) 100L);
        double[] doubleArray16 = new double[] { (short) -1, '#', (byte) -1, (-1) };
        double[] doubleArray21 = new double[] { (byte) -1, 97.0d, 10L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 100, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 97.0, 10.0, 10.0]");
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
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
        double[] doubleArray27 = new double[] { 35.0d };
        double[] doubleArray30 = new double[] { 1L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray27, doubleArray30);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, -1.0]");
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
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
        double double21 = iIRFilter1.process(32.0d);
        double double23 = iIRFilter1.process((double) '#');
        double double25 = iIRFilter1.process(32.0d);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 10.0f);
        double double5 = iIRFilter1.process((double) (short) 10);
        double double7 = iIRFilter1.process((double) 1);
        double double9 = iIRFilter1.process(100.0d);
        double double11 = iIRFilter1.process((double) (-1L));
        double double13 = iIRFilter1.process(10.0d);
        double double15 = iIRFilter1.process((double) (byte) 1);
        double double17 = iIRFilter1.process((double) (byte) 0);
        double double19 = iIRFilter1.process((double) 100L);
        double double21 = iIRFilter1.process(35.0d);
        double double23 = iIRFilter1.process((double) (byte) 100);
        double[] doubleArray28 = new double[] { 52.0d, 10.0d, 97.0d, 0.0f };
        double[] doubleArray30 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray28, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 4");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[52.0, 10.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        com.thealgorithms.audiofilters.IIRFilter iIRFilter1 = new com.thealgorithms.audiofilters.IIRFilter((int) '4');
        double double3 = iIRFilter1.process((double) 1);
        double double5 = iIRFilter1.process((double) 0.0f);
        double double7 = iIRFilter1.process((double) (-1L));
        double double9 = iIRFilter1.process((double) (short) 1);
        double double11 = iIRFilter1.process(0.0d);
        double double13 = iIRFilter1.process(0.0d);
        double double15 = iIRFilter1.process((double) 1);
        double[] doubleArray21 = new double[] { (short) 1, 1.0f, 52.0d, 1, 1 };
        double[] doubleArray23 = new double[] { 35.0d };
        // The following exception was thrown during execution in test generation
        try {
            iIRFilter1.setCoeffs(doubleArray21, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aCoeffs must be of size 52, got 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 52.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0]");
    }
}

