package ciphers.AES;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        int[] intArray5 = new int[] { (short) 1, (short) 1, (-1), 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, -1, 1, 97]");
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        int[] intArray5 = new int[] { (short) 0, (short) 1, (short) 10, 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 10, 1, 35]");
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        int[] intArray6 = new int[] { '4', (byte) 100, '#', 'a', 'a', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 35, 97, 97, -1]");
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        int[] intArray6 = new int[] { (byte) 100, 100, ' ', 1, (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 32, 1, 0, 97]");
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        int[] intArray3 = new int[] { 1, (byte) 10, (short) -1 };
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
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        int[] intArray4 = new int[] { ' ', 'a', (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 97, 100, 10]");
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        int[] intArray6 = new int[] { (short) 0, (short) -1, (byte) 0, (byte) 100, (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 100, -1, 0]");
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        int[] intArray6 = new int[] { (short) 100, '4', (byte) 0, (-1), 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 0, -1, 10, 0]");
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        int[] intArray6 = new int[] { 'a', (short) -1, '4', 1, (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 52, 1, 10, 10]");
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        int[] intArray6 = new int[] { (byte) 100, (byte) 0, (byte) 1, (short) 1, (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 1, 1, 10, 1]");
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        int[] intArray4 = new int[] { '4', (byte) 100, (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 0, 100]");
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (byte) 0, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, -1, 100]");
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        int[] intArray6 = new int[] { (-1), 10, (byte) 100, (short) -1, (-1), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 100, -1, -1, 100]");
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        int[] intArray6 = new int[] { 100, ' ', (byte) 10, (byte) -1, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 10, -1, 32, 1]");
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        int[] intArray4 = new int[] { (byte) 1, (short) 0, (short) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 100, 32]");
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        int[] intArray6 = new int[] { 'a', 'a', 0, (-1), (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 97, 0, -1, 10, -1]");
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        int[] intArray5 = new int[] { 1, (byte) -1, (-1), 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1, 10, 1]");
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        int[] intArray6 = new int[] { 10, (short) 10, (byte) 0, (byte) 10, (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 0, 10, 0, 0]");
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        int[] intArray4 = new int[] { 10, 0, 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 100, 1]");
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        int[] intArray5 = new int[] { 100, (short) 100, '#', (byte) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 35, -1, 97]");
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        int[] intArray5 = new int[] { 100, 1, (short) 10, 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 100, 1]");
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, ' ', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 32, -1]");
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        int[] intArray6 = new int[] { 'a', (-1), (byte) 1, (short) 1, (byte) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 1, 1, 0, 100]");
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        int[] intArray3 = new int[] { 10, (byte) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 0]");
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        int[] intArray5 = new int[] { (short) 0, (short) 1, (byte) 0, (byte) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 0, 100, 1]");
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        int[] intArray6 = new int[] { 10, (short) -1, 'a', (short) 0, (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 97, 0, -1, 10]");
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        int[] intArray6 = new int[] { (-1), 0, (short) 100, (byte) -1, 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 100, -1, 100, 1]");
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        int[] intArray4 = new int[] { (byte) -1, (-1), (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 100, 1]");
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        int[] intArray4 = new int[] { (short) 1, (byte) 10, (byte) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 10]");
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        int[] intArray3 = new int[] { 100, 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 35]");
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        int[] intArray4 = new int[] { 1, (-1), 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 97, 97]");
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        int[] intArray4 = new int[] { 0, '4', (byte) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 0, 10]");
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        int[] intArray5 = new int[] { '4', 0, (byte) 10, 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 10, 1, 1]");
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        int[] intArray5 = new int[] { (byte) -1, 1, (short) -1, ' ', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, -1, 32, 0]");
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        int[] intArray4 = new int[] { 0, (short) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 100, -1]");
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, -1, 32]");
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        int[] intArray4 = new int[] { (byte) 100, 'a', (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 97, 10, -1]");
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, ' ', (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 32, 100, 52]");
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        int[] intArray6 = new int[] { 1, 0, (short) 0, (short) -1, 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 0, -1, 97, 1]");
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, '4', (short) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 52, 100, 10]");
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        int[] intArray5 = new int[] { (short) 1, ' ', ' ', 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, 32, 1, 52]");
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        int[] intArray6 = new int[] { 10, (short) 1, 'a', (byte) 100, '4', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 97, 100, 52, -1]");
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        int[] intArray4 = new int[] { '4', (short) 0, '#', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 0, 35, -1]");
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        int[] intArray4 = new int[] { (byte) 0, 10, (short) 0, (byte) 10 };
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
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        int[] intArray3 = new int[] { '4', (-1), 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, -1, 0]");
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        int[] intArray6 = new int[] { ' ', 100, (byte) 0, (-1), 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 100, 0, -1, 1, 97]");
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        int[] intArray5 = new int[] { (short) 1, ' ', 'a', '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, 97, 35, 1]");
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        int[] intArray6 = new int[] { 100, 100, (byte) 100, (byte) 1, 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 100, 1, 10, -1]");
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        int[] intArray3 = new int[] { (byte) -1, 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 1]");
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        int[] intArray6 = new int[] { 10, (short) 10, (byte) 0, 10, '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 0, 10, 52, -1]");
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        int[] intArray6 = new int[] { (byte) -1, 1, (short) 0, '4', '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 0, 52, 52, 0]");
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        int[] intArray6 = new int[] { (short) 100, 0, 100, (byte) -1, 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 100, -1, 100, 10]");
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        int[] intArray3 = new int[] { '#', 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 97, 1]");
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, -1, 10, -1, 100]");
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        int[] intArray5 = new int[] { (byte) -1, 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 1, 1, 1]");
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        int[] intArray6 = new int[] { (short) 10, (-1), ' ', (-1), (short) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 32, -1, -1, -1]");
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        int[] intArray3 = new int[] { (short) 0, ' ', (short) 1 };
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
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        int[] intArray3 = new int[] { ' ', (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 100, 1]");
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        int[] intArray6 = new int[] { (short) 10, 'a', (byte) 100, 'a', (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 100, 97, 1, 100]");
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        int[] intArray6 = new int[] { 10, 1, 1, 10, (byte) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 1, 10, 0, 1]");
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', 10, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, 10, 1, 100]");
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        int[] intArray4 = new int[] { 0, 1, (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 1, 100]");
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        int[] intArray5 = new int[] { 0, '#', (byte) 0, 'a', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 35, 0, 97, 10]");
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        int[] intArray6 = new int[] { 0, (short) -1, 1, (byte) 1, (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 1, 1, 1, 100]");
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        int[] intArray5 = new int[] { (byte) 0, '4', (short) 10, 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 52, 10, 0, 10]");
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        int[] intArray3 = new int[] { ' ', (-1), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 10]");
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        int[] intArray3 = new int[] { 0, 0, (short) 100 };
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
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) 1, (short) 0, (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 1, 0, -1, 32]");
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        int[] intArray5 = new int[] { '#', (short) 100, (short) 100, (short) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100, 100, 1, -1]");
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        int[] intArray5 = new int[] { '#', (short) 10, (byte) -1, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, -1, 1, 100]");
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        int[] intArray3 = new int[] { (byte) 100, '#', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 35, 100]");
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        int[] intArray6 = new int[] { (-1), 100, 10, (-1), 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 10, -1, 100, 100]");
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        int[] intArray6 = new int[] { '4', (short) 100, '#', 1, (byte) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 35, 1, 0, -1]");
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        int[] intArray6 = new int[] { (-1), (short) 100, 1, (short) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 1, -1, 1, 10]");
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        int[] intArray4 = new int[] { '4', (byte) -1, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 32, 100]");
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        int[] intArray5 = new int[] { ' ', (short) -1, 'a', (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -1, 97, -1, -1]");
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        int[] intArray5 = new int[] { 1, (short) 100, (-1), (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, -1, 10, 0]");
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 1, -1, 32, 52]");
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        int[] intArray3 = new int[] { 'a', 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        int[] intArray6 = new int[] { (byte) -1, ' ', (-1), (byte) 100, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, -1, 100, 100, 35]");
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        int[] intArray6 = new int[] { 10, (byte) 1, (short) -1, 0, 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, -1, 0, 0, 52]");
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        int[] intArray5 = new int[] { (byte) 10, (short) 1, '#', (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 35, 10, 10]");
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        int[] intArray5 = new int[] { (byte) 0, 100, '4', (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 52, -1, 100]");
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        int[] intArray6 = new int[] { (short) 1, 'a', (byte) 100, (short) 10, 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 97, 100, 10, 0, 32]");
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        int[] intArray3 = new int[] { 'a', 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 0, 32]");
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        int[] intArray4 = new int[] { (short) 1, (byte) 10, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 10, 100]");
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        int[] intArray4 = new int[] { 1, (-1), 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 10, 1]");
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        int[] intArray3 = new int[] { (short) 0, (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 32]");
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        int[] intArray5 = new int[] { (short) 10, (byte) 10, (short) 1, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 1, 97, -1]");
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        int[] intArray6 = new int[] { ' ', (byte) -1, '#', (short) 0, (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 35, 0, -1, 100]");
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        int[] intArray4 = new int[] { (short) 0, 100, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 97, 10]");
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        int[] intArray5 = new int[] { (short) 100, (short) 100, ' ', (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 32, 10, 10]");
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        int[] intArray5 = new int[] { 0, (byte) 1, 1, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 1, 1, 10]");
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        int[] intArray3 = new int[] { (short) 0, (short) 0, (short) 1 };
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
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        int[] intArray4 = new int[] { '#', (byte) -1, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, -1, 1, 100]");
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        int[] intArray4 = new int[] { (short) 1, (short) -1, 10, 10 };
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
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, (short) 100, (byte) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 100, -1, 52]");
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        int[] intArray3 = new int[] { 10, '4', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 52, 100]");
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        int[] intArray6 = new int[] { (byte) 0, (byte) 10, (short) 0, (byte) 1, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 0, 1, 100, 52]");
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        int[] intArray6 = new int[] { (short) 100, (byte) 100, ' ', ' ', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 32, 32, 35, 32]");
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        int[] intArray6 = new int[] { 0, (short) -1, 1, ' ', (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 1, 32, 10, 1]");
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        int[] intArray5 = new int[] { (byte) 10, (-1), '#', 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 35, 1, -1]");
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        int[] intArray5 = new int[] { (-1), 100, (short) 0, (short) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 0, 0, 0]");
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        int[] intArray5 = new int[] { (short) 10, ' ', '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 52, 32, 97]");
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        int[] intArray4 = new int[] { (byte) 10, (short) 1, 'a', (short) 100 };
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
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        int[] intArray3 = new int[] { (byte) 0, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0]");
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        int[] intArray4 = new int[] { (byte) 10, '4', ' ', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 32, 100]");
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        int[] intArray5 = new int[] { 100, (byte) -1, (short) 10, (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 10, -1, -1]");
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        int[] intArray5 = new int[] { (short) 100, 10, (byte) 0, '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 0, 52, 97]");
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        int[] intArray4 = new int[] { (byte) 10, 10, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, -1, 10]");
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        int[] intArray6 = new int[] { (short) 1, (byte) 0, 0, (byte) 100, 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 0, 100, 0, 10]");
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        int[] intArray6 = new int[] { (short) 1, (-1), (short) 10, '#', (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 10, 35, -1, 0]");
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        int[] intArray6 = new int[] { (-1), (short) 1, '#', (byte) 100, '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 35, 100, 35, 52]");
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        int[] intArray4 = new int[] { (short) 0, ' ', (byte) 0, (short) 1 };
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
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        int[] intArray3 = new int[] { (-1), 10, '4' };
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
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        int[] intArray4 = new int[] { 100, (short) 100, 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 97, 100]");
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 0, 100]");
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        int[] intArray5 = new int[] { 'a', 10, (byte) 100, '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 10, 100, 52, 0]");
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 0, 10]");
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        int[] intArray3 = new int[] { (short) 0, (short) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 100]");
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        int[] intArray4 = new int[] { (byte) 0, (short) 10, 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 100, 0]");
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        int[] intArray4 = new int[] { (-1), 'a', 'a', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 97, 100]");
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        int[] intArray4 = new int[] { '4', (short) 0, 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 0, 1, 35]");
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        int[] intArray6 = new int[] { (byte) 10, 10, (short) 0, (byte) 10, (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 0, 10, -1, -1]");
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        int[] intArray6 = new int[] { '4', (short) 0, (byte) 0, '#', ' ', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 0, 0, 35, 32, 1]");
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        int[] intArray5 = new int[] { '4', 1, 10, ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 10, 32, 52]");
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        int[] intArray4 = new int[] { (short) 0, 1, ' ', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 32, 0]");
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        int[] intArray3 = new int[] { (byte) 100, 0, (byte) 10 };
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
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        int[] intArray6 = new int[] { (short) 0, (short) 1, (byte) 1, (short) 100, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 1, 100, 52, 0]");
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        int[] intArray6 = new int[] { (short) 0, (byte) -1, (byte) 0, (byte) 100, '4', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 100, 52, 1]");
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        int[] intArray3 = new int[] { (byte) 100, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 1]");
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        int[] intArray3 = new int[] { (-1), '4', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 52, 1]");
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        int[] intArray6 = new int[] { '4', (byte) 10, 'a', (short) 100, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 97, 100, -1, 100]");
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        int[] intArray3 = new int[] { (short) 10, ' ', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 32, 10]");
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        int[] intArray6 = new int[] { 'a', 100, 0, 'a', (short) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 0, 97, 0, 97]");
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, 10, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 10, 10, 1]");
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        int[] intArray4 = new int[] { (byte) 1, 10, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 10]");
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        int[] intArray3 = new int[] { (byte) -1, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, -1]");
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        int[] intArray4 = new int[] { (byte) 0, (short) -1, ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 32, 97]");
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        int[] intArray6 = new int[] { (short) 100, (short) 0, (short) 100, (-1), (short) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 100, -1, 0, 0]");
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        int[] intArray4 = new int[] { ' ', ' ', ' ', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 32, 32, 100]");
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        int[] intArray4 = new int[] { (short) 1, (short) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 0, 1]");
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        int[] intArray6 = new int[] { 1, (byte) 0, (byte) 100, 10, (-1), 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 100, 10, -1, 97]");
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        int[] intArray3 = new int[] { (short) 100, (short) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, -1]");
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        int[] intArray6 = new int[] { (-1), (short) 1, 1, 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 1, 100, 10, 0]");
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        int[] intArray5 = new int[] { (byte) 0, (short) -1, (byte) 10, (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, -1, 100]");
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        int[] intArray4 = new int[] { (short) 1, (byte) 10, 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 10, 100]");
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        int[] intArray5 = new int[] { (short) 1, (byte) 1, (short) -1, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, -1, 35, 97]");
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        int[] intArray3 = new int[] { (-1), (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 35]");
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        int[] intArray4 = new int[] { '4', (short) 100, '#', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 35, -1]");
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        int[] intArray3 = new int[] { 0, (byte) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        int[] intArray4 = new int[] { 10, '4', (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100, 1]");
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, -1]");
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        int[] intArray3 = new int[] { 10, 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 100]");
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, (-1), 100, 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, 100, 100, 0]");
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) 0, 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 0, 10, -1, 100]");
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        int[] intArray4 = new int[] { (short) 10, (short) -1, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 100, 100]");
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        int[] intArray4 = new int[] { ' ', (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 1, 100, 1]");
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        int[] intArray3 = new int[] { 1, (byte) 0, 100 };
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
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        int[] intArray5 = new int[] { 'a', (short) 10, 1, '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 10, 1, 35, -1]");
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, 0, (byte) 1, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 0, 1, 100, 0]");
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        int[] intArray4 = new int[] { (byte) 1, 1, (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100, 100]");
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        int[] intArray6 = new int[] { 1, (short) -1, (short) 10, 1, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 10, 1, -1, 1]");
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        int[] intArray5 = new int[] { (short) 100, 100, (-1), 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, -1, 0, 0]");
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        int[] intArray4 = new int[] { 10, ' ', (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 32, -1, 32]");
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        int[] intArray6 = new int[] { 'a', (byte) 1, (byte) 1, (byte) -1, 'a', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 1, -1, 97, 1]");
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        int[] intArray5 = new int[] { (short) -1, 100, '4', 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 52, 100, 10]");
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        int[] intArray5 = new int[] { (-1), (-1), (short) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 100, 10, 1]");
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        int[] intArray6 = new int[] { '4', (byte) -1, (-1), 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, -1, -1, 1, 10, 100]");
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 1, 10]");
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        int[] intArray5 = new int[] { '#', (short) -1, ' ', (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 32, 100, 100]");
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        int[] intArray4 = new int[] { 10, ' ', ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 32, 32, 1]");
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        int[] intArray4 = new int[] { 0, (short) 0, 100, (byte) 100 };
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
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        int[] intArray6 = new int[] { 10, 100, (byte) -1, ' ', (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, -1, 32, -1, 100]");
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        int[] intArray5 = new int[] { (-1), (short) 1, 0, 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 0, 0, 0]");
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        int[] intArray5 = new int[] { (short) -1, '#', (byte) 100, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, 100, 0, 1]");
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        int[] intArray6 = new int[] { (byte) 10, 'a', (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 1, 10, -1, 1]");
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        int[] intArray5 = new int[] { '4', (byte) 1, (byte) 100, 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 100, 1, 32]");
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        int[] intArray4 = new int[] { (byte) 100, (byte) 0, '4', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 52, 100]");
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        int[] intArray4 = new int[] { '#', (short) 1, (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 1, -1, 32]");
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        int[] intArray4 = new int[] { 1, (byte) -1, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 1, 10]");
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        int[] intArray6 = new int[] { (byte) 1, 1, (short) 1, (short) -1, (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 1, -1, 10, 10]");
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        int[] intArray6 = new int[] { (-1), (byte) 10, 100, '#', (short) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 100, 35, 100, -1]");
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, (short) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 100, -1]");
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        int[] intArray5 = new int[] { 100, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 1, 0, -1]");
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        int[] intArray6 = new int[] { 'a', '#', (short) 10, (short) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 10, -1, 10, 100]");
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        int[] intArray6 = new int[] { (short) 100, (short) -1, (byte) 1, 10, (byte) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 1, 10, 1, 1]");
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        int[] intArray4 = new int[] { (short) 0, (byte) -1, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 35, 35]");
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        int[] intArray6 = new int[] { 1, (byte) 10, (short) 1, 0, '#', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 1, 0, 35, 10]");
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        int[] intArray4 = new int[] { 0, (byte) 10, (byte) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 0, 0]");
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        int[] intArray5 = new int[] { '#', (byte) 10, (byte) -1, 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, -1, 100, 0]");
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        int[] intArray4 = new int[] { 100, (short) 10, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 0, 100]");
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        int[] intArray3 = new int[] { (short) 10, 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 97, 35]");
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        int[] intArray6 = new int[] { (-1), (byte) 100, (byte) 10, '4', 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 10, 52, 1, -1]");
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        int[] intArray3 = new int[] { (-1), (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 1]");
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        int[] intArray5 = new int[] { (short) 0, 10, 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 10, -1, 10]");
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        int[] intArray5 = new int[] { 0, 10, (short) -1, (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, -1, 100, 1]");
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        int[] intArray6 = new int[] { (byte) 1, '4', (short) 0, 0, (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 0, 0, 0, 100]");
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        int[] intArray3 = new int[] { 1, (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 1]");
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        int[] intArray3 = new int[] { (byte) 1, (short) 0, (byte) -1 };
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
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        int[] intArray6 = new int[] { 10, (byte) 1, 10, 0, (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 10, 0, -1, 32]");
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        int[] intArray4 = new int[] { ' ', (byte) 100, (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 100, -1, 35]");
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        int[] intArray6 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) -1, 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 100, -1, 1, 10]");
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        int[] intArray5 = new int[] { 'a', 1, 10, (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1, 10, 100, 0]");
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        int[] intArray6 = new int[] { (byte) -1, (short) 0, 10, (byte) 10, (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 10, 10, 0, 0]");
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        int[] intArray4 = new int[] { '4', (byte) 100, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 10, 0]");
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        int[] intArray5 = new int[] { 10, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 100, 0, 0]");
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
        int[] intArray6 = new int[] { (short) -1, '#', (byte) 0, (short) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, 0, 100, 100, 10]");
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        int[] intArray6 = new int[] { 1, '4', (byte) 0, 10, 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 0, 10, 0, 1]");
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        int[] intArray6 = new int[] { (byte) 1, (byte) -1, (short) 100, 0, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 100, 0, 10, 100]");
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        int[] intArray6 = new int[] { 10, (short) 0, (byte) 10, 1, 'a', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 10, 1, 97, 0]");
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        int[] intArray3 = new int[] { '4', 'a', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 97, 0]");
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
        int[] intArray3 = new int[] { (byte) 100, (byte) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 52]");
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        int[] intArray5 = new int[] { '#', 100, (short) 10, (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100, 10, 0, 0]");
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        int[] intArray6 = new int[] { 10, (byte) -1, 0, '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 0, 35, 32, 32]");
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        int[] intArray6 = new int[] { (byte) 100, (short) 1, (short) 100, ' ', (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 100, 32, 0, 10]");
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        int[] intArray6 = new int[] { 100, 1, (byte) 0, (short) 1, (byte) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 0, 1, 1, 52]");
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 97]");
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        int[] intArray5 = new int[] { (short) 0, '4', '#', (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 52, 35, 1, 10]");
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        int[] intArray5 = new int[] { '4', ' ', (byte) 0, 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 32, 0, 100, 0]");
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        int[] intArray6 = new int[] { '4', (-1), (short) 10, '4', (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, -1, 10, 52, -1, -1]");
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        int[] intArray4 = new int[] { (-1), (short) 1, 'a', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 97, 1]");
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        int[] intArray4 = new int[] { (byte) -1, '#', (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 10, -1]");
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        int[] intArray3 = new int[] { '4', '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 35, 100]");
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
        int[] intArray5 = new int[] { (byte) -1, (byte) -1, ' ', (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 32, 1, -1]");
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
        int[] intArray4 = new int[] { '#', (short) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 10, 10, -1]");
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        int[] intArray6 = new int[] { (byte) 100, 0, '4', (byte) 0, 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 52, 0, 1, 35]");
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        int[] intArray5 = new int[] { 10, (short) 0, '4', '4', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 52, 52, 10]");
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
        int[] intArray4 = new int[] { (short) 10, '4', 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
        int[] intArray6 = new int[] { (short) 0, 'a', (byte) 10, (short) 0, (short) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 97, 10, 0, 1, 0]");
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        int[] intArray4 = new int[] { 10, (short) 1, 0, (byte) -1 };
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
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        int[] intArray4 = new int[] { (short) 1, (byte) 100, '#', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 35, 10]");
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        int[] intArray3 = new int[] { '#', 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 1, -1]");
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        int[] intArray5 = new int[] { 0, (byte) -1, 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, -1, 10]");
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        int[] intArray5 = new int[] { (short) -1, (byte) 1, (short) 100, ' ', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 100, 32, 0]");
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100, 100]");
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        int[] intArray4 = new int[] { (-1), (-1), (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, -1, -1]");
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        int[] intArray4 = new int[] { ' ', (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 10, 100, -1]");
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        int[] intArray4 = new int[] { 1, (-1), (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 1, 97]");
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        int[] intArray6 = new int[] { (byte) 100, '4', (short) 10, (short) 0, ' ', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 10, 0, 32, 0]");
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        int[] intArray5 = new int[] { (byte) -1, '4', ' ', (short) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52, 32, -1, 1]");
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        int[] intArray6 = new int[] { 100, (short) 10, (short) 0, '4', (byte) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 0, 52, 1, 1]");
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        int[] intArray4 = new int[] { (short) 1, (short) 0, 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 1, -1]");
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        int[] intArray3 = new int[] { (short) 100, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 35, 97]");
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        int[] intArray4 = new int[] { 1, (short) -1, (short) -1, (byte) 100 };
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
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        int[] intArray5 = new int[] { 1, 100, (byte) 100, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 100, 10, 100]");
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
        int[] intArray5 = new int[] { (byte) -1, 1, (byte) 0, 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 0, 0, -1]");
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        int[] intArray5 = new int[] { (short) -1, (short) 1, (short) 100, (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 100, 10, 0]");
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        int[] intArray4 = new int[] { (short) 100, 1, '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 100]");
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        int[] intArray5 = new int[] { '4', (short) 1, ' ', (short) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 32, 10, 100]");
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        int[] intArray3 = new int[] { 100, (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 52]");
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        int[] intArray5 = new int[] { (short) 1, (short) 1, (short) 100, (short) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 100, 0, 1]");
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        int[] intArray5 = new int[] { 'a', (byte) 100, (byte) 0, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 0, 10, 0]");
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
        int[] intArray5 = new int[] { 10, (short) 1, 10, (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 10, -1, 0]");
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        int[] intArray4 = new int[] { '#', (short) -1, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, -1, 35, 35]");
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
        int[] intArray6 = new int[] { 10, (byte) 0, ' ', 100, (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 32, 100, -1, -1]");
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
        int[] intArray5 = new int[] { 10, ' ', '#', 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 35, 100, 35]");
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        int[] intArray3 = new int[] { (short) 10, (byte) 10, 10 };
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
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, -1, 35]");
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
        int[] intArray4 = new int[] { (short) 100, (byte) 100, '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 35, 52]");
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        int[] intArray3 = new int[] { 10, '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 52, 0]");
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        int[] intArray4 = new int[] { 'a', (-1), 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, -1, 97, 100]");
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        int[] intArray4 = new int[] { '#', (byte) -1, (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, -1, -1, 52]");
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        int[] intArray4 = new int[] { (short) 0, (short) 1, (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 100, 97]");
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        int[] intArray6 = new int[] { 1, (short) 10, (-1), 1, (short) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 0, 10]");
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        int[] intArray4 = new int[] { (byte) 1, (byte) -1, 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 10, 0]");
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        int[] intArray5 = new int[] { (short) -1, 1, (byte) 1, 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 1, 97, 35]");
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
        int[] intArray3 = new int[] { (byte) 1, 'a', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 97, -1]");
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        int[] intArray3 = new int[] { (short) -1, (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 1]");
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        int[] intArray6 = new int[] { (byte) 1, (short) 10, (-1), ' ', (byte) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 32, 0, 1]");
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        int[] intArray6 = new int[] { (byte) 0, (byte) 0, 'a', (-1), (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 97, -1, -1, 35]");
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 52, -1]");
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
        int[] intArray4 = new int[] { 10, (short) 100, 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 10, 97]");
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        int[] intArray3 = new int[] { (short) 10, (short) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 100]");
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        int[] intArray4 = new int[] { (short) 10, (short) 1, (byte) 0, (byte) 100 };
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
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
        int[] intArray5 = new int[] { 0, (short) 1, 0, 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 0, 0, -1]");
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        int[] intArray5 = new int[] { (byte) 1, (short) 1, 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 100, -1, 0]");
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
        int[] intArray3 = new int[] { (byte) 1, (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, -1]");
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        int[] intArray3 = new int[] { (short) -1, 'a', (byte) 1 };
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
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        int[] intArray5 = new int[] { 1, (short) -1, (short) 0, (byte) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 0, 0, 52]");
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
        int[] intArray4 = new int[] { 10, (byte) 100, '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 10]");
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        int[] intArray5 = new int[] { ' ', 10, (byte) 1, ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 1, 32, 35]");
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        int[] intArray6 = new int[] { (byte) 1, 100, (short) 10, 0, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 10, 0, 100, 0]");
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        int[] intArray4 = new int[] { '4', 10, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 32, 100]");
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        int[] intArray5 = new int[] { ' ', 10, (byte) 10, (short) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 10, 0, 0]");
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        int[] intArray4 = new int[] { '4', (short) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 100, 100]");
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        int[] intArray3 = new int[] { 100, (short) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 1]");
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
        int[] intArray5 = new int[] { 0, ' ', (byte) 1, 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, 1, 97, 97]");
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        int[] intArray4 = new int[] { (byte) 0, 0, 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 52]");
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
        int[] intArray5 = new int[] { (byte) 1, (-1), (-1), 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1, 10, 1]");
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
        int[] intArray5 = new int[] { 1, (byte) 10, 10, '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 52, 10]");
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        int[] intArray5 = new int[] { ' ', (byte) 100, 1, (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 100, 1, 100, 97]");
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
        int[] intArray3 = new int[] { 0, (byte) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 52]");
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        int[] intArray5 = new int[] { 100, (short) 0, (short) 1, 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 1, 10, 35]");
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        int[] intArray5 = new int[] { (byte) 10, (byte) -1, (short) 1, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 1, 100, 0]");
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        int[] intArray3 = new int[] { '4', (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 10, -1]");
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        int[] intArray6 = new int[] { (short) 1, (short) 100, (short) 1, (short) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 1, 10, -1, 0]");
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        int[] intArray3 = new int[] { 100, (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0]");
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        int[] intArray4 = new int[] { 0, '4', (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, -1, 100]");
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        int[] intArray5 = new int[] { (byte) 0, ' ', '4', (-1), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, 52, -1, 10]");
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
        int[] intArray3 = new int[] { (byte) 0, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 100]");
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        int[] intArray4 = new int[] { (short) 0, 100, '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 52, 10]");
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
        int[] intArray3 = new int[] { '#', (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 1, 0]");
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        int[] intArray6 = new int[] { (short) 10, (byte) 10, 0, (short) -1, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 0, -1, 32, 100]");
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
        int[] intArray5 = new int[] { 100, 'a', (byte) 10, (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 10, -1, 0]");
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        int[] intArray4 = new int[] { (byte) 0, 'a', (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 97, -1, -1]");
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        int[] intArray3 = new int[] { (byte) 0, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 1]");
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        int[] intArray6 = new int[] { (short) 100, 0, (byte) 1, (byte) 0, (short) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 1, 0, 100, -1]");
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
        int[] intArray6 = new int[] { (short) -1, (short) -1, (short) 0, 10, (-1), (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 0, 10, -1, 1]");
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        int[] intArray4 = new int[] { 10, 1, (short) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 1, -1]");
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        int[] intArray5 = new int[] { 100, (short) 0, (short) -1, (byte) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 10, 100]");
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        int[] intArray5 = new int[] { (byte) 0, 10, (-1), '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, -1, 52, 10]");
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        int[] intArray6 = new int[] { 1, '4', '#', (byte) -1, 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 35, -1, 1, 100]");
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, 10]");
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, (short) 0, (short) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 0, 1, -1]");
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13816");
        int[] intArray5 = new int[] { (byte) 10, (short) 1, '#', (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 35, 1, 100]");
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13817");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, (byte) 1, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 1, 10, -1]");
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13818");
        int[] intArray4 = new int[] { '4', (byte) -1, 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 100, -1]");
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13819");
        int[] intArray5 = new int[] { '4', (byte) 10, '#', 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 35, 97, -1]");
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13820");
        int[] intArray6 = new int[] { (byte) 100, 1, (byte) 1, 10, (short) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 1, 10, 100, 1]");
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13821");
        int[] intArray4 = new int[] { '#', '#', 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 35, 0, 0]");
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13822");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, 10, (byte) 100, (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 10, 100, 100, 1]");
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13823");
        int[] intArray5 = new int[] { (byte) 10, (short) 10, 'a', (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 97, 10, -1]");
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13824");
        int[] intArray4 = new int[] { (byte) 0, '#', 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 35, 10, 100]");
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13825");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, 10, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 10, 10, 52]");
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13826");
        int[] intArray4 = new int[] { '4', 10, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 0, 1]");
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13827");
        int[] intArray5 = new int[] { 0, (byte) -1, '#', 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 35, 100, 10]");
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13828");
        int[] intArray5 = new int[] { (byte) 100, 100, 'a', 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 97, 100, 52]");
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13829");
        int[] intArray5 = new int[] { (byte) 1, 100, (byte) 1, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 1, 1, 0]");
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13830");
        int[] intArray6 = new int[] { '#', (short) 0, (short) -1, (byte) 1, '4', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0, -1, 1, 52, 1]");
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13831");
        int[] intArray4 = new int[] { (byte) 100, (short) 10, (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100, 100]");
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13832");
        int[] intArray5 = new int[] { (-1), (short) 1, (short) 100, (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 100, -1, 1]");
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13833");
        int[] intArray5 = new int[] { (short) 0, '4', 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 52, 0, 100, 0]");
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13834");
        int[] intArray6 = new int[] { 'a', (short) -1, (byte) 10, 10, (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 10, 10, -1, 0]");
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13835");
        int[] intArray3 = new int[] { 10, (byte) 1, '4' };
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
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13836");
        int[] intArray5 = new int[] { (-1), (byte) 0, (byte) -1, 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, -1, 97, 32]");
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13837");
        int[] intArray6 = new int[] { (short) -1, 100, (short) 0, 0, '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 0, 0, 52, 10]");
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13838");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, (short) -1, '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, -1, 35, 0]");
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13839");
        int[] intArray5 = new int[] { 10, (short) 0, (short) 0, (short) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 0, 100, 97]");
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13840");
        int[] intArray5 = new int[] { (short) -1, (byte) 1, (byte) 100, ' ', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 100, 32, 10]");
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13841");
        int[] intArray6 = new int[] { (-1), ' ', (short) 100, (short) 0, 'a', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 100, 0, 97, 100]");
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13842");
        int[] intArray6 = new int[] { (-1), 0, 100, (byte) 1, 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 100, 1, 10, 97]");
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13843");
        int[] intArray6 = new int[] { '4', '4', (byte) -1, ' ', (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 52, -1, 32, 10, -1]");
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13844");
        int[] intArray4 = new int[] { (byte) -1, '#', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 52, 32]");
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13845");
        int[] intArray6 = new int[] { 0, (short) 1, (short) 100, (short) 1, 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 100, 1, 10, 10]");
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13846");
        int[] intArray6 = new int[] { (short) 100, (-1), 0, (byte) 1, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 0, 1, 10, 0]");
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13847");
        int[] intArray4 = new int[] { (short) 10, '#', '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, 52, 10]");
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13848");
        int[] intArray3 = new int[] { (short) 100, (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 97]");
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13849");
        int[] intArray5 = new int[] { (short) -1, 1, 0, 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 0, 0, 0]");
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13850");
        int[] intArray4 = new int[] { '#', '#', (byte) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 35, 100, 1]");
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13851");
        int[] intArray4 = new int[] { (short) 0, (byte) 10, (short) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 100, -1]");
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13852");
        int[] intArray4 = new int[] { '4', 100, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 100, 0]");
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13853");
        int[] intArray5 = new int[] { (-1), 10, (byte) -1, (short) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, -1, 1, 52]");
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13854");
        int[] intArray6 = new int[] { 1, '4', (short) 1, (short) 1, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 1, 1, 32, 1]");
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13855");
        int[] intArray3 = new int[] { 'a', (byte) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 1, 52]");
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13856");
        int[] intArray3 = new int[] { 0, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 10]");
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13857");
        int[] intArray4 = new int[] { (short) 10, (byte) 1, (short) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 100, -1]");
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13858");
        int[] intArray5 = new int[] { '#', 'a', (byte) 0, 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, 0, 0, 100]");
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13859");
        int[] intArray4 = new int[] { (short) -1, 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 10, -1]");
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13860");
        int[] intArray3 = new int[] { (byte) 100, '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 97]");
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13861");
        int[] intArray3 = new int[] { (short) 100, '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 35, 100]");
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13862");
        int[] intArray5 = new int[] { (byte) -1, 10, (byte) 1, (byte) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 1, -1, 1]");
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13863");
        int[] intArray4 = new int[] { 0, (short) 100, (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 35]");
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13864");
        int[] intArray4 = new int[] { (byte) -1, 1, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 1, 10]");
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13865");
        int[] intArray3 = new int[] { '#', (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, -1, 100]");
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13866");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 100]");
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13867");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, -1, 0]");
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13868");
        int[] intArray4 = new int[] { 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 100, 1]");
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13869");
        int[] intArray4 = new int[] { (byte) 1, (-1), (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 10, 0]");
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13870");
        int[] intArray5 = new int[] { ' ', (short) 1, (short) 10, 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 10, 10, 10]");
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13871");
        int[] intArray4 = new int[] { 'a', (short) 10, (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 10, 100, 1]");
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13872");
        int[] intArray5 = new int[] { 1, (byte) 0, 0, (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 0, 0, 100]");
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13873");
        int[] intArray4 = new int[] { (byte) -1, 'a', (byte) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 0, 10]");
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13874");
        int[] intArray6 = new int[] { (byte) 10, (byte) -1, 10, 'a', 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 10, 97, 0, 0]");
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13875");
        int[] intArray3 = new int[] { (short) 0, (short) 100, (-1) };
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
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13876");
        int[] intArray3 = new int[] { 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 52, 35]");
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13877");
        int[] intArray5 = new int[] { (-1), (-1), (short) 1, (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1, 100, 1]");
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13878");
        int[] intArray6 = new int[] { ' ', (byte) 0, (short) 100, (short) 10, 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 0, 100, 10, 10, 10]");
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13879");
        int[] intArray5 = new int[] { '#', 100, (-1), (byte) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100, -1, -1, 52]");
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13880");
        int[] intArray6 = new int[] { (short) 100, 100, (-1), 1, (short) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, -1, 1, 0, 97]");
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13881");
        int[] intArray6 = new int[] { (short) 1, (short) 1, ' ', (short) 10, (byte) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, 10, 100, 1]");
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13882");
        int[] intArray6 = new int[] { 100, 100, 0, 1, (short) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 0, 1, 1, 10]");
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13883");
        int[] intArray4 = new int[] { 'a', 10, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 10, 1, 10]");
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13884");
        int[] intArray6 = new int[] { ' ', 1, '#', (byte) -1, 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 1, 35, -1, 0, 100]");
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13885");
        int[] intArray4 = new int[] { '4', 'a', 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 97, 10, 0]");
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13886");
        int[] intArray3 = new int[] { 0, 100, (short) 0 };
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
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13887");
        int[] intArray6 = new int[] { (short) 100, (byte) 1, ' ', (short) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 32, 100, 10, 1]");
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13888");
        int[] intArray5 = new int[] { 10, (short) 0, 1, (byte) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 1, 1, 97]");
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13889");
        int[] intArray6 = new int[] { 'a', (short) 10, ' ', (byte) -1, (byte) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 32, -1, 0, 10]");
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13890");
        int[] intArray3 = new int[] { (byte) 10, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 52, 1]");
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13891");
        int[] intArray5 = new int[] { (byte) 0, (short) 10, ' ', 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 10, 1]");
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13892");
        int[] intArray4 = new int[] { 100, (short) 0, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 97, 1]");
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13893");
        int[] intArray5 = new int[] { (short) -1, (short) 100, (short) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 100, 1, -1]");
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13894");
        int[] intArray3 = new int[] { '4', '#', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 35, 10]");
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13895");
        int[] intArray6 = new int[] { (short) 0, 'a', 10, 'a', (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 97, 10, 97, 100, -1]");
    }

    @Test
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13896");
        int[] intArray6 = new int[] { (-1), (byte) 10, 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 1, 0, -1, 1]");
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13897");
        int[] intArray6 = new int[] { ' ', (byte) 0, (byte) 100, '4', (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 0, 100, 52, -1, 100]");
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13898");
        int[] intArray6 = new int[] { (byte) 0, (-1), 0, (byte) 1, (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 1, -1, 35]");
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13899");
        int[] intArray5 = new int[] { (byte) 0, '4', '#', (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 52, 35, -1, 52]");
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13900");
        int[] intArray5 = new int[] { 'a', (short) 10, ' ', 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 10, 32, 10, 1]");
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13901");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 1, 1]");
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13902");
        int[] intArray5 = new int[] { (byte) 1, (byte) 100, (-1), (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, -1, 100, 35]");
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13903");
        int[] intArray3 = new int[] { (short) 1, (-1), '#' };
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
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13904");
        int[] intArray4 = new int[] { (short) -1, 100, (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 100, 97]");
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13905");
        int[] intArray4 = new int[] { 100, 100, (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 0, 0]");
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13906");
        int[] intArray3 = new int[] { 10, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 35, 97]");
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13907");
        int[] intArray3 = new int[] { (byte) -1, (short) 0, (byte) 100 };
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
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13908");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, (short) 10, (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 10, -1, -1]");
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13909");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, 'a', (-1), (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 97, -1, -1, 1]");
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13910");
        int[] intArray5 = new int[] { '#', 1, (short) 100, ' ', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1, 100, 32, -1]");
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13911");
        int[] intArray4 = new int[] { (byte) 0, 1, 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 1, 0]");
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13912");
        int[] intArray6 = new int[] { (short) -1, 1, 1, (short) 1, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 1, 1, 100, 52]");
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13913");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 100]");
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13914");
        int[] intArray5 = new int[] { (short) 0, (short) 10, (short) 1, '4', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 52, -1]");
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13915");
        int[] intArray5 = new int[] { (byte) 100, 'a', (byte) -1, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, -1, 97, 10]");
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13916");
        int[] intArray6 = new int[] { ' ', '#', (short) 10, (short) 10, 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 35, 10, 10, 10, 35]");
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13917");
        int[] intArray6 = new int[] { ' ', (short) -1, (short) 100, (byte) -1, '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 100, -1, 35, 0]");
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13918");
        int[] intArray5 = new int[] { '4', (byte) 1, (short) 1, (byte) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 1, 1, -1]");
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13919");
        int[] intArray5 = new int[] { (short) 10, 1, (short) 1, (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 1, 1, 35]");
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13920");
        int[] intArray3 = new int[] { 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 52, 97]");
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13921");
        int[] intArray6 = new int[] { (byte) 10, 0, (byte) -1, '4', (short) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, -1, 52, 100, 1]");
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13922");
        int[] intArray4 = new int[] { ' ', (short) 10, (short) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 10, -1, 1]");
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13923");
        int[] intArray6 = new int[] { 1, (short) 10, (short) -1, '#', 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 35, 100, -1]");
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13924");
        int[] intArray5 = new int[] { (byte) 10, (-1), '4', (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 52, -1, 10]");
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13925");
        int[] intArray4 = new int[] { 0, (byte) 1, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 0, 1]");
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13926");
        int[] intArray6 = new int[] { 1, (byte) 0, (byte) 100, (byte) 1, (short) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 100, 1, 100, 32]");
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13927");
        int[] intArray6 = new int[] { 0, (short) -1, 1, 0, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 1, 0, 0, 100]");
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13928");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 10, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 10, 10, 35]");
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13929");
        int[] intArray6 = new int[] { (short) 1, 1, (byte) -1, (byte) -1, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, -1, -1, 10, 0]");
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13930");
        int[] intArray3 = new int[] { (short) 1, (short) -1, 10 };
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
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13931");
        int[] intArray6 = new int[] { (short) -1, (byte) 1, 100, 100, (byte) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 100, 100, 10, 1]");
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13932");
        int[] intArray5 = new int[] { (-1), (byte) -1, (byte) 1, (short) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1, 10, 10]");
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13933");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, 'a', (byte) -1, '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 97, -1, 52, 32]");
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13934");
        int[] intArray3 = new int[] { (byte) 100, (byte) 100, 1 };
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
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13935");
        int[] intArray4 = new int[] { (short) 100, (short) 1, '#', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, -1]");
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13936");
        int[] intArray3 = new int[] { 100, (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 1]");
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13937");
        int[] intArray6 = new int[] { 'a', 'a', '4', (short) 0, '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 97, 52, 0, 52, -1]");
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13938");
        int[] intArray6 = new int[] { (byte) 10, 0, (-1), (byte) -1, (short) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, -1, -1, 10, 1]");
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13939");
        int[] intArray5 = new int[] { 'a', (byte) 100, (byte) 10, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 10, 1, 10]");
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13940");
        int[] intArray6 = new int[] { (-1), (byte) 0, (byte) 100, 'a', '#', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 100, 97, 35, 10]");
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13941");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, (byte) 10, (short) 100, (short) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 10, 100, 0, 10]");
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13942");
        int[] intArray6 = new int[] { '4', 0, (-1), 1, '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 0, -1, 1, 35, 0]");
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13943");
        int[] intArray5 = new int[] { (short) 100, 10, (-1), (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, -1, -1, -1]");
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13944");
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, (short) 10, 100, ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 10, 100, 32, 32]");
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13945");
        int[] intArray3 = new int[] { (byte) -1, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 100]");
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13946");
        int[] intArray4 = new int[] { 1, 10, (byte) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 1, 100]");
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13947");
        int[] intArray5 = new int[] { 'a', 100, (byte) -1, (byte) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, -1, 0, 0]");
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13948");
        int[] intArray4 = new int[] { 0, (byte) 10, 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 0, 0]");
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13949");
        int[] intArray5 = new int[] { '4', (short) 1, 0, (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 0, 0, 100]");
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13950");
        int[] intArray5 = new int[] { 10, 0, 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 97, 97, 97]");
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13951");
        int[] intArray5 = new int[] { (short) 1, 10, ' ', (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 32, -1, 0]");
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13952");
        int[] intArray6 = new int[] { (byte) 0, 10, 100, ' ', (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 100, 32, 100, 1]");
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13953");
        int[] intArray4 = new int[] { '#', (byte) 1, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 1, 52, 0]");
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13954");
        int[] intArray5 = new int[] { (short) 10, (byte) 10, (byte) -1, (short) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, -1, 100, -1]");
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13955");
        int[] intArray4 = new int[] { ' ', '4', (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 52, -1, 100]");
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13956");
        int[] intArray6 = new int[] { (short) 1, '4', '4', '#', (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 52, 35, -1, -1]");
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13957");
        int[] intArray5 = new int[] { (byte) 0, (-1), (byte) 100, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 100, 35, 100]");
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13958");
        int[] intArray6 = new int[] { (short) 1, 10, (byte) 100, (byte) -1, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 100, -1, 100, 1]");
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13959");
        int[] intArray3 = new int[] { ' ', (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 52]");
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13960");
        int[] intArray3 = new int[] { ' ', (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 35]");
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13961");
        int[] intArray6 = new int[] { (short) 100, ' ', 1, (byte) 100, '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 1, 100, 35, 32]");
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13962");
        int[] intArray5 = new int[] { (short) 10, (byte) 0, (short) 100, '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 100, 52, 10]");
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13963");
        int[] intArray5 = new int[] { 10, (short) -1, (byte) 0, (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 0, 100, -1]");
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13964");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 0]");
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13965");
        int[] intArray6 = new int[] { (short) 0, 100, 1, 1, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 1, 1, 10, -1]");
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13966");
        int[] intArray6 = new int[] { 10, 1, 1, (short) 100, (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 1, 100, -1, -1]");
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13967");
        int[] intArray3 = new int[] { (short) 10, (byte) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 32]");
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13968");
        int[] intArray3 = new int[] { (short) 1, (byte) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 35]");
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13969");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, 100, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 100, 35, 97]");
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13970");
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, 1, (short) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 1, 10, -1]");
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13971");
        int[] intArray5 = new int[] { (byte) 10, (short) -1, ' ', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 32, 97, 97]");
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13972");
        int[] intArray3 = new int[] { '#', (byte) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 0, 0]");
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13973");
        int[] intArray4 = new int[] { (short) 100, (byte) -1, (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 10, 100]");
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13974");
        int[] intArray5 = new int[] { (byte) -1, (-1), (byte) 0, '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, 52, 10]");
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13975");
        int[] intArray4 = new int[] { '4', 0, ' ', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 0, 32, -1]");
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13976");
        int[] intArray5 = new int[] { 1, (byte) 10, (byte) -1, 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, -1, 0, 1]");
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13977");
        int[] intArray3 = new int[] { 1, (byte) 0, (-1) };
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
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13978");
        int[] intArray6 = new int[] { (byte) -1, 0, ' ', ' ', ' ', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 32, 32, 32, 100]");
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13979");
        int[] intArray4 = new int[] { 'a', 10, '#', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 10, 35, 0]");
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13980");
        int[] intArray6 = new int[] { '#', 10, (short) 10, (short) -1, 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 10, 10, -1, 0, -1]");
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13981");
        int[] intArray5 = new int[] { 'a', 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, -1, 0, -1]");
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13982");
        int[] intArray4 = new int[] { 10, (short) -1, '4', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 52, 100]");
    }

    @Test
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13983");
        int[] intArray5 = new int[] { (short) 0, (byte) 1, (byte) 10, (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 10, 1, -1]");
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13984");
        int[] intArray5 = new int[] { (short) 1, (short) 10, 10, ' ', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 32, 0]");
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13985");
        int[] intArray5 = new int[] { ' ', (-1), '#', (byte) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -1, 35, 100, 52]");
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13986");
        int[] intArray3 = new int[] { (byte) -1, (short) 0, 100 };
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
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13987");
        int[] intArray3 = new int[] { (byte) 100, (short) 10, (byte) 10 };
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
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13988");
        int[] intArray4 = new int[] { (byte) -1, 0, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, -1, 32]");
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13989");
        int[] intArray4 = new int[] { 10, (short) 1, (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 10, 10]");
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13990");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 100, '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 100, 52, 10]");
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13991");
        int[] intArray3 = new int[] { ' ', 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 97, 100]");
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13992");
        int[] intArray3 = new int[] { (byte) 0, 'a', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 97, 100]");
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13993");
        int[] intArray5 = new int[] { 1, (short) 100, ' ', (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 32, -1, 0]");
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13994");
        int[] intArray5 = new int[] { ' ', 1, (byte) 0, 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 10, 32]");
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13995");
        int[] intArray6 = new int[] { 'a', (byte) 0, ' ', 100, 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 0, 32, 100, 97, 1]");
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13996");
        int[] intArray6 = new int[] { (byte) 100, 0, (short) 10, 1, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 10, 1, 10, 1]");
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13997");
        int[] intArray4 = new int[] { (short) 10, (short) -1, (short) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, -1, 10]");
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13998");
        int[] intArray6 = new int[] { (byte) 100, '#', '#', (byte) 0, (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 35, 35, 0, 1, 1]");
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13999");
        int[] intArray4 = new int[] { 'a', (short) 0, (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 0, -1, -1]");
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test14000");
        int[] intArray4 = new int[] { 100, (short) 10, 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 97, 97]");
    }
}
