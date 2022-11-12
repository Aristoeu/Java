package ciphers.AES;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        int[] intArray4 = new int[] { 1, (byte) -1, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 35, 97]");
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        int[] intArray4 = new int[] { (byte) 0, ' ', ' ', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 32, 32, -1]");
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        int[] intArray3 = new int[] { 'a', (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 0, 97]");
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        int[] intArray4 = new int[] { (short) 10, 10, (byte) 1, 'a' };
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
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        int[] intArray3 = new int[] { (byte) 10, 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 97]");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        int[] intArray5 = new int[] { 'a', '#', (-1), '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 35, -1, 52, 0]");
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10, (short) -1, (-1), (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, -1, -1, 10, 0]");
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        int[] intArray6 = new int[] { (short) 100, 100, (short) 1, 1, '#', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 1, 1, 35, 1]");
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        int[] intArray3 = new int[] { 10, ' ', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 32, -1]");
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        int[] intArray5 = new int[] { '#', '#', '#', 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 35, 35, 100, 0]");
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        int[] intArray5 = new int[] { 'a', (byte) 100, 10, (short) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 10, 1, 100]");
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        int[] intArray6 = new int[] { 1, (-1), (-1), 100, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, -1, 100, 97, 10]");
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        int[] intArray4 = new int[] { '4', (short) -1, 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 0, 10]");
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        int[] intArray3 = new int[] { 10, '#', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 35, -1]");
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        int[] intArray4 = new int[] { (short) 10, (byte) -1, '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 35, 100]");
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        int[] intArray6 = new int[] { 'a', 1, (short) -1, (byte) 1, '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 52, 0]");
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        int[] intArray6 = new int[] { 10, (short) 100, 0, (byte) 1, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 0, 1, 10, 35]");
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        int[] intArray4 = new int[] { (-1), (byte) 10, (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 1, 35]");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        int[] intArray5 = new int[] { '#', (byte) -1, ' ', 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 32, 0, 1]");
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        int[] intArray5 = new int[] { (-1), (short) 10, (-1), 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, -1, 100, 32]");
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        int[] intArray6 = new int[] { 100, 'a', 100, (short) -1, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 97, 100, -1, 1, 100]");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        int[] intArray5 = new int[] { '4', (byte) 100, (short) 10, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 10, 10, 100]");
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        int[] intArray6 = new int[] { 1, 1, (-1), 100, (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, -1, 100, 1, 1]");
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        int[] intArray3 = new int[] { 10, 100, (byte) 10 };
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
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        int[] intArray3 = new int[] { (short) -1, (byte) 10, (short) 100 };
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
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        int[] intArray4 = new int[] { '#', (byte) 0, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0, 100, 35]");
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        int[] intArray4 = new int[] { (byte) -1, 100, (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 100, 10]");
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 1, (byte) -1, ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 1, -1, 32, 52]");
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        int[] intArray6 = new int[] { (byte) 100, (short) -1, (short) 0, (short) 1, '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 0, 1, 52, 10]");
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        int[] intArray3 = new int[] { (byte) 100, (-1), 'a' };
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
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        int[] intArray5 = new int[] { (short) 100, 'a', '#', (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 35, 100, -1]");
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        int[] intArray5 = new int[] { 100, ' ', (-1), (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 32, -1, 100, 0]");
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        int[] intArray6 = new int[] { 100, 0, (short) 1, (byte) 1, (short) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 1, 1, 0, -1]");
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        int[] intArray2 = new int[] { (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 97]");
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        int[] intArray6 = new int[] { (short) 10, 100, (short) 100, 'a', (byte) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 100, 97, 1, 97]");
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        int[] intArray4 = new int[] { 'a', (byte) 10, '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 10, 52, -1]");
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        int[] intArray4 = new int[] { (-1), (byte) 0, 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 100, 1]");
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        int[] intArray3 = new int[] { (short) -1, (byte) 100, (byte) 0 };
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
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        int[] intArray4 = new int[] { (short) -1, 100, (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, -1, 100]");
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        int[] intArray3 = new int[] { (short) 100, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 32, 1]");
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        int[] intArray3 = new int[] { 1, 100, 1 };
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
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        int[] intArray4 = new int[] { 100, 10, 100, 0 };
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
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        int[] intArray6 = new int[] { 10, 10, (-1), (byte) 0, (byte) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, -1, 0, 100, 10]");
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        int[] intArray3 = new int[] { '4', (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 10, 1]");
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        int[] intArray6 = new int[] { (short) 1, (short) 0, '#', '#', 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 35, 35, 0, 32]");
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        int[] intArray4 = new int[] { (short) 0, (short) -1, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 35, 1]");
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        int[] intArray5 = new int[] { '4', (byte) 100, ' ', (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 32, 10, 52]");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        int[] intArray6 = new int[] { '#', (short) -1, (short) 0, '#', (-1), 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 0, 35, -1, 97]");
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        int[] intArray5 = new int[] { 10, (short) 10, (byte) 100, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 10, -1]");
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) 0, (byte) 0, (short) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 0, 0, 10, 100]");
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        int[] intArray3 = new int[] { (short) 10, (short) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 97]");
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        int[] intArray3 = new int[] { (byte) -1, 1, (short) 10 };
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
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        int[] intArray6 = new int[] { (byte) 0, 1, 10, 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 10, 10, 1, 0]");
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        int[] intArray6 = new int[] { (short) 1, 100, (short) 1, 1, 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 1, 1, 97, 97]");
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        int[] intArray4 = new int[] { (byte) 0, '#', 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 35, 1, 0]");
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        int[] intArray4 = new int[] { 'a', (-1), (short) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, -1, 1, 32]");
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        int[] intArray3 = new int[] { (short) 100, 1, (byte) -1 };
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
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        int[] intArray6 = new int[] { 0, (byte) 10, 'a', 'a', 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 97, 97, 0, 10]");
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        int[] intArray4 = new int[] { (byte) 100, 100, 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100, 100]");
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        int[] intArray4 = new int[] { (byte) -1, (short) 0, 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 100, 0]");
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        int[] intArray4 = new int[] { ' ', (byte) 1, (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 1, 100, 35]");
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        int[] intArray2 = new int[] { 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        int[] intArray6 = new int[] { 'a', (short) -1, 1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 1, 100, -1, 10]");
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        int[] intArray6 = new int[] { (short) -1, '4', '4', (byte) 10, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 52, 52, 10, 100, 10]");
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        int[] intArray4 = new int[] { (short) 1, 10, (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 100, 1]");
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        int[] intArray2 = new int[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 100]");
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        int[] intArray4 = new int[] { (short) -1, 'a', 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 1, 0]");
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (byte) 10, 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 10, 100, 1]");
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        int[] intArray6 = new int[] { (byte) 10, (short) -1, 1, (byte) -1, 'a', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 1, -1, 97, -1]");
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        int[] intArray6 = new int[] { 100, 100, '4', (-1), (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 52, -1, -1, 100]");
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        int[] intArray6 = new int[] { (byte) -1, 10, (short) 1, (byte) 10, '#', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 1, 10, 35, 1]");
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        int[] intArray6 = new int[] { 'a', 100, ' ', (byte) 0, ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 32, 0, 32, 52]");
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        int[] intArray6 = new int[] { 1, (short) 10, (byte) 100, 0, 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 100, 0, 10, 1]");
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, 0, (short) 10, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 0, 10, -1, -1]");
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        int[] intArray3 = new int[] { 100, (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 100]");
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        int[] intArray5 = new int[] { 'a', '4', ' ', ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 52, 32, 32, 1]");
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        int[] intArray3 = new int[] { (byte) -1, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 1]");
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        int[] intArray3 = new int[] { (short) -1, (byte) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, 100]");
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        int[] intArray5 = new int[] { (short) 100, (short) -1, (byte) 100, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 100, 1, 100]");
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        int[] intArray6 = new int[] { 100, (byte) 10, (short) -1, 'a', (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, -1, 97, -1, 32]");
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        int[] intArray4 = new int[] { (byte) 100, 0, 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 1, 52]");
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        int[] intArray4 = new int[] { '4', 100, '4', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 52, 1]");
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        int[] intArray3 = new int[] { '#', (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, -1, -1]");
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, (-1), (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, -1, 1]");
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        int[] intArray5 = new int[] { 'a', (byte) 1, (short) 0, (-1), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1, 0, -1, 0]");
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        int[] intArray6 = new int[] { 1, (short) 10, (short) 1, 'a', (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 1, 97, 100, 97]");
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (byte) 1 };
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
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        int[] intArray5 = new int[] { (-1), 0, (byte) -1, (short) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, -1, 100, 1]");
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        int[] intArray6 = new int[] { 100, (byte) 1, (short) 1, (short) 100, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 1, 100, 100, -1]");
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        int[] intArray3 = new int[] { '#', (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 100, -1]");
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        int[] intArray3 = new int[] { (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 0, -1]");
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        int[] intArray6 = new int[] { 100, 'a', 0, 0, (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 97, 0, 0, -1, 0]");
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        int[] intArray4 = new int[] { 0, 1, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 52, 1]");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        int[] intArray5 = new int[] { '4', 1, ' ', (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 32, 1, 100]");
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        int[] intArray3 = new int[] { 10, (byte) 1, (byte) 10 };
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
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        int[] intArray6 = new int[] { (byte) 100, '#', (short) 1, ' ', (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 35, 1, 32, 1, 1]");
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        int[] intArray3 = new int[] { (short) 0, 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, -1]");
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        int[] intArray6 = new int[] { ' ', (short) 0, '4', (-1), (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 0, 52, -1, 100, 100]");
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        int[] intArray6 = new int[] { 100, (short) 10, (byte) -1, (short) 100, (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, -1, 100, 1, 97]");
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        int[] intArray5 = new int[] { (short) 1, (short) -1, (short) 1, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 1, 10, 1]");
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        int[] intArray3 = new int[] { '4', (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 10]");
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        int[] intArray5 = new int[] { ' ', '#', ' ', (byte) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 32, 1, 100]");
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, 1, (-1), (short) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 1, -1, -1, 0]");
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        int[] intArray5 = new int[] { 1, 'a', 10, 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 10, 0, 32]");
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        int[] intArray3 = new int[] { (byte) 1, (short) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, -1]");
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        int[] intArray5 = new int[] { (short) -1, '4', (byte) 1, (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52, 1, 1, 35]");
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        int[] intArray4 = new int[] { (byte) 100, ' ', 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 10, 100]");
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        int[] intArray4 = new int[] { 'a', (short) 0, '#', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 0, 35, 1]");
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        int[] intArray6 = new int[] { ' ', '4', 0, 'a', 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 52, 0, 97, 100, 1]");
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        int[] intArray6 = new int[] { '4', 100, (short) -1, (byte) -1, '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, -1, -1, 52, 0]");
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        int[] intArray3 = new int[] { (short) -1, '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 52, 35]");
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        int[] intArray3 = new int[] { (short) 0, '#', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 35, -1]");
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        int[] intArray3 = new int[] { 0, (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 35]");
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        int[] intArray5 = new int[] { (short) 1, (short) 10, 100, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 100, 100, 1]");
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        int[] intArray4 = new int[] { (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 10, 10]");
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        int[] intArray6 = new int[] { (short) 100, ' ', 'a', (byte) -1, (byte) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 97, -1, 0, -1]");
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        int[] intArray4 = new int[] { 100, '#', (byte) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 10, -1]");
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        int[] intArray6 = new int[] { 1, ' ', (byte) 10, 10, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 32, 10, 10, -1, 10]");
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        int[] intArray4 = new int[] { ' ', (byte) 10, 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 10, 10, 100]");
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        int[] intArray4 = new int[] { (short) 1, (short) 10, (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, -1]");
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        int[] intArray6 = new int[] { (short) 100, (byte) -1, (-1), (byte) 10, (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, -1, 10, 100, 0]");
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        int[] intArray4 = new int[] { '#', (short) 100, 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 100, 100, 100]");
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        int[] intArray5 = new int[] { (byte) 1, (byte) -1, 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 1, 0, 100]");
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        int[] intArray3 = new int[] { (byte) 0, (short) 100, 10 };
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
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        int[] intArray6 = new int[] { (short) 0, (byte) -1, '#', (byte) 0, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 35, 0, 1, 100]");
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        int[] intArray3 = new int[] { (byte) 1, (short) 10, 100 };
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
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        int[] intArray3 = new int[] { '4', '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 52, 1]");
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        int[] intArray5 = new int[] { (short) 0, 1, ' ', 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 32, 10, -1]");
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        int[] intArray4 = new int[] { (short) 0, '4', (short) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, -1, -1]");
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        int[] intArray5 = new int[] { 10, (short) 10, 1, 'a', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 1, 97, 1]");
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        int[] intArray6 = new int[] { (short) 1, 0, ' ', (short) 100, 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 32, 100, 1, -1]");
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        int[] intArray5 = new int[] { (byte) 10, (short) 0, 10, 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 10, 100, 32]");
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        int[] intArray3 = new int[] { 1, ' ', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 32, -1]");
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        int[] intArray6 = new int[] { (short) 100, ' ', (byte) 100, (short) 1, (short) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 100, 1, 1, 100]");
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        int[] intArray6 = new int[] { (byte) 1, (short) -1, (byte) 10, '4', (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 10, 52, 1, 1]");
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        int[] intArray3 = new int[] { (byte) 0, 'a', 100 };
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
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        int[] intArray4 = new int[] { (byte) 0, '4', 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 10, 1]");
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        int[] intArray3 = new int[] { (byte) 10, 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, -1]");
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        int[] intArray5 = new int[] { (short) 1, '#', ' ', (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 35, 32, 1, 100]");
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 0, 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 0, 0, 1, 1]");
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        int[] intArray4 = new int[] { 0, 'a', (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 97, -1, 10]");
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        int[] intArray3 = new int[] { (-1), (short) 100, (short) -1 };
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
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        int[] intArray3 = new int[] { (byte) 0, 100, (byte) 10 };
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
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        int[] intArray4 = new int[] { (short) 0, 10, 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 1, 10]");
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        int[] intArray6 = new int[] { 0, (short) 0, 1, 1, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 1, 1, 1, 0]");
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        int[] intArray5 = new int[] { '#', (byte) 0, 1, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0, 1, 35, 100]");
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        int[] intArray4 = new int[] { 1, (-1), (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, -1, 35]");
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        int[] intArray4 = new int[] { 'a', (short) 1, (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 1, 10, -1]");
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        int[] intArray4 = new int[] { (byte) 10, (byte) 0, (short) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 0, 52]");
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        int[] intArray5 = new int[] { 100, (short) 100, '#', 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 35, 1, 52]");
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        int[] intArray3 = new int[] { (short) 0, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        int[] intArray3 = new int[] { 100, ' ', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 32, 0]");
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        int[] intArray5 = new int[] { 100, (-1), 100, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 100, 1, 0]");
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        int[] intArray4 = new int[] { (byte) 1, '#', (byte) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 35, 1, 1]");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        int[] intArray5 = new int[] { '4', 100, 100, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 100, 10, 52]");
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        int[] intArray3 = new int[] { 100, 100, (-1) };
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
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        int[] intArray5 = new int[] { 0, 1, ' ', 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 32, 10, -1]");
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        int[] intArray5 = new int[] { (byte) 10, (short) 100, 100, 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 100, 1, 1]");
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        int[] intArray5 = new int[] { 100, '4', (byte) 10, (byte) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 10, -1, -1]");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        int[] intArray4 = new int[] { 0, 100, (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 100]");
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        int[] intArray3 = new int[] { (short) -1, (byte) 10, (byte) 10 };
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
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, (byte) 10, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 32, 100]");
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        int[] intArray5 = new int[] { 10, 10, '#', 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 35, 0, -1]");
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        int[] intArray3 = new int[] { 0, (byte) 0, (byte) 0 };
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
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        int[] intArray4 = new int[] { 0, 10, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 1, 10]");
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        int[] intArray3 = new int[] { (short) -1, (byte) 0, 100 };
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
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        int[] intArray5 = new int[] { (byte) 1, (short) 0, '#', 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 35, 10, 100]");
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        int[] intArray5 = new int[] { (short) -1, (byte) 0, 1, ' ', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 1, 32, 100]");
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        int[] intArray3 = new int[] { 10, (byte) -1, 1 };
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
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        int[] intArray5 = new int[] { '#', 10, '#', ' ', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 35, 32, -1]");
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        int[] intArray4 = new int[] { (byte) 1, (short) 10, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 10, -1]");
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        int[] intArray6 = new int[] { (byte) -1, 1, 10, 'a', (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 10, 97, -1, 0]");
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        int[] intArray6 = new int[] { (-1), (short) 1, (byte) 10, (short) -1, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 10, -1, 10, 52]");
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        int[] intArray5 = new int[] { (byte) 100, ' ', (short) 0, '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 32, 0, 52, 52]");
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        int[] intArray3 = new int[] { 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 100]");
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        int[] intArray6 = new int[] { 'a', ' ', (byte) 10, 10, (byte) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 32, 10, 10, 0, 52]");
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        int[] intArray3 = new int[] { (byte) 100, (short) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 97]");
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        int[] intArray4 = new int[] { 10, 1, (short) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 1, 1]");
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        int[] intArray5 = new int[] { 'a', (short) 0, (short) 0, (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 0, 0, -1, 0]");
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        int[] intArray3 = new int[] { '4', (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, -1, 10]");
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        int[] intArray5 = new int[] { '4', (byte) -1, 'a', (byte) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 97, 1, 0]");
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        int[] intArray6 = new int[] { (short) 100, (short) 1, (-1), (short) 0, ' ', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, -1, 0, 32, 100]");
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        int[] intArray5 = new int[] { (short) -1, '4', (byte) 0, (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52, 0, 1, 97]");
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        int[] intArray3 = new int[] { 'a', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 35, 97]");
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        int[] intArray4 = new int[] { (byte) 100, (short) 100, 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100, 52]");
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        int[] intArray4 = new int[] { (-1), 1, (short) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 1, -1]");
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        int[] intArray6 = new int[] { (short) -1, 100, 100, '#', '#', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 35, 35, -1]");
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        int[] intArray6 = new int[] { 'a', 100, (short) 100, 1, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 100, 1, 100, 1]");
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        int[] intArray5 = new int[] { '#', (short) 0, (short) 1, (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0, 1, -1, 100]");
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        int[] intArray5 = new int[] { (short) -1, (-1), (short) 1, (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1, -1, 32]");
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        int[] intArray3 = new int[] { (-1), 1, (short) 100 };
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
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        int[] intArray6 = new int[] { (short) 1, (byte) 100, 100, (byte) 0, (byte) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 100, 0, 1, 10]");
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        int[] intArray3 = new int[] { 10, (byte) 100, (-1) };
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
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        int[] intArray4 = new int[] { (byte) 0, (short) 100, (short) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 100, 10]");
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        int[] intArray3 = new int[] { '4', (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 0, 32]");
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        int[] intArray5 = new int[] { (short) -1, (short) 100, 10, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 10, 1, 0]");
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        int[] intArray4 = new int[] { 0, (-1), (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, -1, 100]");
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        int[] intArray6 = new int[] { (byte) 100, (byte) 1, (-1), (byte) 1, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, -1, 1, 1, 10]");
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        int[] intArray3 = new int[] { '4', (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, -1]");
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        int[] intArray6 = new int[] { (short) -1, (byte) 100, (byte) 100, 0, (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 0, -1, 0]");
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        int[] intArray5 = new int[] { (short) 100, 10, (byte) 0, (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 0, 1, 1]");
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        int[] intArray3 = new int[] { (short) 1, (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 35]");
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        int[] intArray5 = new int[] { 0, (-1), '4', (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 52, 0, 100]");
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        int[] intArray4 = new int[] { 1, 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 0]");
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        int[] intArray6 = new int[] { (short) 10, (byte) 100, (short) 1, (short) -1, (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 1, -1, 100, 97]");
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        int[] intArray6 = new int[] { 'a', ' ', (short) 0, (short) 100, (short) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 32, 0, 100, 0, 1]");
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        int[] intArray5 = new int[] { 0, 1, (short) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 0, -1, 10]");
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        int[] intArray4 = new int[] { (byte) -1, '4', (short) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 0, 1]");
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        int[] intArray4 = new int[] { (byte) 10, (short) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, -1, 1]");
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        int[] intArray5 = new int[] { 10, (byte) 10, (short) 10, (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 10, 10, 97]");
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        int[] intArray3 = new int[] { 0, 'a', (short) -1 };
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
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        int[] intArray5 = new int[] { 1, (short) 0, (byte) -1, (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, -1, 10, 100]");
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        int[] intArray4 = new int[] { (short) 10, (short) -1, (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 10, 10]");
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        int[] intArray6 = new int[] { (byte) 100, (byte) 1, (-1), (byte) 0, 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, -1, 0, 10, 1]");
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        int[] intArray5 = new int[] { '#', 100, (byte) 1, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100, 1, 10, -1]");
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        int[] intArray5 = new int[] { 10, (byte) -1, (-1), (short) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, -1, 0, -1]");
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        int[] intArray4 = new int[] { (short) 10, '#', (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, 10, 1]");
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        int[] intArray5 = new int[] { (byte) 0, 1, ' ', (byte) -1, 'a' };
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
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        int[] intArray5 = new int[] { (byte) 0, (byte) 1, 100, 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 100, 1, 0]");
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        int[] intArray3 = new int[] { 'a', (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 0, 1]");
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        int[] intArray5 = new int[] { '#', '4', (short) 1, 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 52, 1, 0, 100]");
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        int[] intArray3 = new int[] { 100, 1, (short) 100 };
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
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        int[] intArray6 = new int[] { (short) 100, (byte) 10, ' ', '#', (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 32, 35, 10, 1]");
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        int[] intArray6 = new int[] { (-1), (byte) 0, (short) 100, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 100, 1, 10, 100]");
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        int[] intArray6 = new int[] { '4', (short) 100, (short) 1, 10, ' ', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 1, 10, 32, 0]");
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        int[] intArray5 = new int[] { 0, (short) 10, (short) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 100, -1]");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        int[] intArray5 = new int[] { (short) 0, (byte) 0, 100, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 100, 10, 1]");
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        int[] intArray3 = new int[] { (short) 100, (-1), (short) 0 };
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
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        int[] intArray4 = new int[] { (byte) -1, ' ', 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 10, 52]");
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        int[] intArray4 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 32, -1]");
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        int[] intArray5 = new int[] { (byte) -1, (byte) 100, (short) 0, '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 0, 52, 10]");
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, '4', '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 52, 35, 1]");
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        int[] intArray5 = new int[] { 'a', (byte) 1, 1, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1, 1, 10, 1]");
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        int[] intArray4 = new int[] { 10, (-1), '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 52, 0]");
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        int[] intArray3 = new int[] { (short) 0, '4', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 100]");
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        int[] intArray6 = new int[] { (byte) 100, 10, 100, ' ', (short) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 100, 32, 1, 1]");
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        int[] intArray4 = new int[] { 0, 10, (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, -1, 32]");
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        int[] intArray5 = new int[] { (byte) -1, 100, (byte) -1, '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, -1, 52, 1]");
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        int[] intArray3 = new int[] { (byte) 10, 1, '4' };
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
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        int[] intArray2 = new int[] { (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        int[] intArray5 = new int[] { '#', 100, (byte) 1, (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100, 1, -1, 10]");
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        int[] intArray6 = new int[] { (short) 1, (short) -1, (byte) -1, (short) 100, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, -1, 100, 1, 0]");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        int[] intArray6 = new int[] { (byte) -1, (-1), 10, (short) 0, 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 10, 0, 10, 0]");
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        int[] intArray6 = new int[] { (byte) 0, (short) 100, (byte) 0, (short) 10, (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 0, 10, 10, 0]");
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        int[] intArray3 = new int[] { 'a', 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 1, 100]");
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        int[] intArray6 = new int[] { (byte) -1, '#', (byte) -1, 100, ' ', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, -1, 100, 32, 0]");
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        int[] intArray6 = new int[] { (short) 100, (short) -1, 0, (short) -1, (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 0, -1, -1, 1]");
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        int[] intArray6 = new int[] { (short) -1, '#', 1, '4', (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, 1, 52, 0, 1]");
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        int[] intArray3 = new int[] { 10, 100, 10 };
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
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        int[] intArray5 = new int[] { (short) 100, (byte) -1, '#', '#', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 35, 35, 10]");
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        int[] intArray4 = new int[] { (-1), (short) 100, (short) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 0, 1]");
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        int[] intArray6 = new int[] { (short) 100, (short) 100, (byte) 10, (short) 1, (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 10, 1, 1, 0]");
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        int[] intArray4 = new int[] { 'a', (short) 100, 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 0, 0]");
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        int[] intArray4 = new int[] { (short) 100, 1, (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 0, 97]");
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        int[] intArray6 = new int[] { ' ', (short) 10, (byte) 1, (byte) 100, (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 1, 100, 10, 0]");
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        int[] intArray4 = new int[] { (short) -1, (-1), '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 35, 1]");
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, 10, 0, 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 10, 0, 10, 0]");
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        int[] intArray3 = new int[] { (short) 0, (byte) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, -1]");
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        int[] intArray2 = new int[] { 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        int[] intArray6 = new int[] { (byte) 0, (short) 100, 100, (byte) 1, (byte) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 100, 1, 0, 1]");
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        int[] intArray5 = new int[] { (short) 100, (short) 100, (short) 0, (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 0, 10, -1]");
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        int[] intArray5 = new int[] { (byte) 10, 0, '4', 'a', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 52, 97, -1]");
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        int[] intArray4 = new int[] { (short) -1, (short) 1, (short) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 0, -1]");
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, (byte) 1, ' ', (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 1, 32, -1, 35]");
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, (byte) 1, 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 1, 1, 0]");
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        int[] intArray4 = new int[] { 10, 100, (short) 10, (short) 1 };
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
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        int[] intArray3 = new int[] { 0, ' ', (byte) -1 };
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
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, 1, 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 1, 1, -1]");
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        int[] intArray5 = new int[] { (byte) 100, ' ', 0, '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 32, 0, 52, 0]");
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, (short) 10, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 10, 1, 100]");
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        int[] intArray6 = new int[] { '#', (byte) 100, '4', (byte) 100, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 100, 52, 100, 35, 1]");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        int[] intArray4 = new int[] { 100, 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, -1, 0]");
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        int[] intArray4 = new int[] { 0, (-1), (byte) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 0, 1]");
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        int[] intArray4 = new int[] { (byte) 100, 10, (short) 100, (byte) 100 };
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
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        int[] intArray5 = new int[] { (byte) 100, 100, (short) 10, (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 10, 100, 100]");
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        int[] intArray5 = new int[] { (byte) 10, (short) 10, (short) 100, 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 10, 1]");
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        int[] intArray3 = new int[] { 100, (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 100]");
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        int[] intArray6 = new int[] { '#', (-1), (short) 100, (short) 1, 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 100, 1, 1, 0]");
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        int[] intArray2 = new int[] { '#', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 10]");
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        int[] intArray5 = new int[] { (byte) 0, ' ', (short) 0, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, 0, 10, -1]");
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        int[] intArray5 = new int[] { '4', 100, (byte) 10, '#', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 10, 35, 1]");
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        int[] intArray5 = new int[] { (byte) 1, 100, 0, '#', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 0, 35, 0]");
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        int[] intArray3 = new int[] { (short) 1, 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, 1]");
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        int[] intArray2 = new int[] { 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, ' ', '4', 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 32, 52, 10, 100]");
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        int[] intArray6 = new int[] { (byte) -1, 1, (short) 1, (byte) 100, 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 1, 100, 100, 32]");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        int[] intArray4 = new int[] { 100, (byte) 1, 0, (byte) 1 };
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
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        int[] intArray5 = new int[] { (byte) 10, (byte) -1, 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 1, 100, 100]");
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        int[] intArray5 = new int[] { 1, 10, 10, (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, -1]");
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        int[] intArray5 = new int[] { '4', (byte) 10, '4', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 52, 97, 32]");
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        int[] intArray5 = new int[] { '#', (-1), (byte) -1, ' ', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, -1, 32, -1]");
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        int[] intArray3 = new int[] { (short) 10, 'a', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 97, -1]");
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        int[] intArray4 = new int[] { 0, (byte) 0, '#', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 35, 100]");
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        int[] intArray3 = new int[] { (byte) 100, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 1]");
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, 10, (-1), '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 10, -1, 35, 35]");
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        int[] intArray6 = new int[] { ' ', 0, (byte) 10, '4', (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 0, 10, 52, 10, 100]");
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        int[] intArray4 = new int[] { (short) 0, '4', (-1), (byte) 100 };
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
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        int[] intArray4 = new int[] { 10, (short) -1, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 100, 97]");
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        int[] intArray3 = new int[] { (byte) -1, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 35]");
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        int[] intArray6 = new int[] { (short) 10, (short) 10, (byte) 1, (short) 1, (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 1, 1, 100, 1]");
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        int[] intArray4 = new int[] { (-1), '#', (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 10, 1]");
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        int[] intArray4 = new int[] { 10, (short) 100, (short) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 1, 0]");
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        int[] intArray3 = new int[] { (short) 10, (short) 10, 0 };
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
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        int[] intArray2 = new int[] { (byte) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        int[] intArray6 = new int[] { '4', (-1), (byte) 1, (short) 1, (-1), (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, -1, 1, 1, -1, 1]");
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        int[] intArray2 = new int[] { (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        int[] intArray6 = new int[] { 'a', 1, (byte) 10, (short) 0, '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 10, 0, 52, -1]");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        int[] intArray3 = new int[] { (short) 1, (short) 100, 1 };
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
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        int[] intArray5 = new int[] { (byte) -1, (byte) 100, '4', (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 52, -1, 32]");
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        int[] intArray6 = new int[] { (byte) 100, (byte) 1, '#', (short) 0, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 35, 0, -1, 32]");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        int[] intArray5 = new int[] { (byte) 1, 100, '#', (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 35, 10, 100]");
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        int[] intArray2 = new int[] { (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        int[] intArray6 = new int[] { (short) 10, '4', (byte) -1, 1, 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 52, -1, 1, 0, 0]");
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        int[] intArray3 = new int[] { 'a', (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, -1, 1]");
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        int[] intArray5 = new int[] { 10, (short) 0, (byte) -1, 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, -1, 0, 97]");
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        int[] intArray4 = new int[] { (short) 100, '#', 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 100, 10]");
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        int[] intArray4 = new int[] { (short) 10, 10, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 10, 1]");
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        int[] intArray4 = new int[] { (byte) 10, '#', (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, 1, 100]");
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        int[] intArray5 = new int[] { '4', (-1), ' ', (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 32, 0, 10]");
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        int[] intArray5 = new int[] { (byte) 10, 'a', ' ', (byte) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 32, 0, 100]");
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        int[] intArray6 = new int[] { (short) 100, '4', 100, (short) 10, (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 100, 10, 10, -1]");
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        int[] intArray5 = new int[] { (short) -1, 'a', 1, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 1, -1, 1]");
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        int[] intArray4 = new int[] { (byte) -1, (byte) 0, 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 0, 0]");
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        int[] intArray4 = new int[] { (byte) 10, (byte) 1, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 10, 52]");
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        int[] intArray4 = new int[] { 10, (byte) 1, 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 0, 0]");
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        int[] intArray3 = new int[] { '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 97, 32]");
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, '4', '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 52, 35, -1]");
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        int[] intArray5 = new int[] { '4', (short) -1, (byte) 10, (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 10, 0, 0]");
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        int[] intArray5 = new int[] { ' ', 100, (short) 0, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 100, 0, 35, 97]");
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        int[] intArray4 = new int[] { (byte) -1, 0, 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 100, 100]");
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        int[] intArray3 = new int[] { 10, (byte) 100, (short) 100 };
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
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10, (byte) -1, 'a', 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, -1, 97, 1, 35]");
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        int[] intArray3 = new int[] { (short) -1, 1, (byte) 100 };
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
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        int[] intArray5 = new int[] { 100, (byte) 1, 100, 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 100, 1, 1]");
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        int[] intArray6 = new int[] { 1, 100, 1, (short) 0, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 1, 0, 1, 100]");
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        int[] intArray4 = new int[] { 10, (short) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 0, 0]");
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        int[] intArray4 = new int[] { '#', (byte) 100, (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 100, -1, 52]");
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        int[] intArray6 = new int[] { '#', (short) 1, '4', (short) 100, 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, 52, 100, 97, 100]");
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        int[] intArray6 = new int[] { (byte) 1, (byte) 100, ' ', (byte) 0, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 32, 0, -1, 0]");
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        int[] intArray4 = new int[] { ' ', 'a', ' ', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 97, 32, 0]");
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, 1, '#', (short) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 1, 35, -1, 0]");
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        int[] intArray4 = new int[] { '4', (byte) 100, (byte) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 10, 97]");
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        int[] intArray5 = new int[] { (byte) -1, 100, '#', 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 35, 0, 10]");
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        int[] intArray4 = new int[] { '#', (short) -1, (byte) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, -1, 10, 1]");
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        int[] intArray3 = new int[] { '#', 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 100, -1]");
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 100, 100, 1]");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        int[] intArray6 = new int[] { (short) 0, '4', (short) 100, '#', '4', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 100, 35, 52, 100]");
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        int[] intArray5 = new int[] { (short) 1, (short) -1, ' ', 'a', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 32, 97, 100]");
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        int[] intArray3 = new int[] { (short) 1, 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 0]");
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        int[] intArray2 = new int[] { 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        int[] intArray5 = new int[] { ' ', 1, 0, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, -1, 100]");
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        int[] intArray4 = new int[] { (byte) 0, 0, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 97, -1]");
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, (short) 0 };
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
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        int[] intArray6 = new int[] { (byte) 0, 'a', (short) 1, (short) -1, (short) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 97, 1, -1, 0, -1]");
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        int[] intArray6 = new int[] { (byte) 1, (short) -1, (byte) 10, 100, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 10, 100, 35, 97]");
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        int[] intArray4 = new int[] { (byte) -1, 0, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 100, 35]");
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        int[] intArray3 = new int[] { (byte) -1, (byte) 1, (short) -1 };
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
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        int[] intArray4 = new int[] { (byte) 10, (-1), (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 0, 0]");
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, (short) 0, (short) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 0, 1, 52]");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        int[] intArray6 = new int[] { 0, (short) -1, (short) 0, (byte) -1, (byte) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, -1, 0, 10]");
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        int[] intArray3 = new int[] { 100, (byte) 0, (byte) -1 };
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
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        int[] intArray5 = new int[] { 'a', '4', (short) -1, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 52, -1, 100, 97]");
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', 100, (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 100, 10, 0]");
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        int[] intArray6 = new int[] { (byte) 0, (short) 1, (byte) -1, '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, -1, 35, 32, 32]");
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        int[] intArray5 = new int[] { (-1), 'a', (short) 0, (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 0, 1, -1]");
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        int[] intArray3 = new int[] { 10, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, -1, 10]");
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        int[] intArray4 = new int[] { 1, (short) 0, 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 100, -1]");
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        int[] intArray3 = new int[] { (byte) 10, (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, -1, 0]");
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        int[] intArray4 = new int[] { 0, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 100, 0]");
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        int[] intArray5 = new int[] { (byte) 1, (short) -1, (byte) 1, 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 1, 97, 52]");
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        int[] intArray4 = new int[] { 1, (short) 10, (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 1]");
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        int[] intArray4 = new int[] { (byte) 0, (short) 10, 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 0, -1]");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        int[] intArray4 = new int[] { (short) -1, 'a', (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 1, 100]");
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        int[] intArray6 = new int[] { (byte) 0, ' ', 0, 1, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 32, 0, 1, -1, 1]");
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        int[] intArray3 = new int[] { '4', (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, -1, 32]");
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        int[] intArray5 = new int[] { (byte) 10, (byte) 10, (short) 1, 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 1, 100, 10]");
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        int[] intArray4 = new int[] { 10, (byte) 1, 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 97, 52]");
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        int[] intArray4 = new int[] { ' ', 1, 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 1, 0, 97]");
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        int[] intArray4 = new int[] { (byte) 10, (byte) 10, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 35, 100]");
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, (byte) 100, 'a' };
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
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        int[] intArray6 = new int[] { (-1), '4', (byte) 10, (short) 10, (byte) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 52, 10, 10, -1, 10]");
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) -1, ' ', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, -1, 32, -1]");
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        int[] intArray5 = new int[] { 1, 'a', (byte) 100, (short) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 100, 100, 0]");
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        int[] intArray4 = new int[] { ' ', 'a', 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 97, 0, 0]");
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        int[] intArray3 = new int[] { (byte) -1, '#', (short) 0 };
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
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        int[] intArray3 = new int[] { (short) 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, -1, 100]");
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        int[] intArray4 = new int[] { (byte) 0, 0, (byte) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 1, 32]");
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        int[] intArray3 = new int[] { (-1), 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 97]");
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        int[] intArray3 = new int[] { (byte) 0, 'a', (byte) -1 };
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
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        int[] intArray3 = new int[] { (short) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 0]");
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        int[] intArray4 = new int[] { (byte) 100, 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 0, 1]");
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        int[] intArray6 = new int[] { (short) 10, 'a', (short) 10, '#', (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 10, 35, 10, 1]");
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        int[] intArray3 = new int[] { (byte) 1, (byte) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, 52]");
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        int[] intArray3 = new int[] { '4', 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 32]");
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        int[] intArray6 = new int[] { '4', (byte) 10, (byte) -1, '4', 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, -1, 52, 1, 0]");
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        int[] intArray3 = new int[] { 'a', (short) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, -1, -1]");
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        int[] intArray6 = new int[] { '4', (byte) -1, (-1), ' ', '4', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, -1, -1, 32, 52, 10]");
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        int[] intArray5 = new int[] { '#', (-1), (short) 100, 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 100, 10, 100]");
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        int[] intArray4 = new int[] { '#', '#', 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 35, 1, 0]");
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        int[] intArray3 = new int[] { (byte) 100, ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 32, 1]");
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        int[] intArray4 = new int[] { (byte) -1, 1, 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 1, 1]");
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        int[] intArray6 = new int[] { (short) 10, (short) 1, '4', (short) -1, (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 52, -1, 1, 35]");
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        int[] intArray5 = new int[] { (short) 10, ' ', (byte) 0, (short) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 0, 10, 1]");
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        int[] intArray3 = new int[] { (short) 0, 100, (short) 1 };
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
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        int[] intArray5 = new int[] { (short) 0, (short) -1, (-1), (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, -1, -1, 35]");
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        int[] intArray4 = new int[] { 10, ' ', 'a', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 32, 97, -1]");
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        int[] intArray6 = new int[] { 100, (short) 0, (short) 1, (byte) 1, (byte) 10, (byte) 1 };
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
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        int[] intArray5 = new int[] { (short) -1, '4', 0, 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52, 0, 100, -1]");
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        int[] intArray4 = new int[] { (byte) 0, 'a', (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 97, -1, 100]");
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        int[] intArray4 = new int[] { (byte) 1, '#', ' ', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 35, 32, 10]");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        int[] intArray5 = new int[] { '4', 0, '4', (short) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 52, 1, 32]");
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        int[] intArray5 = new int[] { 100, (byte) 10, (short) 0, (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 0, -1, 100]");
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        int[] intArray3 = new int[] { 1, (short) 10, 10 };
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
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        int[] intArray5 = new int[] { '#', (short) 0, (short) 0, '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0, 0, 52, 52]");
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        int[] intArray5 = new int[] { 10, '4', (byte) 0, (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52, 0, 1, 35]");
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        int[] intArray4 = new int[] { '4', 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 1, 100, 100]");
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        int[] intArray4 = new int[] { (short) 10, (byte) 1, (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, -1, 1]");
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        int[] intArray4 = new int[] { '#', (short) 10, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 10, 35, 97]");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        int[] intArray3 = new int[] { (short) 0, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        int[] intArray2 = new int[] { 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        int[] intArray4 = new int[] { 10, (byte) 10, (-1), '4' };
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
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        int[] intArray6 = new int[] { (short) 10, (short) 100, (short) 0, (byte) 10, (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 0, 10, -1, -1]");
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        int[] intArray3 = new int[] { (short) 10, (byte) 1, 1 };
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
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        int[] intArray6 = new int[] { '#', (byte) 10, '#', (short) 1, '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 10, 35, 1, 52, 97]");
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        int[] intArray6 = new int[] { (byte) 10, (short) -1, 0, (short) 1, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 0, 1, -1, 1]");
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        int[] intArray5 = new int[] { (short) 10, 1, '4', (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 52, 100, 1]");
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        int[] intArray6 = new int[] { 10, 100, (byte) 0, (byte) -1, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 0, -1, 1, 100]");
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        int[] intArray4 = new int[] { (short) 100, 10, (short) 0, (byte) 100 };
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
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        int[] intArray6 = new int[] { (byte) -1, '4', (byte) -1, '4', 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 52, -1, 52, 100, 10]");
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        int[] intArray4 = new int[] { (byte) 100, (short) 0, (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 0, 10]");
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        int[] intArray4 = new int[] { 1, (byte) 10, 0, (byte) 1 };
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
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        int[] intArray3 = new int[] { '4', (byte) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, -1, -1]");
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        int[] intArray6 = new int[] { (short) -1, (-1), 'a', ' ', (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 97, 32, 0, 100]");
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        int[] intArray3 = new int[] { (short) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        int[] intArray5 = new int[] { (byte) 10, 1, 'a', 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 97, 10, 52]");
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        int[] intArray5 = new int[] { (short) 100, (byte) 1, '4', (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 52, -1, 0]");
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        int[] intArray3 = new int[] { 'a', (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, -1, 1]");
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        int[] intArray3 = new int[] { (short) 0, ' ', '#' };
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
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 10, 0]");
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        int[] intArray6 = new int[] { ' ', ' ', (short) 1, (short) 100, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 32, 1, 100, 100, -1]");
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        int[] intArray6 = new int[] { (short) 1, 100, 0, (short) -1, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 0, -1, 35, 100]");
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        int[] intArray4 = new int[] { ' ', 1, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 1, 10, 0]");
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        int[] intArray4 = new int[] { (short) 10, 10, 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 100, 10]");
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        int[] intArray5 = new int[] { 10, (short) 10, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 10, 100, 10]");
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        int[] intArray3 = new int[] { ' ', (byte) 100, (short) 10 };
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
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        int[] intArray5 = new int[] { (-1), 'a', 10, (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10, -1, 10]");
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        int[] intArray4 = new int[] { (byte) -1, 0, (byte) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 10, -1]");
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, 10, 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 10, 10, 0]");
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        int[] intArray4 = new int[] { 1, (byte) 100, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 10, 52]");
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        int[] intArray5 = new int[] { ' ', (short) 0, (byte) 0, (short) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 0, 0, 100, 97]");
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        int[] intArray3 = new int[] { '#', (byte) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 10, 35]");
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        int[] intArray4 = new int[] { (short) 0, ' ', (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 32, 10, 0]");
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        int[] intArray3 = new int[] { (short) 10, 10, 0 };
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
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        int[] intArray3 = new int[] { (short) 0, (short) 10, (short) 10 };
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
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        int[] intArray4 = new int[] { 0, 0, (short) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 100, 35]");
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        int[] intArray6 = new int[] { 100, (byte) -1, 1, (byte) -1, (byte) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 1, -1, 0, -1]");
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        int[] intArray6 = new int[] { (byte) 100, ' ', 'a', (byte) 1, '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 97, 1, 52, 97]");
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        int[] intArray4 = new int[] { (short) 10, (short) 0, 'a', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 97, 0]");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        int[] intArray6 = new int[] { (short) 10, (short) 0, (short) -1, (short) -1, (short) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, -1, -1, 100, -1]");
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        int[] intArray6 = new int[] { 0, 10, 1, (short) 10, 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 1, 10, 100, 100]");
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        int[] intArray4 = new int[] { 'a', ' ', (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 32, -1, 100]");
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        int[] intArray5 = new int[] { (byte) 0, (short) -1, (byte) -1, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, -1, 32, 1]");
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, (short) 1, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 1, 35, 97]");
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        int[] intArray4 = new int[] { 0, 0, (byte) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 10, 35]");
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        int[] intArray6 = new int[] { 100, '4', (-1), (byte) 10, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, -1, 10, 1, -1]");
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        int[] intArray6 = new int[] { (short) 0, (byte) -1, 'a', '4', (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 97, 52, 100, -1]");
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        int[] intArray5 = new int[] { ' ', 1, (byte) 1, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 1, 1, 10]");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        int[] intArray4 = new int[] { (byte) 100, (byte) 100, 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 10, 100]");
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        int[] intArray3 = new int[] { (byte) -1, (short) 100, (-1) };
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
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        int[] intArray6 = new int[] { (short) 0, 'a', (byte) 0, 0, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 97, 0, 0, 32, 100]");
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        int[] intArray3 = new int[] { (byte) 0, (byte) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 10]");
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        int[] intArray6 = new int[] { (byte) 1, (byte) 1, ' ', (byte) 1, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, 1, -1, -1]");
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        int[] intArray5 = new int[] { (byte) 100, (-1), '#', (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 35, 100, 10]");
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        int[] intArray3 = new int[] { (short) 100, (byte) 100, (byte) 100 };
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
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        int[] intArray4 = new int[] { 1, 0, ' ', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 32, -1]");
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        int[] intArray6 = new int[] { (short) -1, (short) 0, (short) 0, (byte) 1, (short) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 0, 1, 0, 10]");
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        int[] intArray6 = new int[] { 'a', (-1), (short) 1, '#', 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 1, 35, 0, 52]");
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        int[] intArray5 = new int[] { 0, (-1), '4', (byte) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 52, 10, 32]");
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        int[] intArray5 = new int[] { (byte) -1, 0, 100, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 100, 10, 100]");
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        int[] intArray5 = new int[] { (byte) 10, (byte) 10, (short) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, -1, 0, -1]");
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        int[] intArray5 = new int[] { (short) 10, 'a', (byte) 100, (short) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 100, 100, 100]");
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        int[] intArray5 = new int[] { 10, (byte) 1, '#', 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 35, 10, 1]");
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        int[] intArray6 = new int[] { (short) 0, (short) 1, (short) 1, 'a', 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 1, 97, 100, 1]");
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        int[] intArray6 = new int[] { (byte) 10, 100, (short) 10, (-1), (byte) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 10, -1, 100, 32]");
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        int[] intArray6 = new int[] { '4', (short) -1, 10, (byte) 0, 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, -1, 10, 0, 97, 97]");
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        int[] intArray4 = new int[] { (byte) 10, 1, 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 10, 1]");
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, ' ', 'a' };
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
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        int[] intArray5 = new int[] { '#', (byte) 10, (short) 0, 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 0, 10, 0]");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        int[] intArray3 = new int[] { ' ', (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 1, -1]");
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        int[] intArray5 = new int[] { (short) -1, (short) -1, (short) 0, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, 1, 0]");
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        int[] intArray4 = new int[] { (byte) -1, 100, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 97, 10]");
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        int[] intArray5 = new int[] { (short) 100, (byte) 100, (short) 10, 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 10, 97, 100]");
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        int[] intArray5 = new int[] { '4', 100, (short) 100, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 100, 1, 100]");
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        int[] intArray4 = new int[] { (byte) 10, '#', (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, 1, 10]");
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        int[] intArray4 = new int[] { 0, (byte) 10, 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 1, 52]");
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        int[] intArray5 = new int[] { (byte) 1, (short) 1, '#', 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 35, 100, 0]");
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, (short) 1, 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 1, 97, 97]");
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        int[] intArray3 = new int[] { ' ', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = com.thealgorithms.ciphers.AES.mergeCellsIntoBlock(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 52]");
    }
}

