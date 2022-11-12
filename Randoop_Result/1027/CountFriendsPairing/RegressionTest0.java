package CountFriendsPairing;

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
        int[] intArray2 = new int[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0]");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int[] intArray1 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int[] intArray4 = new int[] { '#', (-1), '4' };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int[] intArray1 = null;
        boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int[] intArray7 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray7);
        java.lang.Class<?> wildcardClass9 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int[] intArray8 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.thealgorithms.dynamicprogramming.CountFriendsPairing countFriendsPairing0 = new com.thealgorithms.dynamicprogramming.CountFriendsPairing();
        java.lang.Class<?> wildcardClass1 = countFriendsPairing0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int[] intArray8 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray8);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int[] intArray5 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int[] intArray5 = new int[] { '#', (-1), '4' };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray5);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int[] intArray8 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray8);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int[] intArray6 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int[] intArray6 = new int[] { '#', (-1), '4' };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray6);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int[] intArray6 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray6);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int[] intArray8 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int[] intArray6 = new int[] { '#', (-1), '4' };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray6);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int[] intArray8 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int[] intArray3 = new int[] { 'a', (byte) 1 };
        boolean boolean4 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int[] intArray7 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray7);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int[] intArray8 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int[] intArray8 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray8);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int[] intArray8 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int[] intArray8 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int[] intArray7 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray7);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int[] intArray1 = null;
        boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int[] intArray7 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int[] intArray7 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int[] intArray1 = null;
        boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int[] intArray5 = new int[] { '#', (-1), '4' };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray5);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int[] intArray6 = new int[] { '#', (-1), '4' };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray6);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray6);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int[] intArray1 = null;
        boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int[] intArray7 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray7);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int[] intArray6 = new int[] { '#', (-1), '4' };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray6);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int[] intArray6 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray6);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        int[] intArray8 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int[] intArray8 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int[] intArray7 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        int[] intArray5 = new int[] { '#', (-1), '4' };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray5);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int[] intArray6 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray6);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int[] intArray7 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray7);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int[] intArray11 = new int[] { '#', (-1), '4' };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int[] intArray5 = new int[] { '#', (-1), '4' };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray5);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int[] intArray6 = new int[] { '#', (-1), '4' };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray6);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int[] intArray1 = null;
        boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int[] intArray8 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        int[] intArray8 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int[] intArray5 = new int[] { 'a', (byte) 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray5);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray5);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int[] intArray1 = null;
        boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int[] intArray11 = new int[] { '#', (-1), '4' };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        java.lang.Class<?> wildcardClass31 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int[] intArray4 = new int[] { 'a', (byte) 1 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray4);
        boolean boolean6 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int[] intArray7 = new int[] { '#', (-1), '4' };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int[] intArray10 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int[] intArray7 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray7);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int[] intArray9 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray18);
        java.lang.Class<?> wildcardClass31 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int[] intArray11 = new int[] { '#', (-1), '4' };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        java.lang.Class<?> wildcardClass31 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}
