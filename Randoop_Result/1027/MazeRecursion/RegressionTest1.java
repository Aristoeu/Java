package MazeRecursion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        int[] intArray6 = new int[] { (byte) 100, (-1), (-1), (short) 10, (short) -1, ' ' };
        int[] intArray13 = new int[] { (byte) 100, (-1), (-1), (short) 10, (short) -1, ' ' };
        int[] intArray20 = new int[] { (byte) 100, (-1), (-1), (short) 10, (short) -1, ' ' };
        int[] intArray27 = new int[] { (byte) 100, (-1), (-1), (short) 10, (short) -1, ' ' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, -1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, -1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, -1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, -1, -1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        int[] intArray6 = new int[] { '4', 'a', (short) 100, 'a', (short) 100, (short) 100 };
        int[] intArray13 = new int[] { '4', 'a', (short) 100, 'a', (short) 100, (short) 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 97, 100, 97, 100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 97, 100, 97, 100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        int[] intArray6 = new int[] { 10, (short) 10, (short) 1, (byte) 10, (short) 1, '4' };
        int[] intArray13 = new int[] { 10, (short) 10, (short) 1, (byte) 10, (short) 1, '4' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 1, 10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10, 1, 10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        int[] intArray6 = new int[] { (short) 0, ' ', (byte) -1, (short) 100, (short) 1, '#' };
        int[] intArray13 = new int[] { (short) 0, ' ', (byte) -1, (short) 100, (short) 1, '#' };
        int[] intArray20 = new int[] { (short) 0, ' ', (byte) -1, (short) 100, (short) 1, '#' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 32, -1, 100, 1, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 32, -1, 100, 1, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 32, -1, 100, 1, 35]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int[] intArray5 = new int[] { '4', (short) 1 };
        int[] intArray8 = new int[] { '4', (short) 1 };
        int[] intArray11 = new int[] { '4', (short) 1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        int[] intArray6 = new int[] { 100, (short) -1, (short) -1, (short) 1, (byte) 100, (short) 1 };
        int[] intArray13 = new int[] { 100, (short) -1, (short) -1, (short) 1, (byte) 100, (short) 1 };
        int[] intArray20 = new int[] { 100, (short) -1, (short) -1, (short) 1, (byte) 100, (short) 1 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        int[] intArray2 = new int[] { 1, (short) -1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        int[] intArray2 = new int[] { 10, (short) 0 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        int[] intArray4 = new int[] { (short) 10, '4', '4', (byte) -1 };
        int[] intArray9 = new int[] { (short) 10, '4', '4', (byte) -1 };
        int[] intArray14 = new int[] { (short) 10, '4', '4', (byte) -1 };
        int[] intArray19 = new int[] { (short) 10, '4', '4', (byte) -1 };
        int[] intArray24 = new int[] { (short) 10, '4', '4', (byte) -1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        int[] intArray5 = new int[] { (byte) 1, 10, '4', (short) -1, 0 };
        int[] intArray11 = new int[] { (byte) 1, 10, '4', (short) -1, 0 };
        int[] intArray17 = new int[] { (byte) 1, 10, '4', (short) -1, 0 };
        int[] intArray23 = new int[] { (byte) 1, 10, '4', (short) -1, 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 52, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 52, -1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, 52, -1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 10, 52, -1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        int[] intArray4 = new int[] { 100, 1, 'a', (-1) };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, -1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { (short) 100, (byte) -1, (byte) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        int[] intArray2 = new int[] { (byte) 10, 'a' };
        int[] intArray5 = new int[] { (byte) 10, 'a' };
        int[] intArray8 = new int[] { (byte) 10, 'a' };
        int[] intArray11 = new int[] { (byte) 10, 'a' };
        int[] intArray14 = new int[] { (byte) 10, 'a' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        int[] intArray5 = new int[] { 0, (byte) 100, '4', (short) 10, (short) 10 };
        int[] intArray11 = new int[] { 0, (byte) 100, '4', (short) 10, (short) 10 };
        int[] intArray17 = new int[] { 0, (byte) 100, '4', (short) 10, (short) 10 };
        int[] intArray23 = new int[] { 0, (byte) 100, '4', (short) 10, (short) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 52, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100, 52, 10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 100, 52, 10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 100, 52, 10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        int[] intArray2 = new int[] { '#', (short) 10 };
        int[] intArray5 = new int[] { '#', (short) 10 };
        int[] intArray8 = new int[] { '#', (short) 10 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 10]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        int[] intArray5 = new int[] { 10 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        int[] intArray4 = new int[] { (byte) 10, 10, (short) 0, (byte) 1 };
        int[] intArray9 = new int[] { (byte) 10, 10, (short) 0, (byte) 1 };
        int[] intArray14 = new int[] { (byte) 10, 10, (short) 0, (byte) 1 };
        int[] intArray19 = new int[] { (byte) 10, 10, (short) 0, (byte) 1 };
        int[] intArray24 = new int[] { (byte) 10, 10, (short) 0, (byte) 1 };
        int[] intArray29 = new int[] { (byte) 10, 10, (short) 0, (byte) 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[] intArray7 = new int[] { 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        int[] intArray6 = new int[] { 'a', 100, '#', 0, (byte) 0, '4' };
        int[] intArray13 = new int[] { 'a', 100, '#', 0, (byte) 0, '4' };
        int[] intArray20 = new int[] { 'a', 100, '#', 0, (byte) 0, '4' };
        int[] intArray27 = new int[] { 'a', 100, '#', 0, (byte) 0, '4' };
        int[] intArray34 = new int[] { 'a', 100, '#', 0, (byte) 0, '4' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 35, 0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 35, 0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 100, 35, 0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 100, 35, 0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 100, 35, 0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        int[] intArray3 = new int[] { ' ', 10, ' ' };
        int[] intArray7 = new int[] { ' ', 10, ' ' };
        int[] intArray11 = new int[] { ' ', 10, ' ' };
        int[] intArray15 = new int[] { ' ', 10, ' ' };
        int[] intArray19 = new int[] { ' ', 10, ' ' };
        int[] intArray23 = new int[] { ' ', 10, ' ' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 10, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 32]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        int[] intArray6 = new int[] { (short) 100, (short) -1, (byte) 100, 10, (short) 1, (byte) 10 };
        int[] intArray13 = new int[] { (short) 100, (short) -1, (byte) 100, 10, (short) 1, (byte) 10 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 100, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 100, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        int[] intArray4 = new int[] { (byte) -1, 10, '#', 1 };
        int[] intArray9 = new int[] { (byte) -1, 10, '#', 1 };
        int[] intArray14 = new int[] { (byte) -1, 10, '#', 1 };
        int[] intArray19 = new int[] { (byte) -1, 10, '#', 1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 35, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10, 35, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 35, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 35, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        int[] intArray4 = new int[] { (byte) -1, 100, (byte) 0, (byte) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        int[] intArray5 = new int[] { '4', ' ', (short) 0, (short) 10, (-1) };
        int[] intArray11 = new int[] { '4', ' ', (short) 0, (short) 10, (-1) };
        int[] intArray17 = new int[] { '4', ' ', (short) 0, (short) 10, (-1) };
        int[] intArray23 = new int[] { '4', ' ', (short) 0, (short) 10, (-1) };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        int[] intArray5 = new int[] { '4', '#', '4', '#', (byte) 10 };
        int[] intArray11 = new int[] { '4', '#', '4', '#', (byte) 10 };
        int[] intArray17 = new int[] { '4', '#', '4', '#', (byte) 10 };
        int[] intArray23 = new int[] { '4', '#', '4', '#', (byte) 10 };
        int[] intArray29 = new int[] { '4', '#', '4', '#', (byte) 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 35, 52, 35, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 52, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 35, 52, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 35, 52, 35, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 35, 52, 35, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = new int[] { 100 };
        int[] intArray9 = new int[] { 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        int[] intArray3 = new int[] { (short) 1, (short) 1, 0 };
        int[] intArray7 = new int[] { (short) 1, (short) 1, 0 };
        int[] intArray11 = new int[] { (short) 1, (short) 1, 0 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        int[] intArray5 = new int[] { (short) 0, 'a', 10, 1, 10 };
        int[] intArray11 = new int[] { (short) 0, 'a', 10, 1, 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 97, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        int[] intArray5 = new int[] { (byte) 0, '#', 10, (short) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 0, '#', 10, (short) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 0, '#', 10, (short) 1, (-1) };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 35, 10, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, 10, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 35, 10, 1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        int[] intArray3 = new int[] { (-1), (byte) 100, (byte) -1 };
        int[] intArray7 = new int[] { (-1), (byte) 100, (byte) -1 };
        int[] intArray11 = new int[] { (-1), (byte) 100, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        int[] intArray4 = new int[] { 1, (short) 100, (byte) 10, (byte) 10 };
        int[] intArray9 = new int[] { 1, (short) 100, (byte) 10, (byte) 10 };
        int[] intArray14 = new int[] { 1, (short) 100, (byte) 10, (byte) 10 };
        int[] intArray19 = new int[] { 1, (short) 100, (byte) 10, (byte) 10 };
        int[] intArray24 = new int[] { 1, (short) 100, (byte) 10, (byte) 10 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a' };
        int[] intArray9 = new int[] { 'a' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        int[] intArray3 = new int[] { 10, (short) 10, 0 };
        int[] intArray7 = new int[] { 10, (short) 10, 0 };
        int[] intArray11 = new int[] { 10, (short) 10, 0 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        int[] intArray6 = new int[] { (short) 1, (short) 0, ' ', (byte) 0, (byte) 0, (short) 100 };
        int[] intArray13 = new int[] { (short) 1, (short) 0, ' ', (byte) 0, (byte) 0, (short) 100 };
        int[] intArray20 = new int[] { (short) 1, (short) 0, ' ', (byte) 0, (byte) 0, (short) 100 };
        int[] intArray27 = new int[] { (short) 1, (short) 0, ' ', (byte) 0, (byte) 0, (short) 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 32, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 32, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 32, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 32, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        int[] intArray4 = new int[] { (byte) 100, ' ', 100, 'a' };
        int[] intArray9 = new int[] { (byte) 100, ' ', 100, 'a' };
        int[] intArray14 = new int[] { (byte) 100, ' ', 100, 'a' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, 100, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 32, 100, 97]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, ' ' };
        int[] intArray7 = new int[] { (byte) 10, (byte) 10, ' ' };
        int[] intArray11 = new int[] { (byte) 10, (byte) 10, ' ' };
        int[] intArray15 = new int[] { (byte) 10, (byte) 10, ' ' };
        int[] intArray19 = new int[] { (byte) 10, (byte) 10, ' ' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        int[] intArray6 = new int[] { 1, (short) 10, (short) -1, '4', 'a', ' ' };
        int[] intArray13 = new int[] { 1, (short) 10, (short) -1, '4', 'a', ' ' };
        int[] intArray20 = new int[] { 1, (short) 10, (short) -1, '4', 'a', ' ' };
        int[] intArray27 = new int[] { 1, (short) 10, (short) -1, '4', 'a', ' ' };
        int[] intArray34 = new int[] { 1, (short) 10, (short) -1, '4', 'a', ' ' };
        int[] intArray41 = new int[] { 1, (short) 10, (short) -1, '4', 'a', ' ' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 52, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 10, -1, 52, 97, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 10, -1, 52, 97, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 10, -1, 52, 97, 32]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 10, -1, 52, 97, 32]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 10, -1, 52, 97, 32]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        int[] intArray6 = new int[] { (short) 0, (short) 10, 'a', (byte) 1, (byte) 1, (byte) 1 };
        int[] intArray13 = new int[] { (short) 0, (short) 10, 'a', (byte) 1, (byte) 1, (byte) 1 };
        int[] intArray20 = new int[] { (short) 0, (short) 10, 'a', (byte) 1, (byte) 1, (byte) 1 };
        int[] intArray27 = new int[] { (short) 0, (short) 10, 'a', (byte) 1, (byte) 1, (byte) 1 };
        int[] intArray34 = new int[] { (short) 0, (short) 10, 'a', (byte) 1, (byte) 1, (byte) 1 };
        int[] intArray41 = new int[] { (short) 0, (short) 10, 'a', (byte) 1, (byte) 1, (byte) 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 97, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 97, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 10, 97, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 97, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 10, 97, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 10, 97, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        int[] intArray3 = new int[] { 'a', (byte) 10, (byte) 0 };
        int[] intArray7 = new int[] { 'a', (byte) 10, (byte) 0 };
        int[] intArray11 = new int[] { 'a', (byte) 10, (byte) 0 };
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        int[] intArray9 = new int[] { (short) 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        int[] intArray4 = new int[] { (short) -1, ' ', 0, (short) -1 };
        int[] intArray9 = new int[] { (short) -1, ' ', 0, (short) -1 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        int[] intArray5 = new int[] { ' ', 'a', (byte) 1, ' ', ' ' };
        int[] intArray11 = new int[] { ' ', 'a', (byte) 1, ' ', ' ' };
        int[] intArray17 = new int[] { ' ', 'a', (byte) 1, ' ', ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 97, 1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 97, 1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 97, 1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        int[] intArray2 = new int[] { (short) 100, (short) 1 };
        int[] intArray5 = new int[] { (short) 100, (short) 1 };
        int[] intArray8 = new int[] { (short) 100, (short) 1 };
        int[] intArray11 = new int[] { (short) 100, (short) 1 };
        int[] intArray14 = new int[] { (short) 100, (short) 1 };
        int[] intArray17 = new int[] { (short) 100, (short) 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        int[] intArray4 = new int[] { (short) -1, 0, 'a', '4' };
        int[] intArray9 = new int[] { (short) -1, 0, 'a', '4' };
        int[] intArray14 = new int[] { (short) -1, 0, 'a', '4' };
        int[] intArray19 = new int[] { (short) -1, 0, 'a', '4' };
        int[] intArray24 = new int[] { (short) -1, 0, 'a', '4' };
        int[] intArray29 = new int[] { (short) -1, 0, 'a', '4' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 97, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 0, 97, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 97, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 0, 97, 52]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 0, 97, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 0, 97, 52]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        int[] intArray2 = new int[] { (byte) 1, 10 };
        int[] intArray5 = new int[] { (byte) 1, 10 };
        int[] intArray8 = new int[] { (byte) 1, 10 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        int[] intArray1 = new int[] { ' ' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        int[] intArray5 = new int[] { (byte) 10, 1, '#', (short) 1, (short) 1 };
        int[] intArray11 = new int[] { (byte) 10, 1, '#', (short) 1, (short) 1 };
        int[] intArray17 = new int[] { (byte) 10, 1, '#', (short) 1, (short) 1 };
        int[] intArray23 = new int[] { (byte) 10, 1, '#', (short) 1, (short) 1 };
        int[] intArray29 = new int[] { (byte) 10, 1, '#', (short) 1, (short) 1 };
        int[] intArray35 = new int[] { (byte) 10, 1, '#', (short) 1, (short) 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 35, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 35, 1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1, 35, 1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 1, 35, 1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 1, 35, 1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 1, 35, 1, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { (byte) 0 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        int[] intArray1 = new int[] { 10 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        int[] intArray5 = new int[] { 1, 0, (byte) 1, '#', 0 };
        int[] intArray11 = new int[] { 1, 0, (byte) 1, '#', 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[] intArray7 = new int[] { (-1) };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        int[] intArray6 = new int[] { (short) 0, '4', 'a', '#', (short) -1, 100 };
        int[] intArray13 = new int[] { (short) 0, '4', 'a', '#', (short) -1, 100 };
        int[] intArray20 = new int[] { (short) 0, '4', 'a', '#', (short) -1, 100 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 97, 35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 52, 97, 35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 52, 97, 35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        int[] intArray5 = new int[] { (-1), 10, (short) 10, '4', 10 };
        int[] intArray11 = new int[] { (-1), 10, (short) 10, '4', 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 10, 52, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 52, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        int[] intArray3 = new int[] { (byte) 0, 'a', 'a' };
        int[] intArray7 = new int[] { (byte) 0, 'a', 'a' };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 97, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97, 97]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        int[] intArray5 = new int[] { (short) -1, 10, (short) 10, 'a', ' ' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 10, 97, 32]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        int[] intArray2 = new int[] { (short) -1, (-1) };
        int[] intArray5 = new int[] { (short) -1, (-1) };
        int[] intArray8 = new int[] { (short) -1, (-1) };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        int[] intArray3 = new int[] { (byte) 10, 'a', 100 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 97, 100]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        int[] intArray4 = new int[] { 1, (short) 100, 100, (short) 10 };
        int[] intArray9 = new int[] { 1, (short) 100, 100, (short) 10 };
        int[] intArray14 = new int[] { 1, (short) 100, 100, (short) 10 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        int[] intArray4 = new int[] { (byte) 10, '#', (short) 0, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 10, '#', (short) 0, (byte) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        int[] intArray9 = new int[] { '#' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        int[] intArray2 = new int[] { (short) 100, 100 };
        int[] intArray5 = new int[] { (short) 100, 100 };
        int[] intArray8 = new int[] { (short) 100, 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        int[] intArray6 = new int[] { ' ', '#', (short) 0, '4', 1, (short) 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 35, 0, 52, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (short) -1 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, '#', (short) 10, 100, (short) -1 };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, '#', (short) 10, 100, (short) -1 };
        int[] intArray20 = new int[] { (short) 1, (byte) -1, '#', (short) 10, 100, (short) -1 };
        int[] intArray27 = new int[] { (short) 1, (byte) -1, '#', (short) 10, 100, (short) -1 };
        int[] intArray34 = new int[] { (short) 1, (byte) -1, '#', (short) 10, 100, (short) -1 };
        int[] intArray41 = new int[] { (short) 1, (byte) -1, '#', (short) 10, 100, (short) -1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 35, 10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 35, 10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 35, 10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 35, 10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 35, 10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, -1, 35, 10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        int[] intArray3 = new int[] { 0, (short) 10, (-1) };
        int[] intArray7 = new int[] { 0, (short) 10, (-1) };
        int[] intArray11 = new int[] { 0, (short) 10, (-1) };
        int[] intArray15 = new int[] { 0, (short) 10, (-1) };
        int[] intArray19 = new int[] { 0, (short) 10, (-1) };
        int[] intArray23 = new int[] { 0, (short) 10, (-1) };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        int[] intArray1 = new int[] { '#' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        int[] intArray1 = new int[] { (byte) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        int[] intArray6 = new int[] { 'a', (byte) -1, 1, 100, (byte) 0, 0 };
        int[] intArray13 = new int[] { 'a', (byte) -1, 1, 100, (byte) 0, 0 };
        int[] intArray20 = new int[] { 'a', (byte) -1, 1, 100, (byte) 0, 0 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray5 = new int[] { '#', (short) 100 };
        int[] intArray8 = new int[] { '#', (short) 100 };
        int[] intArray11 = new int[] { '#', (short) 100 };
        int[] intArray14 = new int[] { '#', (short) 100 };
        int[] intArray17 = new int[] { '#', (short) 100 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        int[] intArray5 = new int[] { (short) -1, '4', ' ', (byte) 100, 100 };
        int[] intArray11 = new int[] { (short) -1, '4', ' ', (byte) 100, 100 };
        int[] intArray17 = new int[] { (short) -1, '4', ' ', (byte) 100, 100 };
        int[] intArray23 = new int[] { (short) -1, '4', ' ', (byte) 100, 100 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 52, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 52, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 52, 32, 100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        int[] intArray3 = new int[] { (short) 0, 1, 10 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        int[] intArray5 = new int[] { (byte) 10, (-1), (short) 100, 'a', (byte) -1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 97, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        int[] intArray3 = new int[] { (byte) 100, ' ', (byte) 1 };
        int[] intArray7 = new int[] { (byte) 100, ' ', (byte) 1 };
        int[] intArray11 = new int[] { (byte) 100, ' ', (byte) 1 };
        int[] intArray15 = new int[] { (byte) 100, ' ', (byte) 1 };
        int[] intArray19 = new int[] { (byte) 100, ' ', (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        int[] intArray3 = new int[] { '4', '4', (byte) 10 };
        int[] intArray7 = new int[] { '4', '4', (byte) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 52, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 52, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        int[] intArray4 = new int[] { (-1), (short) 0, (short) 10, 10 };
        int[] intArray9 = new int[] { (-1), (short) 0, (short) 10, 10 };
        int[] intArray14 = new int[] { (-1), (short) 0, (short) 10, 10 };
        int[] intArray19 = new int[] { (-1), (short) 0, (short) 10, 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        int[] intArray4 = new int[] { 0, (short) 0, (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { 0, (short) 0, (byte) -1, (byte) 10 };
        int[] intArray14 = new int[] { 0, (short) 0, (byte) -1, (byte) 10 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        int[] intArray4 = new int[] { 'a', 10, (short) 0, 'a' };
        int[] intArray9 = new int[] { 'a', 10, (short) 0, 'a' };
        int[] intArray14 = new int[] { 'a', 10, (short) 0, 'a' };
        int[] intArray19 = new int[] { 'a', 10, (short) 0, 'a' };
        int[] intArray24 = new int[] { 'a', 10, (short) 0, 'a' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        int[] intArray5 = new int[] { 10 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        int[] intArray4 = new int[] { 1, (byte) 10, '4', (-1) };
        int[] intArray9 = new int[] { 1, (byte) 10, '4', (-1) };
        int[] intArray14 = new int[] { 1, (byte) 10, '4', (-1) };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        int[] intArray2 = new int[] { (byte) 10, ' ' };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        int[] intArray6 = new int[] { 10, 0, (byte) 0, (byte) 0, (short) 1, 100 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        int[] intArray5 = new int[] { 0, 0, 0, (short) 1, (short) 100 };
        int[] intArray11 = new int[] { 0, 0, 0, (short) 1, (short) 100 };
        int[] intArray17 = new int[] { 0, 0, 0, (short) 1, (short) 100 };
        int[] intArray23 = new int[] { 0, 0, 0, (short) 1, (short) 100 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        int[] intArray4 = new int[] { (short) 10, (short) 0, (byte) 1, '4' };
        int[] intArray9 = new int[] { (short) 10, (short) 0, (byte) 1, '4' };
        int[] intArray14 = new int[] { (short) 10, (short) 0, (byte) 1, '4' };
        int[] intArray19 = new int[] { (short) 10, (short) 0, (byte) 1, '4' };
        int[] intArray24 = new int[] { (short) 10, (short) 0, (byte) 1, '4' };
        int[] intArray29 = new int[] { (short) 10, (short) 0, (byte) 1, '4' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 1, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 1, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 1, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 0, 1, 52]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 0, 1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 0, 1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        int[] intArray5 = new int[] { (-1), (byte) 1, ' ', (-1), (short) 1 };
        int[] intArray11 = new int[] { (-1), (byte) 1, ' ', (-1), (short) 1 };
        int[] intArray17 = new int[] { (-1), (byte) 1, ' ', (-1), (short) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 32, -1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 32, -1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1, 32, -1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        int[] intArray3 = new int[] { 0, (short) 0, (byte) 1 };
        int[] intArray7 = new int[] { 0, (short) 0, (byte) 1 };
        int[] intArray11 = new int[] { 0, (short) 0, (byte) 1 };
        int[] intArray15 = new int[] { 0, (short) 0, (byte) 1 };
        int[] intArray19 = new int[] { 0, (short) 0, (byte) 1 };
        int[] intArray23 = new int[] { 0, (short) 0, (byte) 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        int[] intArray3 = new int[] { (short) 10, 'a', (byte) -1 };
        int[] intArray7 = new int[] { (short) 10, 'a', (byte) -1 };
        int[] intArray11 = new int[] { (short) 10, 'a', (byte) -1 };
        int[] intArray15 = new int[] { (short) 10, 'a', (byte) -1 };
        int[] intArray19 = new int[] { (short) 10, 'a', (byte) -1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 97, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        int[] intArray5 = new int[] { 1, (short) 0, (short) 100, 100, (byte) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        int[] intArray5 = new int[] { ' ', 1, ' ', (short) 0, (byte) -1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        int[] intArray2 = new int[] { (short) 1, '4' };
        int[] intArray5 = new int[] { (short) 1, '4' };
        int[] intArray8 = new int[] { (short) 1, '4' };
        int[] intArray11 = new int[] { (short) 1, '4' };
        int[] intArray14 = new int[] { (short) 1, '4' };
        int[] intArray17 = new int[] { (short) 1, '4' };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        int[] intArray4 = new int[] { (byte) -1, (byte) 0, 0, (byte) 0 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 0, 0, (byte) 0 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 0, 0, (byte) 0 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        int[] intArray5 = new int[] { (byte) 1, 1, '4', 0, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 1, 1, '4', 0, (byte) 0 };
        int[] intArray17 = new int[] { (byte) 1, 1, '4', 0, (byte) 0 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 52, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 52, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 52, 0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        int[] intArray5 = new int[] { (byte) 10, 1, (byte) 100, 1, (-1) };
        int[] intArray11 = new int[] { (byte) 10, 1, (byte) 100, 1, (-1) };
        int[] intArray17 = new int[] { (byte) 10, 1, (byte) 100, 1, (-1) };
        int[] intArray23 = new int[] { (byte) 10, 1, (byte) 100, 1, (-1) };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 1, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        int[] intArray6 = new int[] { ' ', 1, (short) 10, (byte) -1, (-1), '4' };
        int[] intArray13 = new int[] { ' ', 1, (short) 10, (byte) -1, (-1), '4' };
        int[] intArray20 = new int[] { ' ', 1, (short) 10, (byte) -1, (-1), '4' };
        int[] intArray27 = new int[] { ' ', 1, (short) 10, (byte) -1, (-1), '4' };
        int[] intArray34 = new int[] { ' ', 1, (short) 10, (byte) -1, (-1), '4' };
        int[] intArray41 = new int[] { ' ', 1, (short) 10, (byte) -1, (-1), '4' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 1, 10, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 1, 10, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 1, 10, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 1, 10, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 1, 10, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 1, 10, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        int[] intArray6 = new int[] { (short) 100, (short) 1, (byte) 0, 0, 'a', (byte) 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 0, 0, 97, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        int[] intArray3 = new int[] { (short) 100, 100, (short) 100 };
        int[] intArray7 = new int[] { (short) 100, 100, (short) 100 };
        int[] intArray11 = new int[] { (short) 100, 100, (short) 100 };
        int[] intArray15 = new int[] { (short) 100, 100, (short) 100 };
        int[] intArray19 = new int[] { (short) 100, 100, (short) 100 };
        int[] intArray23 = new int[] { (short) 100, 100, (short) 100 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        int[] intArray2 = new int[] { ' ', ' ' };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        int[] intArray2 = new int[] { (byte) 1, (short) 0 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        int[] intArray6 = new int[] { (short) 10, (short) 1, (byte) 100, (short) 0, 1, 'a' };
        int[] intArray13 = new int[] { (short) 10, (short) 1, (byte) 100, (short) 0, 1, 'a' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 100, 0, 1, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1, 100, 0, 1, 97]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        int[] intArray4 = new int[] { (short) -1, (byte) -1, 1, (short) 10 };
        int[] intArray9 = new int[] { (short) -1, (byte) -1, 1, (short) 10 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[] intArray11 = new int[] { ' ' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        int[] intArray6 = new int[] { (byte) 10, 10, 100, (byte) 0, 1, 'a' };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 100, 0, 1, 97]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        int[] intArray6 = new int[] { (short) 100, (short) 1, 1, ' ', '#', ' ' };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 1, 32, 35, 32]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        int[] intArray6 = new int[] { (short) -1, 'a', ' ', (byte) 0, '#', '4' };
        int[] intArray13 = new int[] { (short) -1, 'a', ' ', (byte) 0, '#', '4' };
        int[] intArray20 = new int[] { (short) -1, 'a', ' ', (byte) 0, '#', '4' };
        int[] intArray27 = new int[] { (short) -1, 'a', ' ', (byte) 0, '#', '4' };
        int[] intArray34 = new int[] { (short) -1, 'a', ' ', (byte) 0, '#', '4' };
        int[] intArray41 = new int[] { (short) -1, 'a', ' ', (byte) 0, '#', '4' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 97, 32, 0, 35, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32, 0, 35, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 32, 0, 35, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 32, 0, 35, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, 32, 0, 35, 52]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 97, 32, 0, 35, 52]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        int[] intArray6 = new int[] { (byte) 0, (short) 100, '#', ' ', (short) 10, (byte) 0 };
        int[] intArray13 = new int[] { (byte) 0, (short) 100, '#', ' ', (short) 10, (byte) 0 };
        int[] intArray20 = new int[] { (byte) 0, (short) 100, '#', ' ', (short) 10, (byte) 0 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 35, 32, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 35, 32, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, 35, 32, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        int[] intArray3 = new int[] { ' ', (short) 10, 0 };
        int[] intArray7 = new int[] { ' ', (short) 10, 0 };
        int[] intArray11 = new int[] { ' ', (short) 10, 0 };
        int[] intArray15 = new int[] { ' ', (short) 10, 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        int[] intArray4 = new int[] { ' ', '4', '4', (byte) 0 };
        int[] intArray9 = new int[] { ' ', '4', '4', (byte) 0 };
        int[] intArray14 = new int[] { ' ', '4', '4', (byte) 0 };
        int[] intArray19 = new int[] { ' ', '4', '4', (byte) 0 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 52, 52, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 52, 52, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 52, 52, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 52, 52, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        int[] intArray4 = new int[] { 10, (byte) 1, (byte) 1, (short) 100 };
        int[] intArray9 = new int[] { 10, (byte) 1, (byte) 1, (short) 100 };
        int[] intArray14 = new int[] { 10, (byte) 1, (byte) 1, (short) 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        int[] intArray3 = new int[] { 'a', (-1), (byte) -1 };
        int[] intArray7 = new int[] { 'a', (-1), (byte) -1 };
        int[] intArray11 = new int[] { 'a', (-1), (byte) -1 };
        int[] intArray15 = new int[] { 'a', (-1), (byte) -1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        int[] intArray3 = new int[] { 10, (byte) 0, (short) 1 };
        int[] intArray7 = new int[] { 10, (byte) 0, (short) 1 };
        int[] intArray11 = new int[] { 10, (byte) 0, (short) 1 };
        int[] intArray15 = new int[] { 10, (byte) 0, (short) 1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[] intArray5 = new int[] { 0 };
        int[] intArray7 = new int[] { 0 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[] intArray5 = new int[] { 0 };
        int[] intArray7 = new int[] { 0 };
        int[] intArray9 = new int[] { 0 };
        int[] intArray11 = new int[] { 0 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        int[] intArray5 = new int[] { 'a', (short) -1, 0, (byte) 1, 1 };
        int[] intArray11 = new int[] { 'a', (short) -1, 0, (byte) 1, 1 };
        int[] intArray17 = new int[] { 'a', (short) -1, 0, (byte) 1, 1 };
        int[] intArray23 = new int[] { 'a', (short) -1, 0, (byte) 1, 1 };
        int[] intArray29 = new int[] { 'a', (short) -1, 0, (byte) 1, 1 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, -1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        int[] intArray3 = new int[] { 10, (short) 0, (short) 1 };
        int[] intArray7 = new int[] { 10, (short) 0, (short) 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        int[] intArray3 = new int[] { 1, 10, (byte) 10 };
        int[] intArray7 = new int[] { 1, 10, (byte) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        int[] intArray2 = new int[] { 100, (short) 10 };
        int[] intArray5 = new int[] { 100, (short) 10 };
        int[] intArray8 = new int[] { 100, (short) 10 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        int[] intArray3 = new int[] { 100, (short) 10, (short) 100 };
        int[] intArray7 = new int[] { 100, (short) 10, (short) 100 };
        int[] intArray11 = new int[] { 100, (short) 10, (short) 100 };
        int[] intArray15 = new int[] { 100, (short) 10, (short) 100 };
        int[] intArray19 = new int[] { 100, (short) 10, (short) 100 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        int[] intArray4 = new int[] { (byte) 0, 1, 0, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 0, 1, 0, (byte) 100 };
        int[] intArray14 = new int[] { (byte) 0, 1, 0, (byte) 100 };
        int[] intArray19 = new int[] { (byte) 0, 1, 0, (byte) 100 };
        int[] intArray24 = new int[] { (byte) 0, 1, 0, (byte) 100 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        int[] intArray6 = new int[] { '#', ' ', (byte) 1, (byte) 0, (byte) 10, (short) 1 };
        int[] intArray13 = new int[] { '#', ' ', (byte) 1, (byte) 0, (byte) 10, (short) 1 };
        int[] intArray20 = new int[] { '#', ' ', (byte) 1, (byte) 0, (byte) 10, (short) 1 };
        int[] intArray27 = new int[] { '#', ' ', (byte) 1, (byte) 0, (byte) 10, (short) 1 };
        int[] intArray34 = new int[] { '#', ' ', (byte) 1, (byte) 0, (byte) 10, (short) 1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 32, 1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 32, 1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 32, 1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 32, 1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 32, 1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        int[] intArray5 = new int[] { (short) 100, (short) 100, (byte) 10, ' ', 0 };
        int[] intArray11 = new int[] { (short) 100, (short) 100, (byte) 10, ' ', 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 10, 32, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 10, 32, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, '#', (byte) -1, 'a' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 35, -1, 97]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        int[] intArray4 = new int[] { '4', ' ', 'a', (short) -1 };
        int[] intArray9 = new int[] { '4', ' ', 'a', (short) -1 };
        int[] intArray14 = new int[] { '4', ' ', 'a', (short) -1 };
        int[] intArray19 = new int[] { '4', ' ', 'a', (short) -1 };
        int[] intArray24 = new int[] { '4', ' ', 'a', (short) -1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 32, 97, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 32, 97, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 32, 97, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 32, 97, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, 32, 97, -1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1, 0 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 1, 0 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 1, 0 };
        int[] intArray15 = new int[] { (byte) 10, (byte) 1, 0 };
        int[] intArray19 = new int[] { (byte) 10, (byte) 1, 0 };
        int[] intArray23 = new int[] { (byte) 10, (byte) 1, 0 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        int[] intArray4 = new int[] { ' ', 1, (byte) 10, 100 };
        int[] intArray9 = new int[] { ' ', 1, (byte) 10, 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = new int[] { 100 };
        int[] intArray9 = new int[] { 100 };
        int[] intArray11 = new int[] { 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        int[] intArray6 = new int[] { (byte) 100, 0, 0, 'a', (byte) 100, (short) 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 0, 97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        int[] intArray3 = new int[] { 100, (byte) 0, 0 };
        int[] intArray7 = new int[] { 100, (byte) 0, 0 };
        int[] intArray11 = new int[] { 100, (byte) 0, 0 };
        int[] intArray15 = new int[] { 100, (byte) 0, 0 };
        int[] intArray19 = new int[] { 100, (byte) 0, 0 };
        int[] intArray23 = new int[] { 100, (byte) 0, 0 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[] intArray5 = new int[] { '4' };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        int[] intArray5 = new int[] { 0, (byte) -1, (byte) 10, 10, 10 };
        int[] intArray11 = new int[] { 0, (byte) -1, (byte) 10, 10, 10 };
        int[] intArray17 = new int[] { 0, (byte) -1, (byte) 10, 10, 10 };
        int[] intArray23 = new int[] { 0, (byte) -1, (byte) 10, 10, 10 };
        int[] intArray29 = new int[] { 0, (byte) -1, (byte) 10, 10, 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, -1, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, -1, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, -1, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10 };
        int[] intArray9 = new int[] { (byte) 10 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        int[] intArray6 = new int[] { (short) 10, 0, (byte) 100, (short) 10, ' ', (short) 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 100, 10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        int[] intArray2 = new int[] { 10, (short) 10 };
        int[] intArray5 = new int[] { 10, (short) 10 };
        int[] intArray8 = new int[] { 10, (short) 10 };
        int[] intArray11 = new int[] { 10, (short) 10 };
        int[] intArray14 = new int[] { 10, (short) 10 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        int[] intArray5 = new int[] { 10, 1, (short) 100, (byte) 1, 0 };
        int[] intArray11 = new int[] { 10, 1, (short) 100, (byte) 1, 0 };
        int[] intArray17 = new int[] { 10, 1, (short) 100, (byte) 1, 0 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        int[] intArray2 = new int[] { 100, (short) -1 };
        int[] intArray5 = new int[] { 100, (short) -1 };
        int[] intArray8 = new int[] { 100, (short) -1 };
        int[] intArray11 = new int[] { 100, (short) -1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        int[] intArray6 = new int[] { (short) 100, 100, (-1), '4', 10, 1 };
        int[] intArray13 = new int[] { (short) 100, 100, (-1), '4', 10, 1 };
        int[] intArray20 = new int[] { (short) 100, 100, (-1), '4', 10, 1 };
        int[] intArray27 = new int[] { (short) 100, 100, (-1), '4', 10, 1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, -1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, -1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100, -1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100, -1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        int[] intArray4 = new int[] { '4', (short) 0, (short) 0, 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        int[] intArray3 = new int[] { (short) 0, (short) 100, 1 };
        int[] intArray7 = new int[] { (short) 0, (short) 100, 1 };
        int[] intArray11 = new int[] { (short) 0, (short) 100, 1 };
        int[] intArray15 = new int[] { (short) 0, (short) 100, 1 };
        int[] intArray19 = new int[] { (short) 0, (short) 100, 1 };
        int[] intArray23 = new int[] { (short) 0, (short) 100, 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        int[] intArray6 = new int[] { 0, (short) 100, ' ', ' ', (short) 0, (short) 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 32, 32, 0, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        int[] intArray2 = new int[] { (short) 0, '4' };
        int[] intArray5 = new int[] { (short) 0, '4' };
        int[] intArray8 = new int[] { (short) 0, '4' };
        int[] intArray11 = new int[] { (short) 0, '4' };
        int[] intArray14 = new int[] { (short) 0, '4' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 52]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        int[] intArray2 = new int[] { (byte) 0, (short) 0 };
        int[] intArray5 = new int[] { (byte) 0, (short) 0 };
        int[] intArray8 = new int[] { (byte) 0, (short) 0 };
        int[] intArray11 = new int[] { (byte) 0, (short) 0 };
        int[] intArray14 = new int[] { (byte) 0, (short) 0 };
        int[] intArray17 = new int[] { (byte) 0, (short) 0 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        int[] intArray6 = new int[] { 'a', (byte) 0, 10, '#', ' ', (short) -1 };
        int[] intArray13 = new int[] { 'a', (byte) 0, 10, '#', ' ', (short) -1 };
        int[] intArray20 = new int[] { 'a', (byte) 0, 10, '#', ' ', (short) -1 };
        int[] intArray27 = new int[] { 'a', (byte) 0, 10, '#', ' ', (short) -1 };
        int[] intArray34 = new int[] { 'a', (byte) 0, 10, '#', ' ', (short) -1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 0, 10, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 0, 10, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 0, 10, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 0, 10, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 0, 10, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        int[] intArray1 = new int[] { (short) 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        int[] intArray1 = new int[] { (byte) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        int[] intArray5 = new int[] { '#', (byte) -1, (short) 100, (short) -1, ' ' };
        int[] intArray11 = new int[] { '#', (byte) -1, (short) 100, (short) -1, ' ' };
        int[] intArray17 = new int[] { '#', (byte) -1, (short) 100, (short) -1, ' ' };
        int[] intArray23 = new int[] { '#', (byte) -1, (short) 100, (short) -1, ' ' };
        int[] intArray29 = new int[] { '#', (byte) -1, (short) 100, (short) -1, ' ' };
        int[] intArray35 = new int[] { '#', (byte) -1, (short) 100, (short) -1, ' ' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, -1, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, -1, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[35, -1, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        int[] intArray6 = new int[] { (short) 100, (short) 100, 10, (byte) 0, (byte) 0, (byte) 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        int[] intArray4 = new int[] { (short) 1, '4', (-1), '4' };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, -1, 52]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        int[] intArray6 = new int[] { ' ', (-1), (short) -1, (-1), ' ', (short) 100 };
        int[] intArray13 = new int[] { ' ', (-1), (short) -1, (-1), ' ', (short) 100 };
        int[] intArray20 = new int[] { ' ', (-1), (short) -1, (-1), ' ', (short) 100 };
        int[] intArray27 = new int[] { ' ', (-1), (short) -1, (-1), ' ', (short) 100 };
        int[] intArray34 = new int[] { ' ', (-1), (short) -1, (-1), ' ', (short) 100 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, -1, -1, 32, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, -1, -1, -1, 32, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, -1, -1, -1, 32, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, -1, -1, -1, 32, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, -1, -1, -1, 32, 100]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        int[] intArray5 = new int[] { 0, (short) 100, '#', 'a', (short) 1 };
        int[] intArray11 = new int[] { 0, (short) 100, '#', 'a', (short) 1 };
        int[] intArray17 = new int[] { 0, (short) 100, '#', 'a', (short) 1 };
        int[] intArray23 = new int[] { 0, (short) 100, '#', 'a', (short) 1 };
        int[] intArray29 = new int[] { 0, (short) 100, '#', 'a', (short) 1 };
        int[] intArray35 = new int[] { 0, (short) 100, '#', 'a', (short) 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 97, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100, 35, 97, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 100, 35, 97, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 100, 35, 97, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 100, 35, 97, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 100, 35, 97, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        int[] intArray4 = new int[] { (short) 1, (byte) 1, 10, (short) 100 };
        int[] intArray9 = new int[] { (short) 1, (byte) 1, 10, (short) 100 };
        int[] intArray14 = new int[] { (short) 1, (byte) 1, 10, (short) 100 };
        int[] intArray19 = new int[] { (short) 1, (byte) 1, 10, (short) 100 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        int[] intArray4 = new int[] { 10, (short) 100, (byte) 1, (byte) 1 };
        int[] intArray9 = new int[] { 10, (short) 100, (byte) 1, (byte) 1 };
        int[] intArray14 = new int[] { 10, (short) 100, (byte) 1, (byte) 1 };
        int[] intArray19 = new int[] { 10, (short) 100, (byte) 1, (byte) 1 };
        int[] intArray24 = new int[] { 10, (short) 100, (byte) 1, (byte) 1 };
        int[] intArray29 = new int[] { 10, (short) 100, (byte) 1, (byte) 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        int[] intArray4 = new int[] { 1, (-1), 'a', (short) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        int[] intArray6 = new int[] { (short) 0, (short) 0, (byte) 1, (-1), (short) 10, (byte) 1 };
        int[] intArray13 = new int[] { (short) 0, (short) 0, (byte) 1, (-1), (short) 10, (byte) 1 };
        int[] intArray20 = new int[] { (short) 0, (short) 0, (byte) 1, (-1), (short) 10, (byte) 1 };
        int[] intArray27 = new int[] { (short) 0, (short) 0, (byte) 1, (-1), (short) 10, (byte) 1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 1, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 1, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 1, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 1, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1 };
        int[] intArray11 = new int[] { (byte) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        int[] intArray6 = new int[] { ' ', (byte) 100, (byte) -1, ' ', 10, (byte) -1 };
        int[] intArray13 = new int[] { ' ', (byte) 100, (byte) -1, ' ', 10, (byte) -1 };
        int[] intArray20 = new int[] { ' ', (byte) 100, (byte) -1, ' ', 10, (byte) -1 };
        int[] intArray27 = new int[] { ' ', (byte) 100, (byte) -1, ' ', 10, (byte) -1 };
        int[] intArray34 = new int[] { ' ', (byte) 100, (byte) -1, ' ', 10, (byte) -1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 100, -1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 100, -1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 100, -1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 100, -1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 100, -1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        int[] intArray2 = new int[] { 10, (byte) 100 };
        int[] intArray5 = new int[] { 10, (byte) 100 };
        int[] intArray8 = new int[] { 10, (byte) 100 };
        int[] intArray11 = new int[] { 10, (byte) 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        int[] intArray4 = new int[] { ' ', 1, 0, (byte) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        int[] intArray6 = new int[] { 100, '4', ' ', (byte) 0, 100, (short) 100 };
        int[] intArray13 = new int[] { 100, '4', ' ', (byte) 0, 100, (short) 100 };
        int[] intArray20 = new int[] { 100, '4', ' ', (byte) 0, 100, (short) 100 };
        int[] intArray27 = new int[] { 100, '4', ' ', (byte) 0, 100, (short) 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 32, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 52, 32, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 52, 32, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 52, 32, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        int[] intArray5 = new int[] { (byte) 100, 'a', 0, 100, 1 };
        int[] intArray11 = new int[] { (byte) 100, 'a', 0, 100, 1 };
        int[] intArray17 = new int[] { (byte) 100, 'a', 0, 100, 1 };
        int[] intArray23 = new int[] { (byte) 100, 'a', 0, 100, 1 };
        int[] intArray29 = new int[] { (byte) 100, 'a', 0, 100, 1 };
        int[] intArray35 = new int[] { (byte) 100, 'a', 0, 100, 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 97, 0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 97, 0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 97, 0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 97, 0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        int[] intArray2 = new int[] { ' ', 10 };
        int[] intArray5 = new int[] { ' ', 10 };
        int[] intArray8 = new int[] { ' ', 10 };
        int[] intArray11 = new int[] { ' ', 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        int[] intArray4 = new int[] { (short) 0, (short) 1, 1, ' ' };
        int[] intArray9 = new int[] { (short) 0, (short) 1, 1, ' ' };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        int[] intArray2 = new int[] { ' ', (short) 0 };
        int[] intArray5 = new int[] { ' ', (short) 0 };
        int[] intArray8 = new int[] { ' ', (short) 0 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        int[] intArray4 = new int[] { (short) 0, (byte) -1, '#', ' ' };
        int[] intArray9 = new int[] { (short) 0, (byte) -1, '#', ' ' };
        int[] intArray14 = new int[] { (short) 0, (byte) -1, '#', ' ' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 35, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, 35, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, 35, 32]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        int[] intArray5 = new int[] { (short) 10, (short) 1, (byte) 1, 1, (byte) 0 };
        int[] intArray11 = new int[] { (short) 10, (short) 1, (byte) 1, 1, (byte) 0 };
        int[] intArray17 = new int[] { (short) 10, (short) 1, (byte) 1, 1, (byte) 0 };
        int[] intArray23 = new int[] { (short) 10, (short) 1, (byte) 1, 1, (byte) 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 1, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        int[] intArray6 = new int[] { (short) 0, (short) -1, 10, (byte) 10, (short) 10, '#' };
        int[] intArray13 = new int[] { (short) 0, (short) -1, 10, (byte) 10, (short) 10, '#' };
        int[] intArray20 = new int[] { (short) 0, (short) -1, 10, (byte) 10, (short) 10, '#' };
        int[] intArray27 = new int[] { (short) 0, (short) -1, 10, (byte) 10, (short) 10, '#' };
        int[] intArray34 = new int[] { (short) 0, (short) -1, 10, (byte) 10, (short) 10, '#' };
        int[] intArray41 = new int[] { (short) 0, (short) -1, 10, (byte) 10, (short) 10, '#' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 10, 10, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 10, 10, 10, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, 10, 10, 10, 35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, -1, 10, 10, 10, 35]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, -1, 10, 10, 10, 35]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, -1, 10, 10, 10, 35]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        int[] intArray4 = new int[] { (byte) 0, 1, (byte) 10, (short) 0 };
        int[] intArray9 = new int[] { (byte) 0, 1, (byte) 10, (short) 0 };
        int[] intArray14 = new int[] { (byte) 0, 1, (byte) 10, (short) 0 };
        int[] intArray19 = new int[] { (byte) 0, 1, (byte) 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        int[] intArray3 = new int[] { 0, (byte) 100, 1 };
        int[] intArray7 = new int[] { 0, (byte) 100, 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        int[] intArray2 = new int[] { '4', (byte) 10 };
        int[] intArray5 = new int[] { '4', (byte) 10 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (byte) -1 };
        int[] intArray9 = new int[] { (byte) -1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        int[] intArray4 = new int[] { (short) 0, (short) 0, 10, 0 };
        int[] intArray9 = new int[] { (short) 0, (short) 0, 10, 0 };
        int[] intArray14 = new int[] { (short) 0, (short) 0, 10, 0 };
        int[] intArray19 = new int[] { (short) 0, (short) 0, 10, 0 };
        int[] intArray24 = new int[] { (short) 0, (short) 0, 10, 0 };
        int[] intArray29 = new int[] { (short) 0, (short) 0, 10, 0 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray5 = new int[] { '#', (short) 100 };
        int[] intArray8 = new int[] { '#', (short) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        int[] intArray6 = new int[] { (byte) -1, ' ', 10, (short) 100, 100, '4' };
        int[] intArray13 = new int[] { (byte) -1, ' ', 10, (short) 100, 100, '4' };
        int[] intArray20 = new int[] { (byte) -1, ' ', 10, (short) 100, 100, '4' };
        int[] intArray27 = new int[] { (byte) -1, ' ', 10, (short) 100, 100, '4' };
        int[] intArray34 = new int[] { (byte) -1, ' ', 10, (short) 100, 100, '4' };
        int[] intArray41 = new int[] { (byte) -1, ' ', 10, (short) 100, 100, '4' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 10, 100, 100, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 32, 10, 100, 100, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 32, 10, 100, 100, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 32, 10, 100, 100, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 32, 10, 100, 100, 52]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 32, 10, 100, 100, 52]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        int[] intArray3 = new int[] { '#', (-1), (byte) 100 };
        int[] intArray7 = new int[] { '#', (-1), (byte) 100 };
        int[] intArray11 = new int[] { '#', (-1), (byte) 100 };
        int[] intArray15 = new int[] { '#', (-1), (byte) 100 };
        int[] intArray19 = new int[] { '#', (-1), (byte) 100 };
        int[] intArray23 = new int[] { '#', (-1), (byte) 100 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        int[] intArray4 = new int[] { (short) 10, (byte) -1, (-1), (short) -1 };
        int[] intArray9 = new int[] { (short) 10, (byte) -1, (-1), (short) -1 };
        int[] intArray14 = new int[] { (short) 10, (byte) -1, (-1), (short) -1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        int[] intArray2 = new int[] { (byte) -1, (-1) };
        int[] intArray5 = new int[] { (byte) -1, (-1) };
        int[] intArray8 = new int[] { (byte) -1, (-1) };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        int[] intArray4 = new int[] { (byte) 10, 1, 10, (short) 10 };
        int[] intArray9 = new int[] { (byte) 10, 1, 10, (short) 10 };
        int[] intArray14 = new int[] { (byte) 10, 1, 10, (short) 10 };
        int[] intArray19 = new int[] { (byte) 10, 1, 10, (short) 10 };
        int[] intArray24 = new int[] { (byte) 10, 1, 10, (short) 10 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        int[] intArray2 = new int[] { 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        int[] intArray5 = new int[] { 1, (short) 10, 'a', (byte) 0, (byte) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 97, 0, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        int[] intArray3 = new int[] { (short) 100, 10, 1 };
        int[] intArray7 = new int[] { (short) 100, 10, 1 };
        int[] intArray11 = new int[] { (short) 100, 10, 1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        int[] intArray4 = new int[] { (short) 100, (-1), (-1), (-1) };
        int[] intArray9 = new int[] { (short) 100, (-1), (-1), (-1) };
        int[] intArray14 = new int[] { (short) 100, (-1), (-1), (-1) };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray5 = new int[] { 100, '4' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        int[] intArray4 = new int[] { (short) -1, (byte) 1, (short) 1, ' ' };
        int[] intArray9 = new int[] { (short) -1, (byte) 1, (short) 1, ' ' };
        int[] intArray14 = new int[] { (short) -1, (byte) 1, (short) 1, ' ' };
        int[] intArray19 = new int[] { (short) -1, (byte) 1, (short) 1, ' ' };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        int[] intArray1 = new int[] { 100 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        int[] intArray4 = new int[] { 1, '4', (short) 10, (byte) 1 };
        int[] intArray9 = new int[] { 1, '4', (short) 10, (byte) 1 };
        int[] intArray14 = new int[] { 1, '4', (short) 10, (byte) 1 };
        int[] intArray19 = new int[] { 1, '4', (short) 10, (byte) 1 };
        int[] intArray24 = new int[] { 1, '4', (short) 10, (byte) 1 };
        int[] intArray29 = new int[] { 1, '4', (short) 10, (byte) 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray5 = new int[] { 10, '#' };
        int[] intArray8 = new int[] { 10, '#' };
        int[] intArray11 = new int[] { 10, '#' };
        int[] intArray14 = new int[] { 10, '#' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        int[] intArray6 = new int[] { '4', '#', (byte) 1, 1, '#', 'a' };
        int[] intArray13 = new int[] { '4', '#', (byte) 1, 1, '#', 'a' };
        int[] intArray20 = new int[] { '4', '#', (byte) 1, 1, '#', 'a' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 35, 1, 1, 35, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 35, 1, 1, 35, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 35, 1, 1, 35, 97]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        int[] intArray5 = new int[] { '4', (byte) -1, '4', (short) -1, (byte) 0 };
        int[] intArray11 = new int[] { '4', (byte) -1, '4', (short) -1, (byte) 0 };
        int[] intArray17 = new int[] { '4', (byte) -1, '4', (short) -1, (byte) 0 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 52, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, -1, 52, -1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, -1, 52, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        int[] intArray5 = new int[] { (short) 10, 'a', '#', (short) 100, (short) 0 };
        int[] intArray11 = new int[] { (short) 10, 'a', '#', (short) 100, (short) 0 };
        int[] intArray17 = new int[] { (short) 10, 'a', '#', (short) 100, (short) 0 };
        int[] intArray23 = new int[] { (short) 10, 'a', '#', (short) 100, (short) 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 35, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35, 100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35, 100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 97, 35, 100, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        int[] intArray6 = new int[] { (short) 0, (short) 0, (byte) 100, (short) 10, (short) 100, 10 };
        int[] intArray13 = new int[] { (short) 0, (short) 0, (byte) 100, (short) 10, (short) 100, 10 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        int[] intArray3 = new int[] { (byte) 0, '#', (byte) 0 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 35, 0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 1 };
        int[] intArray7 = new int[] { 10, (byte) 0, (byte) 1 };
        int[] intArray11 = new int[] { 10, (byte) 0, (byte) 1 };
        int[] intArray15 = new int[] { 10, (byte) 0, (byte) 1 };
        int[] intArray19 = new int[] { 10, (byte) 0, (byte) 1 };
        int[] intArray23 = new int[] { 10, (byte) 0, (byte) 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        int[] intArray6 = new int[] { '#', (byte) 10, 10, '#', (byte) 10, '4' };
        int[] intArray13 = new int[] { '#', (byte) 10, 10, '#', (byte) 10, '4' };
        int[] intArray20 = new int[] { '#', (byte) 10, 10, '#', (byte) 10, '4' };
        int[] intArray27 = new int[] { '#', (byte) 10, 10, '#', (byte) 10, '4' };
        int[] intArray34 = new int[] { '#', (byte) 10, 10, '#', (byte) 10, '4' };
        int[] intArray41 = new int[] { '#', (byte) 10, 10, '#', (byte) 10, '4' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 10, 10, 35, 10, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 10, 10, 35, 10, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 10, 10, 35, 10, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 10, 10, 35, 10, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 10, 10, 35, 10, 52]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 10, 10, 35, 10, 52]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        int[] intArray4 = new int[] { (short) 10, (short) 1, (byte) 10, (byte) -1 };
        int[] intArray9 = new int[] { (short) 10, (short) 1, (byte) 10, (byte) -1 };
        int[] intArray14 = new int[] { (short) 10, (short) 1, (byte) 10, (byte) -1 };
        int[] intArray19 = new int[] { (short) 10, (short) 1, (byte) 10, (byte) -1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        int[] intArray6 = new int[] { '#', 0, (short) 0, (short) 100, (short) 0, 100 };
        int[] intArray13 = new int[] { '#', 0, (short) 0, (short) 100, (short) 0, 100 };
        int[] intArray20 = new int[] { '#', 0, (short) 0, (short) 100, (short) 0, 100 };
        int[] intArray27 = new int[] { '#', 0, (short) 0, (short) 100, (short) 0, 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0, 0, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0, 0, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 0, 0, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 0, 0, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        int[] intArray3 = new int[] { (short) 10, (byte) 1, (byte) 10 };
        int[] intArray7 = new int[] { (short) 10, (byte) 1, (byte) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        int[] intArray4 = new int[] { 100, '#', (short) 100, ' ' };
        int[] intArray9 = new int[] { 100, '#', (short) 100, ' ' };
        int[] intArray14 = new int[] { 100, '#', (short) 100, ' ' };
        int[] intArray19 = new int[] { 100, '#', (short) 100, ' ' };
        int[] intArray24 = new int[] { 100, '#', (short) 100, ' ' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        int[] intArray4 = new int[] { '4', ' ', (short) -1, 10 };
        int[] intArray9 = new int[] { '4', ' ', (short) -1, 10 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 32, -1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 32, -1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        int[] intArray1 = new int[] { 1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        int[] intArray3 = new int[] { (short) 0, 1, (short) 0 };
        int[] intArray7 = new int[] { (short) 0, 1, (short) 0 };
        int[] intArray11 = new int[] { (short) 0, 1, (short) 0 };
        int[] intArray15 = new int[] { (short) 0, 1, (short) 0 };
        int[] intArray19 = new int[] { (short) 0, 1, (short) 0 };
        int[] intArray23 = new int[] { (short) 0, 1, (short) 0 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, (byte) 10, (short) -1, (short) -1 };
        int[] intArray11 = new int[] { (short) 100, (byte) 10, (byte) 10, (short) -1, (short) -1 };
        int[] intArray17 = new int[] { (short) 100, (byte) 10, (byte) 10, (short) -1, (short) -1 };
        int[] intArray23 = new int[] { (short) 100, (byte) 10, (byte) 10, (short) -1, (short) -1 };
        int[] intArray29 = new int[] { (short) 100, (byte) 10, (byte) 10, (short) -1, (short) -1 };
        int[] intArray35 = new int[] { (short) 100, (byte) 10, (byte) 10, (short) -1, (short) -1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        int[] intArray5 = new int[] { 1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        int[] intArray11 = new int[] { 1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        int[] intArray17 = new int[] { 1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        int[] intArray23 = new int[] { 1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        int[] intArray29 = new int[] { 1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, -1, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, -1, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, -1, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        int[] intArray5 = new int[] { (short) 1, (byte) 100, (short) 10, '#', '4' };
        int[] intArray11 = new int[] { (short) 1, (byte) 100, (short) 10, '#', '4' };
        int[] intArray17 = new int[] { (short) 1, (byte) 100, (short) 10, '#', '4' };
        int[] intArray23 = new int[] { (short) 1, (byte) 100, (short) 10, '#', '4' };
        int[] intArray29 = new int[] { (short) 1, (byte) 100, (short) 10, '#', '4' };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 10, 35, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 10, 35, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 10, 35, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 100, 10, 35, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 100, 10, 35, 52]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        int[] intArray5 = new int[] { (short) 0, '4', (short) -1, (byte) 10, (short) 0 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        int[] intArray2 = new int[] { (byte) 100, 1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray5 = new int[] { 100, '4' };
        int[] intArray8 = new int[] { 100, '4' };
        int[] intArray11 = new int[] { 100, '4' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        int[] intArray6 = new int[] { 1, (short) -1, 1, (short) 1, 'a', '#' };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 1, 1, 97, 35]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        int[] intArray4 = new int[] { 100, 10, (short) 1, (short) 10 };
        int[] intArray9 = new int[] { 100, 10, (short) 1, (short) 10 };
        int[] intArray14 = new int[] { 100, 10, (short) 1, (short) 10 };
        int[] intArray19 = new int[] { 100, 10, (short) 1, (short) 10 };
        int[] intArray24 = new int[] { 100, 10, (short) 1, (short) 10 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        int[] intArray5 = new int[] { (byte) 100, 1, (short) 10, (short) -1, 1 };
        int[] intArray11 = new int[] { (byte) 100, 1, (short) 10, (short) -1, 1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, -1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 10, -1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        int[] intArray2 = new int[] { (short) 1, (short) 1 };
        int[] intArray5 = new int[] { (short) 1, (short) 1 };
        int[] intArray8 = new int[] { (short) 1, (short) 1 };
        int[] intArray11 = new int[] { (short) 1, (short) 1 };
        int[] intArray14 = new int[] { (short) 1, (short) 1 };
        int[] intArray17 = new int[] { (short) 1, (short) 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        int[] intArray2 = new int[] { (byte) 1, (short) -1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        int[] intArray4 = new int[] { (byte) 100, ' ', 10, (byte) 10 };
        int[] intArray9 = new int[] { (byte) 100, ' ', 10, (byte) 10 };
        int[] intArray14 = new int[] { (byte) 100, ' ', 10, (byte) 10 };
        int[] intArray19 = new int[] { (byte) 100, ' ', 10, (byte) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, 10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 32, 10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 32, 10, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        int[] intArray5 = new int[] { (short) 1, (short) -1, (short) 100, (byte) 0, (byte) 10 };
        int[] intArray11 = new int[] { (short) 1, (short) -1, (short) 100, (byte) 0, (byte) 10 };
        int[] intArray17 = new int[] { (short) 1, (short) -1, (short) 100, (byte) 0, (byte) 10 };
        int[] intArray23 = new int[] { (short) 1, (short) -1, (short) 100, (byte) 0, (byte) 10 };
        int[] intArray29 = new int[] { (short) 1, (short) -1, (short) 100, (byte) 0, (byte) 10 };
        int[] intArray35 = new int[] { (short) 1, (short) -1, (short) 100, (byte) 0, (byte) 10 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, -1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        int[] intArray1 = new int[] { (short) 1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        int[] intArray5 = new int[] { 0, (short) 0, (byte) 100, '4', (byte) 0 };
        int[] intArray11 = new int[] { 0, (short) 0, (byte) 100, '4', (byte) 0 };
        int[] intArray17 = new int[] { 0, (short) 0, (byte) 100, '4', (byte) 0 };
        int[] intArray23 = new int[] { 0, (short) 0, (byte) 100, '4', (byte) 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 100, 52, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 100, 52, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 100, 52, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 100, 52, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        int[] intArray3 = new int[] { 0, '4', 1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        int[] intArray5 = new int[] { (short) -1, 1, (-1), (byte) 100, '#' };
        int[] intArray11 = new int[] { (short) -1, 1, (-1), (byte) 100, '#' };
        int[] intArray17 = new int[] { (short) -1, 1, (-1), (byte) 100, '#' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, -1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, -1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1, -1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        int[] intArray5 = new int[] { (short) 10, ' ', 'a', (short) 1, 1 };
        int[] intArray11 = new int[] { (short) 10, ' ', 'a', (short) 1, 1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 97, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 97, 1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) -1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        int[] intArray3 = new int[] { '#', ' ', '#' };
        int[] intArray7 = new int[] { '#', ' ', '#' };
        int[] intArray11 = new int[] { '#', ' ', '#' };
        int[] intArray15 = new int[] { '#', ' ', '#' };
        int[] intArray19 = new int[] { '#', ' ', '#' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 32, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 32, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 32, 35]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 32, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 32, 35]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        int[] intArray1 = new int[] { (short) 100 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) -1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        int[] intArray6 = new int[] { (byte) 10, (short) -1, 0, '4', 'a', (short) 10 };
        int[] intArray13 = new int[] { (byte) 10, (short) -1, 0, '4', 'a', (short) 10 };
        int[] intArray20 = new int[] { (byte) 10, (short) -1, 0, '4', 'a', (short) 10 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 0, 52, 97, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, -1, 0, 52, 97, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, -1, 0, 52, 97, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        int[] intArray5 = new int[] { 10, (short) 1, 1, (-1), 100 };
        int[] intArray11 = new int[] { 10, (short) 1, 1, (-1), 100 };
        int[] intArray17 = new int[] { 10, (short) 1, 1, (-1), 100 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, (short) 1, (short) 100, (byte) -1 };
        int[] intArray11 = new int[] { (byte) -1, (short) -1, (short) 1, (short) 100, (byte) -1 };
        int[] intArray17 = new int[] { (byte) -1, (short) -1, (short) 1, (short) 100, (byte) -1 };
        int[] intArray23 = new int[] { (byte) -1, (short) -1, (short) 1, (short) 100, (byte) -1 };
        int[] intArray29 = new int[] { (byte) -1, (short) -1, (short) 1, (short) 100, (byte) -1 };
        int[] intArray35 = new int[] { (byte) -1, (short) -1, (short) 1, (short) 100, (byte) -1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        int[] intArray5 = new int[] { 1, '#', (-1), 10, (byte) 0 };
        int[] intArray11 = new int[] { 1, '#', (-1), 10, (byte) 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 35, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 35, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        int[] intArray4 = new int[] { '#', (byte) -1, (short) 10, 'a' };
        int[] intArray9 = new int[] { '#', (byte) -1, (short) 10, 'a' };
        int[] intArray14 = new int[] { '#', (byte) -1, (short) 10, 'a' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, -1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, 1, (short) 10, '#' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 1, 10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        int[] intArray6 = new int[] { (short) 1, (short) -1, 1, '#', (-1), (byte) 0 };
        int[] intArray13 = new int[] { (short) 1, (short) -1, 1, '#', (-1), (byte) 0 };
        int[] intArray20 = new int[] { (short) 1, (short) -1, 1, '#', (-1), (byte) 0 };
        int[] intArray27 = new int[] { (short) 1, (short) -1, 1, '#', (-1), (byte) 0 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 1, 35, -1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 1, 35, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 1, 35, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 1, 35, -1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        int[] intArray3 = new int[] { '4', (byte) 0, (short) 100 };
        int[] intArray7 = new int[] { '4', (byte) 0, (short) 100 };
        int[] intArray11 = new int[] { '4', (byte) 0, (short) 100 };
        int[] intArray15 = new int[] { '4', (byte) 0, (short) 100 };
        int[] intArray19 = new int[] { '4', (byte) 0, (short) 100 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 0, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 0, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 0, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        int[] intArray4 = new int[] { (short) -1, (short) -1, (byte) 1, 10 };
        int[] intArray9 = new int[] { (short) -1, (short) -1, (byte) 1, 10 };
        int[] intArray14 = new int[] { (short) -1, (short) -1, (byte) 1, 10 };
        int[] intArray19 = new int[] { (short) -1, (short) -1, (byte) 1, 10 };
        int[] intArray24 = new int[] { (short) -1, (short) -1, (byte) 1, 10 };
        int[] intArray29 = new int[] { (short) -1, (short) -1, (byte) 1, 10 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        int[] intArray2 = new int[] { '4', '4' };
        int[] intArray5 = new int[] { '4', '4' };
        int[] intArray8 = new int[] { '4', '4' };
        int[] intArray11 = new int[] { '4', '4' };
        int[] intArray14 = new int[] { '4', '4' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        int[] intArray2 = new int[] { '4', 'a' };
        int[] intArray5 = new int[] { '4', 'a' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        int[] intArray6 = new int[] { (-1), 0, (byte) 100, 'a', (short) 0, (byte) 100 };
        int[] intArray13 = new int[] { (-1), 0, (byte) 100, 'a', (short) 0, (byte) 100 };
        int[] intArray20 = new int[] { (-1), 0, (byte) 100, 'a', (short) 0, (byte) 100 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 100, 97, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 0, 100, 97, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 100, 97, 0, 100]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        int[] intArray2 = new int[] { 100, 1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        int[] intArray2 = new int[] { 0, 1 };
        int[] intArray5 = new int[] { 0, 1 };
        int[] intArray8 = new int[] { 0, 1 };
        int[] intArray11 = new int[] { 0, 1 };
        int[] intArray14 = new int[] { 0, 1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        int[] intArray6 = new int[] { (byte) 10, 1, '4', 10, (byte) 0, '#' };
        int[] intArray13 = new int[] { (byte) 10, 1, '4', 10, (byte) 0, '#' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 52, 10, 0, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1, 52, 10, 0, 35]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        int[] intArray5 = new int[] { 100, 100, 0, '#', (short) 10 };
        int[] intArray11 = new int[] { 100, 100, 0, '#', (short) 10 };
        int[] intArray17 = new int[] { 100, 100, 0, '#', (short) 10 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 0, 35, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 0, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100, 0, 35, 10]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        int[] intArray3 = new int[] { (short) 10, ' ', (byte) 100 };
        int[] intArray7 = new int[] { (short) 10, ' ', (byte) 100 };
        int[] intArray11 = new int[] { (short) 10, ' ', (byte) 100 };
        int[] intArray15 = new int[] { (short) 10, ' ', (byte) 100 };
        int[] intArray19 = new int[] { (short) 10, ' ', (byte) 100 };
        int[] intArray23 = new int[] { (short) 10, ' ', (byte) 100 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        int[] intArray3 = new int[] { (byte) 100, (short) -1, (short) 0 };
        int[] intArray7 = new int[] { (byte) 100, (short) -1, (short) 0 };
        int[] intArray11 = new int[] { (byte) 100, (short) -1, (short) 0 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        int[] intArray2 = new int[] { 100, (byte) 0 };
        int[] intArray5 = new int[] { 100, (byte) 0 };
        int[] intArray8 = new int[] { 100, (byte) 0 };
        int[] intArray11 = new int[] { 100, (byte) 0 };
        int[] intArray14 = new int[] { 100, (byte) 0 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        int[] intArray1 = new int[] { (-1) };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        int[] intArray3 = new int[] { (short) 100, (byte) 100, (short) 1 };
        int[] intArray7 = new int[] { (short) 100, (byte) 100, (short) 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        int[] intArray3 = new int[] { '4', (byte) -1, (short) 0 };
        int[] intArray7 = new int[] { '4', (byte) -1, (short) 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, -1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        int[] intArray4 = new int[] { 100, ' ', (short) 0, (short) 100 };
        int[] intArray9 = new int[] { 100, ' ', (short) 0, (short) 100 };
        int[] intArray14 = new int[] { 100, ' ', (short) 0, (short) 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 0, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 32, 0, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        int[] intArray2 = new int[] { ' ', 1 };
        int[] intArray5 = new int[] { ' ', 1 };
        int[] intArray8 = new int[] { ' ', 1 };
        int[] intArray11 = new int[] { ' ', 1 };
        int[] intArray14 = new int[] { ' ', 1 };
        int[] intArray17 = new int[] { ' ', 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        int[] intArray5 = new int[] { (byte) -1, '#', (short) -1, (byte) 1, '4' };
        int[] intArray11 = new int[] { (byte) -1, '#', (short) -1, (byte) 1, '4' };
        int[] intArray17 = new int[] { (byte) -1, '#', (short) -1, (byte) 1, '4' };
        int[] intArray23 = new int[] { (byte) -1, '#', (short) -1, (byte) 1, '4' };
        int[] intArray29 = new int[] { (byte) -1, '#', (short) -1, (byte) 1, '4' };
        int[] intArray35 = new int[] { (byte) -1, '#', (short) -1, (byte) 1, '4' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 35, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 35, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 35, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 35, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 35, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        int[] intArray2 = new int[] { (short) 100, 'a' };
        int[] intArray5 = new int[] { (short) 100, 'a' };
        int[] intArray8 = new int[] { (short) 100, 'a' };
        int[] intArray11 = new int[] { (short) 100, 'a' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        int[] intArray6 = new int[] { (short) 0, (-1), (byte) 0, '4', 'a', (short) -1 };
        int[] intArray13 = new int[] { (short) 0, (-1), (byte) 0, '4', 'a', (short) -1 };
        int[] intArray20 = new int[] { (short) 0, (-1), (byte) 0, '4', 'a', (short) -1 };
        int[] intArray27 = new int[] { (short) 0, (-1), (byte) 0, '4', 'a', (short) -1 };
        int[] intArray34 = new int[] { (short) 0, (-1), (byte) 0, '4', 'a', (short) -1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 52, 97, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 0, 52, 97, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, 0, 52, 97, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, -1, 0, 52, 97, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, -1, 0, 52, 97, -1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        int[] intArray5 = new int[] { (byte) -1, '#', (short) 0, 10, (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, '#', (short) 0, 10, (byte) 10 };
        int[] intArray17 = new int[] { (byte) -1, '#', (short) 0, 10, (byte) 10 };
        int[] intArray23 = new int[] { (byte) -1, '#', (short) 0, 10, (byte) 10 };
        int[] intArray29 = new int[] { (byte) -1, '#', (short) 0, 10, (byte) 10 };
        int[] intArray35 = new int[] { (byte) -1, '#', (short) 0, 10, (byte) 10 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 35, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 35, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 35, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 35, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 35, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        int[] intArray3 = new int[] { 'a', (byte) 0, (byte) 0 };
        int[] intArray7 = new int[] { 'a', (byte) 0, (byte) 0 };
        int[] intArray11 = new int[] { 'a', (byte) 0, (byte) 0 };
        int[] intArray15 = new int[] { 'a', (byte) 0, (byte) 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        int[] intArray3 = new int[] { 0, 100, (-1) };
        int[] intArray7 = new int[] { 0, 100, (-1) };
        int[] intArray11 = new int[] { 0, 100, (-1) };
        int[] intArray15 = new int[] { 0, 100, (-1) };
        int[] intArray19 = new int[] { 0, 100, (-1) };
        int[] intArray23 = new int[] { 0, 100, (-1) };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        int[] intArray5 = new int[] { (byte) 1, 1, (short) 1, '4', ' ' };
        int[] intArray11 = new int[] { (byte) 1, 1, (short) 1, '4', ' ' };
        int[] intArray17 = new int[] { (byte) 1, 1, (short) 1, '4', ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 1, 52, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 1, 52, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 1, 52, 32]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, '#', (byte) 10, (byte) 10 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 100, '#', (byte) 10, (byte) 10 };
        int[] intArray17 = new int[] { (byte) 100, (byte) 100, '#', (byte) 10, (byte) 10 };
        int[] intArray23 = new int[] { (byte) 100, (byte) 100, '#', (byte) 10, (byte) 10 };
        int[] intArray29 = new int[] { (byte) 100, (byte) 100, '#', (byte) 10, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 35, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 35, 10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100, 35, 10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100, 35, 10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100, 35, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        int[] intArray2 = new int[] { (short) 100, 1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        int[] intArray2 = new int[] { (short) 0, '#' };
        int[] intArray5 = new int[] { (short) 0, '#' };
        int[] intArray8 = new int[] { (short) 0, '#' };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        int[] intArray5 = new int[] { (byte) 1, (byte) 0, 'a', 10, (short) 1 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 0, 'a', 10, (short) 1 };
        int[] intArray17 = new int[] { (byte) 1, (byte) 0, 'a', 10, (short) 1 };
        int[] intArray23 = new int[] { (byte) 1, (byte) 0, 'a', 10, (short) 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 97, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 97, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 97, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 97, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        int[] intArray2 = new int[] { (byte) -1, (byte) 1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        int[] intArray5 = new int[] { (short) 100, (short) 10, (byte) 100, 1, 1 };
        int[] intArray11 = new int[] { (short) 100, (short) 10, (byte) 100, 1, 1 };
        int[] intArray17 = new int[] { (short) 100, (short) 10, (byte) 100, 1, 1 };
        int[] intArray23 = new int[] { (short) 100, (short) 10, (byte) 100, 1, 1 };
        int[] intArray29 = new int[] { (short) 100, (short) 10, (byte) 100, 1, 1 };
        int[] intArray35 = new int[] { (short) 100, (short) 10, (byte) 100, 1, 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 10, 100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        int[] intArray2 = new int[] { (-1), (byte) 10 };
        int[] intArray5 = new int[] { (-1), (byte) 10 };
        int[] intArray8 = new int[] { (-1), (byte) 10 };
        int[] intArray11 = new int[] { (-1), (byte) 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        int[] intArray6 = new int[] { 100, (byte) 10, '4', (short) 0, 1, (byte) 0 };
        int[] intArray13 = new int[] { 100, (byte) 10, '4', (short) 0, 1, (byte) 0 };
        int[] intArray20 = new int[] { 100, (byte) 10, '4', (short) 0, 1, (byte) 0 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 52, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 52, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 10, 52, 0, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, '#', (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100, (short) 1, '#', (byte) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        int[] intArray4 = new int[] { (short) 100, (short) 0, (-1), (short) 0 };
        int[] intArray9 = new int[] { (short) 100, (short) 0, (-1), (short) 0 };
        int[] intArray14 = new int[] { (short) 100, (short) 0, (-1), (short) 0 };
        int[] intArray19 = new int[] { (short) 100, (short) 0, (-1), (short) 0 };
        int[] intArray24 = new int[] { (short) 100, (short) 0, (-1), (short) 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) -1 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        int[] intArray5 = new int[] { (byte) 0, (short) 100, (short) 0, 'a', 1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 0, 97, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        int[] intArray6 = new int[] { (short) 0, (short) 100, ' ', (short) 0, (byte) -1, (byte) 1 };
        int[] intArray13 = new int[] { (short) 0, (short) 100, ' ', (short) 0, (byte) -1, (byte) 1 };
        int[] intArray20 = new int[] { (short) 0, (short) 100, ' ', (short) 0, (byte) -1, (byte) 1 };
        int[] intArray27 = new int[] { (short) 0, (short) 100, ' ', (short) 0, (byte) -1, (byte) 1 };
        int[] intArray34 = new int[] { (short) 0, (short) 100, ' ', (short) 0, (byte) -1, (byte) 1 };
        int[] intArray41 = new int[] { (short) 0, (short) 100, ' ', (short) 0, (byte) -1, (byte) 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 32, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 32, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, 32, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 100, 32, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 100, 32, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 100, 32, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        int[] intArray5 = new int[] { (short) 10, (-1), (short) 0, 1, 10 };
        int[] intArray11 = new int[] { (short) 10, (-1), (short) 0, 1, 10 };
        int[] intArray17 = new int[] { (short) 10, (-1), (short) 0, 1, 10 };
        int[] intArray23 = new int[] { (short) 10, (-1), (short) 0, 1, 10 };
        int[] intArray29 = new int[] { (short) 10, (-1), (short) 0, 1, 10 };
        int[] intArray35 = new int[] { (short) 10, (-1), (short) 0, 1, 10 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, -1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, -1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, -1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        int[] intArray6 = new int[] { 10, (byte) 0, (short) 10, (byte) 1, (short) 10, ' ' };
        int[] intArray13 = new int[] { 10, (byte) 0, (short) 10, (byte) 1, (short) 10, ' ' };
        int[] intArray20 = new int[] { 10, (byte) 0, (short) 10, (byte) 1, (short) 10, ' ' };
        int[] intArray27 = new int[] { 10, (byte) 0, (short) 10, (byte) 1, (short) 10, ' ' };
        int[] intArray34 = new int[] { 10, (byte) 0, (short) 10, (byte) 1, (short) 10, ' ' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 10, 1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 0, 10, 1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 0, 10, 1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 0, 10, 1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 0, 10, 1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        int[] intArray5 = new int[] { (byte) -1, (-1), 10, (short) 100, (byte) 1 };
        int[] intArray11 = new int[] { (byte) -1, (-1), 10, (short) 100, (byte) 1 };
        int[] intArray17 = new int[] { (byte) -1, (-1), 10, (short) 100, (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        int[] intArray5 = new int[] { 100, (short) -1, (short) -1, (short) 100, (byte) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, (short) 100, 1, (byte) -1 };
        int[] intArray11 = new int[] { (short) 1, (byte) 10, (short) 100, 1, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        int[] intArray5 = new int[] { '4', (-1), (byte) -1, 'a', 0 };
        int[] intArray11 = new int[] { '4', (-1), (byte) -1, 'a', 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, -1, 97, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, -1, -1, 97, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        int[] intArray6 = new int[] { (byte) -1, 1, (short) 10, (byte) 0, 10, (short) 1 };
        int[] intArray13 = new int[] { (byte) -1, 1, (short) 10, (byte) 0, 10, (short) 1 };
        int[] intArray20 = new int[] { (byte) -1, 1, (short) 10, (byte) 0, 10, (short) 1 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 10, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 10, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 1, 10, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        int[] intArray6 = new int[] { (short) 100, 0, '4', 100, '#', (byte) 0 };
        int[] intArray13 = new int[] { (short) 100, 0, '4', 100, '#', (byte) 0 };
        int[] intArray20 = new int[] { (short) 100, 0, '4', 100, '#', (byte) 0 };
        int[] intArray27 = new int[] { (short) 100, 0, '4', 100, '#', (byte) 0 };
        int[] intArray34 = new int[] { (short) 100, 0, '4', 100, '#', (byte) 0 };
        int[] intArray41 = new int[] { (short) 100, 0, '4', 100, '#', (byte) 0 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 52, 100, 35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 52, 100, 35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 52, 100, 35, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 52, 100, 35, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 52, 100, 35, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 52, 100, 35, 0]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        int[] intArray5 = new int[] { 0, (short) 100, (byte) -1, (byte) 10, (short) -1 };
        int[] intArray11 = new int[] { 0, (short) 100, (byte) -1, (byte) 10, (short) -1 };
        int[] intArray17 = new int[] { 0, (short) 100, (byte) -1, (byte) 10, (short) -1 };
        int[] intArray23 = new int[] { 0, (short) 100, (byte) -1, (byte) 10, (short) -1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        int[] intArray5 = new int[] { (short) 10, (short) 100 };
        int[] intArray8 = new int[] { (short) 10, (short) 100 };
        int[] intArray11 = new int[] { (short) 10, (short) 100 };
        int[] intArray14 = new int[] { (short) 10, (short) 100 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        int[] intArray2 = new int[] { (short) -1, (short) 10 };
        int[] intArray5 = new int[] { (short) -1, (short) 10 };
        int[] intArray8 = new int[] { (short) -1, (short) 10 };
        int[] intArray11 = new int[] { (short) -1, (short) 10 };
        int[] intArray14 = new int[] { (short) -1, (short) 10 };
        int[] intArray17 = new int[] { (short) -1, (short) 10 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        int[] intArray3 = new int[] { 'a', (byte) 100, ' ' };
        int[] intArray7 = new int[] { 'a', (byte) 100, ' ' };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        int[] intArray3 = new int[] { (short) 100, (short) -1, ' ' };
        int[] intArray7 = new int[] { (short) 100, (short) -1, ' ' };
        int[] intArray11 = new int[] { (short) 100, (short) -1, ' ' };
        int[] intArray15 = new int[] { (short) 100, (short) -1, ' ' };
        int[] intArray19 = new int[] { (short) 100, (short) -1, ' ' };
        int[] intArray23 = new int[] { (short) 100, (short) -1, ' ' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[] intArray5 = new int[] { '4' };
        int[] intArray7 = new int[] { '4' };
        int[] intArray9 = new int[] { '4' };
        int[] intArray11 = new int[] { '4' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        int[] intArray6 = new int[] { (short) 100, 10, (byte) 10, (short) 0, 'a', 'a' };
        int[] intArray13 = new int[] { (short) 100, 10, (byte) 10, (short) 0, 'a', 'a' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 10, 0, 97, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 10, 0, 97, 97]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        int[] intArray4 = new int[] { 'a', 10, ' ', 100 };
        int[] intArray9 = new int[] { 'a', 10, ' ', 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        int[] intArray4 = new int[] { (byte) 0, 'a', (byte) 1, 'a' };
        int[] intArray9 = new int[] { (byte) 0, 'a', (byte) 1, 'a' };
        int[] intArray14 = new int[] { (byte) 0, 'a', (byte) 1, 'a' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 97, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97, 1, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 97, 1, 97]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        int[] intArray1 = new int[] { (short) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        int[] intArray5 = new int[] { 'a', 0, (byte) 0, (short) 10, (-1) };
        int[] intArray11 = new int[] { 'a', 0, (byte) 0, (short) 10, (-1) };
        int[] intArray17 = new int[] { 'a', 0, (byte) 0, (short) 10, (-1) };
        int[] intArray23 = new int[] { 'a', 0, (byte) 0, (short) 10, (-1) };
        int[] intArray29 = new int[] { 'a', 0, (byte) 0, (short) 10, (-1) };
        int[] intArray35 = new int[] { 'a', 0, (byte) 0, (short) 10, (-1) };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 0, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 0, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 0, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[97, 0, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        int[] intArray5 = new int[] { (byte) -1, (byte) 100, (byte) 10, '#', 0 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 100, (byte) 10, '#', 0 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 100, (byte) 10, '#', 0 };
        int[] intArray23 = new int[] { (byte) -1, (byte) 100, (byte) 10, '#', 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 100, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        int[] intArray6 = new int[] { (short) -1, 10, (short) -1, (byte) 100, (byte) 10, 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, -1, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        int[] intArray5 = new int[] { ' ', '#', (short) -1, (short) -1, '4' };
        int[] intArray11 = new int[] { ' ', '#', (short) -1, (short) -1, '4' };
        int[] intArray17 = new int[] { ' ', '#', (short) -1, (short) -1, '4' };
        int[] intArray23 = new int[] { ' ', '#', (short) -1, (short) -1, '4' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 35, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 35, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 35, -1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        int[] intArray2 = new int[] { 0, (short) 100 };
        int[] intArray5 = new int[] { 0, (short) 100 };
        int[] intArray8 = new int[] { 0, (short) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        int[] intArray2 = new int[] { (byte) 100, (short) 0 };
        int[] intArray5 = new int[] { (byte) 100, (short) 0 };
        int[] intArray8 = new int[] { (byte) 100, (short) 0 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        int[] intArray4 = new int[] { (short) 1, '4', (byte) 10, '#' };
        int[] intArray9 = new int[] { (short) 1, '4', (byte) 10, '#' };
        int[] intArray14 = new int[] { (short) 1, '4', (byte) 10, '#' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 10, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 10, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 52, 10, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        int[] intArray2 = new int[] { (byte) 1, 1 };
        int[] intArray5 = new int[] { (byte) 1, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        int[] intArray3 = new int[] { (short) 10, '4', (short) 10 };
        int[] intArray7 = new int[] { (short) 10, '4', (short) 10 };
        int[] intArray11 = new int[] { (short) 10, '4', (short) 10 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 52, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 52, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        int[] intArray4 = new int[] { 1, (short) 10, (short) 100, '4' };
        int[] intArray9 = new int[] { 1, (short) 10, (short) 100, '4' };
        int[] intArray14 = new int[] { 1, (short) 10, (short) 100, '4' };
        int[] intArray19 = new int[] { 1, (short) 10, (short) 100, '4' };
        int[] intArray24 = new int[] { 1, (short) 10, (short) 100, '4' };
        int[] intArray29 = new int[] { 1, (short) 10, (short) 100, '4' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        int[] intArray3 = new int[] { (short) 0, (byte) 10, (short) 100 };
        int[] intArray7 = new int[] { (short) 0, (byte) 10, (short) 100 };
        int[] intArray11 = new int[] { (short) 0, (byte) 10, (short) 100 };
        int[] intArray15 = new int[] { (short) 0, (byte) 10, (short) 100 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        int[] intArray6 = new int[] { (byte) 1, (byte) -1, 'a', (short) -1, 0, 'a' };
        int[] intArray13 = new int[] { (byte) 1, (byte) -1, 'a', (short) -1, 0, 'a' };
        int[] intArray20 = new int[] { (byte) 1, (byte) -1, 'a', (short) -1, 0, 'a' };
        int[] intArray27 = new int[] { (byte) 1, (byte) -1, 'a', (short) -1, 0, 'a' };
        int[] intArray34 = new int[] { (byte) 1, (byte) -1, 'a', (short) -1, 0, 'a' };
        int[] intArray41 = new int[] { (byte) 1, (byte) -1, 'a', (short) -1, 0, 'a' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 97, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 97, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 97, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 97, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 97, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, -1, 97, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        int[] intArray2 = new int[] { (byte) -1, '4' };
        int[] intArray5 = new int[] { (byte) -1, '4' };
        int[] intArray8 = new int[] { (byte) -1, '4' };
        int[] intArray11 = new int[] { (byte) -1, '4' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        int[] intArray4 = new int[] { '4', (byte) -1, (byte) 100, (short) 1 };
        int[] intArray9 = new int[] { '4', (byte) -1, (byte) 100, (short) 1 };
        int[] intArray14 = new int[] { '4', (byte) -1, (byte) 100, (short) 1 };
        int[] intArray19 = new int[] { '4', (byte) -1, (byte) 100, (short) 1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        int[] intArray2 = new int[] { (short) 10, 'a' };
        int[] intArray5 = new int[] { (short) 10, 'a' };
        int[] intArray8 = new int[] { (short) 10, 'a' };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        int[] intArray3 = new int[] { 10, (short) 100, '4' };
        int[] intArray7 = new int[] { 10, (short) 100, '4' };
        int[] intArray11 = new int[] { 10, (short) 100, '4' };
        int[] intArray15 = new int[] { 10, (short) 100, '4' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 100, 52]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        int[] intArray4 = new int[] { (byte) 0, '4', (byte) 1, '4' };
        int[] intArray9 = new int[] { (byte) 0, '4', (byte) 1, '4' };
        int[] intArray14 = new int[] { (byte) 0, '4', (byte) 1, '4' };
        int[] intArray19 = new int[] { (byte) 0, '4', (byte) 1, '4' };
        int[] intArray24 = new int[] { (byte) 0, '4', (byte) 1, '4' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 1, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 52, 1, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 52, 1, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 52, 1, 52]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 52, 1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        int[] intArray3 = new int[] { (-1), (short) 1, 'a' };
        int[] intArray7 = new int[] { (-1), (short) 1, 'a' };
        int[] intArray11 = new int[] { (-1), (short) 1, 'a' };
        int[] intArray15 = new int[] { (-1), (short) 1, 'a' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[] intArray7 = new int[] { 1 };
        int[] intArray9 = new int[] { 1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        int[] intArray3 = new int[] { (byte) 10, (short) 100, (-1) };
        int[] intArray7 = new int[] { (byte) 10, (short) 100, (-1) };
        int[] intArray11 = new int[] { (byte) 10, (short) 100, (-1) };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        int[] intArray6 = new int[] { (byte) 0, 100, (short) 0, (byte) -1, (-1), (short) 100 };
        int[] intArray13 = new int[] { (byte) 0, 100, (short) 0, (byte) -1, (-1), (short) 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 0, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 0, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, (byte) -1, 'a' };
        int[] intArray9 = new int[] { (byte) 100, (byte) 1, (byte) -1, 'a' };
        int[] intArray14 = new int[] { (byte) 100, (byte) 1, (byte) -1, 'a' };
        int[] intArray19 = new int[] { (byte) 100, (byte) 1, (byte) -1, 'a' };
        int[] intArray24 = new int[] { (byte) 100, (byte) 1, (byte) -1, 'a' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        int[] intArray3 = new int[] { (short) -1, (byte) 0, (short) 0 };
        int[] intArray7 = new int[] { (short) -1, (byte) 0, (short) 0 };
        int[] intArray11 = new int[] { (short) -1, (byte) 0, (short) 0 };
        int[] intArray15 = new int[] { (short) -1, (byte) 0, (short) 0 };
        int[] intArray19 = new int[] { (short) -1, (byte) 0, (short) 0 };
        int[] intArray23 = new int[] { (short) -1, (byte) 0, (short) 0 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        int[] intArray9 = new int[] { '#' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        int[] intArray6 = new int[] { (short) 0, 100, '4', ' ', 0, 10 };
        int[] intArray13 = new int[] { (short) 0, 100, '4', ' ', 0, 10 };
        int[] intArray20 = new int[] { (short) 0, 100, '4', ' ', 0, 10 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 52, 32, 0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 52, 32, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, 52, 32, 0, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        int[] intArray6 = new int[] { (byte) 10, 10, (short) 10, '#', (short) -1, '4' };
        int[] intArray13 = new int[] { (byte) 10, 10, (short) 10, '#', (short) -1, '4' };
        int[] intArray20 = new int[] { (byte) 10, 10, (short) 10, '#', (short) -1, '4' };
        int[] intArray27 = new int[] { (byte) 10, 10, (short) 10, '#', (short) -1, '4' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10, 10, 35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10, 10, 35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10, 10, 35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        int[] intArray3 = new int[] { (short) 10, 10, (short) 10 };
        int[] intArray7 = new int[] { (short) 10, 10, (short) 10 };
        int[] intArray11 = new int[] { (short) 10, 10, (short) 10 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        int[] intArray4 = new int[] { (short) 100, (byte) 10, 0, 100 };
        int[] intArray9 = new int[] { (short) 100, (byte) 10, 0, 100 };
        int[] intArray14 = new int[] { (short) 100, (byte) 10, 0, 100 };
        int[] intArray19 = new int[] { (short) 100, (byte) 10, 0, 100 };
        int[] intArray24 = new int[] { (short) 100, (byte) 10, 0, 100 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 0, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 0, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 10, 0, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 0, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 10, 0, 100]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        int[] intArray2 = new int[] { 'a', (short) 1 };
        int[] intArray5 = new int[] { 'a', (short) 1 };
        int[] intArray8 = new int[] { 'a', (short) 1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        int[] intArray4 = new int[] { (short) -1, (short) -1, (-1), (byte) 100 };
        int[] intArray9 = new int[] { (short) -1, (short) -1, (-1), (byte) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        int[] intArray4 = new int[] { (byte) 0, (short) 1, 0, '#' };
        int[] intArray9 = new int[] { (byte) 0, (short) 1, 0, '#' };
        int[] intArray14 = new int[] { (byte) 0, (short) 1, 0, '#' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 0, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 0, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        int[] intArray4 = new int[] { 1, (byte) 100, 'a', ' ' };
        int[] intArray9 = new int[] { 1, (byte) 100, 'a', ' ' };
        int[] intArray14 = new int[] { 1, (byte) 100, 'a', ' ' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 97, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 100, 97, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 100, 97, 32]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        int[] intArray4 = new int[] { (byte) 1, 0, (short) 100, (-1) };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 100, (-1) };
        int[] intArray14 = new int[] { (byte) 1, 0, (short) 100, (-1) };
        int[] intArray19 = new int[] { (byte) 1, 0, (short) 100, (-1) };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[] intArray5 = new int[] { 0 };
        int[] intArray7 = new int[] { 0 };
        int[] intArray9 = new int[] { 0 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        int[] intArray6 = new int[] { (byte) 1, (short) 10, 100, 10, (short) 0, (byte) 10 };
        int[] intArray13 = new int[] { (byte) 1, (short) 10, 100, 10, (short) 0, (byte) 10 };
        int[] intArray20 = new int[] { (byte) 1, (short) 10, 100, 10, (short) 0, (byte) 10 };
        int[] intArray27 = new int[] { (byte) 1, (short) 10, 100, 10, (short) 0, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 100, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 10, 100, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 10, 100, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 10, 100, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        int[] intArray6 = new int[] { ' ', (byte) 1, 100, 'a', 0, (byte) 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 1, 100, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        int[] intArray2 = new int[] { 100, (-1) };
        int[] intArray5 = new int[] { 100, (-1) };
        int[] intArray8 = new int[] { 100, (-1) };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        int[] intArray2 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        int[] intArray5 = new int[] { (short) -1, 1, 10, 10, '4' };
        int[] intArray11 = new int[] { (short) -1, 1, 10, 10, '4' };
        int[] intArray17 = new int[] { (short) -1, 1, 10, 10, '4' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 10, 10, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 10, 10, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1, 10, 10, 52]");
        org.junit.Assert.assertNotNull(intArray18);
    }
}

