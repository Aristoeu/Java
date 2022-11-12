package ciphers.AES;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, (-1), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, -1, 0]");
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        int[] intArray5 = new int[] { 1, (byte) 10, (byte) 0, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 0, 32, 1]");
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        int[] intArray5 = new int[] { (short) 1, (byte) 1, 1, (short) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 1, 10, 10]");
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        int[] intArray4 = new int[] { ' ', (short) -1, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, -1, 10, 52]");
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        int[] intArray6 = new int[] { 10, (byte) 10, (byte) 0, (byte) 0, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 0, 0, 10, 1]");
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        int[] intArray5 = new int[] { 100, '#', 0, (byte) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, 0, 0, -1]");
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        int[] intArray4 = new int[] { (short) 0, (byte) 1, (short) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 100, -1]");
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
        int[] intArray4 = new int[] { 10, 'a', (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 97, 0, 10]");
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
        int[] intArray4 = new int[] { 1, 100, (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, -1, 0]");
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        int[] intArray4 = new int[] { (byte) 1, (byte) 100, '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 52, 1]");
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
        int[] intArray6 = new int[] { (short) 0, (byte) 10, (byte) 0, '4', (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 0, 52, -1, 1]");
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
        int[] intArray5 = new int[] { 1, 0, (short) 0, 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 0, 100, 0]");
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
        int[] intArray5 = new int[] { '4', 0, (-1), (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, -1, -1, 0]");
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        int[] intArray6 = new int[] { 10, 0, (short) 10, (byte) 0, 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 10, 0, 1, 100]");
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
        int[] intArray3 = new int[] { (byte) 10, (short) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 52]");
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
        int[] intArray5 = new int[] { 10, 10, '#', 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 35, 100, 0]");
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        int[] intArray4 = new int[] { (byte) 10, '#', 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, 10, -1]");
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        int[] intArray4 = new int[] { (short) 0, '4', (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100, -1]");
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, (byte) 0, '#', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 0, 35, 10]");
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        int[] intArray3 = new int[] { 10, (short) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, -1]");
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
        int[] intArray3 = new int[] { '#', (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 10, 1]");
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 10, 35]");
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        int[] intArray4 = new int[] { '#', 100, (byte) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 100, 1, 0]");
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
        int[] intArray6 = new int[] { '#', (-1), (short) 10, ' ', (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 10, 32, 100, 0]");
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
        int[] intArray5 = new int[] { (short) 0, ' ', 0, (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, 0, 1, 1]");
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        int[] intArray4 = new int[] { 'a', 'a', (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 97, -1, 100]");
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        int[] intArray3 = new int[] { 0, ' ', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 1]");
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
        int[] intArray4 = new int[] { (short) 100, 1, (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, -1, 0]");
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
        int[] intArray3 = new int[] { (short) 10, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 32, 1]");
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
        int[] intArray6 = new int[] { 0, 10, (-1), 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, -1, 1, 100, 10]");
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
        int[] intArray5 = new int[] { (byte) 1, (byte) 100, '4', (short) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 52, 1, 0]");
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
        int[] intArray3 = new int[] { (byte) 1, 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, -1]");
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        int[] intArray4 = new int[] { 100, 'a', 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 97, 1, 97]");
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        int[] intArray5 = new int[] { '4', (byte) 100, ' ', 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 32, 0, 100]");
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (byte) -1, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, -1, 52, 1]");
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
        int[] intArray6 = new int[] { (byte) 1, (-1), (short) -1, ' ', '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, -1, 32, 52, 0]");
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
        int[] intArray6 = new int[] { (-1), (byte) -1, (byte) 10, (byte) 0, (short) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 10, 0, 100, 35]");
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 1]");
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
        int[] intArray3 = new int[] { 1, 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
        int[] intArray6 = new int[] { (short) 1, 10, (byte) 100, (byte) 0, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 100, 0, 100, 35]");
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
        int[] intArray5 = new int[] { '#', '#', 100, ' ', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 35, 100, 32, 0]");
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
        int[] intArray6 = new int[] { 1, (byte) 0, (byte) 100, 10, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 100, 10, -1, 10]");
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
        int[] intArray5 = new int[] { 1, (short) 10, ' ', 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 32, 97, 100]");
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, (short) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 0, -1]");
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
        int[] intArray4 = new int[] { (byte) 100, (-1), (byte) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 1, 32]");
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
        int[] intArray6 = new int[] { (short) 1, 0, 'a', 0, (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 97, 0, -1, 35]");
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
        int[] intArray6 = new int[] { (byte) 0, 1, ' ', 10, 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 32, 10, 10, 100]");
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
        int[] intArray4 = new int[] { (short) 0, (byte) 0, 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 10, 10]");
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
        int[] intArray6 = new int[] { (byte) 10, (-1), 10, (short) 100, (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 10, 100, 10, 10]");
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        int[] intArray4 = new int[] { ' ', (byte) 100, (byte) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 100, 0, 10]");
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
        int[] intArray4 = new int[] { 'a', 10, (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 10, 10, 10]");
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
        int[] intArray4 = new int[] { (short) -1, '#', ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 32, 1]");
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
        int[] intArray6 = new int[] { (-1), (short) 1, (-1), '4', 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, -1, 52, 1, 1]");
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
        int[] intArray6 = new int[] { 'a', (short) 1, 0, (short) 10, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 0, 10, -1, 1]");
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
        int[] intArray6 = new int[] { (short) 0, 'a', (-1), ' ', (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 97, -1, 32, 100, 52]");
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
        int[] intArray5 = new int[] { 10, (short) 1, (short) 0, (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 0, 10, 0]");
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 10, 1]");
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
        int[] intArray5 = new int[] { '4', (short) 1, 1, (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 1, 0, 10]");
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
        int[] intArray6 = new int[] { (byte) 1, ' ', (short) 0, (short) 10, 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 32, 0, 10, 100, 10]");
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) -1, (short) 100, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, -1, 100, -1, 0]");
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
        int[] intArray3 = new int[] { 'a', 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 0, 52]");
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, (short) 10, '#', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 10, 35, 1]");
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
        int[] intArray3 = new int[] { '4', ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 32, 1]");
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
        int[] intArray5 = new int[] { (byte) 0, 0, 0, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 97, 10]");
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
        int[] intArray5 = new int[] { (byte) 100, (short) -1, 'a', (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 97, 1, 10]");
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
        int[] intArray6 = new int[] { (-1), 100, (byte) -1, 0, (byte) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, -1, 0, 100, 1]");
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
        int[] intArray4 = new int[] { (short) 1, (short) 1, (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 0, 10]");
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
        int[] intArray5 = new int[] { (byte) -1, 1, '#', (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 35, 0, 100]");
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
        int[] intArray5 = new int[] { (byte) 10, 100, 100, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 100, 1, 10]");
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
        int[] intArray4 = new int[] { (short) -1, (byte) 10, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 100, 35]");
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
        int[] intArray4 = new int[] { (short) 0, (byte) 10, (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 10, 1]");
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
        int[] intArray3 = new int[] { (short) 1, 'a', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 97, 0]");
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
        int[] intArray5 = new int[] { (short) 0, 10, (short) 1, 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 10, 100]");
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
        int[] intArray5 = new int[] { '4', 100, '#', (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 35, 0, 0]");
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, 0, (short) 10, 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 0, 10, 0, 1]");
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
        int[] intArray6 = new int[] { 1, (short) 1, '4', '4', 'a', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 52, 52, 97, 10]");
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
        int[] intArray6 = new int[] { 0, (short) 0, (short) 10, (byte) -1, (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 10, -1, -1, 100]");
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
        int[] intArray6 = new int[] { ' ', '4', (byte) 1, 1, (byte) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 52, 1, 1, 100, 1]");
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
        int[] intArray6 = new int[] { ' ', (short) -1, (short) 10, (short) 100, 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, 100, 10, 10]");
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
        int[] intArray3 = new int[] { (byte) 0, ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 35]");
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
        int[] intArray5 = new int[] { (short) 1, (byte) 1, 100, (byte) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 100, 10, 100]");
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
        int[] intArray3 = new int[] { (byte) 10, 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 32]");
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', 'a', 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, 97, 0, 100]");
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
        int[] intArray3 = new int[] { (byte) 10, (short) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, -1]");
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
        int[] intArray6 = new int[] { (byte) 1, 'a', (short) -1, (byte) 0, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 97, -1, 0, 1, -1]");
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
        int[] intArray6 = new int[] { 1, 0, (short) 1, 100, ' ', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 1, 100, 32, 10]");
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
        int[] intArray4 = new int[] { 1, (short) 100, (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 0, 100]");
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14088");
        int[] intArray5 = new int[] { (byte) 0, (byte) -1, 'a', (-1), 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 97, -1, 0]");
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14089");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100, 0]");
    }

    @Test
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14090");
        int[] intArray4 = new int[] { '#', (short) 100, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 100, 35, 1]");
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14091");
        int[] intArray5 = new int[] { (byte) 10, 10, 1, (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 1, -1, 100]");
    }

    @Test
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14092");
        int[] intArray5 = new int[] { 100, (byte) 100, (byte) 0, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 0, 1, 0]");
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14093");
        int[] intArray5 = new int[] { '#', (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, -1, 10, -1]");
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14094");
        int[] intArray3 = new int[] { '4', (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 0]");
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14095");
        int[] intArray5 = new int[] { (byte) 100, 10, '#', (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 35, -1, 10]");
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14096");
        int[] intArray6 = new int[] { (short) 10, (byte) 10, (short) 0, (byte) 1, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 0, 1, 100, 35]");
    }

    @Test
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14097");
        int[] intArray3 = new int[] { ' ', (short) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 10]");
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14098");
        int[] intArray5 = new int[] { (byte) 100, 'a', (byte) 10, ' ', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 10, 32, -1]");
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14099");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, (short) 10, 100, (byte) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 10, 100, 0, 1]");
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14100");
        int[] intArray3 = new int[] { (-1), 'a', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 100]");
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14101");
        int[] intArray4 = new int[] { (short) 1, (short) 10, (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 100]");
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14102");
        int[] intArray3 = new int[] { 'a', 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 0, 35]");
    }

    @Test
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14103");
        int[] intArray6 = new int[] { 100, (byte) -1, (byte) -1, ' ', (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, -1, 32, -1, 100]");
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14104");
        int[] intArray5 = new int[] { 1, 0, (short) 0, 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 0, 100, 100]");
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14105");
        int[] intArray5 = new int[] { (short) 1, '#', 10, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 35, 10, 10, -1]");
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14106");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 10]");
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14107");
        int[] intArray5 = new int[] { 0, 1, 100, '4', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 100, 52, 100]");
    }

    @Test
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14108");
        int[] intArray5 = new int[] { (byte) 0, '4', (-1), (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 52, -1, 10, 0]");
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14109");
        int[] intArray3 = new int[] { (byte) 0, 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 97]");
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14110");
        int[] intArray5 = new int[] { '#', (byte) 10, (short) 100, '4', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 100, 52, 10]");
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14111");
        int[] intArray6 = new int[] { (byte) 0, (byte) 1, '4', 0, (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 52, 0, 100, 1]");
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14112");
        int[] intArray5 = new int[] { (byte) 0, (short) 10, ' ', '#', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 35, 10]");
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14113");
        int[] intArray6 = new int[] { '4', (byte) 100, ' ', (byte) 10, (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 32, 10, -1, 1]");
    }

    @Test
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14114");
        int[] intArray5 = new int[] { (byte) -1, (-1), ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 32, 32, 35]");
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14115");
        int[] intArray5 = new int[] { (short) 100, 100, (short) 100, (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 100, 100, 35]");
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14116");
        int[] intArray6 = new int[] { ' ', (byte) -1, 100, (short) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 100, 100, -1, -1]");
    }

    @Test
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14117");
        int[] intArray6 = new int[] { 100, 'a', '#', 10, '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 97, 35, 10, 52, 52]");
    }

    @Test
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14118");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 1]");
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14119");
        int[] intArray5 = new int[] { (short) -1, 100, 'a', (short) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 97, -1, 10]");
    }

    @Test
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14120");
        int[] intArray3 = new int[] { '4', 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 97, 10]");
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14121");
        int[] intArray5 = new int[] { 10, (byte) 1, 10, 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 10, 0, 100]");
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14122");
        int[] intArray4 = new int[] { (byte) -1, (byte) -1, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 32, 100]");
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14123");
        int[] intArray6 = new int[] { (short) -1, '4', 'a', (byte) 1, ' ', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 52, 97, 1, 32, 10]");
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14124");
        int[] intArray6 = new int[] { (short) 1, (byte) 0, 'a', (byte) 10, (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 97, 10, 10, -1]");
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14125");
        int[] intArray3 = new int[] { (short) 0, (byte) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 10]");
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14126");
        int[] intArray5 = new int[] { (short) -1, (byte) 0, (short) -1, '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, -1, 35, 0]");
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14127");
        int[] intArray6 = new int[] { (short) 10, '#', 100, (-1), 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 100, -1, 0, -1]");
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14128");
        int[] intArray3 = new int[] { (-1), '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14129");
        int[] intArray6 = new int[] { (short) -1, 'a', 'a', (short) 0, '4', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 97, 97, 0, 52, 100]");
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14130");
        int[] intArray4 = new int[] { (short) 10, '4', (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 100]");
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14131");
        int[] intArray4 = new int[] { 'a', '#', (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 35, 1, 100]");
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14132");
        int[] intArray4 = new int[] { 'a', '#', (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 35, 0, 0]");
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14133");
        int[] intArray5 = new int[] { (short) 10, '#', (byte) 10, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35, 10, -1, 32]");
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14134");
        int[] intArray3 = new int[] { (byte) 0, ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14135");
        int[] intArray4 = new int[] { (byte) 10, (short) 0, (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, -1, 10]");
    }

    @Test
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14136");
        int[] intArray3 = new int[] { 100, (short) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, -1]");
    }

    @Test
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14137");
        int[] intArray5 = new int[] { 100, 'a', (byte) 10, ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 10, 32, 52]");
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14138");
        int[] intArray6 = new int[] { 0, (short) 10, 1, 10, (short) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 1, 10, -1, 97]");
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14139");
        int[] intArray6 = new int[] { (byte) 0, 'a', 100, (short) 1, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 97, 100, 1, 100, 0]");
    }

    @Test
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14140");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, -1, 97]");
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14141");
        int[] intArray5 = new int[] { (byte) -1, 100, '#', 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 35, 0, 35]");
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14142");
        int[] intArray5 = new int[] { (byte) 0, (byte) 1, ' ', (byte) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 32, -1, 97]");
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14143");
        int[] intArray4 = new int[] { 10, ' ', 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 32, 10, 100]");
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14144");
        int[] intArray5 = new int[] { (byte) -1, (short) 1, 0, 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 0, 10, -1]");
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14145");
        int[] intArray4 = new int[] { (byte) 0, (short) 100, '#', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 35, -1]");
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14146");
        int[] intArray5 = new int[] { ' ', (byte) 0, 'a', (-1), '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 0, 97, -1, 52]");
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14147");
        int[] intArray3 = new int[] { 'a', (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 35]");
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14148");
        int[] intArray3 = new int[] { (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 10]");
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14149");
        int[] intArray5 = new int[] { (short) 0, (short) 100, 10, (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 10, -1, 35]");
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14150");
        int[] intArray6 = new int[] { 0, (short) 100, (byte) 1, (short) 0, (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 1, 0, 10, 10]");
    }

    @Test
    public void test14151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14151");
        int[] intArray3 = new int[] { 0, 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 1]");
    }

    @Test
    public void test14152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14152");
        int[] intArray3 = new int[] { (byte) 10, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 0]");
    }

    @Test
    public void test14153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14153");
        int[] intArray6 = new int[] { 100, '#', '4', (short) -1, (byte) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 35, 52, -1, 1, 52]");
    }

    @Test
    public void test14154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14154");
        int[] intArray6 = new int[] { (byte) 1, (-1), 1, (short) 100, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 1, 100, 1, 100]");
    }

    @Test
    public void test14155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14155");
        int[] intArray4 = new int[] { (short) -1, (-1), (-1), 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, -1, 0]");
    }

    @Test
    public void test14156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14156");
        int[] intArray3 = new int[] { 10, '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 35, 52]");
    }

    @Test
    public void test14157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14157");
        int[] intArray3 = new int[] { (short) 100, '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 35, 32]");
    }

    @Test
    public void test14158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14158");
        int[] intArray5 = new int[] { (byte) -1, '#', '#', '4', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, 35, 52, -1]");
    }

    @Test
    public void test14159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14159");
        int[] intArray3 = new int[] { '#', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 97, 97]");
    }

    @Test
    public void test14160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14160");
        int[] intArray6 = new int[] { 1, (short) 0, (short) 1, (short) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 1, 100, 100, 10]");
    }

    @Test
    public void test14161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14161");
        int[] intArray3 = new int[] { (short) 100, '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 0]");
    }

    @Test
    public void test14162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14162");
        int[] intArray5 = new int[] { 100, 0, (short) 100, 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 100, 100, 0]");
    }

    @Test
    public void test14163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14163");
        int[] intArray5 = new int[] { (byte) 10, (short) 0, 'a', (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 97, -1, 1]");
    }

    @Test
    public void test14164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14164");
        int[] intArray5 = new int[] { 100, 100, 1, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 1, 10, 0]");
    }

    @Test
    public void test14165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14165");
        int[] intArray3 = new int[] { 'a', 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 100]");
    }

    @Test
    public void test14166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14166");
        int[] intArray3 = new int[] { (-1), 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 0, 32]");
    }

    @Test
    public void test14167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14167");
        int[] intArray6 = new int[] { (byte) 100, 0, (byte) 0, (short) 1, (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 0, 1, 100, 35]");
    }

    @Test
    public void test14168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14168");
        int[] intArray6 = new int[] { '#', (short) 1, (byte) 10, (short) 10, 'a', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, 10, 10, 97, 0]");
    }

    @Test
    public void test14169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14169");
        int[] intArray4 = new int[] { (short) 0, (-1), (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 1, 10]");
    }

    @Test
    public void test14170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14170");
        int[] intArray5 = new int[] { (byte) 1, (short) -1, (short) -1, (byte) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1, 1, 32]");
    }

    @Test
    public void test14171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14171");
        int[] intArray6 = new int[] { (byte) 10, 0, '4', (-1), ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 52, -1, 32, 97]");
    }

    @Test
    public void test14172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14172");
        int[] intArray3 = new int[] { (byte) 1, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, 0]");
    }

    @Test
    public void test14173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14173");
        int[] intArray4 = new int[] { (byte) 0, 10, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, -1, 0]");
    }

    @Test
    public void test14174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14174");
        int[] intArray5 = new int[] { (-1), (byte) -1, 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 100, 0, 10]");
    }

    @Test
    public void test14175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14175");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, -1, 100]");
    }

    @Test
    public void test14176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14176");
        int[] intArray6 = new int[] { 1, (byte) 1, (byte) 1, 10, (byte) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 1, 10, 0, 100]");
    }

    @Test
    public void test14177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14177");
        int[] intArray5 = new int[] { '4', '4', (short) -1, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, -1, 100, -1]");
    }

    @Test
    public void test14178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14178");
        int[] intArray4 = new int[] { (short) 100, (byte) 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, -1, 100]");
    }

    @Test
    public void test14179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14179");
        int[] intArray4 = new int[] { (short) 0, (byte) -1, 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 10]");
    }

    @Test
    public void test14180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14180");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, '#', (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 35, 0, 0, 0]");
    }

    @Test
    public void test14181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14181");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, 1]");
    }

    @Test
    public void test14182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14182");
        int[] intArray4 = new int[] { 100, (short) 10, (short) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100, 0]");
    }

    @Test
    public void test14183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14183");
        int[] intArray4 = new int[] { 'a', (short) 1, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 1, 1, 100]");
    }

    @Test
    public void test14184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14184");
        int[] intArray6 = new int[] { ' ', ' ', (byte) 100, '4', (short) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 32, 100, 52, 100, 35]");
    }

    @Test
    public void test14185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14185");
        int[] intArray6 = new int[] { (-1), (byte) 1, (byte) 1, '4', (short) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 1, 52, 1, 100]");
    }

    @Test
    public void test14186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14186");
        int[] intArray5 = new int[] { (byte) -1, (byte) 1, '#', '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 35, 52, 1]");
    }

    @Test
    public void test14187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14187");
        int[] intArray4 = new int[] { (short) 0, (byte) 100, '4', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 52, 1]");
    }

    @Test
    public void test14188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14188");
        int[] intArray6 = new int[] { (byte) 0, ' ', 10, (byte) 1, (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 32, 10, 1, -1, 1]");
    }

    @Test
    public void test14189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14189");
        int[] intArray5 = new int[] { ' ', (short) 10, (byte) 1, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1, 100, 0]");
    }

    @Test
    public void test14190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14190");
        int[] intArray4 = new int[] { (short) -1, (byte) 1, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 100, 10]");
    }

    @Test
    public void test14191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14191");
        int[] intArray4 = new int[] { 0, (short) 10, '4', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 52, -1]");
    }

    @Test
    public void test14192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14192");
        int[] intArray6 = new int[] { 100, (byte) -1, '4', (short) 10, (short) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 52, 10, 0, 1]");
    }

    @Test
    public void test14193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14193");
        int[] intArray4 = new int[] { (short) 100, ' ', 'a', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 97, 100]");
    }

    @Test
    public void test14194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14194");
        int[] intArray6 = new int[] { (-1), (short) -1, (short) 0, 0, 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 0, 0, 0, 0]");
    }

    @Test
    public void test14195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14195");
        int[] intArray5 = new int[] { (short) 1, (short) -1, (short) 0, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 0, 1, 100]");
    }

    @Test
    public void test14196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14196");
        int[] intArray3 = new int[] { (short) 0, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 97, -1]");
    }

    @Test
    public void test14197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14197");
        int[] intArray3 = new int[] { (short) 0, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 35, 35]");
    }

    @Test
    public void test14198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14198");
        int[] intArray3 = new int[] { (short) 1, 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, 10]");
    }

    @Test
    public void test14199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14199");
        int[] intArray6 = new int[] { 100, (short) 1, (byte) 1, '4', (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 1, 52, 100, 0]");
    }

    @Test
    public void test14200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14200");
        int[] intArray3 = new int[] { 1, (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 0]");
    }

    @Test
    public void test14201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14201");
        int[] intArray5 = new int[] { '4', 0, 10, 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 10, 0, 10]");
    }

    @Test
    public void test14202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14202");
        int[] intArray6 = new int[] { (short) -1, (short) 1, (byte) 0, (short) 100, (short) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 0, 100, -1, -1]");
    }

    @Test
    public void test14203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14203");
        int[] intArray5 = new int[] { '#', (short) 10, 1, 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 1, 100, 100]");
    }

    @Test
    public void test14204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14204");
        int[] intArray5 = new int[] { (short) 1, (short) 0, (short) 10, (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 100]");
    }

    @Test
    public void test14205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14205");
        int[] intArray4 = new int[] { (short) 10, 1, '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 52, 0]");
    }

    @Test
    public void test14206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14206");
        int[] intArray6 = new int[] { (short) 100, '#', (short) 10, 100, 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 35, 10, 100, 0, 97]");
    }

    @Test
    public void test14207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14207");
        int[] intArray6 = new int[] { 100, (short) 10, (short) 0, ' ', (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 0, 32, 0, 0]");
    }

    @Test
    public void test14208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14208");
        int[] intArray6 = new int[] { 0, (byte) 1, (short) 0, 1, (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 0, 1, 100, 10]");
    }

    @Test
    public void test14209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14209");
        int[] intArray6 = new int[] { (short) 1, (short) -1, (byte) -1, (byte) 0, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, -1, 0, 1, 100]");
    }

    @Test
    public void test14210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14210");
        int[] intArray5 = new int[] { ' ', (byte) -1, (byte) 1, (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -1, 1, -1, 35]");
    }

    @Test
    public void test14211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14211");
        int[] intArray5 = new int[] { 100, (byte) -1, ' ', (short) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 32, 1, 0]");
    }

    @Test
    public void test14212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14212");
        int[] intArray3 = new int[] { (short) 10, 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 52]");
    }

    @Test
    public void test14213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14213");
        int[] intArray4 = new int[] { (short) 0, '#', (byte) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 35, 10, 32]");
    }

    @Test
    public void test14214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14214");
        int[] intArray5 = new int[] { 1, (short) 10, (short) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 0, 100, 1]");
    }

    @Test
    public void test14215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14215");
        int[] intArray3 = new int[] { (byte) -1, 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 0, 100]");
    }

    @Test
    public void test14216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14216");
        int[] intArray5 = new int[] { (byte) -1, '4', (byte) 1, 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52, 1, 10, 0]");
    }

    @Test
    public void test14217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14217");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 35]");
    }

    @Test
    public void test14218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14218");
        int[] intArray5 = new int[] { (short) 0, (short) 0, (byte) 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 10, -1, 100]");
    }

    @Test
    public void test14219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14219");
        int[] intArray6 = new int[] { (short) 0, '#', '#', ' ', 'a', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 35, 32, 97, 10]");
    }

    @Test
    public void test14220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14220");
        int[] intArray4 = new int[] { (-1), (byte) 100, '#', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 35, -1]");
    }

    @Test
    public void test14221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14221");
        int[] intArray3 = new int[] { (short) -1, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 10]");
    }

    @Test
    public void test14222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14222");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, (byte) 0, 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 0, 1, 100]");
    }

    @Test
    public void test14223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14223");
        int[] intArray4 = new int[] { (short) 10, (short) 100, ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 32, 1]");
    }

    @Test
    public void test14224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14224");
        int[] intArray3 = new int[] { (byte) 10, 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, -1]");
    }

    @Test
    public void test14225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14225");
        int[] intArray5 = new int[] { 1, (short) 100, 0, (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 0, 1, 35]");
    }

    @Test
    public void test14226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14226");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, (-1), (short) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, -1, 100, 0]");
    }

    @Test
    public void test14227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14227");
        int[] intArray4 = new int[] { (-1), '#', (byte) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 1, 1]");
    }

    @Test
    public void test14228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14228");
        int[] intArray3 = new int[] { (short) 100, 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 10]");
    }

    @Test
    public void test14229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14229");
        int[] intArray4 = new int[] { (short) 100, 0, (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100, 1]");
    }

    @Test
    public void test14230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14230");
        int[] intArray6 = new int[] { (byte) 100, 0, 10, (short) 1, (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 10, 1, -1, 35]");
    }

    @Test
    public void test14231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14231");
        int[] intArray6 = new int[] { 1, 'a', (short) 100, 100, 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 97, 100, 100, 10, 100]");
    }

    @Test
    public void test14232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14232");
        int[] intArray4 = new int[] { (short) 10, '#', (short) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, 0, -1]");
    }

    @Test
    public void test14233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14233");
        int[] intArray3 = new int[] { (byte) 0, '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 35, 100]");
    }

    @Test
    public void test14234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14234");
        int[] intArray5 = new int[] { (byte) 0, (byte) 1, (short) 100, (short) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 100, 100, 100]");
    }
}

