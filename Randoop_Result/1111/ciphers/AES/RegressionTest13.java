package ciphers.AES;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        int[] intArray6 = new int[] { (byte) -1, (short) -1, (byte) 10, (short) -1, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 10, -1, 35, 35]");
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        int[] intArray4 = new int[] { 1, 1, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 1, 10]");
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        int[] intArray3 = new int[] { (short) -1, 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 0, 0]");
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        int[] intArray4 = new int[] { (-1), (byte) 10, 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 10, 1]");
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (short) -1, (short) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, -1, 1, 32]");
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, 1, 1, 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 1, 1, 97, 100]");
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        int[] intArray4 = new int[] { (byte) 10, (byte) 1, (byte) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 0, -1]");
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        int[] intArray6 = new int[] { (byte) 1, ' ', 0, (byte) -1, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 32, 0, -1, 100, 100]");
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        int[] intArray6 = new int[] { (byte) 10, 1, 'a', (byte) -1, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 97, -1, 32, 100]");
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        int[] intArray5 = new int[] { 'a', 0, (byte) 100, (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 0, 100, 1, 1]");
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        int[] intArray3 = new int[] { (short) 100, '4', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, -1]");
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        int[] intArray4 = new int[] { (byte) 100, 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 0, 100]");
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        int[] intArray6 = new int[] { ' ', (byte) 10, ' ', '4', (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 32, 52, 10, 0]");
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        int[] intArray5 = new int[] { '4', (byte) 1, (short) 0, ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 0, 32, 52]");
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        int[] intArray4 = new int[] { 10, (short) 100, (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 1]");
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        int[] intArray5 = new int[] { (short) 10, (-1), (-1), (-1), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, -1, -1, 100]");
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        int[] intArray3 = new int[] { (byte) 1, (short) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        int[] intArray6 = new int[] { (byte) 1, '#', (short) 100, '4', (short) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 35, 100, 52, 1, 0]");
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        int[] intArray3 = new int[] { (short) 0, (short) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 52]");
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        int[] intArray5 = new int[] { (short) 10, (short) 1, (short) -1, (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, -1, 10, 97]");
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        int[] intArray6 = new int[] { (short) 100, (byte) -1, ' ', (byte) 0, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 32, 0, 1, 100]");
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        int[] intArray4 = new int[] { 10, (byte) 1, 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 97, 100]");
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        int[] intArray4 = new int[] { 1, (-1), (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 10, 10]");
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        int[] intArray6 = new int[] { (short) -1, (short) 0, (byte) 10, 1, (short) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 10, 1, 100, -1]");
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        int[] intArray6 = new int[] { (byte) 0, (byte) 10, '4', '4', '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 52, 52, 35, 100]");
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        int[] intArray3 = new int[] { 0, 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, -1]");
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        int[] intArray6 = new int[] { (byte) 0, 100, 1, (short) 1, 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 1, 1, 97, 35]");
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        int[] intArray4 = new int[] { (short) 0, (-1), '4', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 52, 10]");
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        int[] intArray6 = new int[] { (byte) 100, 'a', (short) 100, (-1), (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 97, 100, -1, 1, 10]");
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        int[] intArray4 = new int[] { (byte) 100, '4', '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 35, 0]");
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        int[] intArray3 = new int[] { (byte) 1, (short) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 0]");
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        int[] intArray6 = new int[] { (short) 10, (short) 0, '#', ' ', (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 35, 32, -1, 10]");
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        int[] intArray3 = new int[] { 'a', (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 0, 10]");
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        int[] intArray3 = new int[] { (-1), (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, -1]");
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        int[] intArray3 = new int[] { (byte) 100, '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 35, -1]");
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        int[] intArray6 = new int[] { '4', (short) 0, 1, '4', (byte) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 0, 1, 52, 0, 10]");
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        int[] intArray4 = new int[] { (byte) 0, '#', (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 35, -1, 1]");
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        int[] intArray6 = new int[] { 10, (byte) 0, (short) -1, (byte) 100, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, -1, 100, 100, 100]");
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        int[] intArray6 = new int[] { 10, (short) 0, 1, ' ', (byte) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 1, 32, 0, 100]");
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        int[] intArray5 = new int[] { (byte) 10, (short) 1, ' ', (short) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 32, 100, 100]");
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        int[] intArray4 = new int[] { '4', (-1), '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 52, 52]");
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        int[] intArray5 = new int[] { (byte) 100, 100, 100, (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 100, 0, 100]");
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        int[] intArray6 = new int[] { 10, (short) 1, (byte) 100, (byte) 1, '4', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 100, 1, 52, 100]");
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        int[] intArray3 = new int[] { (short) -1, (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, -1]");
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        int[] intArray5 = new int[] { '#', (byte) 100, (byte) 0, (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100, 0, 1, 0]");
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        int[] intArray4 = new int[] { (byte) 10, (byte) 100, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 10, 0]");
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        int[] intArray6 = new int[] { (short) 0, (short) 0, (-1), (byte) 0, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, -1, 0, 100, 0]");
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        int[] intArray5 = new int[] { 10, 10, (short) 0, (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 0, -1, 32]");
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        int[] intArray5 = new int[] { (byte) 1, 10, 'a', '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 97, 35, 100]");
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        int[] intArray5 = new int[] { (short) -1, (byte) 0, 100, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 100, 1, 100]");
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, (byte) 10, 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 10, 0, 1]");
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        int[] intArray5 = new int[] { (short) -1, ' ', (byte) 10, (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 32, 10, 0, 100]");
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, (short) 0, (short) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 0, 100, 100]");
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        int[] intArray6 = new int[] { 1, 'a', (short) -1, '#', (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 97, -1, 35, 0, 0]");
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        int[] intArray6 = new int[] { (byte) -1, (short) 1, (byte) 0, '#', (byte) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 0, 35, 0, 35]");
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 1 };
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
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        int[] intArray3 = new int[] { (byte) -1, 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 52]");
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 10]");
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        int[] intArray6 = new int[] { (-1), (byte) 100, (short) 0, '#', 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 0, 35, 0, -1]");
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        int[] intArray3 = new int[] { (short) -1, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 1]");
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        int[] intArray4 = new int[] { 10, (byte) -1, 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 100, 10]");
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        int[] intArray3 = new int[] { (byte) 100, 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        int[] intArray4 = new int[] { (short) -1, (byte) 10, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 100, 10]");
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        int[] intArray3 = new int[] { '#', 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 100, 35]");
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        int[] intArray4 = new int[] { (short) -1, (byte) 1, (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 1, 0]");
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        int[] intArray5 = new int[] { (-1), (short) 10, (short) -1, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, -1, 100, 0]");
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        int[] intArray3 = new int[] { (short) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 100]");
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        int[] intArray4 = new int[] { '4', (short) 100, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 32, 1]");
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        int[] intArray5 = new int[] { 100, (short) 10, 1, (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 1, 1, 97]");
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        int[] intArray6 = new int[] { (short) 100, 100, ' ', ' ', (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 32, 32, 100, 10]");
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        int[] intArray4 = new int[] { '4', 100, '4', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 52, 10]");
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        int[] intArray6 = new int[] { 10, (short) 100, (byte) 1, 100, 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 1, 100, 100, 1]");
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        int[] intArray5 = new int[] { 1, 1, (short) 100, (short) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 100, 0, 35]");
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        int[] intArray6 = new int[] { (short) 0, '#', 0, (byte) 0, (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 0, 0, 10, 0]");
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        int[] intArray6 = new int[] { (short) -1, (byte) 0, 'a', (byte) -1, (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 97, -1, 0, 0]");
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        int[] intArray6 = new int[] { 1, (byte) 100, ' ', (byte) 0, (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 32, 0, -1, 52]");
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        int[] intArray5 = new int[] { '4', (short) -1, (short) 10, ' ', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 10, 32, 0]");
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        int[] intArray4 = new int[] { 10, (byte) 10, (byte) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, -1, 52]");
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        int[] intArray6 = new int[] { (byte) -1, 10, (short) 1, 10, 'a', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 1, 10, 97, 1]");
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        int[] intArray6 = new int[] { ' ', (short) 0, 0, '4', (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 0, 0, 52, 100, 35]");
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        int[] intArray6 = new int[] { 100, 0, (byte) 10, ' ', (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 10, 32, -1, 1]");
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        int[] intArray4 = new int[] { '4', (-1), (byte) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 10, 10]");
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        int[] intArray3 = new int[] { 0, (byte) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 32]");
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        int[] intArray5 = new int[] { 1, (-1), '4', (short) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 52, 0, 1]");
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, (byte) 1, ' ', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 1, 32, 100]");
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        int[] intArray3 = new int[] { (byte) 100, 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 100]");
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        int[] intArray3 = new int[] { (short) 1, (short) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        int[] intArray4 = new int[] { '4', (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 100, 0]");
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        int[] intArray5 = new int[] { 10, (short) 10, (short) 100, 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 100, 0]");
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        int[] intArray3 = new int[] { ' ', (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 100, 0]");
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        int[] intArray6 = new int[] { (short) 100, (-1), 100, (short) 1, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 100, 1, 10, -1]");
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        int[] intArray4 = new int[] { (short) 10, (short) 0, (short) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 100, 10]");
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        int[] intArray3 = new int[] { (byte) 0, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 35, 1]");
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        int[] intArray4 = new int[] { (byte) 0, (short) 100, (short) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 10, -1]");
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        int[] intArray3 = new int[] { (byte) -1, 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 52]");
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        int[] intArray5 = new int[] { (byte) 1, '#', (-1), (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 35, -1, -1, 10]");
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        int[] intArray3 = new int[] { 100, (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 10]");
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        int[] intArray6 = new int[] { 10, 100, (byte) 1, 0, ' ', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 1, 0, 32, 1]");
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        int[] intArray6 = new int[] { (-1), (byte) 1, (byte) 10, (byte) 1, (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 10, 1, -1, 10]");
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        int[] intArray4 = new int[] { 'a', (short) 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 10, -1, 100]");
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        int[] intArray5 = new int[] { (short) -1, 1, '#', 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 35, 0, 32]");
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        int[] intArray6 = new int[] { (short) 10, (short) -1, '#', 10, 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 35, 10, 0, 10]");
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        int[] intArray5 = new int[] { (byte) 0, (byte) 0, 0, (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, -1, 52]");
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 1, -1]");
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        int[] intArray4 = new int[] { (-1), (byte) 0, '4', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 52, -1]");
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        int[] intArray4 = new int[] { 100, (byte) -1, (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, -1]");
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        int[] intArray6 = new int[] { 1, (short) 0, (byte) -1, '#', (byte) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, -1, 35, 100, 52]");
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        int[] intArray6 = new int[] { (byte) 1, (byte) 10, (byte) 100, (short) -1, 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 100, -1, 97, 1]");
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        int[] intArray6 = new int[] { (short) 1, 'a', 10, (-1), (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 97, 10, -1, -1, 1]");
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        int[] intArray5 = new int[] { (-1), 0, (byte) 10, (byte) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 10, 10, 52]");
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        int[] intArray4 = new int[] { (byte) 1, '#', (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 35, 1, 35]");
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        int[] intArray6 = new int[] { 'a', (short) -1, ' ', (byte) 10, 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 32, 10, 100, 1]");
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        int[] intArray3 = new int[] { (byte) 10, (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, -1, 1]");
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        int[] intArray6 = new int[] { '4', (byte) 1, 10, (-1), (byte) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 1, 10, -1, 0, 100]");
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        int[] intArray3 = new int[] { (short) 0, ' ', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, -1]");
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        int[] intArray4 = new int[] { (short) 1, (short) 1, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, -1, 32]");
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 1, '4', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 1, 52, -1]");
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        int[] intArray5 = new int[] { '#', 0, (byte) 1, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0, 1, 52, 0]");
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        int[] intArray6 = new int[] { 1, (short) 100, (-1), (short) 100, 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, -1, 100, 0, 1]");
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        int[] intArray4 = new int[] { (byte) 0, 1, (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, -1, 0]");
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        int[] intArray3 = new int[] { '4', 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 0, 1]");
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        int[] intArray5 = new int[] { (byte) 10, 'a', (-1), (short) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, -1, 100, -1]");
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        int[] intArray6 = new int[] { (byte) 1, (byte) 100, (short) 0, (short) 1, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 0, 1, 100, 97]");
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        int[] intArray6 = new int[] { (byte) 10, 10, (short) 10, 10, '4', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 10, 52, 100]");
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, 1, (short) -1, 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 1, -1, 97, 1]");
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        int[] intArray4 = new int[] { '#', (byte) 10, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 10, -1, 32]");
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        int[] intArray3 = new int[] { (short) 0, 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 100]");
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        int[] intArray3 = new int[] { (byte) -1, '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 52, 0]");
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        int[] intArray4 = new int[] { 0, (short) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 100, 10]");
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 10]");
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        int[] intArray3 = new int[] { (short) 100, (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 10]");
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        int[] intArray6 = new int[] { ' ', '#', (byte) 100, ' ', (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 35, 100, 32, -1, 100]");
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        int[] intArray5 = new int[] { 1, ' ', '#', (short) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, 35, 10, 32]");
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        int[] intArray3 = new int[] { (short) -1, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 100]");
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        int[] intArray3 = new int[] { 0, '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 52]");
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        int[] intArray6 = new int[] { 10, (short) 0, ' ', 10, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 32, 10, 10, 1]");
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        int[] intArray3 = new int[] { (byte) 100, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 97, 10]");
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        int[] intArray4 = new int[] { ' ', '#', (byte) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 10, 97]");
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        int[] intArray5 = new int[] { (short) -1, 0, (byte) 1, (byte) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 1, -1, -1]");
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        int[] intArray4 = new int[] { 100, (byte) 1, 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 0, 1]");
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        int[] intArray5 = new int[] { (byte) 10, (short) 100, 'a', '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 97, 52, -1]");
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        int[] intArray4 = new int[] { (short) 0, (short) 1, 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 100, 1]");
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        int[] intArray5 = new int[] { 1, (byte) 0, 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 0, 100, 10]");
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        int[] intArray3 = new int[] { 10, (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 100]");
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        int[] intArray4 = new int[] { (short) 0, '#', (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 35, 1, 1]");
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        int[] intArray6 = new int[] { 100, (byte) 0, (byte) -1, 100, (short) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, -1, 100, 0, 1]");
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        int[] intArray6 = new int[] { (short) -1, 1, (short) -1, (byte) 10, (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, -1, 10, 1, 1]");
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        int[] intArray3 = new int[] { (-1), 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 0, 1]");
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        int[] intArray3 = new int[] { '4', (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 10, 10]");
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        int[] intArray6 = new int[] { (short) 0, ' ', (short) -1, 0, (short) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 32, -1, 0, -1, 10]");
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        int[] intArray3 = new int[] { (byte) 1, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 10]");
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        int[] intArray3 = new int[] { 1, (byte) -1, (byte) 0 };
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
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        int[] intArray5 = new int[] { (byte) 1, (short) -1, (byte) 10, 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 10, 0, 35]");
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        int[] intArray5 = new int[] { (byte) -1, (short) 1, (short) 1, (byte) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 1, 100, 100]");
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        int[] intArray5 = new int[] { '4', '4', (short) -1, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, -1, 100, 1]");
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        int[] intArray4 = new int[] { (byte) 10, (-1), '#', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 35, 1]");
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        int[] intArray5 = new int[] { (short) 10, (short) 100, '#', 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 35, 100, 0]");
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        int[] intArray5 = new int[] { '#', (short) -1, (byte) 1, (short) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 1, 100, 0]");
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        int[] intArray4 = new int[] { 10, (short) -1, 'a', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 97, 0]");
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        int[] intArray4 = new int[] { (byte) -1, ' ', 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 1, -1]");
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        int[] intArray4 = new int[] { '4', 1, (short) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 1, -1, -1]");
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        int[] intArray4 = new int[] { ' ', (byte) 0, (byte) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 0, 10, 10]");
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        int[] intArray4 = new int[] { (short) 0, 100, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 10, 1]");
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        int[] intArray6 = new int[] { (short) 100, (byte) 10, (short) -1, '#', (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, -1, 35, 100, 10]");
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        int[] intArray5 = new int[] { (byte) -1, '#', 100, 'a', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, 100, 97, -1]");
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        int[] intArray3 = new int[] { 10, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 10]");
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        int[] intArray6 = new int[] { (short) 0, '#', '4', (short) 10, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 52, 10, 1, 0]");
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        int[] intArray4 = new int[] { (byte) 10, (short) 100, (short) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 10, 1]");
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        int[] intArray6 = new int[] { 0, (byte) 100, (short) 1, (short) 0, 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 1, 0, 0, 100]");
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        int[] intArray3 = new int[] { (byte) 100, (byte) 0, 10 };
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
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        int[] intArray3 = new int[] { (short) 1, (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 100]");
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        int[] intArray6 = new int[] { 10, (byte) 100, (byte) 0, (short) 0, (short) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 0, 0, 1, 0]");
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        int[] intArray5 = new int[] { (byte) -1, (short) 1, (byte) 10, 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 10, 1, 0]");
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        int[] intArray5 = new int[] { (byte) 100, (byte) 1, (byte) 0, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, 1, 100]");
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        int[] intArray5 = new int[] { (byte) 100, 'a', (byte) 100, (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 100, -1, 35]");
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        int[] intArray6 = new int[] { 10, 1, (short) 100, (byte) -1, (short) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 100, -1, 100, 1]");
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        int[] intArray2 = new int[] { (short) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 97]");
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 100]");
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        int[] intArray6 = new int[] { 100, '#', (byte) 1, 'a', (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 35, 1, 97, 100, -1]");
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        int[] intArray6 = new int[] { 'a', (byte) 100, 0, 1, 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 0, 1, 100, 1]");
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        int[] intArray6 = new int[] { (short) -1, 0, (byte) 0, (short) 100, (short) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 0, 100, 100, 100]");
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        int[] intArray3 = new int[] { '#', 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 0, 100]");
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        int[] intArray3 = new int[] { 'a', (byte) 0, '4' };
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
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        int[] intArray2 = new int[] { ' ', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 10]");
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        int[] intArray4 = new int[] { '4', 10, (short) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 10, 10]");
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        int[] intArray3 = new int[] { (short) 1, (byte) 10, (short) -1 };
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
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        int[] intArray3 = new int[] { 0, (short) 10, 10 };
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
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        int[] intArray3 = new int[] { 0, (short) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        int[] intArray5 = new int[] { '#', 0, '4', 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0, 52, 1, 10]");
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        int[] intArray3 = new int[] { ' ', ' ', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 10]");
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, (short) 0, (-1), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 0, -1, 10]");
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        int[] intArray6 = new int[] { 'a', (short) 1, 100, (byte) 10, (byte) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 100, 10, 100, 32]");
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        int[] intArray4 = new int[] { (byte) 1, (short) -1, (-1), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, -1, 100]");
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        int[] intArray4 = new int[] { (short) -1, (short) 10, (byte) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 10]");
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        int[] intArray4 = new int[] { 10, (short) 10, (byte) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 1, 97]");
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 10]");
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        int[] intArray6 = new int[] { (short) 100, (byte) 1, (short) -1, 'a', 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, -1, 97, 0, -1]");
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        int[] intArray5 = new int[] { (byte) 0, ' ', (byte) -1, (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, -1, 0, 100]");
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        int[] intArray5 = new int[] { (-1), (short) 10, (short) 10, (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 10, -1, 32]");
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        int[] intArray6 = new int[] { '#', (short) 100, (short) -1, '#', '#', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 100, -1, 35, 35, 10]");
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        int[] intArray4 = new int[] { (short) 0, ' ', (byte) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 32, 0, 1]");
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        int[] intArray4 = new int[] { (byte) -1, (-1), 'a', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 97, 100]");
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        int[] intArray4 = new int[] { 10, 1, (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 0, 10]");
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        int[] intArray6 = new int[] { (byte) 10, 0, ' ', (byte) 1, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 32, 1, 52, 0]");
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        int[] intArray5 = new int[] { 100, (short) -1, 100, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 100, -1, 0]");
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        int[] intArray4 = new int[] { 'a', (short) 1, (short) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 1, 0, 35]");
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        int[] intArray3 = new int[] { (-1), 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 10]");
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        int[] intArray5 = new int[] { (-1), (short) 10, 'a', (short) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 97, 100, 100]");
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        int[] intArray6 = new int[] { (short) -1, '#', '4', 100, '4', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, 52, 100, 52, 100]");
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        int[] intArray3 = new int[] { (byte) 10, (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 100]");
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        int[] intArray5 = new int[] { (short) -1, (byte) 1, '#', '#', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 35, 35, 1]");
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        int[] intArray3 = new int[] { ' ', (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, (byte) -1, '#', '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, -1, 35, 52, 0]");
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        int[] intArray4 = new int[] { (short) 1, (-1), (short) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 0, 10]");
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        int[] intArray6 = new int[] { (short) 0, (byte) 0, 0, (short) 1, (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 1, 100, 97]");
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        int[] intArray5 = new int[] { '4', (short) -1, (byte) 10, 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 10, 1, 32]");
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        int[] intArray6 = new int[] { (byte) 0, 1, (byte) 1, (byte) -1, (short) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 1, -1, 0, 35]");
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        int[] intArray4 = new int[] { (short) 10, 1, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 0, 100]");
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        int[] intArray4 = new int[] { (byte) 100, 10, (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 0, 10]");
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        int[] intArray6 = new int[] { '#', ' ', '#', (byte) -1, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 32, 35, -1, 100, 35]");
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        int[] intArray3 = new int[] { 1, '4', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 52, 100]");
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        int[] intArray3 = new int[] { 10, 0, (short) -1 };
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
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        int[] intArray6 = new int[] { (byte) 0, 100, 'a', (short) 10, '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 97, 10, 35, -1]");
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        int[] intArray3 = new int[] { 'a', (byte) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 0, 10]");
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        int[] intArray6 = new int[] { 'a', (byte) 100, (byte) 100, 10, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 100, 10, 100, 0]");
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        int[] intArray5 = new int[] { (byte) 1, (-1), (byte) 10, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 10, 52, 0]");
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        int[] intArray4 = new int[] { (-1), 100, (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 100, 100]");
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        int[] intArray5 = new int[] { (byte) 100, (-1), (short) 100, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 100, 10, 0]");
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        int[] intArray6 = new int[] { 100, 1, '#', 10, 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 35, 10, 0, 52]");
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        int[] intArray3 = new int[] { (short) -1, (byte) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 0, 0]");
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        int[] intArray5 = new int[] { (byte) 1, '4', 10, (byte) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 52, 10, 1, 1]");
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        int[] intArray5 = new int[] { 100, (short) 0, ' ', (short) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 32, 1, 0]");
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, (byte) 100, (short) 1, (byte) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 100, 1, 0, -1]");
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        int[] intArray5 = new int[] { (-1), (byte) 1, 1, (short) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 1, 1, 10]");
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        int[] intArray3 = new int[] { 1, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, 100]");
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, 1, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 1, 0, 100]");
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        int[] intArray4 = new int[] { (short) 0, 0, 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 100, 100]");
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (byte) 100, 100, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 100, 100, -1, 32]");
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        int[] intArray3 = new int[] { (short) 1, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 100]");
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        int[] intArray3 = new int[] { (byte) -1, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, -1]");
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        int[] intArray4 = new int[] { (short) 0, (short) -1, 'a', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 97, 100]");
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        int[] intArray4 = new int[] { 1, (byte) 100, (short) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 10, 32]");
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        int[] intArray5 = new int[] { 100, 10, 0, 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 0, 10, -1]");
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        int[] intArray6 = new int[] { 'a', '4', (-1), (short) 100, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 52, -1, 100, 100, -1]");
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        int[] intArray6 = new int[] { 0, 10, 100, (short) 0, 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 100, 0, 0, 1]");
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        int[] intArray6 = new int[] { (byte) 100, ' ', 100, 1, 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 100, 1, 97, 32]");
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        int[] intArray6 = new int[] { (byte) 10, (short) 100, '#', (short) 0, (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 35, 0, 1, 35]");
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        int[] intArray5 = new int[] { (byte) 100, (-1), 10, 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 10, 100, 32]");
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, '#', 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 35, 1, 1]");
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        int[] intArray6 = new int[] { (short) 10, 100, (byte) -1, 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, -1, 100, 0, 10]");
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        int[] intArray6 = new int[] { 10, (-1), '4', '#', (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 52, 35, -1, 100]");
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        int[] intArray4 = new int[] { 0, (byte) 1, (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, -1, 1]");
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        int[] intArray6 = new int[] { 100, ' ', (byte) 1, 10, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 1, 10, 10, 35]");
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        int[] intArray6 = new int[] { 100, (short) 0, 0, (byte) -1, (short) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 0, -1, 100, 10]");
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        int[] intArray6 = new int[] { 0, (byte) -1, '#', ' ', (byte) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 35, 32, 100, 10]");
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        int[] intArray5 = new int[] { (short) 0, (short) 1, 1, (byte) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 1, 0, 100]");
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        int[] intArray4 = new int[] { ' ', (-1), (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, -1, 0, 100]");
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        int[] intArray6 = new int[] { 0, 0, (byte) -1, 100, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, -1, 100, 100, 52]");
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        int[] intArray4 = new int[] { (short) 10, (byte) 0, 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 97, 32]");
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        int[] intArray3 = new int[] { (short) 10, (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 10]");
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        int[] intArray4 = new int[] { (byte) 1, (short) 1, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 52, 0]");
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        int[] intArray3 = new int[] { ' ', 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 100, 52]");
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        int[] intArray3 = new int[] { (short) 100, (short) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 100]");
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        int[] intArray5 = new int[] { ' ', (byte) 10, ' ', ' ', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 32, 32, 0]");
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        int[] intArray4 = new int[] { 1, (byte) 1, (short) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 10, 100]");
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        int[] intArray4 = new int[] { (short) -1, (short) 10, (short) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 10]");
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        int[] intArray6 = new int[] { (short) -1, (short) -1, (short) -1, 1, (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, -1, 1, 100, 0]");
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        int[] intArray3 = new int[] { 0, 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        int[] intArray5 = new int[] { (short) 10, 10, 'a', (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 97, 100, 100]");
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        int[] intArray6 = new int[] { (short) 1, (byte) 100, '#', (short) 0, 'a', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 35, 0, 97, 1]");
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        int[] intArray4 = new int[] { (byte) 0, (short) 0, 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 1, 1]");
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        int[] intArray6 = new int[] { (short) -1, (byte) 10, (short) 1, (byte) -1, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 1, -1, 10, 100]");
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        int[] intArray4 = new int[] { (byte) 1, (-1), (short) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 100, 32]");
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        int[] intArray6 = new int[] { 1, (short) -1, (short) 0, (short) -1, '#', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 0, -1, 35, 1]");
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 0, 1]");
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        int[] intArray5 = new int[] { 100, (short) -1, 'a', (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 97, 100, 10]");
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        int[] intArray6 = new int[] { 100, ' ', 'a', (byte) -1, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 97, -1, 52, 1]");
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        int[] intArray4 = new int[] { (byte) 1, (byte) 0, 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 0, 1]");
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        int[] intArray3 = new int[] { (short) -1, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, 1]");
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        int[] intArray6 = new int[] { '#', 1, ' ', 10, (short) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, 32, 10, -1, 1]");
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        int[] intArray6 = new int[] { (short) 1, '#', '4', (short) -1, ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 35, 52, -1, 32, 52]");
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        int[] intArray4 = new int[] { 10, (short) 10, (byte) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 0, 0]");
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        int[] intArray6 = new int[] { (short) 10, '#', ' ', 10, (short) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 32, 10, 100, 1]");
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        int[] intArray5 = new int[] { (byte) 10, 'a', (short) 100, (-1), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 100, -1, 100]");
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        int[] intArray4 = new int[] { '4', (-1), 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 1, 10]");
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        int[] intArray3 = new int[] { 10, 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 10]");
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        int[] intArray3 = new int[] { 1, (byte) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        int[] intArray6 = new int[] { 0, (short) -1, (byte) 1, (-1), (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 1, -1, 1, 100]");
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        int[] intArray3 = new int[] { ' ', 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 100, 10]");
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        int[] intArray6 = new int[] { ' ', 'a', (short) 0, 0, 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 97, 0, 0, 100, 0]");
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        int[] intArray6 = new int[] { (byte) -1, (byte) 100, (byte) -1, (short) 100, (short) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, -1, 100, -1, 1]");
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        int[] intArray5 = new int[] { (short) 0, (byte) 0, 0, '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 35, 32]");
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        int[] intArray6 = new int[] { 100, (short) 100, (byte) 1, 100, 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 1, 100, 100, 10]");
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        int[] intArray6 = new int[] { (byte) 1, '#', ' ', '#', 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 35, 32, 35, 100, 100]");
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        int[] intArray3 = new int[] { '4', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 52, 35]");
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        int[] intArray6 = new int[] { (short) 10, (short) -1, ' ', 1, (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 32, 1, -1, 32]");
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        int[] intArray4 = new int[] { '4', 10, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 0, 100]");
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        int[] intArray6 = new int[] { ' ', ' ', (short) -1, ' ', (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 32, -1, 32, -1, 35]");
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        int[] intArray4 = new int[] { (short) 1, 10, (short) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 10, 32]");
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        int[] intArray6 = new int[] { (short) 0, (byte) 0, (short) -1, (byte) 0, (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, -1, 0, 1, 100]");
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        int[] intArray4 = new int[] { 100, 1, (-1), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, -1, 10]");
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        int[] intArray6 = new int[] { 0, (-1), 1, (short) -1, (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 1, -1, 100, 1]");
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        int[] intArray4 = new int[] { (byte) 1, (byte) 0, 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 10, 10]");
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        int[] intArray6 = new int[] { 10, (byte) 1, 1, 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 1, 10, 10, 0]");
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        int[] intArray3 = new int[] { 0, 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 0]");
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        int[] intArray5 = new int[] { '4', (-1), 100, '#', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 100, 35, 100]");
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        int[] intArray5 = new int[] { (byte) 10, (byte) 1, 0, '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 0, 52, -1]");
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        int[] intArray4 = new int[] { '4', 0, (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 0, 100, 10]");
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        int[] intArray6 = new int[] { (short) -1, 10, '#', ' ', (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 32, -1, 32]");
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        int[] intArray6 = new int[] { 'a', 10, (byte) 0, 10, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 0, 10, 52, 1]");
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        int[] intArray3 = new int[] { 100, '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 35]");
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        int[] intArray5 = new int[] { 0, 0, '#', (short) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 35, 1, 100]");
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        int[] intArray4 = new int[] { 100, 0, 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 0, 100]");
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, 100, (short) 100, '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 100, 100, 35, -1]");
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        int[] intArray5 = new int[] { '#', 'a', (byte) 0, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, 0, 97, 1]");
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        int[] intArray6 = new int[] { (byte) 0, 10, (byte) 1, (byte) 1, (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 1, 1, -1, 100]");
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        int[] intArray5 = new int[] { 'a', (byte) 10, '#', 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 10, 35, 100, -1]");
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        int[] intArray3 = new int[] { '4', 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 0, 1]");
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        int[] intArray6 = new int[] { (short) -1, 100, ' ', (byte) 100, '4', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 32, 100, 52, 100]");
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        int[] intArray3 = new int[] { (short) 100, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 0]");
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, 1, (byte) 0, 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 1, 0, 97, 32]");
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        int[] intArray4 = new int[] { (short) 0, '4', (short) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 10, 10]");
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        int[] intArray4 = new int[] { (short) -1, (short) 0, 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 10, 1]");
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        int[] intArray6 = new int[] { 'a', (byte) 1, (short) 100, ' ', (byte) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 100, 32, -1, -1]");
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        int[] intArray3 = new int[] { (short) 100, (short) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 0]");
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, (short) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, -1, 0, -1]");
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        int[] intArray5 = new int[] { 'a', 1, (short) 100, 'a', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1, 100, 97, -1]");
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        int[] intArray5 = new int[] { (byte) 0, (byte) -1, (byte) 1, (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 1, 1, 1]");
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 10, -1]");
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        int[] intArray6 = new int[] { (short) 1, '4', '#', (byte) 100, (short) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 35, 100, 100, 0]");
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        int[] intArray5 = new int[] { (short) -1, (-1), (byte) 100, (byte) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 100, 10, 0]");
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        int[] intArray6 = new int[] { '4', (byte) -1, ' ', (byte) 1, 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, -1, 32, 1, 10, 52]");
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        int[] intArray6 = new int[] { '4', 1, (short) 0, (-1), (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 1, 0, -1, 1, 10]");
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        int[] intArray4 = new int[] { 10, 1, (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 10, -1]");
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        int[] intArray5 = new int[] { (short) 0, (byte) 0, (short) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 10, -1, 1]");
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        int[] intArray6 = new int[] { (byte) 1, 0, (byte) 0, (byte) -1, (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 0, -1, 1, 35]");
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        int[] intArray4 = new int[] { ' ', ' ', (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 32, 1, -1]");
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        int[] intArray4 = new int[] { (byte) 100, (byte) -1, (short) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100, 10]");
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        int[] intArray4 = new int[] { (short) 0, '#', 'a', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 35, 97, 10]");
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        int[] intArray3 = new int[] { '#', (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 10, 97]");
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        int[] intArray6 = new int[] { (byte) -1, 1, (short) 1, '4', (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 1, 52, -1, 10]");
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        int[] intArray3 = new int[] { (-1), 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 35]");
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        int[] intArray3 = new int[] { (byte) -1, 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 35]");
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        int[] intArray5 = new int[] { '4', (byte) 1, 10, 'a', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 10, 97, 10]");
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        int[] intArray4 = new int[] { (short) 10, 'a', 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 97, 10, 1]");
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        int[] intArray4 = new int[] { '#', (short) 0, (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0, 10, 0]");
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        int[] intArray4 = new int[] { '4', (byte) 0, (short) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 0, 0, 10]");
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        int[] intArray6 = new int[] { (byte) 100, (short) 0, 10, (-1), (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 10, -1, 100, -1]");
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        int[] intArray4 = new int[] { '4', 100, 'a', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 97, 100]");
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        int[] intArray6 = new int[] { (short) -1, (byte) 0, ' ', (byte) 1, (byte) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 32, 1, 1, 0]");
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        int[] intArray5 = new int[] { (byte) -1, (-1), (short) 0, (short) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, 0, 35]");
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, (byte) 10, (byte) -1, (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 10, -1, 10, -1]");
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        int[] intArray4 = new int[] { 0, (short) 10, (byte) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 0, 10]");
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        int[] intArray4 = new int[] { '4', (short) 10, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 10, 52]");
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        int[] intArray5 = new int[] { '#', 1, 1, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1, 1, -1, 1]");
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        int[] intArray3 = new int[] { (byte) 1, (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 10]");
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        int[] intArray4 = new int[] { (short) 100, (short) 10, (byte) -1, (short) 100 };
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
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        int[] intArray5 = new int[] { (byte) 10, ' ', (short) 1, (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 1, 1, 97]");
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        int[] intArray6 = new int[] { (short) 10, 'a', '#', ' ', (short) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35, 32, 0, 1]");
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        int[] intArray5 = new int[] { (short) 0, ' ', (short) -1, (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, -1, -1, 100]");
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        int[] intArray4 = new int[] { (byte) 1, (byte) 100, (short) 0, (byte) 100 };
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
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        int[] intArray6 = new int[] { 100, 10, (short) 100, (-1), (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 100, -1, 10, 97]");
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        int[] intArray3 = new int[] { (-1), '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 100]");
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        int[] intArray5 = new int[] { (byte) 10, 100, ' ', '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 32, 52, 1]");
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        int[] intArray4 = new int[] { ' ', (short) -1, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, -1, 100, 10]");
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        int[] intArray3 = new int[] { '4', (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, -1, 100]");
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        int[] intArray5 = new int[] { ' ', (short) 10, (byte) -1, ' ', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, -1, 32, 1]");
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        int[] intArray5 = new int[] { '#', (short) -1, 'a', (byte) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 97, 10, 0]");
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        int[] intArray6 = new int[] { (byte) 1, 100, (short) -1, (byte) 1, (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, -1, 1, 100, 100]");
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        int[] intArray6 = new int[] { (-1), 0, 100, 1, 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 100, 1, 0, 97]");
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        int[] intArray6 = new int[] { (byte) 0, 10, 10, '4', (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 10, 52, 100, 0]");
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        int[] intArray4 = new int[] { 100, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 10, 0]");
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        int[] intArray3 = new int[] { '4', (byte) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 10, 100]");
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        int[] intArray4 = new int[] { 'a', (short) -1, (byte) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, -1, -1, 1]");
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        int[] intArray6 = new int[] { 1, (short) -1, 0, (short) 0, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 0, 0, 35, 100]");
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        int[] intArray5 = new int[] { (short) 10, '4', (short) 10, '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52, 10, 52, 32]");
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        int[] intArray6 = new int[] { 0, (short) 100, (short) -1, (byte) 0, (-1), 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, 0, -1, 0]");
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        int[] intArray6 = new int[] { (byte) 1, (short) 10, '4', 1, (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 52, 1, 100, 100]");
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        int[] intArray3 = new int[] { (byte) 100, '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 52]");
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 1, (short) -1, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 1, -1, 0, 1]");
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        int[] intArray5 = new int[] { 0, '#', (short) 10, (byte) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 35, 10, -1, 10]");
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        int[] intArray6 = new int[] { 'a', 'a', 10, (short) -1, (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 97, 10, -1, 1, 100]");
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        int[] intArray6 = new int[] { '#', '#', (byte) 0, '#', (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 35, 0, 35, 10, 97]");
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        int[] intArray4 = new int[] { (byte) 0, (byte) 1, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 35, 100]");
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        int[] intArray6 = new int[] { (short) 0, 100, 0, (byte) 1, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 0, 1, 1, 10]");
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        int[] intArray4 = new int[] { '4', 10, ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 32, 1]");
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        int[] intArray6 = new int[] { (byte) 1, (-1), 'a', 'a', (byte) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 97, 97, -1, 97]");
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        int[] intArray5 = new int[] { (byte) -1, (byte) 1, (short) -1, '#', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, -1, 35, -1]");
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        int[] intArray5 = new int[] { 100, (short) 100, (short) -1, (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, -1, -1, 100]");
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        int[] intArray4 = new int[] { (short) 1, '#', 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 35, 1, 35]");
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        int[] intArray6 = new int[] { (byte) 10, 0, 1, (byte) 1, (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 1, 1, -1, 35]");
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        int[] intArray6 = new int[] { (byte) 100, (-1), 1, (byte) 1, 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 1, 1, 1, 0]");
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        int[] intArray5 = new int[] { (byte) -1, 10, 'a', ' ', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 97, 32, 10]");
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        int[] intArray6 = new int[] { 0, (byte) 10, 'a', '4', (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 97, 52, 1, -1]");
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        int[] intArray6 = new int[] { '4', (byte) 0, (short) 100, 10, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 0, 100, 10, 1, -1]");
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        int[] intArray3 = new int[] { (short) 100, 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 100]");
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, (short) 1, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 1, 10, 35]");
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        int[] intArray3 = new int[] { 1, (short) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 10]");
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        int[] intArray4 = new int[] { '#', (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 10, 0, 0]");
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        int[] intArray3 = new int[] { (byte) -1, 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, 0]");
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        int[] intArray4 = new int[] { (byte) -1, 1, (byte) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 10, 35]");
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        int[] intArray4 = new int[] { 0, ' ', '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 32, 52, 1]");
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        int[] intArray4 = new int[] { (byte) 0, (byte) 0, 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0]");
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, (short) -1, (short) -1, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, -1, -1, 100, -1]");
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        int[] intArray5 = new int[] { (byte) 100, 'a', (short) 0, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 0, 1, 100]");
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        int[] intArray3 = new int[] { 1, (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 35]");
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        int[] intArray3 = new int[] { (-1), (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, 100]");
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        int[] intArray5 = new int[] { (byte) 10, (short) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 0, -1, 0]");
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        int[] intArray5 = new int[] { (short) 0, (short) -1, 'a', '#', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 97, 35, 100]");
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        int[] intArray3 = new int[] { (byte) -1, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 100]");
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        int[] intArray5 = new int[] { (short) 10, (byte) 10, '4', (byte) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 52, 100, 52]");
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        int[] intArray6 = new int[] { 100, (byte) 10, (byte) 10, (short) 10, (byte) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 10, 10, 0, 10]");
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        int[] intArray3 = new int[] { 'a', '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 52, 10]");
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        int[] intArray4 = new int[] { (byte) 1, 0, ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 32, 52]");
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        int[] intArray6 = new int[] { 100, (byte) 1, (byte) 0, 100, '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 0, 100, 52, -1]");
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        int[] intArray5 = new int[] { (short) 1, 1, (-1), (byte) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, -1, 0, 52]");
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        int[] intArray4 = new int[] { (short) 0, (-1), (byte) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, -1]");
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        int[] intArray6 = new int[] { (short) 10, (short) 1, (-1), (short) 100, 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, -1, 100, 10, 100]");
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        int[] intArray5 = new int[] { (short) 1, 1, (byte) 10, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 0, 1]");
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        int[] intArray6 = new int[] { (short) 100, (short) 0, 'a', (short) -1, (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 97, -1, 0, 32]");
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        int[] intArray3 = new int[] { '4', 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 0, -1]");
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        int[] intArray5 = new int[] { 'a', 0, (short) 100, 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 0, 100, 10, 0]");
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        int[] intArray4 = new int[] { '#', 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 10, 1, 10]");
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        int[] intArray5 = new int[] { (short) 100, 'a', '4', (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 52, 1, 100]");
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        int[] intArray4 = new int[] { (-1), (byte) 1, (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, -1, 100]");
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        int[] intArray5 = new int[] { 0, ' ', (byte) 0, (short) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, 0, 100, 100]");
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        int[] intArray5 = new int[] { 100, (short) 100, '4', (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 52, 0, 32]");
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        int[] intArray5 = new int[] { (short) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 10, 10, 10]");
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, (short) 0, (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 0, 1, -1]");
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        int[] intArray6 = new int[] { (byte) 10, (short) 1, (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 100, 0, 1, -1]");
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        int[] intArray5 = new int[] { '#', 'a', (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, -1, 10, 100]");
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        int[] intArray4 = new int[] { 0, (byte) 10, (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 1, 1]");
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        int[] intArray4 = new int[] { 10, (byte) -1, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 1, 10]");
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        int[] intArray6 = new int[] { (short) 0, 1, (byte) 1, (short) 0, 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 1, 0, 1, 0]");
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        int[] intArray5 = new int[] { (short) 10, 0, (byte) 100, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 100, 100, 100]");
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        int[] intArray5 = new int[] { 1, ' ', 'a', (short) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, 97, -1, 10]");
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        int[] intArray6 = new int[] { (-1), (byte) 10, '#', (short) -1, 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, -1, 97, 32]");
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        int[] intArray4 = new int[] { '4', (byte) 10, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 35, 35]");
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        int[] intArray4 = new int[] { ' ', 100, (-1), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 100, -1, -1]");
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        int[] intArray5 = new int[] { (byte) 10, '4', ' ', 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52, 32, 1, 10]");
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) 0 };
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
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        int[] intArray3 = new int[] { 1, (short) 10, (byte) -1 };
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
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        int[] intArray5 = new int[] { (-1), (short) -1, 100, 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 100, 10, 97]");
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        int[] intArray4 = new int[] { (byte) 0, 100, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 100, 100]");
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        int[] intArray5 = new int[] { (short) 1, (short) 1, (short) 10, ' ', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 32, 0]");
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        int[] intArray6 = new int[] { (short) 100, 0, 'a', (short) -1, (byte) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 97, -1, 0, 100]");
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        int[] intArray5 = new int[] { 'a', (short) 10, (short) 0, (byte) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 10, 0, 10, 0]");
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        int[] intArray6 = new int[] { 10, '4', (byte) 1, ' ', 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 52, 1, 32, 100, 1]");
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        int[] intArray4 = new int[] { ' ', '#', (short) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, -1, 0]");
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        int[] intArray3 = new int[] { (byte) -1, (byte) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 52]");
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        int[] intArray5 = new int[] { '#', (short) 10, '4', (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 52, -1, 100]");
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        int[] intArray4 = new int[] { (short) 1, (short) -1, 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 0, 1]");
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        int[] intArray6 = new int[] { 1, 0, 10, 10, (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10, -1, 32]");
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        int[] intArray4 = new int[] { (byte) 1, (byte) 0, 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 10, -1]");
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        int[] intArray6 = new int[] { (byte) 0, (byte) 100, 10, (short) 0, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 10, 0, 52, 0]");
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        int[] intArray5 = new int[] { 0, (short) 100, (byte) 1, (byte) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 1, 10, 35]");
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        int[] intArray3 = new int[] { 10, (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 10]");
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        int[] intArray4 = new int[] { (byte) 0, 10, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 32, 100]");
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        int[] intArray4 = new int[] { 10, (byte) 10, (short) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 1, 1]");
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        int[] intArray3 = new int[] { ' ', (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 0]");
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        int[] intArray5 = new int[] { '4', '4', 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 1, 100, 0]");
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        int[] intArray5 = new int[] { '#', (-1), 1, (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 1, 1, 1]");
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        int[] intArray3 = new int[] { '#', 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 1, 35]");
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        int[] intArray5 = new int[] { (-1), (byte) 0, 100, 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 100, 97, 35]");
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        int[] intArray5 = new int[] { (short) 100, 'a', (byte) 10, 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 10, 1, 97]");
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        int[] intArray3 = new int[] { (byte) 1, (short) -1, 0 };
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
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 100, -1]");
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        int[] intArray6 = new int[] { 0, (short) 1, '4', ' ', ' ', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 52, 32, 32, 0]");
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        int[] intArray4 = new int[] { (short) 100, (short) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 10, 1]");
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        int[] intArray4 = new int[] { (byte) -1, (byte) 1, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 52, 0]");
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        int[] intArray5 = new int[] { 0, 100, (byte) 0, '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 0, 52, 0]");
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        int[] intArray5 = new int[] { '#', (byte) 0, 'a', 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0, 97, 1, 100]");
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        int[] intArray4 = new int[] { (byte) 10, (byte) 10, 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 1, 100]");
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        int[] intArray5 = new int[] { (byte) 0, (short) 100, 0, 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 0, 100, 10]");
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        int[] intArray3 = new int[] { 1, 'a', (short) 0 };
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
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        int[] intArray6 = new int[] { 100, (byte) 10, '#', (short) 1, '4', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 35, 1, 52, -1]");
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        int[] intArray3 = new int[] { 0, (short) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, -1]");
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        int[] intArray4 = new int[] { 0, 1, '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 52, 0]");
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        int[] intArray6 = new int[] { (byte) 1, (short) 10, 1, (byte) 100, 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 1, 100, 0, -1]");
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        int[] intArray5 = new int[] { 10, 0, (-1), (short) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, -1, 0, 10]");
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        int[] intArray6 = new int[] { '4', (byte) 100, ' ', (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 32, 0, 0, 100]");
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        int[] intArray3 = new int[] { 100, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 0]");
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        int[] intArray4 = new int[] { 10, ' ', (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 32, -1, 35]");
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        int[] intArray3 = new int[] { (byte) 1, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 100]");
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        int[] intArray6 = new int[] { 'a', (short) 0, (byte) 10, 100, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 0, 10, 100, 100, 100]");
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        int[] intArray4 = new int[] { (byte) 100, (-1), (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 35]");
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        int[] intArray3 = new int[] { '4', 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 1]");
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        int[] intArray6 = new int[] { (short) 10, ' ', 1, '#', (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 32, 1, 35, 10, 52]");
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        int[] intArray5 = new int[] { '4', (short) 100, (byte) 10, 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 10, 0, 35]");
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        int[] intArray4 = new int[] { (byte) -1, (byte) -1, (byte) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 1, 1]");
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        int[] intArray6 = new int[] { 100, (short) -1, 0, 'a', (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 0, 97, 10, 0]");
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        int[] intArray5 = new int[] { (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 1, 100, 0]");
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        int[] intArray5 = new int[] { (byte) 0, 100, (-1), (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, -1, -1, 100]");
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        int[] intArray3 = new int[] { 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 1]");
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        int[] intArray4 = new int[] { (short) 1, 0, 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 100, 10]");
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        int[] intArray4 = new int[] { (short) 1, '4', '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 52, 0]");
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        int[] intArray5 = new int[] { '4', (byte) -1, (short) 10, '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 10, 52, 10]");
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        int[] intArray5 = new int[] { (byte) 0, (short) 1, (short) 10, '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 10, 52, 32]");
    }
}

