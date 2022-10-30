package StringMatchFiniteAutomata;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        int[] intArray6 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray32 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        java.lang.Class<?> wildcardClass46 = intArray32.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        int[] intArray6 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray11 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray16 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray17 = new int[][] { intArray6, intArray11, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray23 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray26 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray27 = new int[][] { intArray14, intArray17, intArray20, intArray23, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        int[] intArray6 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray32 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        java.lang.Class<?> wildcardClass38 = intArray32.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray17 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray18 = new int[][] { intArray9, intArray13, intArray17 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray18;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray18;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray18);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray18;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        int[] intArray6 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray16 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray21 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray26 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        java.lang.Class<?> wildcardClass50 = intArray38.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        int[][] intArray12 = new int[][] { intArray10, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray30);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        int[][] intArray2 = new int[][] {};
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        java.lang.Class<?> wildcardClass48 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray34 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray39 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray40 = new int[][] { intArray14, intArray19, intArray24, intArray29, intArray34, intArray39 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        java.lang.Class<?> wildcardClass53 = intArray40.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray34 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray39 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray40 = new int[][] { intArray14, intArray19, intArray24, intArray29, intArray34, intArray39 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray40);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        java.lang.Class<?> wildcardClass25 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray31 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray32 = new int[][] { intArray13, intArray19, intArray25, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        java.lang.Class<?> wildcardClass45 = intArray32.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[][] intArray6 = new int[][] { intArray3, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray10);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray36 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray41 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray42 = new int[][] { intArray16, intArray21, intArray26, intArray31, intArray36, intArray41 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray42);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        int[] intArray8 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray13 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray18 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray23 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray28 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray33 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray34 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        int[][] intArray4 = new int[][] {};
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        java.lang.Class<?> wildcardClass36 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray26);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        java.lang.Class<?> wildcardClass28 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[] intArray13 = new int[] { 256 };
        int[][] intArray14 = new int[][] { intArray7, intArray9, intArray11, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray14);
        java.lang.Class<?> wildcardClass22 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        java.lang.Class<?> wildcardClass21 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray15 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray16 = new int[][] { intArray7, intArray11, intArray15 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray16);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, 256, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        java.lang.Class<?> wildcardClass53 = intArray38.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        java.lang.Class<?> wildcardClass35 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        int[] intArray8 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray13 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray18 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray19 = new int[][] { intArray8, intArray13, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        int[] intArray8 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray13 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray18 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray23 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray28 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray33 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray34 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        java.lang.Class<?> wildcardClass45 = intArray34.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray17);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        java.lang.Class<?> wildcardClass22 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        int[] intArray6 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray11 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray16 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray17 = new int[][] { intArray6, intArray11, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray17);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray34 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray39 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray40 = new int[][] { intArray14, intArray19, intArray24, intArray29, intArray34, intArray39 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        java.lang.Class<?> wildcardClass35 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        java.lang.Class<?> wildcardClass33 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        java.lang.Class<?> wildcardClass44 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        int[] intArray8 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray13 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray18 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray23 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray28 = new int[] { 256, (byte) 0, 1, ' ' };
        int[][] intArray29 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray29);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        int[] intArray8 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray13 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray18 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray19 = new int[][] { intArray8, intArray13, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray19);
        java.lang.Class<?> wildcardClass29 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        int[][] intArray14 = new int[][] { intArray12, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray23 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray26 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray27 = new int[][] { intArray14, intArray17, intArray20, intArray23, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass28 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        int[] intArray3 = new int[] { 256 };
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[][] intArray10 = new int[][] { intArray3, intArray5, intArray7, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        java.lang.Class<?> wildcardClass23 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 1, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray17);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        java.lang.Class<?> wildcardClass23 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 256, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[] intArray13 = new int[] { 256 };
        int[][] intArray14 = new int[][] { intArray7, intArray9, intArray11, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        int[][] intArray2 = null;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray2);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray38);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray34 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray39 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray40 = new int[][] { intArray14, intArray19, intArray24, intArray29, intArray34, intArray39 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray40);
        java.lang.Class<?> wildcardClass55 = intArray40.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray31 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray32 = new int[][] { intArray13, intArray19, intArray25, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[] intArray13 = new int[] { 256 };
        int[][] intArray14 = new int[][] { intArray7, intArray9, intArray11, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray36 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray41 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray42 = new int[][] { intArray16, intArray21, intArray26, intArray31, intArray36, intArray41 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray42);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, 0, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray34 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray39 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray40 = new int[][] { intArray14, intArray19, intArray24, intArray29, intArray34, intArray39 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        java.lang.Class<?> wildcardClass52 = intArray40.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        int[][] intArray12 = new int[][] { intArray10, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        int[] intArray10 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray15 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray20 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray21 = new int[][] { intArray10, intArray15, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray21);
        java.lang.Class<?> wildcardClass35 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        int[] intArray8 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray13 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray18 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray19 = new int[][] { intArray8, intArray13, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass30 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray34 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray39 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray40 = new int[][] { intArray14, intArray19, intArray24, intArray29, intArray34, intArray39 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray40);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 256, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray36);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, 256, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        java.lang.Class<?> wildcardClass36 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        java.lang.Class<?> wildcardClass49 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        java.lang.Class<?> wildcardClass36 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray25);
        java.lang.Class<?> wildcardClass39 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass12 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        java.lang.Class<?> wildcardClass53 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        java.lang.Class<?> wildcardClass61 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        int[][] intArray12 = new int[][] { intArray10, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray17);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        java.lang.Class<?> wildcardClass23 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass12 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, 256, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, 0, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        int[] intArray4 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray9 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray14 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        java.lang.Class<?> wildcardClass28 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray38);
        java.lang.Class<?> wildcardClass52 = intArray38.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        java.lang.Class<?> wildcardClass43 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        java.lang.Class<?> wildcardClass49 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray34 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray39 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray40 = new int[][] { intArray14, intArray19, intArray24, intArray29, intArray34, intArray39 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray40);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray34 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray39 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray40 = new int[][] { intArray14, intArray19, intArray24, intArray29, intArray34, intArray39 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        int[] intArray8 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray13 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray18 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray23 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray28 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray33 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray34 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        int[][] intArray12 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        int[][] intArray14 = new int[][] { intArray12, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        java.lang.Class<?> wildcardClass20 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, 0, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (byte) 0, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray34 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray39 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray40 = new int[][] { intArray14, intArray19, intArray24, intArray29, intArray34, intArray39 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray26);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        java.lang.Class<?> wildcardClass36 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[] intArray13 = new int[] { 256 };
        int[] intArray15 = new int[] { 256 };
        int[][] intArray16 = new int[][] { intArray9, intArray11, intArray13, intArray15 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray16);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray16);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        int[] intArray10 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray15 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray20 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray21 = new int[][] { intArray10, intArray15, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        int[] intArray8 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray13 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray18 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray23 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray28 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray33 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray34 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray4);
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[] intArray13 = new int[] { 256 };
        int[][] intArray14 = new int[][] { intArray7, intArray9, intArray11, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray23 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray26 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray27 = new int[][] { intArray14, intArray17, intArray20, intArray23, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray27);
        java.lang.Class<?> wildcardClass45 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (byte) 10, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        int[][] intArray12 = new int[][] { intArray10, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, 256, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        java.lang.Class<?> wildcardClass37 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', 256, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray36);
        java.lang.Class<?> wildcardClass42 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray33 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray34 = new int[][] { intArray15, intArray21, intArray27, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        java.lang.Class<?> wildcardClass46 = intArray34.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        java.lang.Class<?> wildcardClass40 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        int[] intArray8 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray13 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray18 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray23 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray28 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray33 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray34 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) 1, 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        java.lang.Class<?> wildcardClass53 = intArray38.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray4);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        int[] intArray6 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray16 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray21 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray26 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
        int[] intArray8 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray13 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray18 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray23 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray28 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray33 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray34 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        java.lang.Class<?> wildcardClass49 = intArray34.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, 0, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray33 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray34 = new int[][] { intArray15, intArray21, intArray27, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        java.lang.Class<?> wildcardClass46 = intArray34.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray36);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', 256, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
        int[] intArray8 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray13 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray18 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray23 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray28 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray33 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray34 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
        int[] intArray4 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray9 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray14 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray19 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray24 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        java.lang.Class<?> wildcardClass30 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
        int[] intArray12 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray17 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray22 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray27 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray32 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray37 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray38 = new int[][] { intArray12, intArray17, intArray22, intArray27, intArray32, intArray37 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        java.lang.Class<?> wildcardClass48 = intArray38.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray21 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray24 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray12, intArray15, intArray18, intArray21, intArray24 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray26);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        java.lang.Class<?> wildcardClass40 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        int[] intArray6 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray11 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray16 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray17 = new int[][] { intArray6, intArray11, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray15 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray20 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray25 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray30 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray35 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray36 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray19 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray22 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray23 = new int[][] { intArray10, intArray13, intArray16, intArray19, intArray22 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }
}

