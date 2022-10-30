package MazeRecursion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test13001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13001");
        int[] intArray3 = new int[] { 1, '#', (byte) 10 };
        int[] intArray7 = new int[] { 1, '#', (byte) 10 };
        int[] intArray11 = new int[] { 1, '#', (byte) 10 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13002");
        int[] intArray5 = new int[] { (-1), 0, (short) -1, (short) 100, 1 };
        int[] intArray11 = new int[] { (-1), 0, (short) -1, (short) 100, 1 };
        int[] intArray17 = new int[] { (-1), 0, (short) -1, (short) 100, 1 };
        int[] intArray23 = new int[] { (-1), 0, (short) -1, (short) 100, 1 };
        int[] intArray29 = new int[] { (-1), 0, (short) -1, (short) 100, 1 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13003");
        int[] intArray2 = new int[] { (short) 10, 0 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13004");
        int[] intArray3 = new int[] { (byte) -1, ' ', 'a' };
        int[] intArray7 = new int[] { (byte) -1, ' ', 'a' };
        int[] intArray11 = new int[] { (byte) -1, ' ', 'a' };
        int[] intArray15 = new int[] { (byte) -1, ' ', 'a' };
        int[] intArray19 = new int[] { (byte) -1, ' ', 'a' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13005");
        int[] intArray4 = new int[] { 0, ' ', ' ', (short) 0 };
        int[] intArray9 = new int[] { 0, ' ', ' ', (short) 0 };
        int[] intArray14 = new int[] { 0, ' ', ' ', (short) 0 };
        int[] intArray19 = new int[] { 0, ' ', ' ', (short) 0 };
        int[] intArray24 = new int[] { 0, ' ', ' ', (short) 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 32, 32, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 32, 32, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 32, 32, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 32, 32, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 32, 32, 0]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13006");
        int[] intArray3 = new int[] { 10, (byte) 100, ' ' };
        int[] intArray7 = new int[] { 10, (byte) 100, ' ' };
        int[] intArray11 = new int[] { 10, (byte) 100, ' ' };
        int[] intArray15 = new int[] { 10, (byte) 100, ' ' };
        int[] intArray19 = new int[] { 10, (byte) 100, ' ' };
        int[] intArray23 = new int[] { 10, (byte) 100, ' ' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 100, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, 32]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13007");
        int[] intArray3 = new int[] { (short) 10, (short) 10, 10 };
        int[] intArray7 = new int[] { (short) 10, (short) 10, 10 };
        int[] intArray11 = new int[] { (short) 10, (short) 10, 10 };
        int[] intArray15 = new int[] { (short) 10, (short) 10, 10 };
        int[] intArray19 = new int[] { (short) 10, (short) 10, 10 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13008");
        int[] intArray1 = new int[] { 10 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13009");
        int[] intArray2 = new int[] { '4', (byte) 1 };
        int[] intArray5 = new int[] { '4', (byte) 1 };
        int[] intArray8 = new int[] { '4', (byte) 1 };
        int[] intArray11 = new int[] { '4', (byte) 1 };
        int[] intArray14 = new int[] { '4', (byte) 1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13010");
        int[] intArray5 = new int[] { '4', 1, (-1), (short) 0, (short) 1 };
        int[] intArray11 = new int[] { '4', 1, (-1), (short) 0, (short) 1 };
        int[] intArray17 = new int[] { '4', 1, (-1), (short) 0, (short) 1 };
        int[] intArray23 = new int[] { '4', 1, (-1), (short) 0, (short) 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 1, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 1, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 1, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13011");
        int[] intArray2 = new int[] { '4', 'a' };
        int[] intArray5 = new int[] { '4', 'a' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13012");
        int[] intArray4 = new int[] { (byte) 10, (byte) 10, (byte) 10, (short) 1 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 10, (byte) 10, (short) 1 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13013");
        int[] intArray4 = new int[] { (byte) -1, (byte) 0, (short) 1, 1 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 0, (short) 1, 1 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 0, (short) 1, 1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13014");
        int[] intArray4 = new int[] { 100, 0, '4', (byte) 1 };
        int[] intArray9 = new int[] { 100, 0, '4', (byte) 1 };
        int[] intArray14 = new int[] { 100, 0, '4', (byte) 1 };
        int[] intArray19 = new int[] { 100, 0, '4', (byte) 1 };
        int[] intArray24 = new int[] { 100, 0, '4', (byte) 1 };
        int[] intArray29 = new int[] { 100, 0, '4', (byte) 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13015");
        int[] intArray4 = new int[] { '4', (byte) 0, (short) 10, ' ' };
        int[] intArray9 = new int[] { '4', (byte) 0, (short) 10, ' ' };
        int[] intArray14 = new int[] { '4', (byte) 0, (short) 10, ' ' };
        int[] intArray19 = new int[] { '4', (byte) 0, (short) 10, ' ' };
        int[] intArray24 = new int[] { '4', (byte) 0, (short) 10, ' ' };
        int[] intArray29 = new int[] { '4', (byte) 0, (short) 10, ' ' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13016");
        int[] intArray5 = new int[] { ' ', (-1), '4', (short) 0, 'a' };
        int[] intArray11 = new int[] { ' ', (-1), '4', (short) 0, 'a' };
        int[] intArray17 = new int[] { ' ', (-1), '4', (short) 0, 'a' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -1, 52, 0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, -1, 52, 0, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, -1, 52, 0, 97]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13017");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13018");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, 'a', (short) 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 97, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13019");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test13020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13020");
        int[] intArray6 = new int[] { (short) 10, (short) 100, 100, (byte) 0, (byte) 100, (short) -1 };
        int[] intArray13 = new int[] { (short) 10, (short) 100, 100, (byte) 0, (byte) 100, (short) -1 };
        int[] intArray20 = new int[] { (short) 10, (short) 100, 100, (byte) 0, (byte) 100, (short) -1 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 100, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 100, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 100, 100, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13021");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, (short) 10, 100 };
        int[] intArray9 = new int[] { (short) 100, (byte) 1, (short) 10, 100 };
        int[] intArray14 = new int[] { (short) 100, (byte) 1, (short) 10, 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13022");
        int[] intArray6 = new int[] { (byte) 100, (short) 1, (byte) 0, (-1), (short) 100, '4' };
        int[] intArray13 = new int[] { (byte) 100, (short) 1, (byte) 0, (-1), (short) 100, '4' };
        int[] intArray20 = new int[] { (byte) 100, (short) 1, (byte) 0, (-1), (short) 100, '4' };
        int[] intArray27 = new int[] { (byte) 100, (short) 1, (byte) 0, (-1), (short) 100, '4' };
        int[] intArray34 = new int[] { (byte) 100, (short) 1, (byte) 0, (-1), (short) 100, '4' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 0, -1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 0, -1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 1, 0, -1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 0, -1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 1, 0, -1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test13023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13023");
        int[] intArray1 = new int[] { 100 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13024");
        int[] intArray3 = new int[] { (short) 0, ' ', ' ' };
        int[] intArray7 = new int[] { (short) 0, ' ', ' ' };
        int[] intArray11 = new int[] { (short) 0, ' ', ' ' };
        int[] intArray15 = new int[] { (short) 0, ' ', ' ' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 32, 32]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13025");
        int[] intArray4 = new int[] { (short) -1, (byte) 100, 100, 0 };
        int[] intArray9 = new int[] { (short) -1, (byte) 100, 100, 0 };
        int[] intArray14 = new int[] { (short) -1, (byte) 100, 100, 0 };
        int[] intArray19 = new int[] { (short) -1, (byte) 100, 100, 0 };
        int[] intArray24 = new int[] { (short) -1, (byte) 100, 100, 0 };
        int[] intArray29 = new int[] { (short) -1, (byte) 100, 100, 0 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13026");
        int[] intArray6 = new int[] { (byte) 10, 100, '4', (short) 0, ' ', 0 };
        int[] intArray13 = new int[] { (byte) 10, 100, '4', (short) 0, ' ', 0 };
        int[] intArray20 = new int[] { (byte) 10, 100, '4', (short) 0, ' ', 0 };
        int[] intArray27 = new int[] { (byte) 10, 100, '4', (short) 0, ' ', 0 };
        int[] intArray34 = new int[] { (byte) 10, 100, '4', (short) 0, ' ', 0 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 52, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 52, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 100, 52, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 100, 52, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 100, 52, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test13027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13027");
        int[] intArray5 = new int[] { (short) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        int[] intArray11 = new int[] { (short) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13028");
        int[] intArray3 = new int[] { (byte) 10, (byte) 0, 1 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 0, 1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 0, 1 };
        int[] intArray15 = new int[] { (byte) 10, (byte) 0, 1 };
        int[] intArray19 = new int[] { (byte) 10, (byte) 0, 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13029");
        int[] intArray6 = new int[] { (byte) 100, (short) 10, '4', 0, 1, (short) 10 };
        int[] intArray13 = new int[] { (byte) 100, (short) 10, '4', 0, 1, (short) 10 };
        int[] intArray20 = new int[] { (byte) 100, (short) 10, '4', 0, 1, (short) 10 };
        int[] intArray27 = new int[] { (byte) 100, (short) 10, '4', 0, 1, (short) 10 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 52, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 52, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 10, 52, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 10, 52, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13030");
        int[] intArray3 = new int[] { '#', 10, '#' };
        int[] intArray7 = new int[] { '#', 10, '#' };
        int[] intArray11 = new int[] { '#', 10, '#' };
        int[] intArray15 = new int[] { '#', 10, '#' };
        int[] intArray19 = new int[] { '#', 10, '#' };
        int[] intArray23 = new int[] { '#', 10, '#' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 10, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 10, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 10, 35]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 10, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 10, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 10, 35]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13031");
        int[] intArray6 = new int[] { (short) 100, (-1), 100, (-1), ' ', '#' };
        int[] intArray13 = new int[] { (short) 100, (-1), 100, (-1), ' ', '#' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 100, -1, 32, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 100, -1, 32, 35]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13032");
        int[] intArray4 = new int[] { '4', (short) 100, (byte) 0, (byte) 0 };
        int[] intArray9 = new int[] { '4', (short) 100, (byte) 0, (byte) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13033");
        int[] intArray4 = new int[] { 'a', 'a', (byte) 10, 10 };
        int[] intArray9 = new int[] { 'a', 'a', (byte) 10, 10 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 97, 10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97, 10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13034");
        int[] intArray6 = new int[] { (byte) 100, (short) 1, (byte) 10, 0, '#', (short) -1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 10, 0, 35, -1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13035");
        int[] intArray5 = new int[] { 'a', 'a', (short) 100, 10, (byte) 1 };
        int[] intArray11 = new int[] { 'a', 'a', (short) 100, 10, (byte) 1 };
        int[] intArray17 = new int[] { 'a', 'a', (short) 100, 10, (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 97, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13036");
        int[] intArray5 = new int[] { (short) 0, 0, (byte) 1, 1, (-1) };
        int[] intArray11 = new int[] { (short) 0, 0, (byte) 1, 1, (-1) };
        int[] intArray17 = new int[] { (short) 0, 0, (byte) 1, 1, (-1) };
        int[] intArray23 = new int[] { (short) 0, 0, (byte) 1, 1, (-1) };
        int[] intArray29 = new int[] { (short) 0, 0, (byte) 1, 1, (-1) };
        int[] intArray35 = new int[] { (short) 0, 0, (byte) 1, 1, (-1) };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13037");
        int[] intArray6 = new int[] { (byte) 10, (short) 10, (byte) 10, (short) -1, (short) 1, 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13038");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        int[] intArray9 = new int[] { (short) 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13039");
        int[] intArray5 = new int[] { 0, (short) 10, '#', (short) 100, (byte) 1 };
        int[] intArray11 = new int[] { 0, (short) 10, '#', (short) 100, (byte) 1 };
        int[] intArray17 = new int[] { 0, (short) 10, '#', (short) 100, (byte) 1 };
        int[] intArray23 = new int[] { 0, (short) 10, '#', (short) 100, (byte) 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 35, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 35, 100, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10, 35, 100, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 10, 35, 100, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13040");
        int[] intArray4 = new int[] { (byte) 10, (short) 1, (byte) -1, '#' };
        int[] intArray9 = new int[] { (byte) 10, (short) 1, (byte) -1, '#' };
        int[] intArray14 = new int[] { (byte) 10, (short) 1, (byte) -1, '#' };
        int[] intArray19 = new int[] { (byte) 10, (short) 1, (byte) -1, '#' };
        int[] intArray24 = new int[] { (byte) 10, (short) 1, (byte) -1, '#' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13041");
        int[] intArray3 = new int[] { 100, (short) 0, (short) 1 };
        int[] intArray7 = new int[] { 100, (short) 0, (short) 1 };
        int[] intArray11 = new int[] { 100, (short) 0, (short) 1 };
        int[] intArray15 = new int[] { 100, (short) 0, (short) 1 };
        int[] intArray19 = new int[] { 100, (short) 0, (short) 1 };
        int[] intArray23 = new int[] { 100, (short) 0, (short) 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13042");
        int[] intArray5 = new int[] { 10, (-1), 10, '4', ' ' };
        int[] intArray11 = new int[] { 10, (-1), 10, '4', ' ' };
        int[] intArray17 = new int[] { 10, (-1), 10, '4', ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 10, 52, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 10, 52, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 10, 52, 32]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13043");
        int[] intArray6 = new int[] { 1, 0, (short) 1, (short) -1, (short) 10, (short) 100 };
        int[] intArray13 = new int[] { 1, 0, (short) 1, (short) -1, (short) 10, (short) 100 };
        int[] intArray20 = new int[] { 1, 0, (short) 1, (short) -1, (short) 10, (short) 100 };
        int[] intArray27 = new int[] { 1, 0, (short) 1, (short) -1, (short) 10, (short) 100 };
        int[] intArray34 = new int[] { 1, 0, (short) 1, (short) -1, (short) 10, (short) 100 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test13044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13044");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13045");
        int[] intArray3 = new int[] { (short) 10, (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { (short) 10, (byte) -1, (byte) -1 };
        int[] intArray11 = new int[] { (short) 10, (byte) -1, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13046");
        int[] intArray5 = new int[] { '4', 100, (short) 100, (byte) 10, '4' };
        int[] intArray11 = new int[] { '4', 100, (short) 100, (byte) 10, '4' };
        int[] intArray17 = new int[] { '4', 100, (short) 100, (byte) 10, '4' };
        int[] intArray23 = new int[] { '4', 100, (short) 100, (byte) 10, '4' };
        int[] intArray29 = new int[] { '4', 100, (short) 100, (byte) 10, '4' };
        int[] intArray35 = new int[] { '4', 100, (short) 100, (byte) 10, '4' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100, 100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 100, 100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 100, 100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 100, 100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[52, 100, 100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13047");
        int[] intArray3 = new int[] { '#', '4', (byte) -1 };
        int[] intArray7 = new int[] { '#', '4', (byte) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 52, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 52, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13048");
        int[] intArray5 = new int[] { (byte) 10, (byte) 10, 1, (byte) 0, (short) 100 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13049");
        int[] intArray2 = new int[] { '#', (byte) -1 };
        int[] intArray5 = new int[] { '#', (byte) -1 };
        int[] intArray8 = new int[] { '#', (byte) -1 };
        int[] intArray11 = new int[] { '#', (byte) -1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13050");
        int[] intArray2 = new int[] { 100, (byte) 100 };
        int[] intArray5 = new int[] { 100, (byte) 100 };
        int[] intArray8 = new int[] { 100, (byte) 100 };
        int[] intArray11 = new int[] { 100, (byte) 100 };
        int[] intArray14 = new int[] { 100, (byte) 100 };
        int[] intArray17 = new int[] { 100, (byte) 100 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13051");
        int[] intArray5 = new int[] { (short) 1, '#', 10, (short) 1, '4' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 35, 10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13052");
        int[] intArray4 = new int[] { 10, (byte) 1, (short) 0, '4' };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 0, 52]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13053");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13054");
        int[] intArray5 = new int[] { 10, '4', (byte) 100, (short) 10, (byte) 1 };
        int[] intArray11 = new int[] { 10, '4', (byte) 100, (short) 10, (byte) 1 };
        int[] intArray17 = new int[] { 10, '4', (byte) 100, (short) 10, (byte) 1 };
        int[] intArray23 = new int[] { 10, '4', (byte) 100, (short) 10, (byte) 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13055");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13056");
        int[] intArray5 = new int[] { 'a', (byte) 1, (short) -1, '#', 0 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13057");
        int[] intArray5 = new int[] { (short) 100, (short) 0, (short) -1, (short) -1, 1 };
        int[] intArray11 = new int[] { (short) 100, (short) 0, (short) -1, (short) -1, 1 };
        int[] intArray17 = new int[] { (short) 100, (short) 0, (short) -1, (short) -1, 1 };
        int[] intArray23 = new int[] { (short) 100, (short) 0, (short) -1, (short) -1, 1 };
        int[] intArray29 = new int[] { (short) 100, (short) 0, (short) -1, (short) -1, 1 };
        int[] intArray35 = new int[] { (short) 100, (short) 0, (short) -1, (short) -1, 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13058");
        int[] intArray1 = new int[] { (short) 100 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13059");
        int[] intArray2 = new int[] { 0, (short) 100 };
        int[] intArray5 = new int[] { 0, (short) 100 };
        int[] intArray8 = new int[] { 0, (short) 100 };
        int[] intArray11 = new int[] { 0, (short) 100 };
        int[] intArray14 = new int[] { 0, (short) 100 };
        int[] intArray17 = new int[] { 0, (short) 100 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13060");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[] intArray5 = new int[] { '4' };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13061");
        int[] intArray3 = new int[] { (short) -1, (-1), ' ' };
        int[] intArray7 = new int[] { (short) -1, (-1), ' ' };
        int[] intArray11 = new int[] { (short) -1, (-1), ' ' };
        int[] intArray15 = new int[] { (short) -1, (-1), ' ' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13062");
        int[] intArray6 = new int[] { ' ', 'a', 1, (byte) 1, (short) 0, 0 };
        int[] intArray13 = new int[] { ' ', 'a', 1, (byte) 1, (short) 0, 0 };
        int[] intArray20 = new int[] { ' ', 'a', 1, (byte) 1, (short) 0, 0 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 97, 1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 97, 1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 97, 1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13063");
        int[] intArray2 = new int[] { 1, 0 };
        int[] intArray5 = new int[] { 1, 0 };
        int[] intArray8 = new int[] { 1, 0 };
        int[] intArray11 = new int[] { 1, 0 };
        int[] intArray14 = new int[] { 1, 0 };
        int[] intArray17 = new int[] { 1, 0 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13064");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[] intArray5 = new int[] { '4' };
        int[] intArray7 = new int[] { '4' };
        int[] intArray9 = new int[] { '4' };
        int[] intArray11 = new int[] { '4' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13065");
        int[] intArray5 = new int[] { 0, (short) -1, (short) 100, 0, (byte) 10 };
        int[] intArray11 = new int[] { 0, (short) -1, (short) 100, 0, (byte) 10 };
        int[] intArray17 = new int[] { 0, (short) -1, (short) 100, 0, (byte) 10 };
        int[] intArray23 = new int[] { 0, (short) -1, (short) 100, 0, (byte) 10 };
        int[] intArray29 = new int[] { 0, (short) -1, (short) 100, 0, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13066");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 10, (byte) 0, 'a' };
        int[] intArray11 = new int[] { (short) 10, (-1), (byte) 10, (byte) 0, 'a' };
        int[] intArray17 = new int[] { (short) 10, (-1), (byte) 10, (byte) 0, 'a' };
        int[] intArray23 = new int[] { (short) 10, (-1), (byte) 10, (byte) 0, 'a' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, -1, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13067");
        int[] intArray4 = new int[] { (byte) 10, '#', (-1), (short) 100 };
        int[] intArray9 = new int[] { (byte) 10, '#', (-1), (short) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13068");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[] intArray5 = new int[] { 0 };
        int[] intArray7 = new int[] { 0 };
        int[] intArray9 = new int[] { 0 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13069");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        int[] intArray5 = new int[] { 10 };
        int[] intArray7 = new int[] { 10 };
        int[] intArray9 = new int[] { 10 };
        int[] intArray11 = new int[] { 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13070");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13071");
        int[] intArray5 = new int[] { (short) 10, (short) 10, ' ', 100, (byte) 100 };
        int[] intArray11 = new int[] { (short) 10, (short) 10, ' ', 100, (byte) 100 };
        int[] intArray17 = new int[] { (short) 10, (short) 10, ' ', 100, (byte) 100 };
        int[] intArray23 = new int[] { (short) 10, (short) 10, ' ', 100, (byte) 100 };
        int[] intArray29 = new int[] { (short) 10, (short) 10, ' ', 100, (byte) 100 };
        int[] intArray35 = new int[] { (short) 10, (short) 10, ' ', 100, (byte) 100 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 10, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13072");
        int[] intArray5 = new int[] { (byte) 100, '4', 'a', 'a', 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13073");
        int[] intArray5 = new int[] { (short) -1, (short) 0, 100, 100, ' ' };
        int[] intArray11 = new int[] { (short) -1, (short) 0, 100, 100, ' ' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 100, 100, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 0, 100, 100, 32]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13074");
        int[] intArray5 = new int[] { '4', '#', 1, 10, 'a' };
        int[] intArray11 = new int[] { '4', '#', 1, 10, 'a' };
        int[] intArray17 = new int[] { '4', '#', 1, 10, 'a' };
        int[] intArray23 = new int[] { '4', '#', 1, 10, 'a' };
        int[] intArray29 = new int[] { '4', '#', 1, 10, 'a' };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 35, 1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 35, 1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 35, 1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 35, 1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13075");
        int[] intArray4 = new int[] { 1, '4', (short) 0, (short) -1 };
        int[] intArray9 = new int[] { 1, '4', (short) 0, (short) -1 };
        int[] intArray14 = new int[] { 1, '4', (short) 0, (short) -1 };
        int[] intArray19 = new int[] { 1, '4', (short) 0, (short) -1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13076");
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, 0, (byte) 0, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 100, (byte) -1, 0, (byte) 0, (byte) 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13077");
        int[] intArray3 = new int[] { (short) 100, '4', '#' };
        int[] intArray7 = new int[] { (short) 100, '4', '#' };
        int[] intArray11 = new int[] { (short) 100, '4', '#' };
        int[] intArray15 = new int[] { (short) 100, '4', '#' };
        int[] intArray19 = new int[] { (short) 100, '4', '#' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 35]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 52, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 52, 35]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13078");
        int[] intArray5 = new int[] { 10, '#', 0, (byte) 10, 100 };
        int[] intArray11 = new int[] { 10, '#', 0, (byte) 10, 100 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 35, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13079");
        int[] intArray2 = new int[] { 10, 100 };
        int[] intArray5 = new int[] { 10, 100 };
        int[] intArray8 = new int[] { 10, 100 };
        int[] intArray11 = new int[] { 10, 100 };
        int[] intArray14 = new int[] { 10, 100 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13080");
        int[] intArray3 = new int[] { (byte) 0, (short) 0, 0 };
        int[] intArray7 = new int[] { (byte) 0, (short) 0, 0 };
        int[] intArray11 = new int[] { (byte) 0, (short) 0, 0 };
        int[] intArray15 = new int[] { (byte) 0, (short) 0, 0 };
        int[] intArray19 = new int[] { (byte) 0, (short) 0, 0 };
        int[] intArray23 = new int[] { (byte) 0, (short) 0, 0 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13081");
        int[] intArray2 = new int[] { 'a', (short) 10 };
        int[] intArray5 = new int[] { 'a', (short) 10 };
        int[] intArray8 = new int[] { 'a', (short) 10 };
        int[] intArray11 = new int[] { 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13082");
        int[] intArray2 = new int[] { (byte) 1, (byte) 0 };
        int[] intArray5 = new int[] { (byte) 1, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 0 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13083");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13084");
        int[] intArray6 = new int[] { (short) 0, (byte) 10, 'a', 10, 0, 'a' };
        int[] intArray13 = new int[] { (short) 0, (byte) 10, 'a', 10, 0, 'a' };
        int[] intArray20 = new int[] { (short) 0, (byte) 10, 'a', 10, 0, 'a' };
        int[] intArray27 = new int[] { (short) 0, (byte) 10, 'a', 10, 0, 'a' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 97, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 97, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 10, 97, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 97, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13085");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13086");
        int[] intArray2 = new int[] { 0, (short) 0 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13087");
        int[] intArray6 = new int[] { (short) 100, (short) 0, (short) 1, (byte) 100, 10, 100 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 1, 100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13088");
        int[] intArray4 = new int[] { (short) 1, (-1), (byte) 100, (byte) 10 };
        int[] intArray9 = new int[] { (short) 1, (-1), (byte) 100, (byte) 10 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13089");
        int[] intArray3 = new int[] { (short) -1, '#', (short) 10 };
        int[] intArray7 = new int[] { (short) -1, '#', (short) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13090");
        int[] intArray4 = new int[] { (short) 0, (short) 1, (-1), (short) 0 };
        int[] intArray9 = new int[] { (short) 0, (short) 1, (-1), (short) 0 };
        int[] intArray14 = new int[] { (short) 0, (short) 1, (-1), (short) 0 };
        int[] intArray19 = new int[] { (short) 0, (short) 1, (-1), (short) 0 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13091");
        int[] intArray5 = new int[] { '#', (-1), 0, 10, (byte) 100 };
        int[] intArray11 = new int[] { '#', (-1), 0, 10, (byte) 100 };
        int[] intArray17 = new int[] { '#', (-1), 0, 10, (byte) 100 };
        int[] intArray23 = new int[] { '#', (-1), 0, 10, (byte) 100 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, -1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13092");
        int[] intArray2 = new int[] { 0, (short) 10 };
        int[] intArray5 = new int[] { 0, (short) 10 };
        int[] intArray8 = new int[] { 0, (short) 10 };
        int[] intArray11 = new int[] { 0, (short) 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13093");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = new int[] { 100 };
        int[] intArray9 = new int[] { 100 };
        int[] intArray11 = new int[] { 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13094");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13095");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test13096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13096");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13097");
        int[] intArray6 = new int[] { ' ', (short) 100, (byte) 0, 1, (short) -1, (short) 0 };
        int[] intArray13 = new int[] { ' ', (short) 100, (byte) 0, 1, (short) -1, (short) 0 };
        int[] intArray20 = new int[] { ' ', (short) 100, (byte) 0, 1, (short) -1, (short) 0 };
        int[] intArray27 = new int[] { ' ', (short) 100, (byte) 0, 1, (short) -1, (short) 0 };
        int[] intArray34 = new int[] { ' ', (short) 100, (byte) 0, 1, (short) -1, (short) 0 };
        int[] intArray41 = new int[] { ' ', (short) 100, (byte) 0, 1, (short) -1, (short) 0 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 100, 0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 100, 0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 100, 0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 100, 0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 100, 0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 100, 0, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test13098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13098");
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, (byte) 100, (short) 10, (byte) 1 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1, (byte) 100, (short) 10, (byte) 1 };
        int[] intArray17 = new int[] { (byte) 1, (byte) 1, (byte) 100, (short) 10, (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13099");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        int[] intArray9 = new int[] { '#' };
        int[] intArray11 = new int[] { '#' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13100");
        int[] intArray3 = new int[] { '4', 10, '4' };
        int[] intArray7 = new int[] { '4', 10, '4' };
        int[] intArray11 = new int[] { '4', 10, '4' };
        int[] intArray15 = new int[] { '4', 10, '4' };
        int[] intArray19 = new int[] { '4', 10, '4' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 10, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 10, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 52]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 10, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 10, 52]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13101");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a' };
        int[] intArray9 = new int[] { 'a' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13102");
        int[] intArray5 = new int[] { 10, '4', 'a', (short) 1, (short) 0 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13103");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100 };
        int[] intArray11 = new int[] { (byte) 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13104");
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, (byte) 1, (short) -1, (short) -1, (short) 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13105");
        int[] intArray4 = new int[] { (byte) -1, 'a', (-1), 1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13106");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13107");
        int[] intArray4 = new int[] { 100, (byte) 1, (short) 100, (short) 0 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13108");
        int[] intArray2 = new int[] { 100, (short) -1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13109");
        int[] intArray4 = new int[] { (short) 1, ' ', (byte) 1, ' ' };
        int[] intArray9 = new int[] { (short) 1, ' ', (byte) 1, ' ' };
        int[] intArray14 = new int[] { (short) 1, ' ', (byte) 1, ' ' };
        int[] intArray19 = new int[] { (short) 1, ' ', (byte) 1, ' ' };
        int[] intArray24 = new int[] { (short) 1, ' ', (byte) 1, ' ' };
        int[] intArray29 = new int[] { (short) 1, ' ', (byte) 1, ' ' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13110");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13111");
        int[] intArray3 = new int[] { '#', (short) 0, (byte) -1 };
        int[] intArray7 = new int[] { '#', (short) 0, (byte) -1 };
        int[] intArray11 = new int[] { '#', (short) 0, (byte) -1 };
        int[] intArray15 = new int[] { '#', (short) 0, (byte) -1 };
        int[] intArray19 = new int[] { '#', (short) 0, (byte) -1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13112");
        int[] intArray5 = new int[] { (short) 10, (-1), (short) 100, (short) 100, (byte) 0 };
        int[] intArray11 = new int[] { (short) 10, (-1), (short) 100, (short) 100, (byte) 0 };
        int[] intArray17 = new int[] { (short) 10, (-1), (short) 100, (short) 100, (byte) 0 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13113");
        int[] intArray5 = new int[] { (short) 1, 'a', (-1), 10, (-1) };
        int[] intArray11 = new int[] { (short) 1, 'a', (-1), 10, (-1) };
        int[] intArray17 = new int[] { (short) 1, 'a', (-1), 10, (-1) };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 97, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13114");
        int[] intArray4 = new int[] { 10, (byte) 10, (short) 1, (byte) 100 };
        int[] intArray9 = new int[] { 10, (byte) 10, (short) 1, (byte) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13115");
        int[] intArray3 = new int[] { ' ', ' ', 10 };
        int[] intArray7 = new int[] { ' ', ' ', 10 };
        int[] intArray11 = new int[] { ' ', ' ', 10 };
        int[] intArray15 = new int[] { ' ', ' ', 10 };
        int[] intArray19 = new int[] { ' ', ' ', 10 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 32, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 32, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13116");
        int[] intArray2 = new int[] { ' ', (short) -1 };
        int[] intArray5 = new int[] { ' ', (short) -1 };
        int[] intArray8 = new int[] { ' ', (short) -1 };
        int[] intArray11 = new int[] { ' ', (short) -1 };
        int[] intArray14 = new int[] { ' ', (short) -1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13117");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13118");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13119");
        int[] intArray3 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray7 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray11 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray15 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray19 = new int[] { (byte) 0, '4', (-1) };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 52, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 52, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 52, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 52, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13120");
        int[] intArray6 = new int[] { '#', (-1), 'a', (short) 10, '4', 'a' };
        int[] intArray13 = new int[] { '#', (-1), 'a', (short) 10, '4', 'a' };
        int[] intArray20 = new int[] { '#', (-1), 'a', (short) 10, '4', 'a' };
        int[] intArray27 = new int[] { '#', (-1), 'a', (short) 10, '4', 'a' };
        int[] intArray34 = new int[] { '#', (-1), 'a', (short) 10, '4', 'a' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 97, 10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 97, 10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, -1, 97, 10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, -1, 97, 10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, -1, 97, 10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test13121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13121");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        int[] intArray5 = new int[] { ' ', (byte) 0 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13122");
        int[] intArray3 = new int[] { (short) 0, 100, (short) -1 };
        int[] intArray7 = new int[] { (short) 0, 100, (short) -1 };
        int[] intArray11 = new int[] { (short) 0, 100, (short) -1 };
        int[] intArray15 = new int[] { (short) 0, 100, (short) -1 };
        int[] intArray19 = new int[] { (short) 0, 100, (short) -1 };
        int[] intArray23 = new int[] { (short) 0, 100, (short) -1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13123");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13124");
        int[] intArray3 = new int[] { 100, (byte) -1, (short) 10 };
        int[] intArray7 = new int[] { 100, (byte) -1, (short) 10 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 10 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13125");
        int[] intArray6 = new int[] { (byte) 0, (byte) 100, 0, (short) -1, 0, (byte) 100 };
        int[] intArray13 = new int[] { (byte) 0, (byte) 100, 0, (short) -1, 0, (byte) 100 };
        int[] intArray20 = new int[] { (byte) 0, (byte) 100, 0, (short) -1, 0, (byte) 100 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 0, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 0, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, 0, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13126");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test13127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13127");
        int[] intArray5 = new int[] { (short) 10, (short) 0, (byte) 1, 0, 1 };
        int[] intArray11 = new int[] { (short) 10, (short) 0, (byte) 1, 0, 1 };
        int[] intArray17 = new int[] { (short) 10, (short) 0, (byte) 1, 0, 1 };
        int[] intArray23 = new int[] { (short) 10, (short) 0, (byte) 1, 0, 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13128");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a' };
        int[] intArray9 = new int[] { 'a' };
        int[] intArray11 = new int[] { 'a' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13129");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13130");
        int[] intArray1 = new int[] { 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13131");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13132");
        int[] intArray2 = new int[] { (byte) 0, 'a' };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13133");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[] intArray7 = new int[] { (-1) };
        int[] intArray9 = new int[] { (-1) };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13134");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13135");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13136");
        int[] intArray5 = new int[] { '4', (short) 1, (short) 0, (short) 0, (short) 10 };
        int[] intArray11 = new int[] { '4', (short) 1, (short) 0, (short) 0, (short) 10 };
        int[] intArray17 = new int[] { '4', (short) 1, (short) 0, (short) 0, (short) 10 };
        int[] intArray23 = new int[] { '4', (short) 1, (short) 0, (short) 0, (short) 10 };
        int[] intArray29 = new int[] { '4', (short) 1, (short) 0, (short) 0, (short) 10 };
        int[] intArray35 = new int[] { '4', (short) 1, (short) 0, (short) 0, (short) 10 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[52, 1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13137");
        int[] intArray5 = new int[] { 10, '4', (short) -1, (byte) 1, 0 };
        int[] intArray11 = new int[] { 10, '4', (short) -1, (byte) 1, 0 };
        int[] intArray17 = new int[] { 10, '4', (short) -1, (byte) 1, 0 };
        int[] intArray23 = new int[] { 10, '4', (short) -1, (byte) 1, 0 };
        int[] intArray29 = new int[] { 10, '4', (short) -1, (byte) 1, 0 };
        int[] intArray35 = new int[] { 10, '4', (short) -1, (byte) 1, 0 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 52, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 52, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 52, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 52, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 52, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13138");
        int[] intArray2 = new int[] { '#', (byte) 0 };
        int[] intArray5 = new int[] { '#', (byte) 0 };
        int[] intArray8 = new int[] { '#', (byte) 0 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13139");
        int[] intArray6 = new int[] { 1, (byte) 0, 10, 10, (byte) 0, '4' };
        int[] intArray13 = new int[] { 1, (byte) 0, 10, 10, (byte) 0, '4' };
        int[] intArray20 = new int[] { 1, (byte) 0, 10, 10, (byte) 0, '4' };
        int[] intArray27 = new int[] { 1, (byte) 0, 10, 10, (byte) 0, '4' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 10, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 10, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 10, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13140");
        int[] intArray6 = new int[] { 'a', 1, (byte) 10, 'a', (short) 10, (byte) 100 };
        int[] intArray13 = new int[] { 'a', 1, (byte) 10, 'a', (short) 10, (byte) 100 };
        int[] intArray20 = new int[] { 'a', 1, (byte) 10, 'a', (short) 10, (byte) 100 };
        int[] intArray27 = new int[] { 'a', 1, (byte) 10, 'a', (short) 10, (byte) 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 10, 97, 10, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 1, 10, 97, 10, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 1, 10, 97, 10, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 1, 10, 97, 10, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13141");
        int[] intArray5 = new int[] { (byte) 10, 0, 0, 10, '#' };
        int[] intArray11 = new int[] { (byte) 10, 0, 0, 10, '#' };
        int[] intArray17 = new int[] { (byte) 10, 0, 0, 10, '#' };
        int[] intArray23 = new int[] { (byte) 10, 0, 0, 10, '#' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 0, 10, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 0, 10, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 0, 10, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 0, 10, 35]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13142");
        int[] intArray2 = new int[] { 10, (-1) };
        int[] intArray5 = new int[] { 10, (-1) };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13143");
        int[] intArray2 = new int[] { (short) 0, 0 };
        int[] intArray5 = new int[] { (short) 0, 0 };
        int[] intArray8 = new int[] { (short) 0, 0 };
        int[] intArray11 = new int[] { (short) 0, 0 };
        int[] intArray14 = new int[] { (short) 0, 0 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13144");
        int[] intArray2 = new int[] { (byte) -1, (short) -1 };
        int[] intArray5 = new int[] { (byte) -1, (short) -1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13145");
        int[] intArray2 = new int[] { (byte) 10, (short) 100 };
        int[] intArray5 = new int[] { (byte) 10, (short) 100 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13146");
        int[] intArray1 = new int[] { (short) 100 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13147");
        int[] intArray3 = new int[] { (short) 0, (short) 100, (byte) 10 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13148");
        int[] intArray6 = new int[] { (short) -1, 'a', (short) 1, '#', 100, (-1) };
        int[] intArray13 = new int[] { (short) -1, 'a', (short) 1, '#', 100, (-1) };
        int[] intArray20 = new int[] { (short) -1, 'a', (short) 1, '#', 100, (-1) };
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 1, '#', 100, (-1) };
        int[] intArray34 = new int[] { (short) -1, 'a', (short) 1, '#', 100, (-1) };
        int[] intArray41 = new int[] { (short) -1, 'a', (short) 1, '#', 100, (-1) };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 97, 1, 35, 100, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 1, 35, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 1, 35, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 1, 35, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, 1, 35, 100, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 97, 1, 35, 100, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test13149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13149");
        int[] intArray4 = new int[] { (byte) 100, 10, (short) 1, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100, 10, (short) 1, (byte) 100 };
        int[] intArray14 = new int[] { (byte) 100, 10, (short) 1, (byte) 100 };
        int[] intArray19 = new int[] { (byte) 100, 10, (short) 1, (byte) 100 };
        int[] intArray24 = new int[] { (byte) 100, 10, (short) 1, (byte) 100 };
        int[] intArray29 = new int[] { (byte) 100, 10, (short) 1, (byte) 100 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13150");
        int[] intArray1 = new int[] { (short) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13151");
        int[] intArray4 = new int[] { 0, (short) -1, (short) 100, (byte) 1 };
        int[] intArray9 = new int[] { 0, (short) -1, (short) 100, (byte) 1 };
        int[] intArray14 = new int[] { 0, (short) -1, (short) 100, (byte) 1 };
        int[] intArray19 = new int[] { 0, (short) -1, (short) 100, (byte) 1 };
        int[] intArray24 = new int[] { 0, (short) -1, (short) 100, (byte) 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13152");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, (byte) 0, (byte) -1, '#' };
        int[] intArray11 = new int[] { (short) 1, (byte) 10, (byte) 0, (byte) -1, '#' };
        int[] intArray17 = new int[] { (short) 1, (byte) 10, (byte) 0, (byte) -1, '#' };
        int[] intArray23 = new int[] { (short) 1, (byte) 10, (byte) 0, (byte) -1, '#' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 0, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 0, -1, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, 0, -1, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 10, 0, -1, 35]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13153");
        int[] intArray3 = new int[] { (byte) -1, (short) 100, (short) 1 };
        int[] intArray7 = new int[] { (byte) -1, (short) 100, (short) 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13154");
        int[] intArray4 = new int[] { (short) 0, (short) 100, '4', (short) 10 };
        int[] intArray9 = new int[] { (short) 0, (short) 100, '4', (short) 10 };
        int[] intArray14 = new int[] { (short) 0, (short) 100, '4', (short) 10 };
        int[] intArray19 = new int[] { (short) 0, (short) 100, '4', (short) 10 };
        int[] intArray24 = new int[] { (short) 0, (short) 100, '4', (short) 10 };
        int[] intArray29 = new int[] { (short) 0, (short) 100, '4', (short) 10 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13155");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13156");
        int[] intArray5 = new int[] { '4', ' ', (short) 100, (byte) 1, ' ' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 32, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13157");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1 };
        int[] intArray11 = new int[] { (byte) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13158");
        int[] intArray4 = new int[] { 100, ' ', (byte) 10, (short) 1 };
        int[] intArray9 = new int[] { 100, ' ', (byte) 10, (short) 1 };
        int[] intArray14 = new int[] { 100, ' ', (byte) 10, (short) 1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 32, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13159");
        int[] intArray2 = new int[] { (short) 100, (short) 100 };
        int[] intArray5 = new int[] { (short) 100, (short) 100 };
        int[] intArray8 = new int[] { (short) 100, (short) 100 };
        int[] intArray11 = new int[] { (short) 100, (short) 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13160");
        int[] intArray5 = new int[] { ' ', (byte) -1, (short) -1, 100, (byte) 1 };
        int[] intArray11 = new int[] { ' ', (byte) -1, (short) -1, 100, (byte) 1 };
        int[] intArray17 = new int[] { ' ', (byte) -1, (short) -1, 100, (byte) 1 };
        int[] intArray23 = new int[] { ' ', (byte) -1, (short) -1, 100, (byte) 1 };
        int[] intArray29 = new int[] { ' ', (byte) -1, (short) -1, 100, (byte) 1 };
        int[] intArray35 = new int[] { ' ', (byte) -1, (short) -1, 100, (byte) 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, -1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, -1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, -1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, -1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, -1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13161");
        int[] intArray5 = new int[] { ' ', 1, '#', 0, (short) 0 };
        int[] intArray11 = new int[] { ' ', 1, '#', 0, (short) 0 };
        int[] intArray17 = new int[] { ' ', 1, '#', 0, (short) 0 };
        int[] intArray23 = new int[] { ' ', 1, '#', 0, (short) 0 };
        int[] intArray29 = new int[] { ' ', 1, '#', 0, (short) 0 };
        int[] intArray35 = new int[] { ' ', 1, '#', 0, (short) 0 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 35, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 1, 35, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 1, 35, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 1, 35, 0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 1, 35, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 1, 35, 0, 0]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13162");
        int[] intArray3 = new int[] { (byte) 0, 100, 'a' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 97]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13163");
        int[] intArray2 = new int[] { (byte) 1, 1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13164");
        int[] intArray4 = new int[] { (byte) -1, 'a', 'a', (byte) -1 };
        int[] intArray9 = new int[] { (byte) -1, 'a', 'a', (byte) -1 };
        int[] intArray14 = new int[] { (byte) -1, 'a', 'a', (byte) -1 };
        int[] intArray19 = new int[] { (byte) -1, 'a', 'a', (byte) -1 };
        int[] intArray24 = new int[] { (byte) -1, 'a', 'a', (byte) -1 };
        int[] intArray29 = new int[] { (byte) -1, 'a', 'a', (byte) -1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 97, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 97, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 97, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 97, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 97, 97, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 97, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13165");
        int[] intArray4 = new int[] { (byte) 1, (byte) 10, 10, (byte) -1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13166");
        int[] intArray4 = new int[] { '4', (byte) 10, '#', ' ' };
        int[] intArray9 = new int[] { '4', (byte) 10, '#', ' ' };
        int[] intArray14 = new int[] { '4', (byte) 10, '#', ' ' };
        int[] intArray19 = new int[] { '4', (byte) 10, '#', ' ' };
        int[] intArray24 = new int[] { '4', (byte) 10, '#', ' ' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 35, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 10, 35, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 10, 35, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 10, 35, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, 10, 35, 32]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13167");
        int[] intArray5 = new int[] { (short) 1, '#', (short) 0, 100, '4' };
        int[] intArray11 = new int[] { (short) 1, '#', (short) 0, 100, '4' };
        int[] intArray17 = new int[] { (short) 1, '#', (short) 0, 100, '4' };
        int[] intArray23 = new int[] { (short) 1, '#', (short) 0, 100, '4' };
        int[] intArray29 = new int[] { (short) 1, '#', (short) 0, 100, '4' };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 35, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 35, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 35, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 35, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13168");
        int[] intArray6 = new int[] { '4', '#', (-1), '4', (byte) 1, 'a' };
        int[] intArray13 = new int[] { '4', '#', (-1), '4', (byte) 1, 'a' };
        int[] intArray20 = new int[] { '4', '#', (-1), '4', (byte) 1, 'a' };
        int[] intArray27 = new int[] { '4', '#', (-1), '4', (byte) 1, 'a' };
        int[] intArray34 = new int[] { '4', '#', (-1), '4', (byte) 1, 'a' };
        int[] intArray41 = new int[] { '4', '#', (-1), '4', (byte) 1, 'a' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 35, -1, 52, 1, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 35, -1, 52, 1, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 35, -1, 52, 1, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 35, -1, 52, 1, 97]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[52, 35, -1, 52, 1, 97]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[52, 35, -1, 52, 1, 97]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test13169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13169");
        int[] intArray2 = new int[] { (short) 1, ' ' };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13170");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13171");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray11 = new int[] { (short) 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13172");
        int[] intArray3 = new int[] { (short) 0, 100, (byte) 1 };
        int[] intArray7 = new int[] { (short) 0, 100, (byte) 1 };
        int[] intArray11 = new int[] { (short) 0, 100, (byte) 1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13173");
        int[] intArray6 = new int[] { ' ', 0, 1, (short) 0, 100, (byte) 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 0, 1, 0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13174");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, 0, 10, (short) -1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13175");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13176");
        int[] intArray4 = new int[] { 100, ' ', (byte) 100, 100 };
        int[] intArray9 = new int[] { 100, ' ', (byte) 100, 100 };
        int[] intArray14 = new int[] { 100, ' ', (byte) 100, 100 };
        int[] intArray19 = new int[] { 100, ' ', (byte) 100, 100 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13177");
        int[] intArray4 = new int[] { (short) -1, 1, (short) 1, 'a' };
        int[] intArray9 = new int[] { (short) -1, 1, (short) 1, 'a' };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13178");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13179");
        int[] intArray2 = new int[] { (byte) 10, (short) 100 };
        int[] intArray5 = new int[] { (byte) 10, (short) 100 };
        int[] intArray8 = new int[] { (byte) 10, (short) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13180");
        int[] intArray3 = new int[] { (byte) -1, 10, (short) 1 };
        int[] intArray7 = new int[] { (byte) -1, 10, (short) 1 };
        int[] intArray11 = new int[] { (byte) -1, 10, (short) 1 };
        int[] intArray15 = new int[] { (byte) -1, 10, (short) 1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13181");
        int[] intArray2 = new int[] { ' ', (short) 1 };
        int[] intArray5 = new int[] { ' ', (short) 1 };
        int[] intArray8 = new int[] { ' ', (short) 1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13182");
        int[] intArray5 = new int[] { (-1), (byte) 10, (byte) -1, (short) 100, 0 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13183");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13184");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = new int[] { 100 };
        int[] intArray9 = new int[] { 100 };
        int[] intArray11 = new int[] { 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13185");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13186");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13187");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test13188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13188");
        int[] intArray5 = new int[] { (byte) 0, (short) 0, '4', (short) 1, '4' };
        int[] intArray11 = new int[] { (byte) 0, (short) 0, '4', (short) 1, '4' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 52, 1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 52, 1, 52]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13189");
        int[] intArray2 = new int[] { 10, 0 };
        int[] intArray5 = new int[] { 10, 0 };
        int[] intArray8 = new int[] { 10, 0 };
        int[] intArray11 = new int[] { 10, 0 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13190");
        int[] intArray3 = new int[] { (short) 100, (short) 1, '#' };
        int[] intArray7 = new int[] { (short) 100, (short) 1, '#' };
        int[] intArray11 = new int[] { (short) 100, (short) 1, '#' };
        int[] intArray15 = new int[] { (short) 100, (short) 1, '#' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 35]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 35]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13191");
        int[] intArray4 = new int[] { (byte) -1, 1, (short) 1, (short) 100 };
        int[] intArray9 = new int[] { (byte) -1, 1, (short) 1, (short) 100 };
        int[] intArray14 = new int[] { (byte) -1, 1, (short) 1, (short) 100 };
        int[] intArray19 = new int[] { (byte) -1, 1, (short) 1, (short) 100 };
        int[] intArray24 = new int[] { (byte) -1, 1, (short) 1, (short) 100 };
        int[] intArray29 = new int[] { (byte) -1, 1, (short) 1, (short) 100 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13192");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13193");
        int[] intArray6 = new int[] { '#', (short) 100, (byte) 0, (-1), 'a', (byte) 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 100, 0, -1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13194");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[] intArray5 = new int[] { (byte) 0, (short) 100 };
        int[] intArray8 = new int[] { (byte) 0, (short) 100 };
        int[] intArray11 = new int[] { (byte) 0, (short) 100 };
        int[] intArray14 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13195");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13196");
        int[] intArray4 = new int[] { (short) 10, (-1), 0, '#' };
        int[] intArray9 = new int[] { (short) 10, (-1), 0, '#' };
        int[] intArray14 = new int[] { (short) 10, (-1), 0, '#' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 0, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, -1, 0, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, -1, 0, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13197");
        int[] intArray4 = new int[] { (byte) 0, (byte) 10, '#', (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0, (byte) 10, '#', (byte) 0 };
        int[] intArray14 = new int[] { (byte) 0, (byte) 10, '#', (byte) 0 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13198");
        int[] intArray6 = new int[] { '4', (byte) 10, (short) 1, (short) -1, (byte) 100, 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13199");
        int[] intArray2 = new int[] { (byte) 10, 'a' };
        int[] intArray5 = new int[] { (byte) 10, 'a' };
        int[] intArray8 = new int[] { (byte) 10, 'a' };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13200");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13201");
        int[] intArray4 = new int[] { '4', (short) 0, 0, (byte) -1 };
        int[] intArray9 = new int[] { '4', (short) 0, 0, (byte) -1 };
        int[] intArray14 = new int[] { '4', (short) 0, 0, (byte) -1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13202");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 1, (short) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13203");
        int[] intArray4 = new int[] { (byte) 100, 1, (-1), (byte) 0 };
        int[] intArray9 = new int[] { (byte) 100, 1, (-1), (byte) 0 };
        int[] intArray14 = new int[] { (byte) 100, 1, (-1), (byte) 0 };
        int[] intArray19 = new int[] { (byte) 100, 1, (-1), (byte) 0 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13204");
        int[] intArray5 = new int[] { '#', (short) 1, (-1), (byte) 100, (byte) 0 };
        int[] intArray11 = new int[] { '#', (short) 1, (-1), (byte) 100, (byte) 0 };
        int[] intArray17 = new int[] { '#', (short) 1, (-1), (byte) 100, (byte) 0 };
        int[] intArray23 = new int[] { '#', (short) 1, (-1), (byte) 100, (byte) 0 };
        int[] intArray29 = new int[] { '#', (short) 1, (-1), (byte) 100, (byte) 0 };
        int[] intArray35 = new int[] { '#', (short) 1, (-1), (byte) 100, (byte) 0 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13205");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, (-1), (-1) };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13206");
        int[] intArray3 = new int[] { (byte) 10, 100, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10, 100, (byte) 10 };
        int[] intArray11 = new int[] { (byte) 10, 100, (byte) 10 };
        int[] intArray15 = new int[] { (byte) 10, 100, (byte) 10 };
        int[] intArray19 = new int[] { (byte) 10, 100, (byte) 10 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13207");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[] intArray9 = new int[] { (short) 1 };
        int[] intArray11 = new int[] { (short) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13208");
        int[] intArray4 = new int[] { 'a', (short) 0, (short) -1, (short) 1 };
        int[] intArray9 = new int[] { 'a', (short) 0, (short) -1, (short) 1 };
        int[] intArray14 = new int[] { 'a', (short) 0, (short) -1, (short) 1 };
        int[] intArray19 = new int[] { 'a', (short) 0, (short) -1, (short) 1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13209");
        int[] intArray2 = new int[] { (byte) 10, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 10, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 10, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 100 };
        int[] intArray14 = new int[] { (byte) 10, (byte) 100 };
        int[] intArray17 = new int[] { (byte) 10, (byte) 100 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13210");
        int[] intArray5 = new int[] { (-1), (short) 0, (byte) 0, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (-1), (short) 0, (byte) 0, (byte) -1, (byte) 1 };
        int[] intArray17 = new int[] { (-1), (short) 0, (byte) 0, (byte) -1, (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 0, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 0, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13211");
        int[] intArray3 = new int[] { 1, (short) 10, 'a' };
        int[] intArray7 = new int[] { 1, (short) 10, 'a' };
        int[] intArray11 = new int[] { 1, (short) 10, 'a' };
        int[] intArray15 = new int[] { 1, (short) 10, 'a' };
        int[] intArray19 = new int[] { 1, (short) 10, 'a' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13212");
        int[] intArray1 = new int[] { (short) 100 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13213");
        int[] intArray4 = new int[] { (byte) 1, 'a', '4', (byte) -1 };
        int[] intArray9 = new int[] { (byte) 1, 'a', '4', (byte) -1 };
        int[] intArray14 = new int[] { (byte) 1, 'a', '4', (byte) -1 };
        int[] intArray19 = new int[] { (byte) 1, 'a', '4', (byte) -1 };
        int[] intArray24 = new int[] { (byte) 1, 'a', '4', (byte) -1 };
        int[] intArray29 = new int[] { (byte) 1, 'a', '4', (byte) -1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 97, 52, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 97, 52, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 97, 52, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 97, 52, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 97, 52, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 97, 52, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13214");
        int[] intArray2 = new int[] { (short) 1, (byte) -1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13215");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[] intArray7 = new int[] { 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13216");
        int[] intArray3 = new int[] { 0, (short) 10, 0 };
        int[] intArray7 = new int[] { 0, (short) 10, 0 };
        int[] intArray11 = new int[] { 0, (short) 10, 0 };
        int[] intArray15 = new int[] { 0, (short) 10, 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13217");
        int[] intArray4 = new int[] { 0, (short) -1, (byte) 10, (short) -1 };
        int[] intArray9 = new int[] { 0, (short) -1, (byte) 10, (short) -1 };
        int[] intArray14 = new int[] { 0, (short) -1, (byte) 10, (short) -1 };
        int[] intArray19 = new int[] { 0, (short) -1, (byte) 10, (short) -1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13218");
        int[] intArray6 = new int[] { '#', '4', (short) 100, (short) 0, 100, 100 };
        int[] intArray13 = new int[] { '#', '4', (short) 100, (short) 0, 100, 100 };
        int[] intArray20 = new int[] { '#', '4', (short) 100, (short) 0, 100, 100 };
        int[] intArray27 = new int[] { '#', '4', (short) 100, (short) 0, 100, 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 52, 100, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 52, 100, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 52, 100, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 52, 100, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13219");
        int[] intArray4 = new int[] { 10, 10, '#', '4' };
        int[] intArray9 = new int[] { 10, 10, '#', '4' };
        int[] intArray14 = new int[] { 10, 10, '#', '4' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 35, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10, 35, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10, 35, 52]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13220");
        int[] intArray6 = new int[] { 0, (byte) -1, (byte) 0, 100, '#', 'a' };
        int[] intArray13 = new int[] { 0, (byte) -1, (byte) 0, 100, '#', 'a' };
        int[] intArray20 = new int[] { 0, (byte) -1, (byte) 0, 100, '#', 'a' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 100, 35, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 0, 100, 35, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, 0, 100, 35, 97]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13221");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13222");
        int[] intArray2 = new int[] { (short) 1, 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13223");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13224");
        int[] intArray5 = new int[] { (-1), 100, (short) 10, (byte) 0, (byte) 0 };
        int[] intArray11 = new int[] { (-1), 100, (short) 10, (byte) 0, (byte) 0 };
        int[] intArray17 = new int[] { (-1), 100, (short) 10, (byte) 0, (byte) 0 };
        int[] intArray23 = new int[] { (-1), 100, (short) 10, (byte) 0, (byte) 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, 10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100, 10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 100, 10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13225");
        int[] intArray4 = new int[] { (short) 0, (short) -1, (byte) 100, '#' };
        int[] intArray9 = new int[] { (short) 0, (short) -1, (byte) 100, '#' };
        int[] intArray14 = new int[] { (short) 0, (short) -1, (byte) 100, '#' };
        int[] intArray19 = new int[] { (short) 0, (short) -1, (byte) 100, '#' };
        int[] intArray24 = new int[] { (short) 0, (short) -1, (byte) 100, '#' };
        int[] intArray29 = new int[] { (short) 0, (short) -1, (byte) 100, '#' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, -1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, -1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13226");
        int[] intArray6 = new int[] { (-1), '#', (short) -1, (byte) 0, ' ', (short) -1 };
        int[] intArray13 = new int[] { (-1), '#', (short) -1, (byte) 0, ' ', (short) -1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, -1, 0, 32, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 35, -1, 0, 32, -1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13227");
        int[] intArray2 = new int[] { '#', (byte) -1 };
        int[] intArray5 = new int[] { '#', (byte) -1 };
        int[] intArray8 = new int[] { '#', (byte) -1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13228");
        int[] intArray6 = new int[] { '#', (byte) 0, ' ', (byte) -1, (byte) 1, (short) -1 };
        int[] intArray13 = new int[] { '#', (byte) 0, ' ', (byte) -1, (byte) 1, (short) -1 };
        int[] intArray20 = new int[] { '#', (byte) 0, ' ', (byte) -1, (byte) 1, (short) -1 };
        int[] intArray27 = new int[] { '#', (byte) 0, ' ', (byte) -1, (byte) 1, (short) -1 };
        int[] intArray34 = new int[] { '#', (byte) 0, ' ', (byte) -1, (byte) 1, (short) -1 };
        int[] intArray41 = new int[] { '#', (byte) 0, ' ', (byte) -1, (byte) 1, (short) -1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 0, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 0, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 0, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 0, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test13229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13229");
        int[] intArray3 = new int[] { (byte) 100, 10, '#' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 35]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13230");
        int[] intArray3 = new int[] { 10, 'a', '#' };
        int[] intArray7 = new int[] { 10, 'a', '#' };
        int[] intArray11 = new int[] { 10, 'a', '#' };
        int[] intArray15 = new int[] { 10, 'a', '#' };
        int[] intArray19 = new int[] { 10, 'a', '#' };
        int[] intArray23 = new int[] { 10, 'a', '#' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13231");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13232");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, 1, (short) 1, (short) 0 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, 1, (short) 1, (short) 0 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, 1, (short) 1, (short) 0 };
        int[] intArray23 = new int[] { (byte) -1, (byte) 10, 1, (short) 1, (short) 0 };
        int[] intArray29 = new int[] { (byte) -1, (byte) 10, 1, (short) 1, (short) 0 };
        int[] intArray35 = new int[] { (byte) -1, (byte) 10, 1, (short) 1, (short) 0 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13233");
        int[] intArray6 = new int[] { 1, 100, (short) 1, (byte) -1, (byte) 100, (byte) 100 };
        int[] intArray13 = new int[] { 1, 100, (short) 1, (byte) -1, (byte) 100, (byte) 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13234");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) -1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13235");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13236");
        int[] intArray2 = new int[] { 10, (short) 1 };
        int[] intArray5 = new int[] { 10, (short) 1 };
        int[] intArray8 = new int[] { 10, (short) 1 };
        int[] intArray11 = new int[] { 10, (short) 1 };
        int[] intArray14 = new int[] { 10, (short) 1 };
        int[] intArray17 = new int[] { 10, (short) 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13237");
        int[] intArray4 = new int[] { 0, 'a', (byte) -1, (byte) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 97, -1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13238");
        int[] intArray3 = new int[] { (byte) 100, (short) 100, '#' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 35]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13239");
        int[] intArray6 = new int[] { (short) 1, (byte) 0, '4', ' ', (short) 0, (short) 1 };
        int[] intArray13 = new int[] { (short) 1, (byte) 0, '4', ' ', (short) 0, (short) 1 };
        int[] intArray20 = new int[] { (short) 1, (byte) 0, '4', ' ', (short) 0, (short) 1 };
        int[] intArray27 = new int[] { (short) 1, (byte) 0, '4', ' ', (short) 0, (short) 1 };
        int[] intArray34 = new int[] { (short) 1, (byte) 0, '4', ' ', (short) 0, (short) 1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 52, 32, 0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 52, 32, 0, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 52, 32, 0, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 52, 32, 0, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 52, 32, 0, 1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test13240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13240");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13241");
        int[] intArray4 = new int[] { (-1), '#', (byte) 1, 1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13242");
        int[] intArray2 = new int[] { (short) -1, (short) 0 };
        int[] intArray5 = new int[] { (short) -1, (short) 0 };
        int[] intArray8 = new int[] { (short) -1, (short) 0 };
        int[] intArray11 = new int[] { (short) -1, (short) 0 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13243");
        int[] intArray3 = new int[] { 1, (byte) 0, (byte) 10 };
        int[] intArray7 = new int[] { 1, (byte) 0, (byte) 10 };
        int[] intArray11 = new int[] { 1, (byte) 0, (byte) 10 };
        int[] intArray15 = new int[] { 1, (byte) 0, (byte) 10 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13244");
        int[] intArray2 = new int[] { (short) -1, (byte) 1 };
        int[] intArray5 = new int[] { (short) -1, (byte) 1 };
        int[] intArray8 = new int[] { (short) -1, (byte) 1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13245");
        int[] intArray3 = new int[] { (byte) 100, '4', 1 };
        int[] intArray7 = new int[] { (byte) 100, '4', 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13246");
        int[] intArray2 = new int[] { ' ', (short) 100 };
        int[] intArray5 = new int[] { ' ', (short) 100 };
        int[] intArray8 = new int[] { ' ', (short) 100 };
        int[] intArray11 = new int[] { ' ', (short) 100 };
        int[] intArray14 = new int[] { ' ', (short) 100 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13247");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13248");
        int[] intArray4 = new int[] { (byte) 100, 0, 100, '4' };
        int[] intArray9 = new int[] { (byte) 100, 0, 100, '4' };
        int[] intArray14 = new int[] { (byte) 100, 0, 100, '4' };
        int[] intArray19 = new int[] { (byte) 100, 0, 100, '4' };
        int[] intArray24 = new int[] { (byte) 100, 0, 100, '4' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13249");
        int[] intArray6 = new int[] { (short) 0, (byte) 10, (short) 100, 100, 0, (byte) 1 };
        int[] intArray13 = new int[] { (short) 0, (byte) 10, (short) 100, 100, 0, (byte) 1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13250");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13251");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13252");
        int[] intArray6 = new int[] { (short) 10, ' ', (byte) 10, (short) 1, (short) -1, (short) 100 };
        int[] intArray13 = new int[] { (short) 10, ' ', (byte) 10, (short) 1, (short) -1, (short) 100 };
        int[] intArray20 = new int[] { (short) 10, ' ', (byte) 10, (short) 1, (short) -1, (short) 100 };
        int[] intArray27 = new int[] { (short) 10, ' ', (byte) 10, (short) 1, (short) -1, (short) 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 32, 10, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 10, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 32, 10, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 32, 10, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13253");
        int[] intArray6 = new int[] { (short) 1, 'a', '#', (short) 1, 1, (byte) 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 97, 35, 1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13254");
        int[] intArray3 = new int[] { (byte) 1, 100, (byte) -1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13255");
        int[] intArray4 = new int[] { 10, (short) 0, (byte) 1, 0 };
        int[] intArray9 = new int[] { 10, (short) 0, (byte) 1, 0 };
        int[] intArray14 = new int[] { 10, (short) 0, (byte) 1, 0 };
        int[] intArray19 = new int[] { 10, (short) 0, (byte) 1, 0 };
        int[] intArray24 = new int[] { 10, (short) 0, (byte) 1, 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13256");
        int[] intArray4 = new int[] { (byte) 100, ' ', (short) 0, 100 };
        int[] intArray9 = new int[] { (byte) 100, ' ', (short) 0, 100 };
        int[] intArray14 = new int[] { (byte) 100, ' ', (short) 0, 100 };
        int[] intArray19 = new int[] { (byte) 100, ' ', (short) 0, 100 };
        int[] intArray24 = new int[] { (byte) 100, ' ', (short) 0, 100 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 0, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 32, 0, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 32, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 32, 0, 100]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13257");
        int[] intArray5 = new int[] { (short) 0, (short) -1, 100, (-1), 0 };
        int[] intArray11 = new int[] { (short) 0, (short) -1, 100, (-1), 0 };
        int[] intArray17 = new int[] { (short) 0, (short) -1, 100, (-1), 0 };
        int[] intArray23 = new int[] { (short) 0, (short) -1, 100, (-1), 0 };
        int[] intArray29 = new int[] { (short) 0, (short) -1, 100, (-1), 0 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, -1, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, -1, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, -1, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13258");
        int[] intArray6 = new int[] { (-1), 'a', '#', 0, '4', (byte) 100 };
        int[] intArray13 = new int[] { (-1), 'a', '#', 0, '4', (byte) 100 };
        int[] intArray20 = new int[] { (-1), 'a', '#', 0, '4', (byte) 100 };
        int[] intArray27 = new int[] { (-1), 'a', '#', 0, '4', (byte) 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 97, 35, 0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 35, 0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 35, 0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 35, 0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13259");
        int[] intArray4 = new int[] { 100, 'a', 0, (byte) 0 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 97, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13260");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1 };
        int[] intArray11 = new int[] { (byte) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13261");
        int[] intArray1 = new int[] { (byte) 10 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13262");
        int[] intArray4 = new int[] { (byte) 0, ' ', 1, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0, ' ', 1, (byte) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 32, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 32, 1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13263");
        int[] intArray5 = new int[] { 100, (short) 1, (-1), 100, (byte) 10 };
        int[] intArray11 = new int[] { 100, (short) 1, (-1), 100, (byte) 10 };
        int[] intArray17 = new int[] { 100, (short) 1, (-1), 100, (byte) 10 };
        int[] intArray23 = new int[] { 100, (short) 1, (-1), 100, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, -1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, -1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, -1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, -1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13264");
        int[] intArray4 = new int[] { (byte) 1, (short) 1, (byte) 10, (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1, (short) 1, (byte) 10, (byte) 1 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13265");
        int[] intArray3 = new int[] { (byte) -1, (byte) 10, (short) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10 };
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13266");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13267");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[] intArray7 = new int[] { 1 };
        int[] intArray9 = new int[] { 1 };
        int[] intArray11 = new int[] { 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13268");
        int[] intArray5 = new int[] { (byte) 100, 10, (short) 0, (short) 100, 100 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13269");
        int[] intArray3 = new int[] { 'a', '4', 1 };
        int[] intArray7 = new int[] { 'a', '4', 1 };
        int[] intArray11 = new int[] { 'a', '4', 1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 52, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 52, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 52, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13270");
        int[] intArray2 = new int[] { (short) 1, (short) 1 };
        int[] intArray5 = new int[] { (short) 1, (short) 1 };
        int[] intArray8 = new int[] { (short) 1, (short) 1 };
        int[] intArray11 = new int[] { (short) 1, (short) 1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13271");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray5 = new int[] { 10, '#' };
        int[] intArray8 = new int[] { 10, '#' };
        int[] intArray11 = new int[] { 10, '#' };
        int[] intArray14 = new int[] { 10, '#' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13272");
        int[] intArray4 = new int[] { 0, 100, 'a', (short) 10 };
        int[] intArray9 = new int[] { 0, 100, 'a', (short) 10 };
        int[] intArray14 = new int[] { 0, 100, 'a', (short) 10 };
        int[] intArray19 = new int[] { 0, 100, 'a', (short) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100, 97, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, 97, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 100, 97, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13273");
        int[] intArray6 = new int[] { (short) 100, '#', ' ', (short) 0, (short) 10, (short) 10 };
        int[] intArray13 = new int[] { (short) 100, '#', ' ', (short) 0, (short) 10, (short) 10 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 35, 32, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 35, 32, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13274");
        int[] intArray4 = new int[] { (short) -1, '4', (byte) 1, (byte) 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13275");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1 };
        int[] intArray11 = new int[] { (byte) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13276");
        int[] intArray3 = new int[] { 0, (byte) 100, (byte) -1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13277");
        int[] intArray3 = new int[] { (short) 1, 'a', (short) 1 };
        int[] intArray7 = new int[] { (short) 1, 'a', (short) 1 };
        int[] intArray11 = new int[] { (short) 1, 'a', (short) 1 };
        int[] intArray15 = new int[] { (short) 1, 'a', (short) 1 };
        int[] intArray19 = new int[] { (short) 1, 'a', (short) 1 };
        int[] intArray23 = new int[] { (short) 1, 'a', (short) 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13278");
        int[] intArray1 = new int[] { 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13279");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, 1, ' ', 1, (short) 1 };
        int[] intArray13 = new int[] { (short) 0, (byte) 1, 1, ' ', 1, (short) 1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 1, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13280");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13281");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13282");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13283");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13284");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 10, ' ' };
        int[] intArray9 = new int[] { (byte) -1, (short) 10, (short) 10, ' ' };
        int[] intArray14 = new int[] { (byte) -1, (short) 10, (short) 10, ' ' };
        int[] intArray19 = new int[] { (byte) -1, (short) 10, (short) 10, ' ' };
        int[] intArray24 = new int[] { (byte) -1, (short) 10, (short) 10, ' ' };
        int[] intArray29 = new int[] { (byte) -1, (short) 10, (short) 10, ' ' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13285");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13286");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13287");
        int[] intArray4 = new int[] { 1, ' ', (-1), '4' };
        int[] intArray9 = new int[] { 1, ' ', (-1), '4' };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13288");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13289");
        int[] intArray2 = new int[] { 'a', (short) -1 };
        int[] intArray5 = new int[] { 'a', (short) -1 };
        int[] intArray8 = new int[] { 'a', (short) -1 };
        int[] intArray11 = new int[] { 'a', (short) -1 };
        int[] intArray14 = new int[] { 'a', (short) -1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13290");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13291");
        int[] intArray5 = new int[] { (short) 0, (short) 10, 100, (short) 1, ' ' };
        int[] intArray11 = new int[] { (short) 0, (short) 10, 100, (short) 1, ' ' };
        int[] intArray17 = new int[] { (short) 0, (short) 10, 100, (short) 1, ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13292");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13293");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13294");
        int[] intArray6 = new int[] { 1, '#', (byte) 10, (short) 0, (byte) 0, '4' };
        int[] intArray13 = new int[] { 1, '#', (byte) 10, (short) 0, (byte) 0, '4' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 35, 10, 0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10, 0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13295");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[] intArray5 = new int[] { '4' };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13296");
        int[] intArray5 = new int[] { (short) 0, (short) 1, (byte) 100, 'a', (short) 100 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 100, 97, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13297");
        int[] intArray5 = new int[] { (byte) 100, (short) 100, (short) -1, ' ', '4' };
        int[] intArray11 = new int[] { (byte) 100, (short) 100, (short) -1, ' ', '4' };
        int[] intArray17 = new int[] { (byte) 100, (short) 100, (short) -1, ' ', '4' };
        int[] intArray23 = new int[] { (byte) 100, (short) 100, (short) -1, ' ', '4' };
        int[] intArray29 = new int[] { (byte) 100, (short) 100, (short) -1, ' ', '4' };
        int[] intArray35 = new int[] { (byte) 100, (short) 100, (short) -1, ' ', '4' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, -1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, -1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100, -1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100, -1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100, -1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 100, -1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13298");
        int[] intArray4 = new int[] { 1, (-1), (short) 10, (byte) 0 };
        int[] intArray9 = new int[] { 1, (-1), (short) 10, (byte) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13299");
        int[] intArray3 = new int[] { (byte) 0, 1, (short) 1 };
        int[] intArray7 = new int[] { (byte) 0, 1, (short) 1 };
        int[] intArray11 = new int[] { (byte) 0, 1, (short) 1 };
        int[] intArray15 = new int[] { (byte) 0, 1, (short) 1 };
        int[] intArray19 = new int[] { (byte) 0, 1, (short) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13300");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13301");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13302");
        int[] intArray3 = new int[] { '4', '#', '4' };
        int[] intArray7 = new int[] { '4', '#', '4' };
        int[] intArray11 = new int[] { '4', '#', '4' };
        int[] intArray15 = new int[] { '4', '#', '4' };
        int[] intArray19 = new int[] { '4', '#', '4' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 35, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 35, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 52]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 35, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 35, 52]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13303");
        int[] intArray5 = new int[] { (byte) 1, (byte) 100, (short) 10, (short) 100, (short) 1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13304");
        int[] intArray4 = new int[] { 'a', (-1), '4', (byte) 0 };
        int[] intArray9 = new int[] { 'a', (-1), '4', (byte) 0 };
        int[] intArray14 = new int[] { 'a', (-1), '4', (byte) 0 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, -1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13305");
        int[] intArray6 = new int[] { (short) 0, '#', (short) 1, (short) -1, (-1), (byte) -1 };
        int[] intArray13 = new int[] { (short) 0, '#', (short) 1, (short) -1, (-1), (byte) -1 };
        int[] intArray20 = new int[] { (short) 0, '#', (short) 1, (short) -1, (-1), (byte) -1 };
        int[] intArray27 = new int[] { (short) 0, '#', (short) 1, (short) -1, (-1), (byte) -1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 35, 1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 35, 1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 35, 1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13306");
        int[] intArray3 = new int[] { 10, (byte) 1, '4' };
        int[] intArray7 = new int[] { 10, (byte) 1, '4' };
        int[] intArray11 = new int[] { 10, (byte) 1, '4' };
        int[] intArray15 = new int[] { 10, (byte) 1, '4' };
        int[] intArray19 = new int[] { 10, (byte) 1, '4' };
        int[] intArray23 = new int[] { 10, (byte) 1, '4' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13307");
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, (byte) 1, '#', (byte) 100 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 0, (byte) 1, '#', (byte) 100 };
        int[] intArray17 = new int[] { (byte) 10, (byte) 0, (byte) 1, '#', (byte) 100 };
        int[] intArray23 = new int[] { (byte) 10, (byte) 0, (byte) 1, '#', (byte) 100 };
        int[] intArray29 = new int[] { (byte) 10, (byte) 0, (byte) 1, '#', (byte) 100 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 0, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13308");
        int[] intArray4 = new int[] { (byte) 100, 1, (byte) 1, 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13309");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13310");
        int[] intArray2 = new int[] { (byte) 10, (byte) -1 };
        int[] intArray5 = new int[] { (byte) 10, (byte) -1 };
        int[] intArray8 = new int[] { (byte) 10, (byte) -1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) -1 };
        int[] intArray14 = new int[] { (byte) 10, (byte) -1 };
        int[] intArray17 = new int[] { (byte) 10, (byte) -1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13311");
        int[] intArray4 = new int[] { 1, (short) 100, (byte) 100, 0 };
        int[] intArray9 = new int[] { 1, (short) 100, (byte) 100, 0 };
        int[] intArray14 = new int[] { 1, (short) 100, (byte) 100, 0 };
        int[] intArray19 = new int[] { 1, (short) 100, (byte) 100, 0 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13312");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13313");
        int[] intArray6 = new int[] { ' ', '#', 100, (short) 1, (byte) -1, '4' };
        int[] intArray13 = new int[] { ' ', '#', 100, (short) 1, (byte) -1, '4' };
        int[] intArray20 = new int[] { ' ', '#', 100, (short) 1, (byte) -1, '4' };
        int[] intArray27 = new int[] { ' ', '#', 100, (short) 1, (byte) -1, '4' };
        int[] intArray34 = new int[] { ' ', '#', 100, (short) 1, (byte) -1, '4' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 35, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 35, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 35, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 35, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 35, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test13314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13314");
        int[] intArray2 = new int[] { (-1), (short) -1 };
        int[] intArray5 = new int[] { (-1), (short) -1 };
        int[] intArray8 = new int[] { (-1), (short) -1 };
        int[] intArray11 = new int[] { (-1), (short) -1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13315");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test13316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13316");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13317");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test13318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13318");
        int[] intArray5 = new int[] { '#', (short) 10, ' ', (short) 0, (-1) };
        int[] intArray11 = new int[] { '#', (short) 10, ' ', (short) 0, (-1) };
        int[] intArray17 = new int[] { '#', (short) 10, ' ', (short) 0, (-1) };
        int[] intArray23 = new int[] { '#', (short) 10, ' ', (short) 0, (-1) };
        int[] intArray29 = new int[] { '#', (short) 10, ' ', (short) 0, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 10, 32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 10, 32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 10, 32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13319");
        int[] intArray4 = new int[] { (short) 1, ' ', '#', (short) 1 };
        int[] intArray9 = new int[] { (short) 1, ' ', '#', (short) 1 };
        int[] intArray14 = new int[] { (short) 1, ' ', '#', (short) 1 };
        int[] intArray19 = new int[] { (short) 1, ' ', '#', (short) 1 };
        int[] intArray24 = new int[] { (short) 1, ' ', '#', (short) 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, 35, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 32, 35, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 32, 35, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 32, 35, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 32, 35, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13320");
        int[] intArray5 = new int[] { 1, (short) -1, '#', 10, (short) 100 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 35, 10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13321");
        int[] intArray3 = new int[] { (short) 1, (-1), 100 };
        int[] intArray7 = new int[] { (short) 1, (-1), 100 };
        int[] intArray11 = new int[] { (short) 1, (-1), 100 };
        int[] intArray15 = new int[] { (short) 1, (-1), 100 };
        int[] intArray19 = new int[] { (short) 1, (-1), 100 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13322");
        int[] intArray3 = new int[] { (short) 100, '4', (short) -1 };
        int[] intArray7 = new int[] { (short) 100, '4', (short) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13323");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray5 = new int[] { (byte) 1, (short) 100 };
        int[] intArray8 = new int[] { (byte) 1, (short) 100 };
        int[] intArray11 = new int[] { (byte) 1, (short) 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13324");
        int[] intArray5 = new int[] { (-1), (short) 100, 1, 1, (-1) };
        int[] intArray11 = new int[] { (-1), (short) 100, 1, 1, (-1) };
        int[] intArray17 = new int[] { (-1), (short) 100, 1, 1, (-1) };
        int[] intArray23 = new int[] { (-1), (short) 100, 1, 1, (-1) };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 100, 1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13325");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13326");
        int[] intArray4 = new int[] { (byte) 10, (short) 100, 100, 10 };
        int[] intArray9 = new int[] { (byte) 10, (short) 100, 100, 10 };
        int[] intArray14 = new int[] { (byte) 10, (short) 100, 100, 10 };
        int[] intArray19 = new int[] { (byte) 10, (short) 100, 100, 10 };
        int[] intArray24 = new int[] { (byte) 10, (short) 100, 100, 10 };
        int[] intArray29 = new int[] { (byte) 10, (short) 100, 100, 10 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13327");
        int[] intArray4 = new int[] { (short) 100, (byte) 100, (byte) 1, (-1) };
        int[] intArray9 = new int[] { (short) 100, (byte) 100, (byte) 1, (-1) };
        int[] intArray14 = new int[] { (short) 100, (byte) 100, (byte) 1, (-1) };
        int[] intArray19 = new int[] { (short) 100, (byte) 100, (byte) 1, (-1) };
        int[] intArray24 = new int[] { (short) 100, (byte) 100, (byte) 1, (-1) };
        int[] intArray29 = new int[] { (short) 100, (byte) 100, (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13328");
        int[] intArray6 = new int[] { 100, (short) 1, (short) 10, 'a', 1, ' ' };
        int[] intArray13 = new int[] { 100, (short) 1, (short) 10, 'a', 1, ' ' };
        int[] intArray20 = new int[] { 100, (short) 1, (short) 10, 'a', 1, ' ' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 10, 97, 1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 10, 97, 1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 1, 10, 97, 1, 32]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13329");
        int[] intArray4 = new int[] { (byte) 1, (byte) 1, (short) 0, (short) -1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13330");
        int[] intArray2 = new int[] { (byte) 100, 10 };
        int[] intArray5 = new int[] { (byte) 100, 10 };
        int[] intArray8 = new int[] { (byte) 100, 10 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13331");
        int[] intArray6 = new int[] { (byte) 10, (short) 100, '4', (byte) 10, '4', 100 };
        int[] intArray13 = new int[] { (byte) 10, (short) 100, '4', (byte) 10, '4', 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 52, 10, 52, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 52, 10, 52, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13332");
        int[] intArray3 = new int[] { (short) 1, ' ', (byte) 1 };
        int[] intArray7 = new int[] { (short) 1, ' ', (byte) 1 };
        int[] intArray11 = new int[] { (short) 1, ' ', (byte) 1 };
        int[] intArray15 = new int[] { (short) 1, ' ', (byte) 1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13333");
        int[] intArray4 = new int[] { (byte) 1, (byte) 0, (short) 10, 'a' };
        int[] intArray9 = new int[] { (byte) 1, (byte) 0, (short) 10, 'a' };
        int[] intArray14 = new int[] { (byte) 1, (byte) 0, (short) 10, 'a' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 10, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13334");
        int[] intArray3 = new int[] { 'a', (-1), (byte) 10 };
        int[] intArray7 = new int[] { 'a', (-1), (byte) 10 };
        int[] intArray11 = new int[] { 'a', (-1), (byte) 10 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, -1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13335");
        int[] intArray2 = new int[] { (short) 100, (byte) 0 };
        int[] intArray5 = new int[] { (short) 100, (byte) 0 };
        int[] intArray8 = new int[] { (short) 100, (byte) 0 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13336");
        int[] intArray3 = new int[] { (short) 10, 1, 1 };
        int[] intArray7 = new int[] { (short) 10, 1, 1 };
        int[] intArray11 = new int[] { (short) 10, 1, 1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13337");
        int[] intArray3 = new int[] { (byte) 0, 100, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 0, 100, (byte) 100 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13338");
        int[] intArray6 = new int[] { (byte) 10, ' ', (byte) 100, (short) -1, (short) -1, ' ' };
        int[] intArray13 = new int[] { (byte) 10, ' ', (byte) 100, (short) -1, (short) -1, ' ' };
        int[] intArray20 = new int[] { (byte) 10, ' ', (byte) 100, (short) -1, (short) -1, ' ' };
        int[] intArray27 = new int[] { (byte) 10, ' ', (byte) 100, (short) -1, (short) -1, ' ' };
        int[] intArray34 = new int[] { (byte) 10, ' ', (byte) 100, (short) -1, (short) -1, ' ' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 32, 100, -1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 100, -1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 32, 100, -1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 32, 100, -1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 32, 100, -1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test13339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13339");
        int[] intArray5 = new int[] { '4', (short) 1, ' ', (byte) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (short) 1, ' ', (byte) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (short) 1, ' ', (byte) -1, (byte) 10 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 32, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 1, 32, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 1, 32, -1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13340");
        int[] intArray6 = new int[] { (short) 10, ' ', (short) 1, (short) 10, (byte) 100, 1 };
        int[] intArray13 = new int[] { (short) 10, ' ', (short) 1, (short) 10, (byte) 100, 1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 32, 1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13341");
        int[] intArray6 = new int[] { (byte) 100, '4', (short) -1, '4', 'a', 1 };
        int[] intArray13 = new int[] { (byte) 100, '4', (short) -1, '4', 'a', 1 };
        int[] intArray20 = new int[] { (byte) 100, '4', (short) -1, '4', 'a', 1 };
        int[] intArray27 = new int[] { (byte) 100, '4', (short) -1, '4', 'a', 1 };
        int[] intArray34 = new int[] { (byte) 100, '4', (short) -1, '4', 'a', 1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, -1, 52, 97, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 52, -1, 52, 97, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 52, -1, 52, 97, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 52, -1, 52, 97, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 52, -1, 52, 97, 1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test13342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13342");
        int[] intArray5 = new int[] { '4', (short) 100, 1, (short) 100, '#' };
        int[] intArray11 = new int[] { '4', (short) 100, 1, (short) 100, '#' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100, 1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13343");
        int[] intArray6 = new int[] { ' ', (short) -1, 0, (short) -1, (short) -1, (short) 100 };
        int[] intArray13 = new int[] { ' ', (short) -1, 0, (short) -1, (short) -1, (short) 100 };
        int[] intArray20 = new int[] { ' ', (short) -1, 0, (short) -1, (short) -1, (short) 100 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 0, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, -1, 0, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, -1, 0, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13344");
        int[] intArray3 = new int[] { (byte) -1, (short) 1, (short) 100 };
        int[] intArray7 = new int[] { (byte) -1, (short) 1, (short) 100 };
        int[] intArray11 = new int[] { (byte) -1, (short) 1, (short) 100 };
        int[] intArray15 = new int[] { (byte) -1, (short) 1, (short) 100 };
        int[] intArray19 = new int[] { (byte) -1, (short) 1, (short) 100 };
        int[] intArray23 = new int[] { (byte) -1, (short) 1, (short) 100 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13345");
        int[] intArray2 = new int[] { '#', '#' };
        int[] intArray5 = new int[] { '#', '#' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13346");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13347");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13348");
        int[] intArray3 = new int[] { (short) 100, (byte) 0, 100 };
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 100 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13349");
        int[] intArray3 = new int[] { 0, (byte) 10, (byte) 10 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13350");
        int[] intArray3 = new int[] { (short) 10, 1, (byte) 1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13351");
        int[] intArray6 = new int[] { (byte) 10, 'a', (short) 10, (-1), (byte) -1, (short) 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13352");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) -1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13353");
        int[] intArray4 = new int[] { (-1), (byte) -1, (byte) 10, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) -1, (byte) 10, (byte) 100 };
        int[] intArray14 = new int[] { (-1), (byte) -1, (byte) 10, (byte) 100 };
        int[] intArray19 = new int[] { (-1), (byte) -1, (byte) 10, (byte) 100 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13354");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13355");
        int[] intArray6 = new int[] { '#', 1, (-1), (short) -1, (byte) 10, '#' };
        int[] intArray13 = new int[] { '#', 1, (-1), (short) -1, (byte) 10, '#' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, -1, -1, 10, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 1, -1, -1, 10, 35]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13356");
        int[] intArray6 = new int[] { (byte) -1, (short) 1, 0, (byte) -1, (short) 100, (byte) -1 };
        int[] intArray13 = new int[] { (byte) -1, (short) 1, 0, (byte) -1, (short) 100, (byte) -1 };
        int[] intArray20 = new int[] { (byte) -1, (short) 1, 0, (byte) -1, (short) 100, (byte) -1 };
        int[] intArray27 = new int[] { (byte) -1, (short) 1, 0, (byte) -1, (short) 100, (byte) -1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 0, -1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 0, -1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 1, 0, -1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 1, 0, -1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13357");
        int[] intArray3 = new int[] { (short) 1, 1, (short) 0 };
        int[] intArray7 = new int[] { (short) 1, 1, (short) 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13358");
        int[] intArray5 = new int[] { 0, 0, (byte) 10, (short) 100, (short) 0 };
        int[] intArray11 = new int[] { 0, 0, (byte) 10, (short) 100, (short) 0 };
        int[] intArray17 = new int[] { 0, 0, (byte) 10, (short) 100, (short) 0 };
        int[] intArray23 = new int[] { 0, 0, (byte) 10, (short) 100, (short) 0 };
        int[] intArray29 = new int[] { 0, 0, (byte) 10, (short) 100, (short) 0 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13359");
        int[] intArray6 = new int[] { (byte) 10, (byte) 10, (byte) 1, (short) 0, (byte) 0, (byte) 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13360");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13361");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        int[] intArray5 = new int[] { 10 };
        int[] intArray7 = new int[] { 10 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13362");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[] intArray5 = new int[] { (byte) 0, (short) 100 };
        int[] intArray8 = new int[] { (byte) 0, (short) 100 };
        int[] intArray11 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13363");
        int[] intArray4 = new int[] { 1, (byte) -1, (short) 100, (short) 1 };
        int[] intArray9 = new int[] { 1, (byte) -1, (short) 100, (short) 1 };
        int[] intArray14 = new int[] { 1, (byte) -1, (short) 100, (short) 1 };
        int[] intArray19 = new int[] { 1, (byte) -1, (short) 100, (short) 1 };
        int[] intArray24 = new int[] { 1, (byte) -1, (short) 100, (short) 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13364");
        int[] intArray2 = new int[] { (short) 100, '#' };
        int[] intArray5 = new int[] { (short) 100, '#' };
        int[] intArray8 = new int[] { (short) 100, '#' };
        int[] intArray11 = new int[] { (short) 100, '#' };
        int[] intArray14 = new int[] { (short) 100, '#' };
        int[] intArray17 = new int[] { (short) 100, '#' };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13365");
        int[] intArray2 = new int[] { (short) 10, (short) 10 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13366");
        int[] intArray5 = new int[] { (-1), (short) 10, ' ', 100, (short) 1 };
        int[] intArray11 = new int[] { (-1), (short) 10, ' ', 100, (short) 1 };
        int[] intArray17 = new int[] { (-1), (short) 10, ' ', 100, (short) 1 };
        int[] intArray23 = new int[] { (-1), (short) 10, ' ', 100, (short) 1 };
        int[] intArray29 = new int[] { (-1), (short) 10, ' ', 100, (short) 1 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 10, 32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13367");
        int[] intArray2 = new int[] { ' ', 1 };
        int[] intArray5 = new int[] { ' ', 1 };
        int[] intArray8 = new int[] { ' ', 1 };
        int[] intArray11 = new int[] { ' ', 1 };
        int[] intArray14 = new int[] { ' ', 1 };
        int[] intArray17 = new int[] { ' ', 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13368");
        int[] intArray3 = new int[] { 'a', 1, (short) 0 };
        int[] intArray7 = new int[] { 'a', 1, (short) 0 };
        int[] intArray11 = new int[] { 'a', 1, (short) 0 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13369");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13370");
        int[] intArray2 = new int[] { 'a', (byte) 1 };
        int[] intArray5 = new int[] { 'a', (byte) 1 };
        int[] intArray8 = new int[] { 'a', (byte) 1 };
        int[] intArray11 = new int[] { 'a', (byte) 1 };
        int[] intArray14 = new int[] { 'a', (byte) 1 };
        int[] intArray17 = new int[] { 'a', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13371");
        int[] intArray6 = new int[] { (byte) 100, '4', (short) 100, (short) 100, ' ', '4' };
        int[] intArray13 = new int[] { (byte) 100, '4', (short) 100, (short) 100, ' ', '4' };
        int[] intArray20 = new int[] { (byte) 100, '4', (short) 100, (short) 100, ' ', '4' };
        int[] intArray27 = new int[] { (byte) 100, '4', (short) 100, (short) 100, ' ', '4' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 100, 100, 32, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 52, 100, 100, 32, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 52, 100, 100, 32, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 52, 100, 100, 32, 52]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13372");
        int[] intArray4 = new int[] { '4', (byte) -1, 10, (byte) 1 };
        int[] intArray9 = new int[] { '4', (byte) -1, 10, (byte) 1 };
        int[] intArray14 = new int[] { '4', (byte) -1, 10, (byte) 1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13373");
        int[] intArray3 = new int[] { ' ', '#', (short) 0 };
        int[] intArray7 = new int[] { ' ', '#', (short) 0 };
        int[] intArray11 = new int[] { ' ', '#', (short) 0 };
        int[] intArray15 = new int[] { ' ', '#', (short) 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 35, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 35, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13374");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, (byte) 10, (short) 1, (short) 10 };
        int[] intArray11 = new int[] { (short) 1, (byte) 10, (byte) 10, (short) 1, (short) 10 };
        int[] intArray17 = new int[] { (short) 1, (byte) 10, (byte) 10, (short) 1, (short) 10 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13375");
        int[] intArray3 = new int[] { (-1), (short) 10, 100 };
        int[] intArray7 = new int[] { (-1), (short) 10, 100 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13376");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, '#', (byte) -1, (short) 1 };
        int[] intArray11 = new int[] { (byte) 1, (short) 10, '#', (byte) -1, (short) 1 };
        int[] intArray17 = new int[] { (byte) 1, (short) 10, '#', (byte) -1, (short) 1 };
        int[] intArray23 = new int[] { (byte) 1, (short) 10, '#', (byte) -1, (short) 1 };
        int[] intArray29 = new int[] { (byte) 1, (short) 10, '#', (byte) -1, (short) 1 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 35, -1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 35, -1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, 35, -1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 10, 35, -1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 10, 35, -1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13377");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13378");
        int[] intArray2 = new int[] { (short) -1, (short) 100 };
        int[] intArray5 = new int[] { (short) -1, (short) 100 };
        int[] intArray8 = new int[] { (short) -1, (short) 100 };
        int[] intArray11 = new int[] { (short) -1, (short) 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13379");
        int[] intArray5 = new int[] { (byte) -1, '#', 1, 100, (short) 1 };
        int[] intArray11 = new int[] { (byte) -1, '#', 1, 100, (short) 1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 35, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13380");
        int[] intArray6 = new int[] { '4', 'a', (byte) 1, (short) 0, ' ', 0 };
        int[] intArray13 = new int[] { '4', 'a', (byte) 1, (short) 0, ' ', 0 };
        int[] intArray20 = new int[] { '4', 'a', (byte) 1, (short) 0, ' ', 0 };
        int[] intArray27 = new int[] { '4', 'a', (byte) 1, (short) 0, ' ', 0 };
        int[] intArray34 = new int[] { '4', 'a', (byte) 1, (short) 0, ' ', 0 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 97, 1, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 97, 1, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 97, 1, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 97, 1, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[52, 97, 1, 0, 32, 0]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test13381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13381");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13382");
        int[] intArray6 = new int[] { (byte) 100, '#', '4', (short) 0, (byte) 0, 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 35, 52, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13383");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray5 = new int[] { 100, '4' };
        int[] intArray8 = new int[] { 100, '4' };
        int[] intArray11 = new int[] { 100, '4' };
        int[] intArray14 = new int[] { 100, '4' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13384");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13385");
        int[] intArray4 = new int[] { 'a', (short) 0, (byte) 100, '4' };
        int[] intArray9 = new int[] { 'a', (short) 0, (byte) 100, '4' };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 100, 52]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13386");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13387");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13388");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13389");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test13390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13390");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13391");
        int[] intArray4 = new int[] { 1, (-1), 100, (short) 10 };
        int[] intArray9 = new int[] { 1, (-1), 100, (short) 10 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13392");
        int[] intArray6 = new int[] { 'a', '#', '4', (short) 0, 1, (byte) -1 };
        int[] intArray13 = new int[] { 'a', '#', '4', (short) 0, 1, (byte) -1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 52, 0, 1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 35, 52, 0, 1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13393");
        int[] intArray3 = new int[] { (-1), (byte) 1, (short) 0 };
        int[] intArray7 = new int[] { (-1), (byte) 1, (short) 0 };
        int[] intArray11 = new int[] { (-1), (byte) 1, (short) 0 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13394");
        int[] intArray5 = new int[] { '#', (short) 0, (short) 100, 100, 1 };
        int[] intArray11 = new int[] { '#', (short) 0, (short) 100, 100, 1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0, 100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 0, 100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13395");
        int[] intArray5 = new int[] { (-1), '4', '#', (byte) 0, (-1) };
        int[] intArray11 = new int[] { (-1), '4', '#', (byte) 0, (-1) };
        int[] intArray17 = new int[] { (-1), '4', '#', (byte) 0, (-1) };
        int[] intArray23 = new int[] { (-1), '4', '#', (byte) 0, (-1) };
        int[] intArray29 = new int[] { (-1), '4', '#', (byte) 0, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52, 35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 52, 35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 52, 35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 52, 35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 52, 35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13396");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13397");
        int[] intArray4 = new int[] { (short) 10, '#', '#', (-1) };
        int[] intArray9 = new int[] { (short) 10, '#', '#', (-1) };
        int[] intArray14 = new int[] { (short) 10, '#', '#', (-1) };
        int[] intArray19 = new int[] { (short) 10, '#', '#', (-1) };
        int[] intArray24 = new int[] { (short) 10, '#', '#', (-1) };
        int[] intArray29 = new int[] { (short) 10, '#', '#', (-1) };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, 35, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 35, 35, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 35, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 35, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 35, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 35, 35, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13398");
        int[] intArray2 = new int[] { (byte) 0, (byte) 0 };
        int[] intArray5 = new int[] { (byte) 0, (byte) 0 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13399");
        int[] intArray5 = new int[] { '4', (byte) 1, 100, (short) 10, (byte) 1 };
        int[] intArray11 = new int[] { '4', (byte) 1, 100, (short) 10, (byte) 1 };
        int[] intArray17 = new int[] { '4', (byte) 1, 100, (short) 10, (byte) 1 };
        int[] intArray23 = new int[] { '4', (byte) 1, 100, (short) 10, (byte) 1 };
        int[] intArray29 = new int[] { '4', (byte) 1, 100, (short) 10, (byte) 1 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13400");
        int[] intArray4 = new int[] { (short) 10, (byte) -1, (short) 0, (-1) };
        int[] intArray9 = new int[] { (short) 10, (byte) -1, (short) 0, (-1) };
        int[] intArray14 = new int[] { (short) 10, (byte) -1, (short) 0, (-1) };
        int[] intArray19 = new int[] { (short) 10, (byte) -1, (short) 0, (-1) };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, -1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, -1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, -1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13401");
        int[] intArray4 = new int[] { 0, (-1), (short) -1, (byte) 100 };
        int[] intArray9 = new int[] { 0, (-1), (short) -1, (byte) 100 };
        int[] intArray14 = new int[] { 0, (-1), (short) -1, (byte) 100 };
        int[] intArray19 = new int[] { 0, (-1), (short) -1, (byte) 100 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13402");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test13403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13403");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int[] intArray5 = new int[] { '#', (short) 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13404");
        int[] intArray4 = new int[] { (byte) 10, (short) 1, ' ', (-1) };
        int[] intArray9 = new int[] { (byte) 10, (short) 1, ' ', (-1) };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13405");
        int[] intArray4 = new int[] { 0, (byte) 0, 1, (short) 0 };
        int[] intArray9 = new int[] { 0, (byte) 0, 1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13406");
        int[] intArray6 = new int[] { 10, (short) 10, (short) 1, (byte) 10, '4', (byte) 100 };
        int[] intArray13 = new int[] { 10, (short) 10, (short) 1, (byte) 10, '4', (byte) 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 1, 10, 52, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10, 1, 10, 52, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13407");
        int[] intArray5 = new int[] { (byte) 0, (byte) -1, (short) 0, (byte) 100, (-1) };
        int[] intArray11 = new int[] { (byte) 0, (byte) -1, (short) 0, (byte) 100, (-1) };
        int[] intArray17 = new int[] { (byte) 0, (byte) -1, (short) 0, (byte) 100, (-1) };
        int[] intArray23 = new int[] { (byte) 0, (byte) -1, (short) 0, (byte) 100, (-1) };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, -1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, -1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13408");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, (byte) 0 };
        int[] intArray7 = new int[] { (short) 100, (byte) -1, (byte) 0 };
        int[] intArray11 = new int[] { (short) 100, (byte) -1, (byte) 0 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13409");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[] intArray9 = new int[] { (short) 1 };
        int[] intArray11 = new int[] { (short) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13410");
        int[] intArray3 = new int[] { (byte) 100, (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 100, (byte) -1, (byte) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13411");
        int[] intArray3 = new int[] { (short) 1, 0, (byte) 0 };
        int[] intArray7 = new int[] { (short) 1, 0, (byte) 0 };
        int[] intArray11 = new int[] { (short) 1, 0, (byte) 0 };
        int[] intArray15 = new int[] { (short) 1, 0, (byte) 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13412");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13413");
        int[] intArray2 = new int[] { 10, ' ' };
        int[] intArray5 = new int[] { 10, ' ' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13414");
        int[] intArray2 = new int[] { (short) -1, (byte) 100 };
        int[] intArray5 = new int[] { (short) -1, (byte) 100 };
        int[] intArray8 = new int[] { (short) -1, (byte) 100 };
        int[] intArray11 = new int[] { (short) -1, (byte) 100 };
        int[] intArray14 = new int[] { (short) -1, (byte) 100 };
        int[] intArray17 = new int[] { (short) -1, (byte) 100 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13415");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (byte) -1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13416");
        int[] intArray3 = new int[] { (short) -1, 'a', 10 };
        int[] intArray7 = new int[] { (short) -1, 'a', 10 };
        int[] intArray11 = new int[] { (short) -1, 'a', 10 };
        int[] intArray15 = new int[] { (short) -1, 'a', 10 };
        int[] intArray19 = new int[] { (short) -1, 'a', 10 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13417");
        int[] intArray2 = new int[] { (short) 10, ' ' };
        int[] intArray5 = new int[] { (short) 10, ' ' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13418");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13419");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0 };
        int[] intArray11 = new int[] { (byte) 0 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13420");
        int[] intArray2 = new int[] { 100, (byte) -1 };
        int[] intArray5 = new int[] { 100, (byte) -1 };
        int[] intArray8 = new int[] { 100, (byte) -1 };
        int[] intArray11 = new int[] { 100, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13421");
        int[] intArray1 = new int[] { (byte) 1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test13422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13422");
        int[] intArray4 = new int[] { (-1), '#', ' ', (-1) };
        int[] intArray9 = new int[] { (-1), '#', ' ', (-1) };
        int[] intArray14 = new int[] { (-1), '#', ' ', (-1) };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test13423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13423");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test13424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13424");
        int[] intArray5 = new int[] { '#', (short) 1, ' ', 'a', 0 };
        int[] intArray11 = new int[] { '#', (short) 1, ' ', 'a', 0 };
        int[] intArray17 = new int[] { '#', (short) 1, ' ', 'a', 0 };
        int[] intArray23 = new int[] { '#', (short) 1, ' ', 'a', 0 };
        int[] intArray29 = new int[] { '#', (short) 1, ' ', 'a', 0 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1, 32, 97, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 1, 32, 97, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 1, 32, 97, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 1, 32, 97, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 1, 32, 97, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13425");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test13426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13426");
        int[] intArray5 = new int[] { (byte) -1, 0, (short) -1, 10, (short) -1 };
        int[] intArray11 = new int[] { (byte) -1, 0, (short) -1, 10, (short) -1 };
        int[] intArray17 = new int[] { (byte) -1, 0, (short) -1, 10, (short) -1 };
        int[] intArray23 = new int[] { (byte) -1, 0, (short) -1, 10, (short) -1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13427");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13428");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13429");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { '#' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13430");
        int[] intArray3 = new int[] { 1, 1, (byte) 10 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13431");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13432");
        int[] intArray2 = new int[] { (byte) -1, '#' };
        int[] intArray5 = new int[] { (byte) -1, '#' };
        int[] intArray8 = new int[] { (byte) -1, '#' };
        int[] intArray11 = new int[] { (byte) -1, '#' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 35]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13433");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13434");
        int[] intArray3 = new int[] { '4', (byte) 0, 0 };
        int[] intArray7 = new int[] { '4', (byte) 0, 0 };
        int[] intArray11 = new int[] { '4', (byte) 0, 0 };
        int[] intArray15 = new int[] { '4', (byte) 0, 0 };
        int[] intArray19 = new int[] { '4', (byte) 0, 0 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13435");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13436");
        int[] intArray5 = new int[] { (short) 100, (short) 0, (short) 10, (byte) 0, '4' };
        int[] intArray11 = new int[] { (short) 100, (short) 0, (short) 10, (byte) 0, '4' };
        int[] intArray17 = new int[] { (short) 100, (short) 0, (short) 10, (byte) 0, '4' };
        int[] intArray23 = new int[] { (short) 100, (short) 0, (short) 10, (byte) 0, '4' };
        int[] intArray29 = new int[] { (short) 100, (short) 0, (short) 10, (byte) 0, '4' };
        int[] intArray35 = new int[] { (short) 100, (short) 0, (short) 10, (byte) 0, '4' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13437");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13438");
        int[] intArray3 = new int[] { (short) -1, (short) 0, (byte) 100 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13439");
        int[] intArray6 = new int[] { '#', ' ', (byte) 10, 10, 10, (byte) 1 };
        int[] intArray13 = new int[] { '#', ' ', (byte) 10, 10, 10, (byte) 1 };
        int[] intArray20 = new int[] { '#', ' ', (byte) 10, 10, 10, (byte) 1 };
        int[] intArray27 = new int[] { '#', ' ', (byte) 10, 10, 10, (byte) 1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 32, 10, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 32, 10, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 32, 10, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 32, 10, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13440");
        int[] intArray6 = new int[] { '#', (-1), (byte) 1, (short) 1, (-1), (byte) 0 };
        int[] intArray13 = new int[] { '#', (-1), (byte) 1, (short) 1, (-1), (byte) 0 };
        int[] intArray20 = new int[] { '#', (-1), (byte) 1, (short) 1, (-1), (byte) 0 };
        int[] intArray27 = new int[] { '#', (-1), (byte) 1, (short) 1, (-1), (byte) 0 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 1, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 1, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, -1, 1, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, -1, 1, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13441");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test13442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13442");
        int[] intArray4 = new int[] { '#', ' ', (byte) -1, (-1) };
        int[] intArray9 = new int[] { '#', ' ', (byte) -1, (-1) };
        int[] intArray14 = new int[] { '#', ' ', (byte) -1, (-1) };
        int[] intArray19 = new int[] { '#', ' ', (byte) -1, (-1) };
        int[] intArray24 = new int[] { '#', ' ', (byte) -1, (-1) };
        int[] intArray29 = new int[] { '#', ' ', (byte) -1, (-1) };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13443");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test13444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13444");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        int[] intArray5 = new int[] { 10 };
        int[] intArray7 = new int[] { 10 };
        int[] intArray9 = new int[] { 10 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13445");
        int[] intArray6 = new int[] { '4', '4', 'a', (byte) 0, (short) 0, (short) 100 };
        int[] intArray13 = new int[] { '4', '4', 'a', (byte) 0, (short) 0, (short) 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 52, 97, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 52, 97, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13446");
        int[] intArray2 = new int[] { ' ', (short) 0 };
        int[] intArray5 = new int[] { ' ', (short) 0 };
        int[] intArray8 = new int[] { ' ', (short) 0 };
        int[] intArray11 = new int[] { ' ', (short) 0 };
        int[] intArray14 = new int[] { ' ', (short) 0 };
        int[] intArray17 = new int[] { ' ', (short) 0 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13447");
        int[] intArray5 = new int[] { (short) -1, (byte) 1, 100, 10, 'a' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13448");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[] intArray7 = new int[] { (-1) };
        int[] intArray9 = new int[] { (-1) };
        int[] intArray11 = new int[] { (-1) };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13449");
        int[] intArray4 = new int[] { 'a', 100, (byte) 1, 1 };
        int[] intArray9 = new int[] { 'a', 100, (byte) 1, 1 };
        int[] intArray14 = new int[] { 'a', 100, (byte) 1, 1 };
        int[] intArray19 = new int[] { 'a', 100, (byte) 1, 1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13450");
        int[] intArray6 = new int[] { '#', (short) 0, (byte) 10, ' ', '#', 10 };
        int[] intArray13 = new int[] { '#', (short) 0, (byte) 10, ' ', '#', 10 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0, 10, 32, 35, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0, 10, 32, 35, 10]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13451");
        int[] intArray6 = new int[] { '4', (byte) 100, 'a', (-1), (short) 100, (byte) 0 };
        int[] intArray13 = new int[] { '4', (byte) 100, 'a', (-1), (short) 100, (byte) 0 };
        int[] intArray20 = new int[] { '4', (byte) 100, 'a', (-1), (short) 100, (byte) 0 };
        int[] intArray27 = new int[] { '4', (byte) 100, 'a', (-1), (short) 100, (byte) 0 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 97, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 100, 97, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 100, 97, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 100, 97, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13452");
        int[] intArray3 = new int[] { 0, '#', ' ' };
        int[] intArray7 = new int[] { 0, '#', ' ' };
        int[] intArray11 = new int[] { 0, '#', ' ' };
        int[] intArray15 = new int[] { 0, '#', ' ' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 35, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 35, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 35, 32]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test13453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13453");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13454");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        int[] intArray5 = new int[] { 10 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13455");
        int[] intArray2 = new int[] { 'a', (short) 1 };
        int[] intArray5 = new int[] { 'a', (short) 1 };
        int[] intArray8 = new int[] { 'a', (short) 1 };
        int[] intArray11 = new int[] { 'a', (short) 1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13456");
        int[] intArray2 = new int[] { (short) 1, (byte) 100 };
        int[] intArray5 = new int[] { (short) 1, (byte) 100 };
        int[] intArray8 = new int[] { (short) 1, (byte) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13457");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a' };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13458");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, (-1), 1 };
        int[] intArray9 = new int[] { (byte) 10, (byte) -1, (-1), 1 };
        int[] intArray14 = new int[] { (byte) 10, (byte) -1, (-1), 1 };
        int[] intArray19 = new int[] { (byte) 10, (byte) -1, (-1), 1 };
        int[] intArray24 = new int[] { (byte) 10, (byte) -1, (-1), 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13459");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13460");
        int[] intArray6 = new int[] { 0, (short) 1, 'a', '4', (short) 1, (short) -1 };
        int[] intArray13 = new int[] { 0, (short) 1, 'a', '4', (short) 1, (short) -1 };
        int[] intArray20 = new int[] { 0, (short) 1, 'a', '4', (short) 1, (short) -1 };
        int[] intArray27 = new int[] { 0, (short) 1, 'a', '4', (short) 1, (short) -1 };
        int[] intArray34 = new int[] { 0, (short) 1, 'a', '4', (short) 1, (short) -1 };
        int[] intArray41 = new int[] { 0, (short) 1, 'a', '4', (short) 1, (short) -1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 97, 52, 1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 97, 52, 1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 97, 52, 1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 1, 97, 52, 1, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 1, 97, 52, 1, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1, 97, 52, 1, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test13461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13461");
        int[] intArray6 = new int[] { (short) -1, 0, ' ', 'a', (byte) 10, 0 };
        int[] intArray13 = new int[] { (short) -1, 0, ' ', 'a', (byte) 10, 0 };
        int[] intArray20 = new int[] { (short) -1, 0, ' ', 'a', (byte) 10, 0 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 32, 97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 0, 32, 97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 32, 97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13462");
        int[] intArray3 = new int[] { 1, (short) 1, 'a' };
        int[] intArray7 = new int[] { 1, (short) 1, 'a' };
        int[] intArray11 = new int[] { 1, (short) 1, 'a' };
        int[] intArray15 = new int[] { 1, (short) 1, 'a' };
        int[] intArray19 = new int[] { 1, (short) 1, 'a' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13463");
        int[] intArray6 = new int[] { '#', ' ', 0, 100, 'a', (byte) 100 };
        int[] intArray13 = new int[] { '#', ' ', 0, 100, 'a', (byte) 100 };
        int[] intArray20 = new int[] { '#', ' ', 0, 100, 'a', (byte) 100 };
        int[] intArray27 = new int[] { '#', ' ', 0, 100, 'a', (byte) 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 32, 0, 100, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 32, 0, 100, 97, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 32, 0, 100, 97, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 32, 0, 100, 97, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test13464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13464");
        int[] intArray5 = new int[] { 0, 100, (byte) 10, (short) -1, (byte) -1 };
        int[] intArray11 = new int[] { 0, 100, (byte) 10, (short) -1, (byte) -1 };
        int[] intArray17 = new int[] { 0, 100, (byte) 10, (short) -1, (byte) -1 };
        int[] intArray23 = new int[] { 0, 100, (byte) 10, (short) -1, (byte) -1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 100, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 100, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13465");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (byte) -1, 'a' };
        int[] intArray9 = new int[] { (short) 0, (short) 100, (byte) -1, 'a' };
        int[] intArray14 = new int[] { (short) 0, (short) 100, (byte) -1, 'a' };
        int[] intArray19 = new int[] { (short) 0, (short) 100, (byte) -1, 'a' };
        int[] intArray24 = new int[] { (short) 0, (short) 100, (byte) -1, 'a' };
        int[] intArray29 = new int[] { (short) 0, (short) 100, (byte) -1, 'a' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100, -1, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 100, -1, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 100, -1, 97]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 100, -1, 97]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13466");
        int[] intArray2 = new int[] { (-1), 10 };
        int[] intArray5 = new int[] { (-1), 10 };
        int[] intArray8 = new int[] { (-1), 10 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test13467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13467");
        int[] intArray4 = new int[] { 1, 'a', ' ', 10 };
        int[] intArray9 = new int[] { 1, 'a', ' ', 10 };
        int[] intArray14 = new int[] { 1, 'a', ' ', 10 };
        int[] intArray19 = new int[] { 1, 'a', ' ', 10 };
        int[] intArray24 = new int[] { 1, 'a', ' ', 10 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 97, 32, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 97, 32, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 97, 32, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 97, 32, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 97, 32, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test13468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13468");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13469");
        int[] intArray6 = new int[] { (byte) 100, 1, 0, '#', (short) -1, (byte) -1 };
        int[] intArray13 = new int[] { (byte) 100, 1, 0, '#', (short) -1, (byte) -1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 0, 35, -1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 0, 35, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13470");
        int[] intArray5 = new int[] { (short) 10, '#', (short) 1, (-1), '4' };
        int[] intArray11 = new int[] { (short) 10, '#', (short) 1, (-1), '4' };
        int[] intArray17 = new int[] { (short) 10, '#', (short) 1, (-1), '4' };
        int[] intArray23 = new int[] { (short) 10, '#', (short) 1, (-1), '4' };
        int[] intArray29 = new int[] { (short) 10, '#', (short) 1, (-1), '4' };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 35, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 35, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 35, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 35, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13471");
        int[] intArray2 = new int[] { (short) 100, '#' };
        int[] intArray5 = new int[] { (short) 100, '#' };
        int[] intArray8 = new int[] { (short) 100, '#' };
        int[] intArray11 = new int[] { (short) 100, '#' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13472");
        int[] intArray6 = new int[] { 0, (byte) 1, 'a', (byte) -1, (short) 0, 100 };
        int[] intArray13 = new int[] { 0, (byte) 1, 'a', (byte) -1, (short) 0, 100 };
        int[] intArray20 = new int[] { 0, (byte) 1, 'a', (byte) -1, (short) 0, 100 };
        int[] intArray27 = new int[] { 0, (byte) 1, 'a', (byte) -1, (short) 0, 100 };
        int[] intArray34 = new int[] { 0, (byte) 1, 'a', (byte) -1, (short) 0, 100 };
        int[] intArray41 = new int[] { 0, (byte) 1, 'a', (byte) -1, (short) 0, 100 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 97, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 97, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 97, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 1, 97, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 1, 97, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1, 97, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test13473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13473");
        int[] intArray5 = new int[] { (byte) 1, (short) -1, (byte) 0, (byte) 100, (short) 100 };
        int[] intArray11 = new int[] { (byte) 1, (short) -1, (byte) 0, (byte) 100, (short) 100 };
        int[] intArray17 = new int[] { (byte) 1, (short) -1, (byte) 0, (byte) 100, (short) 100 };
        int[] intArray23 = new int[] { (byte) 1, (short) -1, (byte) 0, (byte) 100, (short) 100 };
        int[] intArray29 = new int[] { (byte) 1, (short) -1, (byte) 0, (byte) 100, (short) 100 };
        int[] intArray35 = new int[] { (byte) 1, (short) -1, (byte) 0, (byte) 100, (short) 100 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, -1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, -1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, -1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, -1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test13474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13474");
        int[] intArray6 = new int[] { 100, ' ', (short) 0, (short) 1, (-1), (short) 100 };
        int[] intArray13 = new int[] { 100, ' ', (short) 0, (short) 1, (-1), (short) 100 };
        int[] intArray20 = new int[] { 100, ' ', (short) 0, (short) 1, (-1), (short) 100 };
        int[] intArray27 = new int[] { 100, ' ', (short) 0, (short) 1, (-1), (short) 100 };
        int[] intArray34 = new int[] { 100, ' ', (short) 0, (short) 1, (-1), (short) 100 };
        int[] intArray41 = new int[] { 100, ' ', (short) 0, (short) 1, (-1), (short) 100 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 0, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, 0, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 32, 0, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 32, 0, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 32, 0, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 32, 0, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test13475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13475");
        int[] intArray2 = new int[] { (byte) -1, (short) 100 };
        int[] intArray5 = new int[] { (byte) -1, (short) 100 };
        int[] intArray8 = new int[] { (byte) -1, (short) 100 };
        int[] intArray11 = new int[] { (byte) -1, (short) 100 };
        int[] intArray14 = new int[] { (byte) -1, (short) 100 };
        int[] intArray17 = new int[] { (byte) -1, (short) 100 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13476");
        int[] intArray3 = new int[] { 1, 100, (byte) 100 };
        int[] intArray7 = new int[] { 1, 100, (byte) 100 };
        int[] intArray11 = new int[] { 1, 100, (byte) 100 };
        int[] intArray15 = new int[] { 1, 100, (byte) 100 };
        int[] intArray19 = new int[] { 1, 100, (byte) 100 };
        int[] intArray23 = new int[] { 1, 100, (byte) 100 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13477");
        int[] intArray5 = new int[] { (-1), 1, (short) 10, '#', (-1) };
        int[] intArray11 = new int[] { (-1), 1, (short) 10, '#', (-1) };
        int[] intArray17 = new int[] { (-1), 1, (short) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test13478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13478");
        int[] intArray5 = new int[] { (short) 1, 0, '4', 0, (short) -1 };
        int[] intArray11 = new int[] { (short) 1, 0, '4', 0, (short) -1 };
        int[] intArray17 = new int[] { (short) 1, 0, '4', 0, (short) -1 };
        int[] intArray23 = new int[] { (short) 1, 0, '4', 0, (short) -1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test13479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13479");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        int[] intArray9 = new int[] { (short) 100 };
        int[] intArray11 = new int[] { (short) 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13480");
        int[] intArray3 = new int[] { (-1), (-1), '4' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test13481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13481");
        int[] intArray6 = new int[] { (short) 100, (-1), (short) 100, (short) 1, (byte) 10, (short) 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 100, 1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13482");
        int[] intArray6 = new int[] { (short) 1, (byte) 10, 100, (byte) 1, (short) -1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (byte) 10, 100, (byte) 1, (short) -1, (-1) };
        int[] intArray20 = new int[] { (short) 1, (byte) 10, 100, (byte) 1, (short) -1, (-1) };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 100, 1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 10, 100, 1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 10, 100, 1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13483");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 100, (short) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13484");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[] intArray5 = new int[] { 0 };
        int[] intArray7 = new int[] { 0 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13485");
        int[] intArray6 = new int[] { '#', 1, (short) 1, 100, (byte) 10, (byte) 0 };
        int[] intArray13 = new int[] { '#', 1, (short) 1, 100, (byte) 10, (byte) 0 };
        int[] intArray20 = new int[] { '#', 1, (short) 1, 100, (byte) 10, (byte) 0 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, 1, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 1, 1, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 1, 1, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13486");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[] intArray7 = new int[] { (-1) };
        int[] intArray9 = new int[] { (-1) };
        int[] intArray11 = new int[] { (-1) };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13487");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[] intArray7 = new int[] { (-1) };
        int[] intArray9 = new int[] { (-1) };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test13488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13488");
        int[] intArray4 = new int[] { 1, (short) -1, (-1), 1 };
        int[] intArray9 = new int[] { 1, (short) -1, (-1), 1 };
        int[] intArray14 = new int[] { 1, (short) -1, (-1), 1 };
        int[] intArray19 = new int[] { 1, (short) -1, (-1), 1 };
        int[] intArray24 = new int[] { 1, (short) -1, (-1), 1 };
        int[] intArray29 = new int[] { 1, (short) -1, (-1), 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test13489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13489");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test13490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13490");
        int[] intArray4 = new int[] { (short) 1, (short) 10, (short) -1, (short) -1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test13491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13491");
        int[] intArray6 = new int[] { '#', 1, (short) -1, '#', (short) 100, (short) 100 };
        int[] intArray13 = new int[] { '#', 1, (short) -1, '#', (short) 100, (short) 100 };
        int[] intArray20 = new int[] { '#', 1, (short) -1, '#', (short) 100, (short) 100 };
        int[] intArray27 = new int[] { '#', 1, (short) -1, '#', (short) 100, (short) 100 };
        int[] intArray34 = new int[] { '#', 1, (short) -1, '#', (short) 100, (short) 100 };
        int[] intArray41 = new int[] { '#', 1, (short) -1, '#', (short) 100, (short) 100 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, -1, 35, 100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 1, -1, 35, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 1, -1, 35, 100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 1, -1, 35, 100, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 1, -1, 35, 100, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 1, -1, 35, 100, 100]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test13492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13492");
        int[] intArray4 = new int[] { (short) 10, ' ', 'a', 1 };
        int[] intArray9 = new int[] { (short) 10, ' ', 'a', 1 };
        int[] intArray14 = new int[] { (short) 10, ' ', 'a', 1 };
        int[] intArray19 = new int[] { (short) 10, ' ', 'a', 1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 32, 97, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 97, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 32, 97, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 32, 97, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test13493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13493");
        int[] intArray6 = new int[] { (byte) 1, (short) -1, (short) -1, (byte) 0, 1, 'a' };
        int[] intArray13 = new int[] { (byte) 1, (short) -1, (short) -1, (byte) 0, 1, 'a' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, -1, 0, 1, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, -1, 0, 1, 97]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test13494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13494");
        int[] intArray6 = new int[] { 0, ' ', (short) 10, 100, 1, ' ' };
        int[] intArray13 = new int[] { 0, ' ', (short) 10, 100, 1, ' ' };
        int[] intArray20 = new int[] { 0, ' ', (short) 10, 100, 1, ' ' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 32, 10, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 32, 10, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 32, 10, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test13495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13495");
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, 0, ' ', (-1) };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 0, 32, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test13496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13496");
        int[] intArray6 = new int[] { 0, (-1), (short) 10, (byte) -1, (byte) 1, (short) 1 };
        int[] intArray13 = new int[] { 0, (-1), (short) 10, (byte) -1, (byte) 1, (short) 1 };
        int[] intArray20 = new int[] { 0, (-1), (short) 10, (byte) -1, (byte) 1, (short) 1 };
        int[] intArray27 = new int[] { 0, (-1), (short) 10, (byte) -1, (byte) 1, (short) 1 };
        int[] intArray34 = new int[] { 0, (-1), (short) 10, (byte) -1, (byte) 1, (short) 1 };
        int[] intArray41 = new int[] { 0, (-1), (short) 10, (byte) -1, (byte) 1, (short) 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, 10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, -1, 10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, -1, 10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, -1, 10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test13497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13497");
        int[] intArray3 = new int[] { (byte) -1, (byte) 0, 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 0, 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test13498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13498");
        int[] intArray6 = new int[] { (short) 0, ' ', (byte) 1, ' ', (short) 10, 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 32, 1, 32, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test13499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13499");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        int[] intArray5 = new int[] { 10 };
        int[] intArray7 = new int[] { 10 };
        int[] intArray9 = new int[] { 10 };
        int[] intArray11 = new int[] { 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test13500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13500");
        int[] intArray4 = new int[] { '#', '4', 0, (-1) };
        int[] intArray9 = new int[] { '#', '4', 0, (-1) };
        int[] intArray14 = new int[] { '#', '4', 0, (-1) };
        int[] intArray19 = new int[] { '#', '4', 0, (-1) };
        int[] intArray24 = new int[] { '#', '4', 0, (-1) };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35, 52, 0, -1]");
        org.junit.Assert.assertNotNull(intArray25);
    }
}

