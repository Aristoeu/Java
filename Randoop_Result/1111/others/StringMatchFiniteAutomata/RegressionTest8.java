package others.StringMatchFiniteAutomata;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
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
// flaky:             com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray10);
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
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray36);
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
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass29 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
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
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (byte) 10, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray40);
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
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray8);
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
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        int[][] intArray4 = new int[][] {};
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
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
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        java.lang.Class<?> wildcardClass20 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray35 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray36 = new int[][] { intArray17, intArray23, intArray29, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray34);
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
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        int[] intArray8 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray13 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray18 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray23 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray28 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray33 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray34 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray34);
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
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, 256, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, 256, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
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
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray12);
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
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray40);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray40);
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
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray23);
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
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray34);
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
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray40);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray40);
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
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray26);
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
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        java.lang.Class<?> wildcardClass35 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray38);
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
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray23);
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
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray14);
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
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray14);
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
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray4);
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        int[] intArray8 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray13 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray18 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray23 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray28 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray33 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray34 = new int[][] { intArray8, intArray13, intArray18, intArray23, intArray28, intArray33 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray34);
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
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray6);
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
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        java.lang.Class<?> wildcardClass31 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        int[] intArray3 = new int[] { 256 };
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[][] intArray10 = new int[][] { intArray3, intArray5, intArray7, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
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
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray10);
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
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        java.lang.Class<?> wildcardClass51 = intArray38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, 256, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
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
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray6);
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
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        java.lang.Class<?> wildcardClass39 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
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
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray31 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray32 = new int[][] { intArray13, intArray19, intArray25, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0]");
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
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray4);
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
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray12);
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
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 0, intArray12);
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
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray40);
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
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray12);
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
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray38);
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
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass34 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray21);
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
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray34);
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
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray27);
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
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray23);
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
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray25);
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
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray14);
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
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 0, intArray19);
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
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray19);
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
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
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
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray21);
        java.lang.Class<?> wildcardClass26 = intArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray4);
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
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray23);
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
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray21);
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
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray34);
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
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        java.lang.Class<?> wildcardClass45 = intArray36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"FA\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
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
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray12);
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
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
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
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray38);
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
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), 10, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
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
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        int[] intArray6 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray11 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray16 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray17 = new int[][] { intArray6, intArray11, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray36);
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
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray17);
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
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray38);
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
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray8);
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
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray38);
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
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        int[] intArray6 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray16 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray21 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray26 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray27);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        java.lang.Class<?> wildcardClass33 = intArray27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
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
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
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
        java.lang.Class<?> wildcardClass22 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', 10, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        int[] intArray6 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray11 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray16 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray21 = new int[] { 256, (byte) 0, 1, ' ' };
        int[] intArray26 = new int[] { 256, (byte) 0, 1, ' ' };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray27);
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
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
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
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, 10, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray31 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray32 = new int[][] { intArray13, intArray19, intArray25, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray32);
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
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
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
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray6);
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
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, 256, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray21);
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
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
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
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray38);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray38);
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
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray34);
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
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
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
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray8);
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
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass18 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray14);
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
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray30);
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
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray38);
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
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) 'a', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray25);
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
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray31 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray32 = new int[][] { intArray13, intArray19, intArray25, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray36);
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
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray34);
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
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray28);
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
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
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
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (short) 100, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[][] intArray6 = new int[][] { intArray3, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray8);
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
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        int[] intArray6 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray16 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray21 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray26 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray27);
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
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray28);
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
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray14);
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
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray38);
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
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray30);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray30);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray30);
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
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (byte) 100, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, 256, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray4);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray21);
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
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray6);
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
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass14 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray36);
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
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), 256, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray40);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray40);
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
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray23);
        java.lang.Class<?> wildcardClass35 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray14);
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
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray28);
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
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray17);
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
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, 10, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, 256, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray12);
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
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        java.lang.Class<?> wildcardClass32 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', 256, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
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
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, 256, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray21);
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
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray30);
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
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        java.lang.Class<?> wildcardClass46 = intArray34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        java.lang.Class<?> wildcardClass47 = intArray34.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
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
        java.lang.Class<?> wildcardClass49 = intArray38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray38);
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
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray8);
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
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray30;
        java.lang.Class<?> wildcardClass44 = intArray30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        int[][] intArray2 = new int[][] {};
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray25);
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
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray6);
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
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray25);
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
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray26);
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
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray12);
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
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray10);
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
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray15 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray16 = new int[][] { intArray7, intArray11, intArray15 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray19);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass30 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
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
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray12);
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
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 10, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
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
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), 0, 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray15 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray16 = new int[][] { intArray7, intArray11, intArray15 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray16);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray16);
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
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray35 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray36 = new int[][] { intArray17, intArray23, intArray29, intArray35 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray36;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray36);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray17);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        java.lang.Class<?> wildcardClass30 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray30);
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
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray23);
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
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray19);
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
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray14);
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
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
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
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray8);
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
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, 1, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, 256, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) (short) 0, 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) -1, (int) (byte) 100, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
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
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
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
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
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
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
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
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        int[][] intArray8 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray8);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
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
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray23);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        java.lang.Class<?> wildcardClass39 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray25);
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
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
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
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray40);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray40);
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
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
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
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
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
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[][] intArray12 = new int[][] { intArray5, intArray7, intArray9, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray12);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        java.lang.Class<?> wildcardClass23 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
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
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        int[][] intArray10 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray10);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
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
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray23);
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
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray38;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray38);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray38);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray38);
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
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
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
        java.lang.Class<?> wildcardClass33 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray17);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        java.lang.Class<?> wildcardClass26 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray17);
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
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray31 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray32 = new int[][] { intArray13, intArray19, intArray25, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray32);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray8);
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
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', 256, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        int[] intArray9 = new int[] { 256 };
        int[] intArray11 = new int[] { 256 };
        int[] intArray13 = new int[] { 256 };
        int[] intArray15 = new int[] { 256 };
        int[][] intArray16 = new int[][] { intArray9, intArray11, intArray13, intArray15 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray16);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray16);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[256]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
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
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray34);
        java.lang.Class<?> wildcardClass40 = intArray34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray8);
        java.lang.Class<?> wildcardClass22 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 0, intArray23);
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
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray4);
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
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        java.lang.Class<?> wildcardClass33 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
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
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
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
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, 256, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
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
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
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
        java.lang.Class<?> wildcardClass49 = intArray38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray25;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray25);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray25);
        java.lang.Class<?> wildcardClass40 = intArray25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray36);
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
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray14);
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
}
