package stacks;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test9001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9001");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test9002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9002");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9003");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test9004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9004");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9005");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9006");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (-1));
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (-1));
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test9007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9007");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9008");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) -1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
    }

    @Test
    public void test9009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9009");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test9010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9010");
        int[] intArray2 = new int[] { 10, 0 };
        int[] intArray4 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (short) 0);
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 1);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (-1));
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test9011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9011");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test9012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9012");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
    }

    @Test
    public void test9013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9013");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (-1));
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) -1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test9014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9014");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test9015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9015");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9016");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test9017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9017");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (-1));
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test9018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9018");
        int[] intArray2 = new int[] { 10, 0 };
        int[] intArray4 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (short) 0);
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 1);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (short) -1);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 0);
        int[] intArray14 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (-1));
        int[] intArray16 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 1);
        int[] intArray18 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray16, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test9019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9019");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
    }

    @Test
    public void test9020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9020");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9021");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test9022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9022");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
    }

    @Test
    public void test9023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9023");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0]");
    }

    @Test
    public void test9024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9024");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 0);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, 0);
        java.lang.Class<?> wildcardClass30 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test9025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9025");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10]");
    }

    @Test
    public void test9026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9026");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (-1));
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (-1));
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray29, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0]");
    }

    @Test
    public void test9027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9027");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) -1);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (-1));
        int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray29, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0]");
    }

    @Test
    public void test9028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9028");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test9029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9029");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9030");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
    }

    @Test
    public void test9031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9031");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9032");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 0);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (byte) 1);
        int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray29, (int) (short) 0);
        int[] intArray33 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray29, (int) (short) -1);
        java.lang.Class<?> wildcardClass34 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test9033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9033");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) -1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (-1));
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9034");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (-1));
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
    }

    @Test
    public void test9035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9035");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test9036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9036");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test9037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9037");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9038");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9039");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test9040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9040");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9041");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9042");
        int[] intArray0 = null;
        int[] intArray2 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray0, (int) (short) 0);
        int[] intArray4 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray0, 0);
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (byte) 0);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, 0);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
    }

    @Test
    public void test9043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9043");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test9044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9044");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test9045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9045");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9046");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9047");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test9048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9048");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9049");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test9050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9050");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 0);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (byte) 1);
        int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray29, (int) (short) -1);
        int[] intArray33 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray29, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray33, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0]");
    }

    @Test
    public void test9051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9051");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9052");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test9053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9053");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test9054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9054");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test9055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9055");
        int[] intArray4 = new int[] { 1, (byte) -1, 10, 10 };
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (byte) -1);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (short) -1);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, 1);
        int[] intArray14 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (byte) 0);
        int[] intArray16 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9056");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test9057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9057");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (-1));
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, 0);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
    }

    @Test
    public void test9058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9058");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test9059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9059");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9060");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test9061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9061");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9062");
        int[] intArray2 = new int[] { 10, 0 };
        int[] intArray4 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (short) 0);
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 1);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray8, (int) (short) -1);
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray10, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test9063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9063");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9064");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9065");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (-1));
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test9066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9066");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test9067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9067");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9068");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9069");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test9070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9070");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test9071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9071");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9072");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9073");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test9074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9074");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        java.lang.Class<?> wildcardClass26 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test9075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9075");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9076");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test9077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9077");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
    }

    @Test
    public void test9078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9078");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test9079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9079");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test9080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9080");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
    }

    @Test
    public void test9081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9081");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test9082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9082");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test9083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9083");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9084");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9085");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test9086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9086");
        int[] intArray4 = new int[] { 10, 100, (short) -1, (byte) 10 };
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (short) 0);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (short) -1);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray8, (int) (short) -1);
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray8, 0);
        int[] intArray14 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray8, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test9087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9087");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9088");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test9089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9089");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9090");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) -1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test9091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9091");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test9092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9092");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test9093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9093");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
    }

    @Test
    public void test9094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9094");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9095");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9096");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test9097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9097");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9098");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 97]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test9099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9099");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9100");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9101");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10]");
    }

    @Test
    public void test9102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9102");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9103");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test9104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9104");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test9105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9105");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray29, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test9106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9106");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
    }

    @Test
    public void test9107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9107");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9108");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test9109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9109");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (-1));
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) -1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9110");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test9111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9111");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9112");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
    }

    @Test
    public void test9113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9113");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) -1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9114");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test9115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9115");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9116");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9117");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9118");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9119");
        int[] intArray2 = new int[] { 10, 0 };
        int[] intArray4 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (short) 0);
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 1);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray8, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray10, 0);
        int[] intArray14 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray10, 0);
        int[] intArray16 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray14, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9120");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test9121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9121");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
    }

    @Test
    public void test9122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9122");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (short) 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
    }

    @Test
    public void test9123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9123");
        int[] intArray2 = new int[] { 10, 0 };
        int[] intArray4 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (short) 0);
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 1);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (short) -1);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
    }

    @Test
    public void test9124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9124");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test9125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9125");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9126");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test9127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9127");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
    }

    @Test
    public void test9128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9128");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
    }

    @Test
    public void test9129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9129");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test9130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9130");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, 1);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (byte) 1);
        int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0]");
    }

    @Test
    public void test9131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9131");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test9132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9132");
        int[] intArray2 = new int[] { 10, 0 };
        int[] intArray4 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (short) 0);
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, 1);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray2, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray8, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
    }

    @Test
    public void test9133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9133");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
    }

    @Test
    public void test9134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9134");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9135");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
    }

    @Test
    public void test9136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9136");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test9137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9137");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9138");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9139");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test9140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9140");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) -1);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test9141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9141");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test9142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9142");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
    }

    @Test
    public void test9143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9143");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9144");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9145");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
    }

    @Test
    public void test9146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9146");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test9147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9147");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
    }

    @Test
    public void test9148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9148");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9149");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray29, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test9150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9150");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9151");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9152");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (byte) -1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
    }

    @Test
    public void test9153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9153");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test9154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9154");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test9155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9155");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9156");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test9157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9157");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9158");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
    }

    @Test
    public void test9159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9159");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9160");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9161");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test9162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9162");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9163");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9164");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (-1));
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9165");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
    }

    @Test
    public void test9166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9166");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9167");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test9168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9168");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9169");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test9170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9170");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test9171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9171");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9172");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9173");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (-1));
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test9174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9174");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test9175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9175");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (-1));
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9176");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (-1));
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, 0);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray29, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test9177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9177");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9178");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9179");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9180");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test9181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9181");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (-1));
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test9182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9182");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
    }

    @Test
    public void test9183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9183");
        int[] intArray4 = new int[] { 1, (byte) -1, 10, 10 };
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (byte) -1);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray8, 1);
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray8, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray12, (-1));
        int[] intArray16 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray12, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
    }

    @Test
    public void test9184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9184");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9185");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9186");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test9187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9187");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (short) -1);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (short) -1);
        int[] intArray31 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (-1));
        java.lang.Class<?> wildcardClass32 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test9188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9188");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9189");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9190");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9191");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9192");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test9193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9193");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (-1));
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9194");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9195");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9196");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 1);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9197");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test9198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9198");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test9199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9199");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9200");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
    }

    @Test
    public void test9201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9201");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9202");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test9203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9203");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test9204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9204");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test9205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9205");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9206");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test9207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9207");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9208");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test9209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9209");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (byte) -1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (-1));
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test9210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9210");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test9211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9211");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10]");
    }

    @Test
    public void test9212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9212");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (-1));
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
    }

    @Test
    public void test9213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9213");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
    }

    @Test
    public void test9214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9214");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test9215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9215");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test9216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9216");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (-1));
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test9217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9217");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) -1);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 1);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray25, (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test9218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9218");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9219");
        int[] intArray4 = new int[] { 1, (byte) -1, 10, 10 };
        int[] intArray6 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (byte) -1);
        int[] intArray8 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (int) (short) -1);
        int[] intArray10 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, 1);
        int[] intArray12 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray4, (-1));
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test9220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9220");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (byte) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9221");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) -1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9222");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test9223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9223");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
    }

    @Test
    public void test9224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9224");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9225");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
    }

    @Test
    public void test9226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9226");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9227");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test9228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9228");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test9229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9229");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (byte) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, 0);
        int[] intArray27 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray23, (int) (short) -1);
        int[] intArray29 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray27, (int) (short) -1);
        java.lang.Class<?> wildcardClass30 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test9230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9230");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9231");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, 0);
        int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test9232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9232");
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test9233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9233");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, 10, 100 };
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray5, 1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 1);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 0);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray19, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
    }

    @Test
    public void test9234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9234");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        int[] intArray5 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, 0);
        int[] intArray7 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray3, (int) (byte) -1);
        int[] intArray9 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray7, 0);
        int[] intArray11 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray9, (-1));
        int[] intArray13 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray11, 0);
        int[] intArray15 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray13, 0);
        int[] intArray17 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray15, (int) (byte) 1);
        int[] intArray19 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.datastructures.stacks.MaximumMinimumWindow.calculateMaxOfMin(intArray21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }
}

