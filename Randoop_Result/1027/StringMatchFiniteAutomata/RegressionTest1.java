package StringMatchFiniteAutomata;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
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
// flaky:             com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray21);
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        int[] intArray5 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        java.lang.Class<?> wildcardClass28 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        int[] intArray5 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray11 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray17 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray23 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray24;
        java.lang.Class<?> wildcardClass29 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray21);
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray4);
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray34);
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, 256, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        int[][] intArray2 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray26);
        java.lang.Class<?> wildcardClass30 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray28);
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray21);
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray34);
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray38);
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray26);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        java.lang.Class<?> wildcardClass31 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        int[] intArray6 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray11 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray16 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray17 = new int[][] { intArray6, intArray11, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray17);
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray26);
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray15 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray16 = new int[][] { intArray7, intArray11, intArray15 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray16);
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray21);
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray26);
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, 256, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray26);
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray34);
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray26);
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, 0, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray28);
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"FA\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray17);
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (-1), 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray36);
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) '#', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 0, intArray23);
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray38);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray21);
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray6);
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        int[] intArray4 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray9 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray14 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray23);
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 10, intArray26);
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray21);
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray21);
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
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray34);
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, 256, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray38);
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 0, intArray14);
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray38);
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray26);
        java.lang.Class<?> wildcardClass30 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 100, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"FA\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (byte) -1, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray17);
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray38);
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray15 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray16 = new int[][] { intArray7, intArray11, intArray15 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray16;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray16);
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int[] intArray3 = new int[] { 256 };
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[] intArray9 = new int[] { 256 };
        int[][] intArray10 = new int[][] { intArray3, intArray5, intArray7, intArray9 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        java.lang.Class<?> wildcardClass32 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        java.lang.Class<?> wildcardClass39 = intArray34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"FA\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, 256, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, (int) (byte) 10, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray17);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (byte) 100, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray8);
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 256, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray21);
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, 256, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', 1, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray21);
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (-1), 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray38);
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, 1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        int[] intArray6 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray16 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray21 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray26 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.Class<?> wildcardClass14 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 10, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '4', intArray23);
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray8);
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int[] intArray6 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray16 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray21 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray26 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[] intArray31 = new int[] { 1, (byte) 0, (short) 100, (-1) };
        int[][] intArray32 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26, intArray31 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray32);
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        int[] intArray4 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray9 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray14 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (-1), 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 100, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray21);
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, 256, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray38);
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray36);
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray34);
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, 256, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (-1), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray34);
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 256, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray21);
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray40);
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 0, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        int[] intArray4 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray9 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray14 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray15;
        java.lang.Class<?> wildcardClass21 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[256, 0, -1, 256]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray28);
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray28);
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray26);
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
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '#', intArray4);
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray38);
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray8);
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray14);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) '#', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 10, intArray28);
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, 256, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int[][] intArray0 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray0;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray0;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray0;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray0;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray0;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray0;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray0;
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray19);
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (byte) 10, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray2, intArray3 };
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (byte) 0, 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray38);
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        int[] intArray1 = new int[] { 256 };
        int[] intArray3 = new int[] { 256 };
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[256]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int[] intArray6 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray16 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray21 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray26 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) -1, (int) ' ', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '4', 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"FA\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray12;
        java.lang.Class<?> wildcardClass20 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray14);
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray14);
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray5, intArray9, intArray13 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 1, intArray14);
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray19);
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 0, intArray8);
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) ' ', (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 1, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) 0, 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray17);
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 100, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, (int) (short) -1, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 1, intArray19);
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"FA\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 100, intArray23);
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 10, intArray40);
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 1, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray17);
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (short) 0, 256);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 256, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray40);
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray28);
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int[] intArray9 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray15 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray21 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray27 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray9, intArray15, intArray21, intArray27 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray28);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray28);
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        int[] intArray6 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray11 = new int[] { 256, (short) 0, (-1), 256 };
        int[] intArray16 = new int[] { 256, (short) 0, (-1), 256 };
        int[][] intArray17 = new int[][] { intArray6, intArray11, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray17);
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 0, intArray21);
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) 1, intArray36);
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
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        java.lang.Class<?> wildcardClass36 = intArray30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray21);
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (-1), intArray6);
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray34);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray34;
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        java.lang.Class<?> wildcardClass30 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 10, intArray38);
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        java.lang.Class<?> wildcardClass46 = intArray36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        int[] intArray7 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray13 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[] intArray25 = new int[] { 256, '#', 0, 100, (byte) 10 };
        int[][] intArray26 = new int[][] { intArray7, intArray13, intArray19, intArray25 };
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', (int) '#', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int[][] intArray2 = null;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray2);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) -1, intArray34);
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray28);
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 256, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) -1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) ' ', 256, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 10, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 100, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 10, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 0, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray6);
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray16 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray17);
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray19);
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 10, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 100, intArray38);
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '#', 256, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) 'a', intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        java.lang.Class<?> wildcardClass41 = intArray32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) 'a', 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        java.lang.Class<?> wildcardClass33 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[256, 35, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (-1), (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray4, intArray5 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int[] intArray6 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray16 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray21 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[] intArray26 = new int[] { 10, 100, (short) 1, (byte) 100 };
        int[][] intArray27 = new int[][] { intArray6, intArray11, intArray16, intArray21, intArray26 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) 'a', intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int[] intArray1 = new int[] { 256 };
        int[] intArray3 = new int[] { 256 };
        int[] intArray5 = new int[] { 256 };
        int[] intArray7 = new int[] { 256 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray8;
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[256]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[256]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[256]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[256]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray8);
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray36);
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) '#', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) ' ', intArray4);
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", 256, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"FA\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", 0, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 100, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray34);
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray34);
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (-1), 256, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 255 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray38);
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 0, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (short) 100, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray2);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) -1, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 0, intArray28);
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 10, intArray28);
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"FA\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 100, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        int[][] intArray6 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray6;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) -1, intArray6);
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray36);
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 0, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) '4', intArray19);
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 10, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) ' ', intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (byte) 0, intArray21);
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", 100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int[][] intArray2 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 1, (-1), 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 0, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) 'a', 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) '#', (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (byte) 10, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) (short) 100, (int) ' ', 256);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("hi!", (int) '4', (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray8, intArray11, intArray14, intArray17, intArray20 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray21;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (short) -1, intArray21);
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (-1), intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", (int) (short) 10, intArray21);
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int[][] intArray4 = com.thealgorithms.others.StringMatchFiniteAutomata.FA;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray4);
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("hi!", 256, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.StringMatchFiniteAutomata.getNextState("", (int) (byte) 100, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray18 = new int[] { (byte) -1, (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        com.thealgorithms.others.StringMatchFiniteAutomata.FA = intArray19;
        com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.StringMatchFiniteAutomata.computeFA("", (int) (byte) 0, intArray19);
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
}
