package others.StringMatchFiniteAutomata;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        java.lang.Class<?> wildcardClass15 = null; // flaky: intArray4.getClass();
// flaky:         org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray36);
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray36);
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int[] intArray5 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        java.lang.Class<?> wildcardClass34 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray40);
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray8);
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', (int) ' ', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        java.lang.Class<?> wildcardClass38 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray0;
        java.lang.Class<?> wildcardClass2 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray28);
        java.lang.Class<?> wildcardClass37 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass14 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray26);
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass26 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
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
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
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
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray28);
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray40);
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
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray28);
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
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
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
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray26);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        java.lang.Class<?> wildcardClass38 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray8);
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
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        java.lang.Class<?> wildcardClass32 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int[] intArray3 = new int[] { 256 };
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[][] intArray10 = new int[][] { intArray3, intArray5, intArray7, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray21);
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
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray28);
        java.lang.Class<?> wildcardClass34 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 0, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass27 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        java.lang.Class<?> wildcardClass20 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int[] intArray6 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray11 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray16 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray21 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray26 = new int[] { 256, (byte) 0, 1, ' ' };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[256, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, 256, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (short) 0, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, 0, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray36);
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
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[][] intArray10 = new int[][] { intArray8, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray21);
        java.lang.Class<?> wildcardClass27 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
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
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        java.lang.Class<?> wildcardClass47 = intArray36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, 256, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (short) 1, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, 256, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int[] intArray6 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray32 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray32);
        java.lang.Class<?> wildcardClass37 = intArray32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) ' ', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        java.lang.Class<?> wildcardClass32 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        java.lang.Class<?> wildcardClass36 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray21);
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
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray23);
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
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        int[] intArray4 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray9 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray29 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        java.lang.Class<?> wildcardClass40 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray8);
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
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray28);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray28);
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
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        java.lang.Class<?> wildcardClass42 = intArray34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray19);
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
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray36);
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
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        int[] intArray6 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray32 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0]");
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
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int[] intArray6 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray32 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        java.lang.Class<?> wildcardClass39 = intArray32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, 256, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray38);
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
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (int) '4', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray36);
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
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, 100, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        java.lang.Class<?> wildcardClass48 = intArray34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass31 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray28);
        java.lang.Class<?> wildcardClass37 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        int[] intArray6 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray11 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray16 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray17 = new int[][] { intArray6, intArray11, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray30);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int[] intArray6 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray16 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray21 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray26 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray27);
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
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        java.lang.Class<?> wildcardClass37 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray30);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray12);
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
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
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
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray19);
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
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray28);
        java.lang.Class<?> wildcardClass33 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        int[] intArray8 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray13 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray18 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray23 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray28 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray29 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray29);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int[] intArray6 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray11 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray16 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray17 = new int[][] { intArray6, intArray11, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray21);
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
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray32);
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
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray40);
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
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray23);
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
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        java.lang.Class<?> wildcardClass37 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        java.lang.Class<?> wildcardClass32 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray19);
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
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray34);
        java.lang.Class<?> wildcardClass43 = intArray34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray12);
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
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, 256, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 256, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
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
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
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
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray28);
        java.lang.Class<?> wildcardClass33 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        int[] intArray3 = new int[] { 256 };
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[][] intArray10 = new int[][] { intArray3, intArray5, intArray7, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
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
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        java.lang.Class<?> wildcardClass41 = intArray34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
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
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray30);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        java.lang.Class<?> wildcardClass27 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[] intArray13 = new int[] { 256 };
        int[][] intArray14 = new int[][] { intArray7, intArray9, intArray11, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        java.lang.Class<?> wildcardClass37 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray28);
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
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 256, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray34);
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
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
        java.lang.Class<?> wildcardClass30 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray4);
        java.lang.Class<?> wildcardClass12 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[] intArray13 = new int[] { 256 };
        int[][] intArray14 = new int[][] { intArray7, intArray9, intArray11, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray14);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray30);
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
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray36);
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
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int[] intArray10 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray15 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray20 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray25 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray30 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray31 = new int[][] { intArray10, intArray15, intArray20, intArray25, intArray30 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray31;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray31;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray31;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray31);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray31;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray31;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray31);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray25);
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
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray21);
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
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray23);
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
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray25);
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
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, 256, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray38);
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
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray28);
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
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray38);
        java.lang.Class<?> wildcardClass58 = intArray38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray8);
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
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray36);
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
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int[] intArray6 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray32 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        java.lang.Class<?> wildcardClass40 = intArray32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray23);
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
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray23);
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
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int[] intArray8 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray13 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray18 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray23 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray28 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray29 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray29);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray29;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray29);
        java.lang.Class<?> wildcardClass37 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (int) (short) 100, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray21);
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
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray30);
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
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) ' ', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray28);
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
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        int[] intArray6 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray11 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray16 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray17 = new int[][] { intArray6, intArray11, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray17);
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
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"FA\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass32 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        java.lang.Class<?> wildcardClass35 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        int[] intArray8 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray13 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray18 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray19 = new int[][] { intArray8, intArray13, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray19);
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
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray21);
        java.lang.Class<?> wildcardClass34 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 256, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        java.lang.Class<?> wildcardClass43 = intArray32.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        java.lang.Class<?> wildcardClass39 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray26);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        java.lang.Class<?> wildcardClass35 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 0, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray30);
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
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        java.lang.Class<?> wildcardClass50 = intArray36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray21);
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
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        int[] intArray6 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray32 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        java.lang.Class<?> wildcardClass39 = intArray32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray42);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray42);
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
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray30);
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
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray10);
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
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray36);
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
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        int[][] intArray4 = new int[][] {};
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray38);
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
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
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
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        java.lang.Class<?> wildcardClass38 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, 0, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        java.lang.Class<?> wildcardClass45 = intArray34.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray36);
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
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray14);
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
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[][] intArray8 = new int[][] { intArray6, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray8);
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
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        int[] intArray3 = new int[] { 256 };
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[][] intArray10 = new int[][] { intArray3, intArray5, intArray7, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        java.lang.Class<?> wildcardClass16 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray21);
        java.lang.Class<?> wildcardClass31 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (-1), 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray34);
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
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
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
        java.lang.Class<?> wildcardClass38 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        int[] intArray5 = new int[] { 100, (byte) -1, '4' };
        int[] intArray9 = new int[] { 100, (byte) -1, '4' };
        int[] intArray13 = new int[] { 100, (byte) -1, '4' };
        int[] intArray17 = new int[] { 100, (byte) -1, '4' };
        int[][] intArray18 = new int[][] { intArray5, intArray9, intArray13, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray28);
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
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray12);
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
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray38);
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
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass14 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }
}
