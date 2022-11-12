package others.ArrayLeftRotation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.thealgorithms.others.ArrayLeftRotation arrayLeftRotation0 = new com.thealgorithms.others.ArrayLeftRotation();
        java.lang.Class<?> wildcardClass1 = arrayLeftRotation0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) '#');
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0]");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) '#');
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 10);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '#');
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int[] intArray3 = new int[] { 10, (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 10);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 10);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 10);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 10);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0]");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 10);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 10);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 10);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) 'a');
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 0);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 1);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 1);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) 'a');
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 1);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray22, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, 10);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) ' ');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 100);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) ' ');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) (short) 0);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 0);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 100);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1]");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) 'a');
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (byte) 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, 100);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 0);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '4');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 10);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 0);
        java.lang.Class<?> wildcardClass16 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 0);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, 0);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, 1);
        java.lang.Class<?> wildcardClass25 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 10);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 1);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 0);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 10);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 10);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 0);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 0);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) 'a');
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 10);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '#');
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (byte) 10);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '4');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 100, -1]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 0);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 10);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray21, 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 10);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 10);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray21, 1);
        int[] intArray25 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray23, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 97, 100]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, 0);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, 1);
        int[] intArray26 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) (short) 100);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 0);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, 10);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray21, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 100);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 10);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 1);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 100);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 1);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 100);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 10);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 100);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 1);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 100);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, 0);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) '#');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, (int) (byte) 100);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray21, 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 0);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 100);
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 0);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) '#');
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) (short) 0);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 1);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) '4');
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, 0);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) ' ');
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 10);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 1);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 10);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray21, 1);
        int[] intArray25 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray23, (int) (short) 10);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) ' ');
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 10);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, 1);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 1);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray24, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 10);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 0);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 100);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, 10);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, 0);
        int[] intArray25 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray23, (int) (short) 10);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 10);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) '4');
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 100);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) '#');
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 0);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray22, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 0);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, (int) (byte) 100);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray21, 1);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 10);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 10);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) '4');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 10);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray21, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray23, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 97]");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 10);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 10);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray21, 1);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray24, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) ' ');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) '#');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 10);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (byte) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) '#');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, 10);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (byte) 10);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) '#');
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) (short) 10);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray22, 0);
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 10);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 1);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 1);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 10);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '#');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, 10);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, 10);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (byte) 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 100);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0]");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, 10);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) '#');
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0]");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) 'a');
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 10);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) '#');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 0);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) '4');
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, 10);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) '4');
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (short) 0);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 10);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 0);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 1);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, 100);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 10);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 0);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 0);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) 'a');
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 1);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray21, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 100);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) '#');
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, 1);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) '4');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) 'a');
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 100);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (-1));
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) 'a');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '#');
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 1);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (byte) 0);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) ' ');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 0, 100]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 10);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) '#');
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) 'a');
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, 10);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, 10);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 100);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) '#');
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) '#');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, 10);
        int[] intArray21 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray19, 0);
        int[] intArray25 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray23, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray25, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 10, 97]");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 10);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) ' ');
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, 10);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 100, -1]");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) '4');
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (short) 100);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) '#');
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) '#');
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 100);
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, 10);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, (int) (short) 1);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) 'a');
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) ' ');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) 'a');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 1);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, 100);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray24, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 0, 100, -1]");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray9, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) '4');
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) 'a');
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray1, 0);
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray5, (-1));
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, -1, 0]");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 1);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, 10);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray17, (int) '#');
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 100);
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 10);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray7, 0);
        int[] intArray17 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray15, (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray13, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) 'a');
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (short) 10);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) '4');
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, 0);
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (short) 100);
        int[] intArray26 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray24, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, -1, -1, 0]");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, 1);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray14, (int) '4');
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray16, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray6, (int) '4');
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, 1);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, -1]");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int[] intArray3 = new int[] { 'a', (byte) 100, (byte) 10 };
        int[] intArray5 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 100);
        int[] intArray7 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, 0);
        int[] intArray11 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) '#');
        int[] intArray13 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 97]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray6 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) '#');
        int[] intArray8 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (byte) 100);
        int[] intArray10 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray4, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray10, 100);
        int[] intArray14 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) (byte) 1);
        int[] intArray18 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray12, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray18, 10);
        int[] intArray22 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray20, (int) ' ');
        int[] intArray24 = com.thealgorithms.others.ArrayLeftRotation.rotateLeft(intArray22, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }
}
