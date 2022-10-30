package MazeRecursion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        int[] intArray6 = new int[] { 100, (byte) 10, '4', 0, ' ', (byte) -1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 52, 0, 32, -1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 10, 0);
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
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 1, (int) (byte) 100);
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
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        int[] intArray6 = new int[] { 100, (byte) 1, 'a', '#', 1, (byte) 0 };
        int[] intArray13 = new int[] { 100, (byte) 1, 'a', '#', 1, (byte) 0 };
        int[] intArray20 = new int[] { 100, (byte) 1, 'a', '#', 1, (byte) 0 };
        int[] intArray27 = new int[] { 100, (byte) 1, 'a', '#', 1, (byte) 0 };
        int[] intArray34 = new int[] { 100, (byte) 1, 'a', '#', 1, (byte) 0 };
        int[] intArray41 = new int[] { 100, (byte) 1, 'a', '#', 1, (byte) 0 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 97, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 97, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 1, 97, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 97, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 1, 97, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 1, 97, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 10, 0);
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
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        int[] intArray4 = new int[] { (byte) 100, (short) 100, '4', '4' };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 52, 52]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        int[] intArray3 = new int[] { '4', (byte) 10, (short) 100 };
        int[] intArray7 = new int[] { '4', (byte) 10, (short) 100 };
        int[] intArray11 = new int[] { '4', (byte) 10, (short) 100 };
        int[] intArray15 = new int[] { '4', (byte) 10, (short) 100 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 10, 100]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        int[] intArray3 = new int[] { (-1), (byte) 10, (byte) -1 };
        int[] intArray7 = new int[] { (-1), (byte) 10, (byte) -1 };
        int[] intArray11 = new int[] { (-1), (byte) 10, (byte) -1 };
        int[] intArray15 = new int[] { (-1), (byte) 10, (byte) -1 };
        int[] intArray19 = new int[] { (-1), (byte) 10, (byte) -1 };
        int[] intArray23 = new int[] { (-1), (byte) 10, (byte) -1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        int[] intArray2 = new int[] { (short) 0, '#' };
        int[] intArray5 = new int[] { (short) 0, '#' };
        int[] intArray8 = new int[] { (short) 0, '#' };
        int[] intArray11 = new int[] { (short) 0, '#' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        int[] intArray3 = new int[] { (byte) 0, '4', 1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        int[] intArray4 = new int[] { 1, ' ', (byte) 10, (short) -1 };
        int[] intArray9 = new int[] { 1, ' ', (byte) 10, (short) -1 };
        int[] intArray14 = new int[] { 1, ' ', (byte) 10, (short) -1 };
        int[] intArray19 = new int[] { 1, ' ', (byte) 10, (short) -1 };
        int[] intArray24 = new int[] { 1, ' ', (byte) 10, (short) -1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        int[] intArray3 = new int[] { (short) 100, (-1), (byte) 1 };
        int[] intArray7 = new int[] { (short) 100, (-1), (byte) 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 0, (int) (short) 10);
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
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        int[] intArray2 = new int[] { (short) -1, (byte) 10 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, (byte) 100, (short) -1, (byte) -1 };
        int[] intArray11 = new int[] { (byte) -1, (short) 0, (byte) 100, (short) -1, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 0, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        int[] intArray2 = new int[] { 10, 10 };
        int[] intArray5 = new int[] { 10, 10 };
        int[] intArray8 = new int[] { 10, 10 };
        int[] intArray11 = new int[] { 10, 10 };
        int[] intArray14 = new int[] { 10, 10 };
        int[] intArray17 = new int[] { 10, 10 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = new int[] { 100 };
        int[] intArray9 = new int[] { 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (byte) -1, (int) 'a');
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
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10 };
        int[] intArray9 = new int[] { (byte) 10 };
        int[] intArray11 = new int[] { (byte) 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[] intArray7 = new int[] { 1 };
        int[] intArray9 = new int[] { 1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (-1), (int) (short) 1);
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
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        int[] intArray1 = new int[] { (byte) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        int[] intArray5 = new int[] { (short) 10, ' ', (short) 10, (short) 1, (byte) -1 };
        int[] intArray11 = new int[] { (short) 10, ' ', (short) 10, (short) 1, (byte) -1 };
        int[] intArray17 = new int[] { (short) 10, ' ', (short) 10, (short) 1, (byte) -1 };
        int[] intArray23 = new int[] { (short) 10, ' ', (short) 10, (short) 1, (byte) -1 };
        int[] intArray29 = new int[] { (short) 10, ' ', (short) 10, (short) 1, (byte) -1 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 32, 10, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 32, 10, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 32, 10, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        int[] intArray2 = new int[] { (short) -1, '#' };
        int[] intArray5 = new int[] { (short) -1, '#' };
        int[] intArray8 = new int[] { (short) -1, '#' };
        int[] intArray11 = new int[] { (short) -1, '#' };
        int[] intArray14 = new int[] { (short) -1, '#' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray5 = new int[] { 10, '4' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        int[] intArray4 = new int[] { '#', (short) -1, (short) 0, (byte) 1 };
        int[] intArray9 = new int[] { '#', (short) -1, (short) 0, (byte) 1 };
        int[] intArray14 = new int[] { '#', (short) -1, (short) 0, (byte) 1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        int[] intArray2 = new int[] { (short) 0, (byte) 1 };
        int[] intArray5 = new int[] { (short) 0, (byte) 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, (short) 1, (short) 1, '#' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 1, 1, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 100, (int) (byte) 1);
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
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        int[] intArray4 = new int[] { 10, 0, (short) 10, 0 };
        int[] intArray9 = new int[] { 10, 0, (short) 10, 0 };
        int[] intArray14 = new int[] { 10, 0, (short) 10, 0 };
        int[] intArray19 = new int[] { 10, 0, (short) 10, 0 };
        int[] intArray24 = new int[] { 10, 0, (short) 10, 0 };
        int[] intArray29 = new int[] { 10, 0, (short) 10, 0 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        int[] intArray6 = new int[] { (byte) 10, (byte) 10, 10, (-1), (byte) 0, (short) 100 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, 10, (-1), (byte) 0, (short) 100 };
        int[] intArray20 = new int[] { (byte) 10, (byte) 10, 10, (-1), (byte) 0, (short) 100 };
        int[] intArray27 = new int[] { (byte) 10, (byte) 10, 10, (-1), (byte) 0, (short) 100 };
        int[] intArray34 = new int[] { (byte) 10, (byte) 10, 10, (-1), (byte) 0, (short) 100 };
        int[] intArray41 = new int[] { (byte) 10, (byte) 10, 10, (-1), (byte) 0, (short) 100 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10, 10, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10, 10, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10, 10, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 10, 10, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 10, 10, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        int[] intArray4 = new int[] { 100, 10, 100, (short) 100 };
        int[] intArray9 = new int[] { 100, 10, 100, (short) 100 };
        int[] intArray14 = new int[] { 100, 10, 100, (short) 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, '4', 100, (byte) 1, ' ' };
        int[] intArray13 = new int[] { (byte) 100, (byte) 100, '4', 100, (byte) 1, ' ' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 52, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, 52, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        int[] intArray5 = new int[] { 0, 'a', (short) 100, (short) 0, 0 };
        int[] intArray11 = new int[] { 0, 'a', (short) 100, (short) 0, 0 };
        int[] intArray17 = new int[] { 0, 'a', (short) 100, (short) 0, 0 };
        int[] intArray23 = new int[] { 0, 'a', (short) 100, (short) 0, 0 };
        int[] intArray29 = new int[] { 0, 'a', (short) 100, (short) 0, 0 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 97, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 97, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 97, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 97, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        int[] intArray5 = new int[] { ' ', '#', 10, ' ', ' ' };
        int[] intArray11 = new int[] { ' ', '#', 10, ' ', ' ' };
        int[] intArray17 = new int[] { ' ', '#', 10, ' ', ' ' };
        int[] intArray23 = new int[] { ' ', '#', 10, ' ', ' ' };
        int[] intArray29 = new int[] { ' ', '#', 10, ' ', ' ' };
        int[] intArray35 = new int[] { ' ', '#', 10, ' ', ' ' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 10, 32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 35, 10, 32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 35, 10, 32, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 35, 10, 32, 32]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 35, 10, 32, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 35, 10, 32, 32]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        int[] intArray5 = new int[] { (byte) 100, 10, (byte) 0, (short) 0, (byte) 10 };
        int[] intArray11 = new int[] { (byte) 100, 10, (byte) 0, (short) 0, (byte) 10 };
        int[] intArray17 = new int[] { (byte) 100, 10, (byte) 0, (short) 0, (byte) 10 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        int[] intArray6 = new int[] { ' ', ' ', (byte) 1, (short) -1, (short) 1, 0 };
        int[] intArray13 = new int[] { ' ', ' ', (byte) 1, (short) -1, (short) 1, 0 };
        int[] intArray20 = new int[] { ' ', ' ', (byte) 1, (short) -1, (short) 1, 0 };
        int[] intArray27 = new int[] { ' ', ' ', (byte) 1, (short) -1, (short) 1, 0 };
        int[] intArray34 = new int[] { ' ', ' ', (byte) 1, (short) -1, (short) 1, 0 };
        int[] intArray41 = new int[] { ' ', ' ', (byte) 1, (short) -1, (short) 1, 0 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 32, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 32, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 32, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 32, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        int[] intArray4 = new int[] { (byte) 1, '#', (byte) 10, 'a' };
        int[] intArray9 = new int[] { (byte) 1, '#', (byte) 10, 'a' };
        int[] intArray14 = new int[] { (byte) 1, '#', (byte) 10, 'a' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 35, 10, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 35, 10, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 35, 10, 97]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        int[] intArray4 = new int[] { 0, (byte) 100, (short) 0, 1 };
        int[] intArray9 = new int[] { 0, (byte) 100, (short) 0, 1 };
        int[] intArray14 = new int[] { 0, (byte) 100, (short) 0, 1 };
        int[] intArray19 = new int[] { 0, (byte) 100, (short) 0, 1 };
        int[] intArray24 = new int[] { 0, (byte) 100, (short) 0, 1 };
        int[] intArray29 = new int[] { 0, (byte) 100, (short) 0, 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        int[] intArray6 = new int[] { (short) 100, ' ', 0, (short) 10, (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (short) 100, ' ', 0, (short) 10, (byte) -1, (byte) 10 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 0, 10, -1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, 0, 10, -1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        int[] intArray6 = new int[] { '4', ' ', (byte) 100, (byte) 0, (short) -1, (short) 100 };
        int[] intArray13 = new int[] { '4', ' ', (byte) 100, (byte) 0, (short) -1, (short) 100 };
        int[] intArray20 = new int[] { '4', ' ', (byte) 100, (byte) 0, (short) -1, (short) 100 };
        int[] intArray27 = new int[] { '4', ' ', (byte) 100, (byte) 0, (short) -1, (short) 100 };
        int[] intArray34 = new int[] { '4', ' ', (byte) 100, (byte) 0, (short) -1, (short) 100 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 32, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 32, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 32, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 32, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[52, 32, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        int[] intArray2 = new int[] { 10, 1 };
        int[] intArray5 = new int[] { 10, 1 };
        int[] intArray8 = new int[] { 10, 1 };
        int[] intArray11 = new int[] { 10, 1 };
        int[] intArray14 = new int[] { 10, 1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        int[] intArray5 = new int[] { '#', (byte) 1, (byte) 1, ' ', 1 };
        int[] intArray11 = new int[] { '#', (byte) 1, (byte) 1, ' ', 1 };
        int[] intArray17 = new int[] { '#', (byte) 1, (byte) 1, ' ', 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1, 1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 1, 1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 1, 1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        int[] intArray3 = new int[] { ' ', 1, ' ' };
        int[] intArray7 = new int[] { ' ', 1, ' ' };
        int[] intArray11 = new int[] { ' ', 1, ' ' };
        int[] intArray15 = new int[] { ' ', 1, ' ' };
        int[] intArray19 = new int[] { ' ', 1, ' ' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        int[] intArray6 = new int[] { 0, (short) -1, 0, (short) -1, (-1), 1 };
        int[] intArray13 = new int[] { 0, (short) -1, 0, (short) -1, (-1), 1 };
        int[] intArray20 = new int[] { 0, (short) -1, 0, (short) -1, (-1), 1 };
        int[] intArray27 = new int[] { 0, (short) -1, 0, (short) -1, (-1), 1 };
        int[] intArray34 = new int[] { 0, (short) -1, 0, (short) -1, (-1), 1 };
        int[] intArray41 = new int[] { 0, (short) -1, 0, (short) -1, (-1), 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, -1, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, -1, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, -1, 0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        int[] intArray2 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        int[] intArray3 = new int[] { (short) -1, ' ', 10 };
        int[] intArray7 = new int[] { (short) -1, ' ', 10 };
        int[] intArray11 = new int[] { (short) -1, ' ', 10 };
        int[] intArray15 = new int[] { (short) -1, ' ', 10 };
        int[] intArray19 = new int[] { (short) -1, ' ', 10 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        int[] intArray6 = new int[] { 100, (short) 100, (byte) 10, (short) 0, '4', (byte) 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 10, 0, 52, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        int[] intArray6 = new int[] { '4', 100, (byte) 1, 0, (short) 10, 1 };
        int[] intArray13 = new int[] { '4', 100, (byte) 1, 0, (short) 10, 1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 100, 1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        int[] intArray6 = new int[] { 100, (byte) 10, 'a', 0, '4', '#' };
        int[] intArray13 = new int[] { 100, (byte) 10, 'a', 0, '4', '#' };
        int[] intArray20 = new int[] { 100, (byte) 10, 'a', 0, '4', '#' };
        int[] intArray27 = new int[] { 100, (byte) 10, 'a', 0, '4', '#' };
        int[] intArray34 = new int[] { 100, (byte) 10, 'a', 0, '4', '#' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 97, 0, 52, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 97, 0, 52, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 10, 97, 0, 52, 35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 10, 97, 0, 52, 35]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 10, 97, 0, 52, 35]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) -1 };
        int[] intArray9 = new int[] { (short) -1 };
        int[] intArray11 = new int[] { (short) -1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        int[] intArray5 = new int[] { (byte) 0, 'a', (short) 10, 'a', 1 };
        int[] intArray11 = new int[] { (byte) 0, 'a', (short) 10, 'a', 1 };
        int[] intArray17 = new int[] { (byte) 0, 'a', (short) 10, 'a', 1 };
        int[] intArray23 = new int[] { (byte) 0, 'a', (short) 10, 'a', 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 97, 10, 97, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 10, 97, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 97, 10, 97, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 97, 10, 97, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 0, (-1));
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
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        int[] intArray3 = new int[] { 'a', (byte) 1, (short) 0 };
        int[] intArray7 = new int[] { 'a', (byte) 1, (short) 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        int[] intArray4 = new int[] { (short) 100, (byte) 10, 0, (byte) 1 };
        int[] intArray9 = new int[] { (short) 100, (byte) 10, 0, (byte) 1 };
        int[] intArray14 = new int[] { (short) 100, (byte) 10, 0, (byte) 1 };
        int[] intArray19 = new int[] { (short) 100, (byte) 10, 0, (byte) 1 };
        int[] intArray24 = new int[] { (short) 100, (byte) 10, 0, (byte) 1 };
        int[] intArray29 = new int[] { (short) 100, (byte) 10, 0, (byte) 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 0, 0);
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
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        int[] intArray5 = new int[] { (short) 10, (byte) 1 };
        int[] intArray8 = new int[] { (short) 10, (byte) 1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        int[] intArray5 = new int[] { (-1), (byte) 1 };
        int[] intArray8 = new int[] { (-1), (byte) 1 };
        int[] intArray11 = new int[] { (-1), (byte) 1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        int[] intArray3 = new int[] { 0, 100, (byte) 1 };
        int[] intArray7 = new int[] { 0, 100, (byte) 1 };
        int[] intArray11 = new int[] { 0, 100, (byte) 1 };
        int[] intArray15 = new int[] { 0, 100, (byte) 1 };
        int[] intArray19 = new int[] { 0, 100, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        int[] intArray3 = new int[] { (-1), 1, (short) -1 };
        int[] intArray7 = new int[] { (-1), 1, (short) -1 };
        int[] intArray11 = new int[] { (-1), 1, (short) -1 };
        int[] intArray15 = new int[] { (-1), 1, (short) -1 };
        int[] intArray19 = new int[] { (-1), 1, (short) -1 };
        int[] intArray23 = new int[] { (-1), 1, (short) -1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        int[] intArray4 = new int[] { 0, '4', (short) 0, 10 };
        int[] intArray9 = new int[] { 0, '4', (short) 0, 10 };
        int[] intArray14 = new int[] { 0, '4', (short) 0, 10 };
        int[] intArray19 = new int[] { 0, '4', (short) 0, 10 };
        int[] intArray24 = new int[] { 0, '4', (short) 0, 10 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 0, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 52, 0, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 52, 0, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 52, 0, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 52, 0, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        int[] intArray3 = new int[] { (short) -1, ' ', '4' };
        int[] intArray7 = new int[] { (short) -1, ' ', '4' };
        int[] intArray11 = new int[] { (short) -1, ' ', '4' };
        int[] intArray15 = new int[] { (short) -1, ' ', '4' };
        int[] intArray19 = new int[] { (short) -1, ' ', '4' };
        int[] intArray23 = new int[] { (short) -1, ' ', '4' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 32, 52]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        int[] intArray5 = new int[] { (short) 0, (short) 10, ' ', (short) 1, 100 };
        int[] intArray11 = new int[] { (short) 0, (short) 10, ' ', (short) 1, 100 };
        int[] intArray17 = new int[] { (short) 0, (short) 10, ' ', (short) 1, 100 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 32, 1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10, 32, 1, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        int[] intArray5 = new int[] { 10, (-1), (byte) 10, (short) 100, (short) 100 };
        int[] intArray11 = new int[] { 10, (-1), (byte) 10, (short) 100, (short) 100 };
        int[] intArray17 = new int[] { 10, (-1), (byte) 10, (short) 100, (short) 100 };
        int[] intArray23 = new int[] { 10, (-1), (byte) 10, (short) 100, (short) 100 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, -1, 10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        int[] intArray6 = new int[] { (byte) 100, (short) -1, (byte) 10, (short) 0, (byte) 1, (short) 10 };
        int[] intArray13 = new int[] { (byte) 100, (short) -1, (byte) 10, (short) 0, (byte) 1, (short) 10 };
        int[] intArray20 = new int[] { (byte) 100, (short) -1, (byte) 10, (short) 0, (byte) 1, (short) 10 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 10, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 10, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        int[] intArray2 = new int[] { '4', (short) 10 };
        int[] intArray5 = new int[] { '4', (short) 10 };
        int[] intArray8 = new int[] { '4', (short) 10 };
        int[] intArray11 = new int[] { '4', (short) 10 };
        int[] intArray14 = new int[] { '4', (short) 10 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        int[] intArray6 = new int[] { (short) 0, 10, (short) 1, (byte) 1, (short) -1, (byte) 10 };
        int[] intArray13 = new int[] { (short) 0, 10, (short) 1, (byte) 1, (short) -1, (byte) 10 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 10, 100);
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
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        int[] intArray6 = new int[] { ' ', (short) 100, 'a', (-1), (byte) 100, '4' };
        int[] intArray13 = new int[] { ' ', (short) 100, 'a', (-1), (byte) 100, '4' };
        int[] intArray20 = new int[] { ' ', (short) 100, 'a', (-1), (byte) 100, '4' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 100, 97, -1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 100, 97, -1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 100, 97, -1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        int[] intArray1 = new int[] { (short) 10 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 1, (int) (short) -1);
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
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        int[] intArray1 = new int[] { (short) 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        int[] intArray3 = new int[] { (byte) 1, '#', (byte) 10 };
        int[] intArray7 = new int[] { (byte) 1, '#', (byte) 10 };
        int[] intArray11 = new int[] { (byte) 1, '#', (byte) 10 };
        int[] intArray15 = new int[] { (byte) 1, '#', (byte) 10 };
        int[] intArray19 = new int[] { (byte) 1, '#', (byte) 10 };
        int[] intArray23 = new int[] { (byte) 1, '#', (byte) 10 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        int[] intArray4 = new int[] { '#', (short) 1, 0, (byte) 0 };
        int[] intArray9 = new int[] { '#', (short) 1, 0, (byte) 0 };
        int[] intArray14 = new int[] { '#', (short) 1, 0, (byte) 0 };
        int[] intArray19 = new int[] { '#', (short) 1, 0, (byte) 0 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        int[] intArray6 = new int[] { 100, (byte) 100, 1, (byte) -1, (byte) 10, ' ' };
        int[] intArray13 = new int[] { 100, (byte) 100, 1, (byte) -1, (byte) 10, ' ' };
        int[] intArray20 = new int[] { 100, (byte) 100, 1, (byte) -1, (byte) 10, ' ' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 1, -1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, 1, -1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100, 1, -1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) '#', (int) (short) 100);
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
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) 'a', (int) (short) -1);
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
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        int[] intArray4 = new int[] { (short) 100, (byte) 0, 100, (byte) 10 };
        int[] intArray9 = new int[] { (short) 100, (byte) 0, 100, (byte) 10 };
        int[] intArray14 = new int[] { (short) 100, (byte) 0, 100, (byte) 10 };
        int[] intArray19 = new int[] { (short) 100, (byte) 0, 100, (byte) 10 };
        int[] intArray24 = new int[] { (short) 100, (byte) 0, 100, (byte) 10 };
        int[] intArray29 = new int[] { (short) 100, (byte) 0, 100, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        int[] intArray4 = new int[] { (short) 10, (short) -1, 'a', (byte) 100 };
        int[] intArray9 = new int[] { (short) 10, (short) -1, 'a', (byte) 100 };
        int[] intArray14 = new int[] { (short) 10, (short) -1, 'a', (byte) 100 };
        int[] intArray19 = new int[] { (short) 10, (short) -1, 'a', (byte) 100 };
        int[] intArray24 = new int[] { (short) 10, (short) -1, 'a', (byte) 100 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        int[] intArray3 = new int[] { 0, 1, 'a' };
        int[] intArray7 = new int[] { 0, 1, 'a' };
        int[] intArray11 = new int[] { 0, 1, 'a' };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 97]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 1, (int) (short) 10);
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
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) 100, (int) (byte) 100);
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
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        int[] intArray6 = new int[] { 'a', (short) 100, '4', 100, 0, '4' };
        int[] intArray13 = new int[] { 'a', (short) 100, '4', 100, 0, '4' };
        int[] intArray20 = new int[] { 'a', (short) 100, '4', 100, 0, '4' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 52, 100, 0, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 52, 100, 0, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 100, 52, 100, 0, 52]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        int[] intArray3 = new int[] { 0, (byte) 0, 'a' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 97]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        int[] intArray5 = new int[] { 10, (byte) 100, (byte) 10, ' ', (short) 10 };
        int[] intArray11 = new int[] { 10, (byte) 100, (byte) 10, ' ', (short) 10 };
        int[] intArray17 = new int[] { 10, (byte) 100, (byte) 10, ' ', (short) 10 };
        int[] intArray23 = new int[] { 10, (byte) 100, (byte) 10, ' ', (short) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 100, 10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, 10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        int[] intArray6 = new int[] { (short) -1, (byte) 10, 10, '4', (short) 1, (short) 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 10, 52, 1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, 0, (-1));
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
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        int[] intArray3 = new int[] { (short) 10, 0, (byte) 1 };
        int[] intArray7 = new int[] { (short) 10, 0, (byte) 1 };
        int[] intArray11 = new int[] { (short) 10, 0, (byte) 1 };
        int[] intArray15 = new int[] { (short) 10, 0, (byte) 1 };
        int[] intArray19 = new int[] { (short) 10, 0, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        int[] intArray6 = new int[] { (byte) -1, (short) 10, (-1), (byte) 10, 1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (short) 10, (-1), (byte) 10, 1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) -1, (short) 10, (-1), (byte) 10, 1, (byte) 10 };
        int[] intArray27 = new int[] { (byte) -1, (short) 10, (-1), (byte) 10, 1, (byte) 10 };
        int[] intArray34 = new int[] { (byte) -1, (short) 10, (-1), (byte) 10, 1, (byte) 10 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 10, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 10, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        int[] intArray2 = new int[] { (short) -1, '4' };
        int[] intArray5 = new int[] { (short) -1, '4' };
        int[] intArray8 = new int[] { (short) -1, '4' };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        int[] intArray6 = new int[] { (short) 1, 100, (short) 10, (short) 100, (byte) -1, ' ' };
        int[] intArray13 = new int[] { (short) 1, 100, (short) 10, (short) 100, (byte) -1, ' ' };
        int[] intArray20 = new int[] { (short) 1, 100, (short) 10, (short) 100, (byte) -1, ' ' };
        int[] intArray27 = new int[] { (short) 1, 100, (short) 10, (short) 100, (byte) -1, ' ' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 10, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 10, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 100, 10, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 100, 10, 100, -1, 32]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        int[] intArray3 = new int[] { (byte) 100, 100, (byte) 0 };
        int[] intArray7 = new int[] { (byte) 100, 100, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 100, 100, (byte) 0 };
        int[] intArray15 = new int[] { (byte) 100, 100, (byte) 0 };
        int[] intArray19 = new int[] { (byte) 100, 100, (byte) 0 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        int[] intArray5 = new int[] { '#', (-1), 0, 'a', (short) 0 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 0, 97, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        int[] intArray4 = new int[] { 10, (short) 10, (short) 100, 'a' };
        int[] intArray9 = new int[] { 10, (short) 10, (short) 100, 'a' };
        int[] intArray14 = new int[] { 10, (short) 10, (short) 100, 'a' };
        int[] intArray19 = new int[] { 10, (short) 10, (short) 100, 'a' };
        int[] intArray24 = new int[] { 10, (short) 10, (short) 100, 'a' };
        int[] intArray29 = new int[] { 10, (short) 10, (short) 100, 'a' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 100, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10, 100, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10, 100, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10, 100, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 10, 100, 97]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 10, 100, 97]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) 10, 0);
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
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 0, (int) (byte) 1);
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
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 1, (int) (byte) 10);
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
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        int[] intArray6 = new int[] { (byte) 100, (byte) 1, 'a', (short) 1, (-1), (byte) 100 };
        int[] intArray13 = new int[] { (byte) 100, (byte) 1, 'a', (short) 1, (-1), (byte) 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 97, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 97, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        int[] intArray6 = new int[] { (byte) 100, (short) -1, (byte) 100, ' ', (byte) 100, (short) 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 100, 32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        int[] intArray2 = new int[] { '4', (byte) 100 };
        int[] intArray5 = new int[] { '4', (byte) 100 };
        int[] intArray8 = new int[] { '4', (byte) 100 };
        int[] intArray11 = new int[] { '4', (byte) 100 };
        int[] intArray14 = new int[] { '4', (byte) 100 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        int[] intArray3 = new int[] { (byte) -1, (byte) 1, '4' };
        int[] intArray7 = new int[] { (byte) -1, (byte) 1, '4' };
        int[] intArray11 = new int[] { (byte) -1, (byte) 1, '4' };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        int[] intArray6 = new int[] { '#', (byte) 1, (byte) -1, (short) 10, '#', (short) 0 };
        int[] intArray13 = new int[] { '#', (byte) 1, (byte) -1, (short) 10, '#', (short) 0 };
        int[] intArray20 = new int[] { '#', (byte) 1, (byte) -1, (short) 10, '#', (short) 0 };
        int[] intArray27 = new int[] { '#', (byte) 1, (byte) -1, (short) 10, '#', (short) 0 };
        int[] intArray34 = new int[] { '#', (byte) 1, (byte) -1, (short) 10, '#', (short) 0 };
        int[] intArray41 = new int[] { '#', (byte) 1, (byte) -1, (short) 10, '#', (short) 0 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 1, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 1, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 1, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 1, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 1, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        int[] intArray4 = new int[] { 10, (byte) -1, '4', (byte) 1 };
        int[] intArray9 = new int[] { 10, (byte) -1, '4', (byte) 1 };
        int[] intArray14 = new int[] { 10, (byte) -1, '4', (byte) 1 };
        int[] intArray19 = new int[] { 10, (byte) -1, '4', (byte) 1 };
        int[] intArray24 = new int[] { 10, (byte) -1, '4', (byte) 1 };
        int[] intArray29 = new int[] { 10, (byte) -1, '4', (byte) 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        int[] intArray3 = new int[] { (byte) 100, '#', (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100, '#', (byte) 100 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 35, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 100]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        int[] intArray3 = new int[] { 'a', (short) 100, (short) 0 };
        int[] intArray7 = new int[] { 'a', (short) 100, (short) 0 };
        int[] intArray11 = new int[] { 'a', (short) 100, (short) 0 };
        int[] intArray15 = new int[] { 'a', (short) 100, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 100, (short) 0 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[] intArray9 = new int[] { (short) 10 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) '4', (int) (short) 1);
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
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, (short) 100, 10, 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        int[] intArray2 = new int[] { (byte) 10, 'a' };
        int[] intArray5 = new int[] { (byte) 10, 'a' };
        int[] intArray8 = new int[] { (byte) 10, 'a' };
        int[] intArray11 = new int[] { (byte) 10, 'a' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        int[] intArray3 = new int[] { (byte) 10, (short) 1, 10 };
        int[] intArray7 = new int[] { (byte) 10, (short) 1, 10 };
        int[] intArray11 = new int[] { (byte) 10, (short) 1, 10 };
        int[] intArray15 = new int[] { (byte) 10, (short) 1, 10 };
        int[] intArray19 = new int[] { (byte) 10, (short) 1, 10 };
        int[] intArray23 = new int[] { (byte) 10, (short) 1, 10 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        int[] intArray2 = new int[] { '4', 100 };
        int[] intArray5 = new int[] { '4', 100 };
        int[] intArray8 = new int[] { '4', 100 };
        int[] intArray11 = new int[] { '4', 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        int[] intArray6 = new int[] { (byte) -1, (byte) 100, (-1), (byte) 0, (short) 0, (-1) };
        int[] intArray13 = new int[] { (byte) -1, (byte) 100, (-1), (byte) 0, (short) 0, (-1) };
        int[] intArray20 = new int[] { (byte) -1, (byte) 100, (-1), (byte) 0, (short) 0, (-1) };
        int[] intArray27 = new int[] { (byte) -1, (byte) 100, (-1), (byte) 0, (short) 0, (-1) };
        int[] intArray34 = new int[] { (byte) -1, (byte) 100, (-1), (byte) 0, (short) 0, (-1) };
        int[] intArray41 = new int[] { (byte) -1, (byte) 100, (-1), (byte) 0, (short) 0, (-1) };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, -1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, -1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 100, -1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 100, -1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 100, -1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 100, -1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        int[] intArray5 = new int[] { 100, '#', '4', 0, ' ' };
        int[] intArray11 = new int[] { 100, '#', '4', 0, ' ' };
        int[] intArray17 = new int[] { 100, '#', '4', 0, ' ' };
        int[] intArray23 = new int[] { 100, '#', '4', 0, ' ' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, 52, 0, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 52, 0, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 52, 0, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, 52, 0, 32]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        int[] intArray6 = new int[] { '4', ' ', 0, (byte) 10, '4', 0 };
        int[] intArray13 = new int[] { '4', ' ', 0, (byte) 10, '4', 0 };
        int[] intArray20 = new int[] { '4', ' ', 0, (byte) 10, '4', 0 };
        int[] intArray27 = new int[] { '4', ' ', 0, (byte) 10, '4', 0 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 32, 0, 10, 52, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 32, 0, 10, 52, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 32, 0, 10, 52, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 32, 0, 10, 52, 0]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        int[] intArray4 = new int[] { (-1), '4', ' ', (byte) 0 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        int[] intArray6 = new int[] { 10, 100, (short) 1, (short) 100, (byte) 1, (-1) };
        int[] intArray13 = new int[] { 10, 100, (short) 1, (short) 100, (byte) 1, (-1) };
        int[] intArray20 = new int[] { 10, 100, (short) 1, (short) 100, (byte) 1, (-1) };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 1, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 1, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 100, 1, 100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        int[] intArray6 = new int[] { 1, 'a', (short) 10, ' ', (byte) 0, 10 };
        int[] intArray13 = new int[] { 1, 'a', (short) 10, ' ', (byte) 0, 10 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 97, 10, 32, 0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 97, 10, 32, 0, 10]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        int[] intArray6 = new int[] { (byte) -1, (byte) 100, '#', 0, (byte) -1, '4' };
        int[] intArray13 = new int[] { (byte) -1, (byte) 100, '#', 0, (byte) -1, '4' };
        int[] intArray20 = new int[] { (byte) -1, (byte) 100, '#', 0, (byte) -1, '4' };
        int[] intArray27 = new int[] { (byte) -1, (byte) 100, '#', 0, (byte) -1, '4' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 35, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, 35, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 100, 35, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 100, 35, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[] intArray7 = new int[] { (-1) };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) '4', 10);
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
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        int[] intArray2 = new int[] { (short) 100, '4' };
        int[] intArray5 = new int[] { (short) 100, '4' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 0, (int) (byte) 10);
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
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        int[] intArray6 = new int[] { (short) 10, (byte) 0, 0, (short) 0, (short) -1, 1 };
        int[] intArray13 = new int[] { (short) 10, (byte) 0, 0, (short) 0, (short) -1, 1 };
        int[] intArray20 = new int[] { (short) 10, (byte) 0, 0, (short) 0, (short) -1, 1 };
        int[] intArray27 = new int[] { (short) 10, (byte) 0, 0, (short) 0, (short) -1, 1 };
        int[] intArray34 = new int[] { (short) 10, (byte) 0, 0, (short) 0, (short) -1, 1 };
        int[] intArray41 = new int[] { (short) 10, (byte) 0, 0, (short) 0, (short) -1, 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 0, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 0, 0, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 0, 0, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 0, 0, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 0, 0, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 0, 0, 0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        int[] intArray6 = new int[] { 'a', 0, (byte) -1, (short) 1, 0, (byte) 1 };
        int[] intArray13 = new int[] { 'a', 0, (byte) -1, (short) 1, 0, (byte) 1 };
        int[] intArray20 = new int[] { 'a', 0, (byte) -1, (short) 1, 0, (byte) 1 };
        int[] intArray27 = new int[] { 'a', 0, (byte) -1, (short) 1, 0, (byte) 1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 0, -1, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 0, -1, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 0, -1, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 0, -1, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        int[] intArray3 = new int[] { (short) 0, 'a', (byte) 0 };
        int[] intArray7 = new int[] { (short) 0, 'a', (byte) 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 97, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97, 0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        int[] intArray5 = new int[] { (short) 10, 1, '#', (short) 100, (short) 0 };
        int[] intArray11 = new int[] { (short) 10, 1, '#', (short) 100, (short) 0 };
        int[] intArray17 = new int[] { (short) 10, 1, '#', (short) 100, (short) 0 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 35, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 35, 100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1, 35, 100, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        int[] intArray4 = new int[] { 10, 1, '4', '#' };
        int[] intArray9 = new int[] { 10, 1, '4', '#' };
        int[] intArray14 = new int[] { 10, 1, '4', '#' };
        int[] intArray19 = new int[] { 10, 1, '4', '#' };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 52, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 52, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, 52, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 52, 35]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        int[] intArray4 = new int[] { (byte) -1, 1, 100, (short) 10 };
        int[] intArray9 = new int[] { (byte) -1, 1, 100, (short) 10 };
        int[] intArray14 = new int[] { (byte) -1, 1, 100, (short) 10 };
        int[] intArray19 = new int[] { (byte) -1, 1, 100, (short) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[] intArray9 = new int[] { (short) 1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 0, (int) ' ');
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
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        int[] intArray4 = new int[] { (-1), 1, (short) 100, (byte) 0 };
        int[] intArray9 = new int[] { (-1), 1, (short) 100, (byte) 0 };
        int[] intArray14 = new int[] { (-1), 1, (short) 100, (byte) 0 };
        int[] intArray19 = new int[] { (-1), 1, (short) 100, (byte) 0 };
        int[] intArray24 = new int[] { (-1), 1, (short) 100, (byte) 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        int[] intArray6 = new int[] { (-1), ' ', 'a', (byte) 10, (short) 0, (byte) 100 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 97, 10, 0, 100]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        int[] intArray5 = new int[] { 0, (short) 10, 'a', (short) 0, (short) 1 };
        int[] intArray11 = new int[] { 0, (short) 10, 'a', (short) 0, (short) 1 };
        int[] intArray17 = new int[] { 0, (short) 10, 'a', (short) 0, (short) 1 };
        int[] intArray23 = new int[] { 0, (short) 10, 'a', (short) 0, (short) 1 };
        int[] intArray29 = new int[] { 0, (short) 10, 'a', (short) 0, (short) 1 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 10, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 10, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        int[] intArray3 = new int[] { 1, (short) 100, '#' };
        int[] intArray7 = new int[] { 1, (short) 100, '#' };
        int[] intArray11 = new int[] { 1, (short) 100, '#' };
        int[] intArray15 = new int[] { 1, (short) 100, '#' };
        int[] intArray19 = new int[] { 1, (short) 100, '#' };
        int[] intArray23 = new int[] { 1, (short) 100, '#' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        int[] intArray3 = new int[] { (short) -1, (byte) 100, '4' };
        int[] intArray7 = new int[] { (short) -1, (byte) 100, '4' };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 100, 52]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        int[] intArray3 = new int[] { (byte) 100, '4', 'a' };
        int[] intArray7 = new int[] { (byte) 100, '4', 'a' };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, 97]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 0, (int) 'a');
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
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) '#', 0);
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
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        int[] intArray4 = new int[] { (byte) 100, 0, 1, '#' };
        int[] intArray9 = new int[] { (byte) 100, 0, 1, '#' };
        int[] intArray14 = new int[] { (byte) 100, 0, 1, '#' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        int[] intArray1 = new int[] { 'a' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        int[] intArray5 = new int[] { (byte) 100, (short) 100, (byte) 1, (byte) -1, '4' };
        int[] intArray11 = new int[] { (byte) 100, (short) 100, (byte) 1, (byte) -1, '4' };
        int[] intArray17 = new int[] { (byte) 100, (short) 100, (byte) 1, (byte) -1, '4' };
        int[] intArray23 = new int[] { (byte) 100, (short) 100, (byte) 1, (byte) -1, '4' };
        int[] intArray29 = new int[] { (byte) 100, (short) 100, (byte) 1, (byte) -1, '4' };
        int[] intArray35 = new int[] { (byte) 100, (short) 100, (byte) 1, (byte) -1, '4' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 100, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        int[] intArray4 = new int[] { 100, (short) 10, ' ', ' ' };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 32, 32]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[] intArray5 = new int[] { '4' };
        int[] intArray7 = new int[] { '4' };
        int[] intArray9 = new int[] { '4' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        int[] intArray6 = new int[] { (byte) 10, (short) -1, 'a', (short) -1, (byte) 0, ' ' };
        int[] intArray13 = new int[] { (byte) 10, (short) -1, 'a', (short) -1, (byte) 0, ' ' };
        int[] intArray20 = new int[] { (byte) 10, (short) -1, 'a', (short) -1, (byte) 0, ' ' };
        int[] intArray27 = new int[] { (byte) 10, (short) -1, 'a', (short) -1, (byte) 0, ' ' };
        int[] intArray34 = new int[] { (byte) 10, (short) -1, 'a', (short) -1, (byte) 0, ' ' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 97, -1, 0, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, -1, 97, -1, 0, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, -1, 97, -1, 0, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, -1, 97, -1, 0, 32]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, -1, 97, -1, 0, 32]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 0, (int) (short) -1);
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
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) ' ', 1);
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
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        int[] intArray4 = new int[] { (short) 100, (short) 100, 0, (short) 1 };
        int[] intArray9 = new int[] { (short) 100, (short) 100, 0, (short) 1 };
        int[] intArray14 = new int[] { (short) 100, (short) 100, 0, (short) 1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, 1, ' ', 0, 'a' };
        int[] intArray13 = new int[] { (byte) 100, (byte) 100, 1, ' ', 0, 'a' };
        int[] intArray20 = new int[] { (byte) 100, (byte) 100, 1, ' ', 0, 'a' };
        int[] intArray27 = new int[] { (byte) 100, (byte) 100, 1, ' ', 0, 'a' };
        int[] intArray34 = new int[] { (byte) 100, (byte) 100, 1, ' ', 0, 'a' };
        int[] intArray41 = new int[] { (byte) 100, (byte) 100, 1, ' ', 0, 'a' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 1, 32, 0, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, 1, 32, 0, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100, 1, 32, 0, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100, 1, 32, 0, 97]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 100, 1, 32, 0, 97]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 100, 1, 32, 0, 97]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        int[] intArray6 = new int[] { (short) 0, (short) 10, ' ', (byte) -1, 10, '4' };
        int[] intArray13 = new int[] { (short) 0, (short) 10, ' ', (byte) -1, 10, '4' };
        int[] intArray20 = new int[] { (short) 0, (short) 10, ' ', (byte) -1, 10, '4' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 32, -1, 10, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 32, -1, 10, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 10, 32, -1, 10, 52]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        int[] intArray1 = new int[] { '4' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        int[] intArray3 = new int[] { 'a', (byte) 10, (byte) 0 };
        int[] intArray7 = new int[] { 'a', (byte) 10, (byte) 0 };
        int[] intArray11 = new int[] { 'a', (byte) 10, (byte) 0 };
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 0 };
        int[] intArray19 = new int[] { 'a', (byte) 10, (byte) 0 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 1, (int) '#');
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
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        int[] intArray4 = new int[] { '4', (short) 10, (short) 100, (byte) 1 };
        int[] intArray9 = new int[] { '4', (short) 10, (short) 100, (byte) 1 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, (short) 1, (byte) 1 };
        int[] intArray9 = new int[] { (byte) -1, (short) 1, (short) 1, (byte) 1 };
        int[] intArray14 = new int[] { (byte) -1, (short) 1, (short) 1, (byte) 1 };
        int[] intArray19 = new int[] { (byte) -1, (short) 1, (short) 1, (byte) 1 };
        int[] intArray24 = new int[] { (byte) -1, (short) 1, (short) 1, (byte) 1 };
        int[] intArray29 = new int[] { (byte) -1, (short) 1, (short) 1, (byte) 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, (short) 100, (short) 100, (byte) 10 };
        int[] intArray11 = new int[] { (byte) 100, (short) 10, (short) 100, (short) 100, (byte) 10 };
        int[] intArray17 = new int[] { (byte) 100, (short) 10, (short) 100, (short) 100, (byte) 10 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        int[] intArray2 = new int[] { 1, 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        int[] intArray4 = new int[] { '#', '#', (-1), (byte) 10 };
        int[] intArray9 = new int[] { '#', '#', (-1), (byte) 10 };
        int[] intArray14 = new int[] { '#', '#', (-1), (byte) 10 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 35, -1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 35, -1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 35, -1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        int[] intArray3 = new int[] { (short) 10, 10, (-1) };
        int[] intArray7 = new int[] { (short) 10, 10, (-1) };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        int[] intArray2 = new int[] { (short) -1, (byte) -1 };
        int[] intArray5 = new int[] { (short) -1, (byte) -1 };
        int[] intArray8 = new int[] { (short) -1, (byte) -1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1 };
        int[] intArray14 = new int[] { (short) -1, (byte) -1 };
        int[] intArray17 = new int[] { (short) -1, (byte) -1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        int[] intArray5 = new int[] { (short) 1, (byte) 100, (short) -1, (-1), (short) 100 };
        int[] intArray11 = new int[] { (short) 1, (byte) 100, (short) -1, (-1), (short) 100 };
        int[] intArray17 = new int[] { (short) 1, (byte) 100, (short) -1, (-1), (short) 100 };
        int[] intArray23 = new int[] { (short) 1, (byte) 100, (short) -1, (-1), (short) 100 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 100, -1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '4', (int) (short) -1);
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
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        int[] intArray3 = new int[] { ' ', (short) 100, 1 };
        int[] intArray7 = new int[] { ' ', (short) 100, 1 };
        int[] intArray11 = new int[] { ' ', (short) 100, 1 };
        int[] intArray15 = new int[] { ' ', (short) 100, 1 };
        int[] intArray19 = new int[] { ' ', (short) 100, 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a' };
        int[] intArray9 = new int[] { 'a' };
        int[] intArray11 = new int[] { 'a' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        int[] intArray3 = new int[] { 10, (short) 100, (short) 10 };
        int[] intArray7 = new int[] { 10, (short) 100, (short) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        int[] intArray6 = new int[] { '#', (short) 100, (byte) 10, 'a', 100, 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 100, 10, 97, 100, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        int[] intArray3 = new int[] { 0, (byte) 10, (short) -1 };
        int[] intArray7 = new int[] { 0, (byte) 10, (short) -1 };
        int[] intArray11 = new int[] { 0, (byte) 10, (short) -1 };
        int[] intArray15 = new int[] { 0, (byte) 10, (short) -1 };
        int[] intArray19 = new int[] { 0, (byte) 10, (short) -1 };
        int[] intArray23 = new int[] { 0, (byte) 10, (short) -1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 100, 0);
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
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        int[] intArray5 = new int[] { (short) 1, (byte) 100, (short) 100, 0, (short) 0 };
        int[] intArray11 = new int[] { (short) 1, (byte) 100, (short) 100, 0, (short) 0 };
        int[] intArray17 = new int[] { (short) 1, (byte) 100, (short) 100, 0, (short) 0 };
        int[] intArray23 = new int[] { (short) 1, (byte) 100, (short) 100, 0, (short) 0 };
        int[] intArray29 = new int[] { (short) 1, (byte) 100, (short) 100, 0, (short) 0 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) ' ', 100);
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
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 10, (-1));
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
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[] intArray9 = new int[] { (short) 1 };
        int[] intArray11 = new int[] { (short) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, 10);
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
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 1, (int) '#');
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
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        int[] intArray4 = new int[] { '4', 100, 10, (byte) -1 };
        int[] intArray9 = new int[] { '4', 100, 10, (byte) -1 };
        int[] intArray14 = new int[] { '4', 100, 10, (byte) -1 };
        int[] intArray19 = new int[] { '4', 100, 10, (byte) -1 };
        int[] intArray24 = new int[] { '4', 100, 10, (byte) -1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, 100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, (int) (byte) 0);
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
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        int[] intArray3 = new int[] { (byte) 0, (-1), (byte) 10 };
        int[] intArray7 = new int[] { (byte) 0, (-1), (byte) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, (-1), ' ' };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        int[] intArray6 = new int[] { (short) 100, 'a', 0, (-1), ' ', (byte) -1 };
        int[] intArray13 = new int[] { (short) 100, 'a', 0, (-1), ' ', (byte) -1 };
        int[] intArray20 = new int[] { (short) 100, 'a', 0, (-1), ' ', (byte) -1 };
        int[] intArray27 = new int[] { (short) 100, 'a', 0, (-1), ' ', (byte) -1 };
        int[] intArray34 = new int[] { (short) 100, 'a', 0, (-1), ' ', (byte) -1 };
        int[] intArray41 = new int[] { (short) 100, 'a', 0, (-1), ' ', (byte) -1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 97, 0, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 97, 0, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 97, 0, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 97, 0, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 97, 0, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 97, 0, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        int[] intArray5 = new int[] { (short) 100, (byte) -1, 10, 100, 'a' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 10, 100, 97]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        int[] intArray14 = new int[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        int[] intArray19 = new int[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        int[] intArray24 = new int[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        int[] intArray29 = new int[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        int[] intArray2 = new int[] { (byte) 1, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 1, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (byte) -1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 1, (int) (short) 10);
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
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        int[] intArray3 = new int[] { (-1), (short) 1, (short) 0 };
        int[] intArray7 = new int[] { (-1), (short) 1, (short) 0 };
        int[] intArray11 = new int[] { (-1), (short) 1, (short) 0 };
        int[] intArray15 = new int[] { (-1), (short) 1, (short) 0 };
        int[] intArray19 = new int[] { (-1), (short) 1, (short) 0 };
        int[] intArray23 = new int[] { (-1), (short) 1, (short) 0 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        int[] intArray4 = new int[] { (byte) 100, 100, '#', '4' };
        int[] intArray9 = new int[] { (byte) 100, 100, '#', '4' };
        int[] intArray14 = new int[] { (byte) 100, 100, '#', '4' };
        int[] intArray19 = new int[] { (byte) 100, 100, '#', '4' };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 35, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100, 35, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100, 35, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100, 35, 52]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        int[] intArray6 = new int[] { (byte) 100, 10, 0, (short) 100, 10, 'a' };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 0, 100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        int[] intArray2 = new int[] { 100, '#' };
        int[] intArray5 = new int[] { 100, '#' };
        int[] intArray8 = new int[] { 100, '#' };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) '#', (int) (byte) 0);
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
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        int[] intArray2 = new int[] { '4', '4' };
        int[] intArray5 = new int[] { '4', '4' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        int[] intArray6 = new int[] { (byte) 1, 10, (short) 0, (-1), 'a', (short) 100 };
        int[] intArray13 = new int[] { (byte) 1, 10, (short) 0, (-1), 'a', (short) 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 0, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 10, 0, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        int[] intArray5 = new int[] { '4', 10, (short) -1, ' ', (byte) 0 };
        int[] intArray11 = new int[] { '4', 10, (short) -1, ' ', (byte) 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, -1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, -1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        int[] intArray6 = new int[] { ' ', (-1), 0, ' ', (byte) 100, (short) 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 0, 32, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 0, (int) (byte) 0);
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
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        int[] intArray4 = new int[] { (short) 10, 10, (-1), (short) -1 };
        int[] intArray9 = new int[] { (short) 10, 10, (-1), (short) -1 };
        int[] intArray14 = new int[] { (short) 10, 10, (-1), (short) -1 };
        int[] intArray19 = new int[] { (short) 10, 10, (-1), (short) -1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        int[] intArray4 = new int[] { 'a', 10, (byte) -1, 0 };
        int[] intArray9 = new int[] { 'a', 10, (byte) -1, 0 };
        int[] intArray14 = new int[] { 'a', 10, (byte) -1, 0 };
        int[] intArray19 = new int[] { 'a', 10, (byte) -1, 0 };
        int[] intArray24 = new int[] { 'a', 10, (byte) -1, 0 };
        int[] intArray29 = new int[] { 'a', 10, (byte) -1, 0 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        int[] intArray3 = new int[] { 'a', '4', 100 };
        int[] intArray7 = new int[] { 'a', '4', 100 };
        int[] intArray11 = new int[] { 'a', '4', 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 52, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 52, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 52, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        int[] intArray2 = new int[] { 1, (byte) 0 };
        int[] intArray5 = new int[] { 1, (byte) 0 };
        int[] intArray8 = new int[] { 1, (byte) 0 };
        int[] intArray11 = new int[] { 1, (byte) 0 };
        int[] intArray14 = new int[] { 1, (byte) 0 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        int[] intArray3 = new int[] { (byte) 10, ' ', '4' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 32, 52]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        int[] intArray6 = new int[] { (byte) 0, (byte) 0, (byte) 100, 100, '#', (byte) -1 };
        int[] intArray13 = new int[] { (byte) 0, (byte) 0, (byte) 100, 100, '#', (byte) -1 };
        int[] intArray20 = new int[] { (byte) 0, (byte) 0, (byte) 100, 100, '#', (byte) -1 };
        int[] intArray27 = new int[] { (byte) 0, (byte) 0, (byte) 100, 100, '#', (byte) -1 };
        int[] intArray34 = new int[] { (byte) 0, (byte) 0, (byte) 100, 100, '#', (byte) -1 };
        int[] intArray41 = new int[] { (byte) 0, (byte) 0, (byte) 100, 100, '#', (byte) -1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 100, 100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 100, 100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 100, 100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 100, 100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 100, 100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 100, 100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 0, (int) (byte) 1);
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
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        int[] intArray6 = new int[] { 10, (byte) 100, (short) 0, (byte) 10, 0, (short) 1 };
        int[] intArray13 = new int[] { 10, (byte) 100, (short) 0, (byte) 10, 0, (short) 1 };
        int[] intArray20 = new int[] { 10, (byte) 100, (short) 0, (byte) 10, 0, (short) 1 };
        int[] intArray27 = new int[] { 10, (byte) 100, (short) 0, (byte) 10, 0, (short) 1 };
        int[] intArray34 = new int[] { 10, (byte) 100, (short) 0, (byte) 10, 0, (short) 1 };
        int[] intArray41 = new int[] { 10, (byte) 100, (short) 0, (byte) 10, 0, (short) 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 0, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 0, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 100, 0, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 100, 0, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 100, 0, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 100, 0, 10, 0, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        int[] intArray4 = new int[] { 0, (byte) 100, (byte) -1, 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        int[] intArray5 = new int[] { '4', (-1), (short) 1, (byte) -1, (byte) 100 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        int[] intArray3 = new int[] { (byte) 0, 'a', (short) 0 };
        int[] intArray7 = new int[] { (byte) 0, 'a', (short) 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 97, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97, 0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        int[] intArray3 = new int[] { (short) 1, (byte) 1, 10 };
        int[] intArray7 = new int[] { (short) 1, (byte) 1, 10 };
        int[] intArray11 = new int[] { (short) 1, (byte) 1, 10 };
        int[] intArray15 = new int[] { (short) 1, (byte) 1, 10 };
        int[] intArray19 = new int[] { (short) 1, (byte) 1, 10 };
        int[] intArray23 = new int[] { (short) 1, (byte) 1, 10 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        int[] intArray1 = new int[] { (byte) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 10, (int) (short) 10);
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
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        int[] intArray3 = new int[] { (-1), (short) 100, (byte) 100 };
        int[] intArray7 = new int[] { (-1), (short) 100, (byte) 100 };
        int[] intArray11 = new int[] { (-1), (short) 100, (byte) 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        int[] intArray6 = new int[] { 100, (byte) 10, (byte) 0, ' ', 1, (short) 10 };
        int[] intArray13 = new int[] { 100, (byte) 10, (byte) 0, ' ', 1, (short) 10 };
        int[] intArray20 = new int[] { 100, (byte) 10, (byte) 0, ' ', 1, (short) 10 };
        int[] intArray27 = new int[] { 100, (byte) 10, (byte) 0, ' ', 1, (short) 10 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 0, 32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 0, 32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 10, 0, 32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 10, 0, 32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        int[] intArray6 = new int[] { (short) 1, (-1), 1, '#', '4', (short) 1 };
        int[] intArray13 = new int[] { (short) 1, (-1), 1, '#', '4', (short) 1 };
        int[] intArray20 = new int[] { (short) 1, (-1), 1, '#', '4', (short) 1 };
        int[] intArray27 = new int[] { (short) 1, (-1), 1, '#', '4', (short) 1 };
        int[] intArray34 = new int[] { (short) 1, (-1), 1, '#', '4', (short) 1 };
        int[] intArray41 = new int[] { (short) 1, (-1), 1, '#', '4', (short) 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 1, 35, 52, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 1, 35, 52, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 1, 35, 52, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 1, 35, 52, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 1, 35, 52, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, -1, 1, 35, 52, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) 100, (int) (short) 0);
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
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        int[] intArray2 = new int[] { (byte) 100, 100 };
        int[] intArray5 = new int[] { (byte) 100, 100 };
        int[] intArray8 = new int[] { (byte) 100, 100 };
        int[] intArray11 = new int[] { (byte) 100, 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        int[] intArray5 = new int[] { (byte) 1, '#', (-1), 'a', (short) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 35, -1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        int[] intArray3 = new int[] { (byte) 1, 0, (short) 10 };
        int[] intArray7 = new int[] { (byte) 1, 0, (short) 10 };
        int[] intArray11 = new int[] { (byte) 1, 0, (short) 10 };
        int[] intArray15 = new int[] { (byte) 1, 0, (short) 10 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) '4', 1);
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
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        int[] intArray4 = new int[] { 10, 100, 'a', (short) 1 };
        int[] intArray9 = new int[] { 10, 100, 'a', (short) 1 };
        int[] intArray14 = new int[] { 10, 100, 'a', (short) 1 };
        int[] intArray19 = new int[] { 10, 100, 'a', (short) 1 };
        int[] intArray24 = new int[] { 10, 100, 'a', (short) 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (byte) 10, (short) 10, '4', (short) 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 10, 10, 52, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        int[] intArray9 = new int[] { (short) 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 1, (int) (short) 100);
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
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        int[] intArray4 = new int[] { 10, 1, (byte) 100, 'a' };
        int[] intArray9 = new int[] { 10, 1, (byte) 100, 'a' };
        int[] intArray14 = new int[] { 10, 1, (byte) 100, 'a' };
        int[] intArray19 = new int[] { 10, 1, (byte) 100, 'a' };
        int[] intArray24 = new int[] { 10, 1, (byte) 100, 'a' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        int[] intArray5 = new int[] { (short) 10, 'a', (short) 100, (-1), (short) 10 };
        int[] intArray11 = new int[] { (short) 10, 'a', (short) 100, (-1), (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        int[] intArray6 = new int[] { ' ', 1, 10, '#', ' ', (-1) };
        int[] intArray13 = new int[] { ' ', 1, 10, '#', ' ', (-1) };
        int[] intArray20 = new int[] { ' ', 1, 10, '#', ' ', (-1) };
        int[] intArray27 = new int[] { ' ', 1, 10, '#', ' ', (-1) };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 1, 10, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 1, 10, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 1, 10, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 1, 10, 35, 32, -1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        int[] intArray2 = new int[] { (byte) 1, 'a' };
        int[] intArray5 = new int[] { (byte) 1, 'a' };
        int[] intArray8 = new int[] { (byte) 1, 'a' };
        int[] intArray11 = new int[] { (byte) 1, 'a' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, (-1), (byte) 10, (byte) 100, (short) 10 };
        int[] intArray13 = new int[] { (short) 0, (byte) 100, (-1), (byte) 10, (byte) 100, (short) 10 };
        int[] intArray20 = new int[] { (short) 0, (byte) 100, (-1), (byte) 10, (byte) 100, (short) 10 };
        int[] intArray27 = new int[] { (short) 0, (byte) 100, (-1), (byte) 10, (byte) 100, (short) 10 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, 10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, -1, 10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, -1, 10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 100, -1, 10, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        int[] intArray6 = new int[] { 'a', 'a', (byte) 10, (byte) 1, 10, '#' };
        int[] intArray13 = new int[] { 'a', 'a', (byte) 10, (byte) 1, 10, '#' };
        int[] intArray20 = new int[] { 'a', 'a', (byte) 10, (byte) 1, 10, '#' };
        int[] intArray27 = new int[] { 'a', 'a', (byte) 10, (byte) 1, 10, '#' };
        int[] intArray34 = new int[] { 'a', 'a', (byte) 10, (byte) 1, 10, '#' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 97, 10, 1, 10, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 97, 10, 1, 10, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 97, 10, 1, 10, 35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 97, 10, 1, 10, 35]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 97, 10, 1, 10, 35]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        int[] intArray5 = new int[] { '#', (short) 1, (-1), '4', ' ' };
        int[] intArray11 = new int[] { '#', (short) 1, (-1), '4', ' ' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1, -1, 52, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 1, -1, 52, 32]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        int[] intArray4 = new int[] { '4', 100, (byte) 0, (byte) 0 };
        int[] intArray9 = new int[] { '4', 100, (byte) 0, (byte) 0 };
        int[] intArray14 = new int[] { '4', 100, (byte) 0, (byte) 0 };
        int[] intArray19 = new int[] { '4', 100, (byte) 0, (byte) 0 };
        int[] intArray24 = new int[] { '4', 100, (byte) 0, (byte) 0 };
        int[] intArray29 = new int[] { '4', 100, (byte) 0, (byte) 0 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        int[] intArray2 = new int[] { (short) 0, (byte) 1 };
        int[] intArray5 = new int[] { (short) 0, (byte) 1 };
        int[] intArray8 = new int[] { (short) 0, (byte) 1 };
        int[] intArray11 = new int[] { (short) 0, (byte) 1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) '4', (int) '#');
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
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        int[] intArray6 = new int[] { (byte) 100, (byte) 0, (byte) 1, 0, (short) 1, '#' };
        int[] intArray13 = new int[] { (byte) 100, (byte) 0, (byte) 1, 0, (short) 1, '#' };
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, (byte) 1, 0, (short) 1, '#' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        int[] intArray6 = new int[] { 'a', (byte) 10, 10, (short) -1, 100, 1 };
        int[] intArray13 = new int[] { 'a', (byte) 10, 10, (short) -1, 100, 1 };
        int[] intArray20 = new int[] { 'a', (byte) 10, 10, (short) -1, 100, 1 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 10, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 10, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 10, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) -1, (int) (short) -1);
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
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 0, 0);
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
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        int[] intArray4 = new int[] { 1, (short) 0, 1, 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        int[] intArray2 = new int[] { 1, (short) 10 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        int[] intArray4 = new int[] { (short) 10, 1, (byte) -1, (short) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        int[] intArray4 = new int[] { (short) 100, (byte) 0, 100, (byte) 100 };
        int[] intArray9 = new int[] { (short) 100, (byte) 0, 100, (byte) 100 };
        int[] intArray14 = new int[] { (short) 100, (byte) 0, 100, (byte) 100 };
        int[] intArray19 = new int[] { (short) 100, (byte) 0, 100, (byte) 100 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        int[] intArray3 = new int[] { 0, 100, (short) 10 };
        int[] intArray7 = new int[] { 0, 100, (short) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        int[] intArray4 = new int[] { 10, (short) 10, (byte) -1, (byte) 100 };
        int[] intArray9 = new int[] { 10, (short) 10, (byte) -1, (byte) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, -1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10, -1, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        int[] intArray5 = new int[] { (byte) -1, (byte) 1, (byte) -1, (short) 0, (short) 1 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 1, (byte) -1, (short) 0, (short) 1 };
        int[] intArray17 = new int[] { (byte) -1, (byte) 1, (byte) -1, (short) 0, (short) 1 };
        int[] intArray23 = new int[] { (byte) -1, (byte) 1, (byte) -1, (short) 0, (short) 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 1, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        int[] intArray5 = new int[] { (byte) -1, '#', '4', (byte) 0, 0 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, 52, 0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        int[] intArray5 = new int[] { ' ', (short) 100, (byte) 1, (-1), (-1) };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 100, 1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        int[] intArray3 = new int[] { (short) -1, ' ', 0 };
        int[] intArray7 = new int[] { (short) -1, ' ', 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        int[] intArray6 = new int[] { (byte) 10, '4', 'a', 100, ' ', 'a' };
        int[] intArray13 = new int[] { (byte) 10, '4', 'a', 100, ' ', 'a' };
        int[] intArray20 = new int[] { (byte) 10, '4', 'a', 100, ' ', 'a' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 52, 97, 100, 32, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97, 100, 32, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 52, 97, 100, 32, 97]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        int[] intArray4 = new int[] { (short) 10, (byte) 1, (short) -1, '#' };
        int[] intArray9 = new int[] { (short) 10, (byte) 1, (short) -1, '#' };
        int[] intArray14 = new int[] { (short) 10, (byte) 1, (short) -1, '#' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        int[] intArray5 = new int[] { (short) 1, 100, (short) 100, (short) -1, (byte) 100 };
        int[] intArray11 = new int[] { (short) 1, 100, (short) 100, (short) -1, (byte) 100 };
        int[] intArray17 = new int[] { (short) 1, 100, (short) 100, (short) -1, (byte) 100 };
        int[] intArray23 = new int[] { (short) 1, 100, (short) 100, (short) -1, (byte) 100 };
        int[] intArray29 = new int[] { (short) 1, 100, (short) 100, (short) -1, (byte) 100 };
        int[] intArray35 = new int[] { (short) 1, 100, (short) 100, (short) -1, (byte) 100 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 100, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 100, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 100, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        int[] intArray4 = new int[] { '#', (short) 1, (byte) -1, (byte) 0 };
        int[] intArray9 = new int[] { '#', (short) 1, (byte) -1, (byte) 0 };
        int[] intArray14 = new int[] { '#', (short) 1, (byte) -1, (byte) 0 };
        int[] intArray19 = new int[] { '#', (short) 1, (byte) -1, (byte) 0 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        int[] intArray2 = new int[] { (short) -1, (short) 100 };
        int[] intArray5 = new int[] { (short) -1, (short) 100 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        int[] intArray2 = new int[] { 'a', (byte) 10 };
        int[] intArray5 = new int[] { 'a', (byte) 10 };
        int[] intArray8 = new int[] { 'a', (byte) 10 };
        int[] intArray11 = new int[] { 'a', (byte) 10 };
        int[] intArray14 = new int[] { 'a', (byte) 10 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 100, (int) '#');
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
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        int[] intArray3 = new int[] { '#', (byte) 100, (-1) };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 100, -1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 10]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        int[] intArray6 = new int[] { '#', (byte) 1, (byte) 10, (byte) 10, (short) 1, 10 };
        int[] intArray13 = new int[] { '#', (byte) 1, (byte) 10, (byte) 10, (short) 1, 10 };
        int[] intArray20 = new int[] { '#', (byte) 1, (byte) 10, (byte) 10, (short) 1, 10 };
        int[] intArray27 = new int[] { '#', (byte) 1, (byte) 10, (byte) 10, (short) 1, 10 };
        int[] intArray34 = new int[] { '#', (byte) 1, (byte) 10, (byte) 10, (short) 1, 10 };
        int[] intArray41 = new int[] { '#', (byte) 1, (byte) 10, (byte) 10, (short) 1, 10 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, 10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 1, 10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 1, 10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 1, 10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 1, 10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 1, 10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        int[] intArray1 = new int[] { 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        int[] intArray3 = new int[] { (byte) 1, (short) -1, 100 };
        int[] intArray7 = new int[] { (byte) 1, (short) -1, 100 };
        int[] intArray11 = new int[] { (byte) 1, (short) -1, 100 };
        int[] intArray15 = new int[] { (byte) 1, (short) -1, 100 };
        int[] intArray19 = new int[] { (byte) 1, (short) -1, 100 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        int[] intArray3 = new int[] { (byte) -1, '#', (short) 100 };
        int[] intArray7 = new int[] { (byte) -1, '#', (short) 100 };
        int[] intArray11 = new int[] { (byte) -1, '#', (short) 100 };
        int[] intArray15 = new int[] { (byte) -1, '#', (short) 100 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) -1, 1, (short) -1, (byte) 10 };
        int[] intArray13 = new int[] { (short) 0, (byte) 1, (byte) -1, 1, (short) -1, (byte) 10 };
        int[] intArray20 = new int[] { (short) 0, (byte) 1, (byte) -1, 1, (short) -1, (byte) 10 };
        int[] intArray27 = new int[] { (short) 0, (byte) 1, (byte) -1, 1, (short) -1, (byte) 10 };
        int[] intArray34 = new int[] { (short) 0, (byte) 1, (byte) -1, 1, (short) -1, (byte) 10 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, -1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, -1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, -1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 1, -1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 1, -1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 10, (int) '4');
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
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        int[] intArray2 = new int[] { (byte) 100, (short) 1 };
        int[] intArray5 = new int[] { (byte) 100, (short) 1 };
        int[] intArray8 = new int[] { (byte) 100, (short) 1 };
        int[] intArray11 = new int[] { (byte) 100, (short) 1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, 10 };
        int[] intArray7 = new int[] { (short) 1, (byte) -1, 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        int[] intArray3 = new int[] { (byte) 1, '#', (-1) };
        int[] intArray7 = new int[] { (byte) 1, '#', (-1) };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 35, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 35, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        int[] intArray6 = new int[] { '#', (-1), (byte) 10, (short) 1, 10, (short) 1 };
        int[] intArray13 = new int[] { '#', (-1), (byte) 10, (short) 1, 10, (short) 1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        int[] intArray1 = new int[] { (byte) 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        int[] intArray2 = new int[] { (byte) 100, (-1) };
        int[] intArray5 = new int[] { (byte) 100, (-1) };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        int[] intArray4 = new int[] { (short) -1, (short) 100, 0, (short) 10 };
        int[] intArray9 = new int[] { (short) -1, (short) 100, 0, (short) 10 };
        int[] intArray14 = new int[] { (short) -1, (short) 100, 0, (short) 10 };
        int[] intArray19 = new int[] { (short) -1, (short) 100, 0, (short) 10 };
        int[] intArray24 = new int[] { (short) -1, (short) 100, 0, (short) 10 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) ' ', 100);
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
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        int[] intArray5 = new int[] { (byte) 100, (-1), (short) 0, 10, (-1) };
        int[] intArray11 = new int[] { (byte) 100, (-1), (short) 0, 10, (-1) };
        int[] intArray17 = new int[] { (byte) 100, (-1), (short) 0, 10, (-1) };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, -1, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        int[] intArray2 = new int[] { (byte) 10, 100 };
        int[] intArray5 = new int[] { (byte) 10, 100 };
        int[] intArray8 = new int[] { (byte) 10, 100 };
        int[] intArray11 = new int[] { (byte) 10, 100 };
        int[] intArray14 = new int[] { (byte) 10, 100 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (-1), (int) (byte) 1);
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
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        int[] intArray4 = new int[] { (-1), 'a', 1, ' ' };
        int[] intArray9 = new int[] { (-1), 'a', 1, ' ' };
        int[] intArray14 = new int[] { (-1), 'a', 1, ' ' };
        int[] intArray19 = new int[] { (-1), 'a', 1, ' ' };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 1, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 1, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        int[] intArray3 = new int[] { 10, 0, (short) 1 };
        int[] intArray7 = new int[] { 10, 0, (short) 1 };
        int[] intArray11 = new int[] { 10, 0, (short) 1 };
        int[] intArray15 = new int[] { 10, 0, (short) 1 };
        int[] intArray19 = new int[] { 10, 0, (short) 1 };
        int[] intArray23 = new int[] { 10, 0, (short) 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 10, (int) (short) -1);
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
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 10, (-1));
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
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        int[] intArray3 = new int[] { (-1), 1, (short) 1 };
        int[] intArray7 = new int[] { (-1), 1, (short) 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        int[] intArray3 = new int[] { '#', (byte) 10, (short) 1 };
        int[] intArray7 = new int[] { '#', (byte) 10, (short) 1 };
        int[] intArray11 = new int[] { '#', (byte) 10, (short) 1 };
        int[] intArray15 = new int[] { '#', (byte) 10, (short) 1 };
        int[] intArray19 = new int[] { '#', (byte) 10, (short) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        int[] intArray4 = new int[] { (short) 100, '#', 100, (byte) -1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 100, -1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) 'a', 10);
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
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        int[] intArray5 = new int[] { 0, (short) 1, 1, (byte) 100, (short) 10 };
        int[] intArray11 = new int[] { 0, (short) 1, 1, (byte) 100, (short) 10 };
        int[] intArray17 = new int[] { 0, (short) 1, 1, (byte) 100, (short) 10 };
        int[] intArray23 = new int[] { 0, (short) 1, 1, (byte) 100, (short) 10 };
        int[] intArray29 = new int[] { 0, (short) 1, 1, (byte) 100, (short) 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 10, (int) 'a');
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
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        int[] intArray6 = new int[] { 'a', 100, 0, 0, ' ', (short) 1 };
        int[] intArray13 = new int[] { 'a', 100, 0, 0, ' ', (short) 1 };
        int[] intArray20 = new int[] { 'a', 100, 0, 0, ' ', (short) 1 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 0, 0, 32, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 100, 0, 0, 32, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 100, 0, 0, 32, 1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        int[] intArray2 = new int[] { 100, '#' };
        int[] intArray5 = new int[] { 100, '#' };
        int[] intArray8 = new int[] { 100, '#' };
        int[] intArray11 = new int[] { 100, '#' };
        int[] intArray14 = new int[] { 100, '#' };
        int[] intArray17 = new int[] { 100, '#' };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, 0, (short) -1, (-1), 'a' };
        int[] intArray13 = new int[] { (short) 1, (byte) -1, 0, (short) -1, (-1), 'a' };
        int[] intArray20 = new int[] { (short) 1, (byte) -1, 0, (short) -1, (-1), 'a' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 0, -1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 0, -1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 0, -1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        int[] intArray6 = new int[] { (short) 1, (byte) 100, (short) 10, (byte) 100, (byte) 0, (short) 1 };
        int[] intArray13 = new int[] { (short) 1, (byte) 100, (short) 10, (byte) 100, (byte) 0, (short) 1 };
        int[] intArray20 = new int[] { (short) 1, (byte) 100, (short) 10, (byte) 100, (byte) 0, (short) 1 };
        int[] intArray27 = new int[] { (short) 1, (byte) 100, (short) 10, (byte) 100, (byte) 0, (short) 1 };
        int[] intArray34 = new int[] { (short) 1, (byte) 100, (short) 10, (byte) 100, (byte) 0, (short) 1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 10, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 10, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 100, 10, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 100, 10, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 100, 10, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        int[] intArray6 = new int[] { 1, (short) 100, (byte) 1, 1, (byte) 100, (byte) 10 };
        int[] intArray13 = new int[] { 1, (short) 100, (byte) 1, 1, (byte) 100, (byte) 10 };
        int[] intArray20 = new int[] { 1, (short) 100, (byte) 1, 1, (byte) 100, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 100, 1, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        int[] intArray2 = new int[] { 10, 1 };
        int[] intArray5 = new int[] { 10, 1 };
        int[] intArray8 = new int[] { 10, 1 };
        int[] intArray11 = new int[] { 10, 1 };
        int[] intArray14 = new int[] { 10, 1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        int[] intArray5 = new int[] { (byte) 100, 10, ' ', 100, (byte) 10 };
        int[] intArray11 = new int[] { (byte) 100, 10, ' ', 100, (byte) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 32, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 32, 100, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        int[] intArray6 = new int[] { (byte) 100, 100, 10, (-1), '#', 100 };
        int[] intArray13 = new int[] { (byte) 100, 100, 10, (-1), '#', 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 10, -1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, 10, -1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        int[] intArray6 = new int[] { (-1), '#', (byte) 10, 10, 10, (byte) 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, 10, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (-1), 10);
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
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 100, 10);
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
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 1, (int) (short) 0);
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
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        int[] intArray4 = new int[] { 0, (byte) 1, 0, (byte) 1 };
        int[] intArray9 = new int[] { 0, (byte) 1, 0, (byte) 1 };
        int[] intArray14 = new int[] { 0, (byte) 1, 0, (byte) 1 };
        int[] intArray19 = new int[] { 0, (byte) 1, 0, (byte) 1 };
        int[] intArray24 = new int[] { 0, (byte) 1, 0, (byte) 1 };
        int[] intArray29 = new int[] { 0, (byte) 1, 0, (byte) 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        int[] intArray5 = new int[] { 0, (byte) 10, (short) 0, (short) -1, (byte) -1 };
        int[] intArray11 = new int[] { 0, (byte) 10, (short) 0, (short) -1, (byte) -1 };
        int[] intArray17 = new int[] { 0, (byte) 10, (short) 0, (short) -1, (byte) -1 };
        int[] intArray23 = new int[] { 0, (byte) 10, (short) 0, (short) -1, (byte) -1 };
        int[] intArray29 = new int[] { 0, (byte) 10, (short) 0, (short) -1, (byte) -1 };
        int[] intArray35 = new int[] { 0, (byte) 10, (short) 0, (short) -1, (byte) -1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 0, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 0, -1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10, 0, -1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 10, 0, -1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 10, 0, -1, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 10, 0, -1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, 100, '4', (short) 1, 10 };
        int[] intArray13 = new int[] { (byte) 100, (short) 100, 100, '4', (short) 1, 10 };
        int[] intArray20 = new int[] { (byte) 100, (short) 100, 100, '4', (short) 1, 10 };
        int[] intArray27 = new int[] { (byte) 100, (short) 100, 100, '4', (short) 1, 10 };
        int[] intArray34 = new int[] { (byte) 100, (short) 100, 100, '4', (short) 1, 10 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 100, 52, 1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, 100, 52, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100, 100, 52, 1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100, 100, 52, 1, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 100, 100, 52, 1, 10]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        int[] intArray3 = new int[] { 1, (short) 100, 'a' };
        int[] intArray7 = new int[] { 1, (short) 100, 'a' };
        int[] intArray11 = new int[] { 1, (short) 100, 'a' };
        int[] intArray15 = new int[] { 1, (short) 100, 'a' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        int[] intArray5 = new int[] { '#', '#', 1, ' ', (short) 1 };
        int[] intArray11 = new int[] { '#', '#', 1, ' ', (short) 1 };
        int[] intArray17 = new int[] { '#', '#', 1, ' ', (short) 1 };
        int[] intArray23 = new int[] { '#', '#', 1, ' ', (short) 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 35, 1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 35, 1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 35, 1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 35, 1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        int[] intArray4 = new int[] { (short) 10, (short) 10, (short) 1, (byte) 10 };
        int[] intArray9 = new int[] { (short) 10, (short) 10, (short) 1, (byte) 10 };
        int[] intArray14 = new int[] { (short) 10, (short) 10, (short) 1, (byte) 10 };
        int[] intArray19 = new int[] { (short) 10, (short) 10, (short) 1, (byte) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        int[] intArray5 = new int[] { (short) -1, '#', (byte) -1, (byte) 1, (short) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        int[] intArray4 = new int[] { (byte) 0, '#', (byte) 100, 'a' };
        int[] intArray9 = new int[] { (byte) 0, '#', (byte) 100, 'a' };
        int[] intArray14 = new int[] { (byte) 0, '#', (byte) 100, 'a' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 35, 100, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 35, 100, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 35, 100, 97]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        int[] intArray3 = new int[] { (byte) -1, 1, (short) 0 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int[] intArray7 = new int[] { (byte) 100, 1, (short) 1 };
        int[] intArray11 = new int[] { (byte) 100, 1, (short) 1 };
        int[] intArray15 = new int[] { (byte) 100, 1, (short) 1 };
        int[] intArray19 = new int[] { (byte) 100, 1, (short) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        int[] intArray4 = new int[] { (short) -1, (byte) -1, (byte) 100, 100 };
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (byte) 100, 100 };
        int[] intArray14 = new int[] { (short) -1, (byte) -1, (byte) 100, 100 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 100, 100 };
        int[] intArray24 = new int[] { (short) -1, (byte) -1, (byte) 100, 100 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        int[] intArray6 = new int[] { (short) 1, (short) 100, ' ', (-1), (short) 10, (-1) };
        int[] intArray13 = new int[] { (short) 1, (short) 100, ' ', (-1), (short) 10, (-1) };
        int[] intArray20 = new int[] { (short) 1, (short) 100, ' ', (-1), (short) 10, (-1) };
        int[] intArray27 = new int[] { (short) 1, (short) 100, ' ', (-1), (short) 10, (-1) };
        int[] intArray34 = new int[] { (short) 1, (short) 100, ' ', (-1), (short) 10, (-1) };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 32, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 32, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 100, 32, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 100, 32, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 100, 32, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        int[] intArray4 = new int[] { 1, (short) 0, 'a', 10 };
        int[] intArray9 = new int[] { 1, (short) 0, 'a', 10 };
        int[] intArray14 = new int[] { 1, (short) 0, 'a', 10 };
        int[] intArray19 = new int[] { 1, (short) 0, 'a', 10 };
        int[] intArray24 = new int[] { 1, (short) 0, 'a', 10 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 97, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 97, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 97, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 97, 10]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 1, (int) '4');
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
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray5 = new int[] { (short) 0, (byte) 100 };
        int[] intArray8 = new int[] { (short) 0, (byte) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (byte) 1, (int) (short) -1);
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
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        int[] intArray4 = new int[] { 1, 10, 100, 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        int[] intArray6 = new int[] { 0, (-1), 0, (short) 100, (short) 10, '#' };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 100, 10, 35]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray5 = new int[] { '#', '4' };
        int[] intArray8 = new int[] { '#', '4' };
        int[] intArray11 = new int[] { '#', '4' };
        int[] intArray14 = new int[] { '#', '4' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 52]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        int[] intArray3 = new int[] { (short) 100, (short) 10, (short) 1 };
        int[] intArray7 = new int[] { (short) 100, (short) 10, (short) 1 };
        int[] intArray11 = new int[] { (short) 100, (short) 10, (short) 1 };
        int[] intArray15 = new int[] { (short) 100, (short) 10, (short) 1 };
        int[] intArray19 = new int[] { (short) 100, (short) 10, (short) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        int[] intArray2 = new int[] { ' ', '#' };
        int[] intArray5 = new int[] { ' ', '#' };
        int[] intArray8 = new int[] { ' ', '#' };
        int[] intArray11 = new int[] { ' ', '#' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        int[] intArray4 = new int[] { (short) 100, '4', (short) -1, (short) -1 };
        int[] intArray9 = new int[] { (short) 100, '4', (short) -1, (short) -1 };
        int[] intArray14 = new int[] { (short) 100, '4', (short) -1, (short) -1 };
        int[] intArray19 = new int[] { (short) 100, '4', (short) -1, (short) -1 };
        int[] intArray24 = new int[] { (short) 100, '4', (short) -1, (short) -1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 52, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 52, -1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 52, -1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 52, -1, -1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        int[] intArray5 = new int[] { ' ', (short) 10, 'a', 100, '4' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 97, 100, 52]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        int[] intArray1 = new int[] { (short) 1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 100, 0);
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
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        int[] intArray2 = new int[] { '#', 100 };
        int[] intArray5 = new int[] { '#', 100 };
        int[] intArray8 = new int[] { '#', 100 };
        int[] intArray11 = new int[] { '#', 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        int[] intArray2 = new int[] { (byte) 1, (short) 10 };
        int[] intArray5 = new int[] { (byte) 1, (short) 10 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        int[] intArray6 = new int[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (short) 10 };
        int[] intArray13 = new int[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (short) 10 };
        int[] intArray20 = new int[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (short) 10 };
        int[] intArray27 = new int[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (short) 10 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        int[] intArray3 = new int[] { (short) 0, '4', (byte) 1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        int[] intArray5 = new int[] { 0, (byte) 10, (short) 0, ' ', '#' };
        int[] intArray11 = new int[] { 0, (byte) 10, (short) 0, ' ', '#' };
        int[] intArray17 = new int[] { 0, (byte) 10, (short) 0, ' ', '#' };
        int[] intArray23 = new int[] { 0, (byte) 10, (short) 0, ' ', '#' };
        int[] intArray29 = new int[] { 0, (byte) 10, (short) 0, ' ', '#' };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 0, 32, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 0, 32, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10, 0, 32, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 10, 0, 32, 35]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 10, 0, 32, 35]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) ' ', 0);
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
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        int[] intArray6 = new int[] { (short) 10, (byte) -1, '4', ' ', (short) 100, ' ' };
        int[] intArray13 = new int[] { (short) 10, (byte) -1, '4', ' ', (short) 100, ' ' };
        int[] intArray20 = new int[] { (short) 10, (byte) -1, '4', ' ', (short) 100, ' ' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 52, 32, 100, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, -1, 52, 32, 100, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, -1, 52, 32, 100, 32]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        int[] intArray3 = new int[] { (byte) 100, 'a', ' ' };
        int[] intArray7 = new int[] { (byte) 100, 'a', ' ' };
        int[] intArray11 = new int[] { (byte) 100, 'a', ' ' };
        int[] intArray15 = new int[] { (byte) 100, 'a', ' ' };
        int[] intArray19 = new int[] { (byte) 100, 'a', ' ' };
        int[] intArray23 = new int[] { (byte) 100, 'a', ' ' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 97, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 97, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 97, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 97, 32]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        int[] intArray3 = new int[] { (byte) 100, (byte) 0, (byte) 1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        int[] intArray2 = new int[] { (short) -1, (short) -1 };
        int[] intArray5 = new int[] { (short) -1, (short) -1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (-1), (int) ' ');
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
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        int[] intArray5 = new int[] { 100, 'a', 1, '4', (byte) -1 };
        int[] intArray11 = new int[] { 100, 'a', 1, '4', (byte) -1 };
        int[] intArray17 = new int[] { 100, 'a', 1, '4', (byte) -1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 1, 52, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 1, 52, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 97, 1, 52, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        int[] intArray4 = new int[] { 1, ' ', '#', (short) 100 };
        int[] intArray9 = new int[] { 1, ' ', '#', (short) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, 35, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 32, 35, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, 0, 100);
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
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        int[] intArray6 = new int[] { (short) 100, ' ', 1, 'a', '#', 10 };
        int[] intArray13 = new int[] { (short) 100, ' ', 1, 'a', '#', 10 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32, 1, 97, 35, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, 1, 97, 35, 10]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        int[] intArray6 = new int[] { (short) 0, (short) 10, 10, 1, 10, (byte) 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        int[] intArray6 = new int[] { '#', (byte) 100, (short) 100, 'a', 'a', (short) 0 };
        int[] intArray13 = new int[] { '#', (byte) 100, (short) 100, 'a', 'a', (short) 0 };
        int[] intArray20 = new int[] { '#', (byte) 100, (short) 100, 'a', 'a', (short) 0 };
        int[] intArray27 = new int[] { '#', (byte) 100, (short) 100, 'a', 'a', (short) 0 };
        int[] intArray34 = new int[] { '#', (byte) 100, (short) 100, 'a', 'a', (short) 0 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 100, 100, 97, 97, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 100, 100, 97, 97, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 100, 100, 97, 97, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 100, 100, 97, 97, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 100, 100, 97, 97, 0]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        int[] intArray3 = new int[] { (byte) 100, (byte) 1, (short) 100 };
        int[] intArray7 = new int[] { (byte) 100, (byte) 1, (short) 100 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 1, (short) 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) 'a', (int) (byte) 10);
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
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        int[] intArray2 = new int[] { (byte) 10, (short) 0 };
        int[] intArray5 = new int[] { (byte) 10, (short) 0 };
        int[] intArray8 = new int[] { (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { (byte) 10, (short) 0 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        int[] intArray3 = new int[] { 10, (byte) 10, (byte) 0 };
        int[] intArray7 = new int[] { 10, (byte) 10, (byte) 0 };
        int[] intArray11 = new int[] { 10, (byte) 10, (byte) 0 };
        int[] intArray15 = new int[] { 10, (byte) 10, (byte) 0 };
        int[] intArray19 = new int[] { 10, (byte) 10, (byte) 0 };
        int[] intArray23 = new int[] { 10, (byte) 10, (byte) 0 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) -1 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 0, (int) (short) 1);
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
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[] intArray5 = new int[] { '4' };
        int[] intArray7 = new int[] { '4' };
        int[] intArray9 = new int[] { '4' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, 0, (int) (byte) 100);
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
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        int[] intArray4 = new int[] { (short) 0, (byte) 0, (short) 1, 1 };
        int[] intArray9 = new int[] { (short) 0, (byte) 0, (short) 1, 1 };
        int[] intArray14 = new int[] { (short) 0, (byte) 0, (short) 1, 1 };
        int[] intArray19 = new int[] { (short) 0, (byte) 0, (short) 1, 1 };
        int[] intArray24 = new int[] { (short) 0, (byte) 0, (short) 1, 1 };
        int[] intArray29 = new int[] { (short) 0, (byte) 0, (short) 1, 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        int[] intArray2 = new int[] { 1, '4' };
        int[] intArray5 = new int[] { 1, '4' };
        int[] intArray8 = new int[] { 1, '4' };
        int[] intArray11 = new int[] { 1, '4' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 1, (int) (short) 0);
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
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        int[] intArray3 = new int[] { (byte) 10, (short) 100, 100 };
        int[] intArray7 = new int[] { (byte) 10, (short) 100, 100 };
        int[] intArray11 = new int[] { (byte) 10, (short) 100, 100 };
        int[] intArray15 = new int[] { (byte) 10, (short) 100, 100 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        int[] intArray2 = new int[] { 1, (byte) -1 };
        int[] intArray5 = new int[] { 1, (byte) -1 };
        int[] intArray8 = new int[] { 1, (byte) -1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        int[] intArray2 = new int[] { ' ', '#' };
        int[] intArray5 = new int[] { ' ', '#' };
        int[] intArray8 = new int[] { ' ', '#' };
        int[] intArray11 = new int[] { ' ', '#' };
        int[] intArray14 = new int[] { ' ', '#' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        int[] intArray6 = new int[] { (byte) -1, '#', (short) 100, (byte) -1, (short) -1, 'a' };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, 100, -1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '4', 1);
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
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        int[] intArray4 = new int[] { (short) 0, (short) 10, ' ', '4' };
        int[] intArray9 = new int[] { (short) 0, (short) 10, ' ', '4' };
        int[] intArray14 = new int[] { (short) 0, (short) 10, ' ', '4' };
        int[] intArray19 = new int[] { (short) 0, (short) 10, ' ', '4' };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 32, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10, 32, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 10, 32, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 10, 32, 52]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        int[] intArray4 = new int[] { 0, 'a', 1, 10 };
        int[] intArray9 = new int[] { 0, 'a', 1, 10 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 97, 1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 97, 1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        int[] intArray5 = new int[] { (-1), 1, (short) 1, 'a', 1 };
        int[] intArray11 = new int[] { (-1), 1, (short) 1, 'a', 1 };
        int[] intArray17 = new int[] { (-1), 1, (short) 1, 'a', 1 };
        int[] intArray23 = new int[] { (-1), 1, (short) 1, 'a', 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1, 1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 1, 1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        int[] intArray4 = new int[] { (byte) 10, 10, (short) -1, (-1) };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        int[] intArray3 = new int[] { (byte) 10, (byte) -1, 0 };
        int[] intArray7 = new int[] { (byte) 10, (byte) -1, 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        int[] intArray4 = new int[] { (byte) -1, ' ', (-1), (short) -1 };
        int[] intArray9 = new int[] { (byte) -1, ' ', (-1), (short) -1 };
        int[] intArray14 = new int[] { (byte) -1, ' ', (-1), (short) -1 };
        int[] intArray19 = new int[] { (byte) -1, ' ', (-1), (short) -1 };
        int[] intArray24 = new int[] { (byte) -1, ' ', (-1), (short) -1 };
        int[] intArray29 = new int[] { (byte) -1, ' ', (-1), (short) -1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 32, -1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) '#', (int) (byte) 1);
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
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        int[] intArray4 = new int[] { (byte) 1, ' ', (byte) -1, ' ' };
        int[] intArray9 = new int[] { (byte) 1, ' ', (byte) -1, ' ' };
        int[] intArray14 = new int[] { (byte) 1, ' ', (byte) -1, ' ' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        int[] intArray2 = new int[] { (short) 10, (-1) };
        int[] intArray5 = new int[] { (short) 10, (-1) };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        int[] intArray5 = new int[] { (short) 100, (byte) 0, 10, (short) 100, 'a' };
        int[] intArray11 = new int[] { (short) 100, (byte) 0, 10, (short) 100, 'a' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 10, 100, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 10, 100, 97]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        int[] intArray2 = new int[] { (short) 0, 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        int[] intArray6 = new int[] { (short) 0, (-1), 'a', (short) 0, '4', (short) 100 };
        int[] intArray13 = new int[] { (short) 0, (-1), 'a', (short) 0, '4', (short) 100 };
        int[] intArray20 = new int[] { (short) 0, (-1), 'a', (short) 0, '4', (short) 100 };
        int[] intArray27 = new int[] { (short) 0, (-1), 'a', (short) 0, '4', (short) 100 };
        int[] intArray34 = new int[] { (short) 0, (-1), 'a', (short) 0, '4', (short) 100 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 97, 0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 97, 0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, 97, 0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, -1, 97, 0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, -1, 97, 0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        int[] intArray3 = new int[] { (byte) 10, 10, (-1) };
        int[] intArray7 = new int[] { (byte) 10, 10, (-1) };
        int[] intArray11 = new int[] { (byte) 10, 10, (-1) };
        int[] intArray15 = new int[] { (byte) 10, 10, (-1) };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        int[] intArray3 = new int[] { (byte) 1, (short) 10, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 1, (short) 10, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 1, (short) 10, (byte) 100 };
        int[] intArray15 = new int[] { (byte) 1, (short) 10, (byte) 100 };
        int[] intArray19 = new int[] { (byte) 1, (short) 10, (byte) 100 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 10, 1);
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
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        int[] intArray5 = new int[] { (byte) 0, ' ', 'a', (short) 100, 1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, 97, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 10, (-1));
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
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) 'a', 0);
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
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        int[] intArray2 = new int[] { (byte) 0, 10 };
        int[] intArray5 = new int[] { (byte) 0, 10 };
        int[] intArray8 = new int[] { (byte) 0, 10 };
        int[] intArray11 = new int[] { (byte) 0, 10 };
        int[] intArray14 = new int[] { (byte) 0, 10 };
        int[] intArray17 = new int[] { (byte) 0, 10 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        int[] intArray3 = new int[] { (short) -1, (byte) 10, 100 };
        int[] intArray7 = new int[] { (short) -1, (byte) 10, 100 };
        int[] intArray11 = new int[] { (short) -1, (byte) 10, 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        int[] intArray4 = new int[] { (byte) 1, 'a', '4', 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 97, 52, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        int[] intArray6 = new int[] { '#', (short) 100, (byte) 1, 10, 1, 100 };
        int[] intArray13 = new int[] { '#', (short) 100, (byte) 1, 10, 1, 100 };
        int[] intArray20 = new int[] { '#', (short) 100, (byte) 1, 10, 1, 100 };
        int[] intArray27 = new int[] { '#', (short) 100, (byte) 1, 10, 1, 100 };
        int[] intArray34 = new int[] { '#', (short) 100, (byte) 1, 10, 1, 100 };
        int[] intArray41 = new int[] { '#', (short) 100, (byte) 1, 10, 1, 100 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 100, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 100, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 100, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 100, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 100, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 100, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 0, (int) (short) 100);
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
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        int[] intArray1 = new int[] { 'a' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        int[] intArray6 = new int[] { 'a', (short) -1, (short) -1, (short) -1, (byte) 1, (byte) 1 };
        int[] intArray13 = new int[] { 'a', (short) -1, (short) -1, (short) -1, (byte) 1, (byte) 1 };
        int[] intArray20 = new int[] { 'a', (short) -1, (short) -1, (short) -1, (byte) 1, (byte) 1 };
        int[] intArray27 = new int[] { 'a', (short) -1, (short) -1, (short) -1, (byte) 1, (byte) 1 };
        int[] intArray34 = new int[] { 'a', (short) -1, (short) -1, (short) -1, (byte) 1, (byte) 1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, -1, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, -1, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, -1, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, -1, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, -1, -1, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        int[] intArray1 = new int[] { (short) 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray5 = new int[] { 10, '#' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        int[] intArray6 = new int[] { (short) 100, (short) -1, 'a', (byte) -1, ' ', (short) -1 };
        int[] intArray13 = new int[] { (short) 100, (short) -1, 'a', (byte) -1, ' ', (short) -1 };
        int[] intArray20 = new int[] { (short) 100, (short) -1, 'a', (byte) -1, ' ', (short) -1 };
        int[] intArray27 = new int[] { (short) 100, (short) -1, 'a', (byte) -1, ' ', (short) -1 };
        int[] intArray34 = new int[] { (short) 100, (short) -1, 'a', (byte) -1, ' ', (short) -1 };
        int[] intArray41 = new int[] { (short) 100, (short) -1, 'a', (byte) -1, ' ', (short) -1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 97, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 97, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 97, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, -1, 97, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, -1, 97, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, -1, 97, -1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        int[] intArray5 = new int[] { 100, (short) 10, 10, 10, (byte) 100 };
        int[] intArray11 = new int[] { 100, (short) 10, 10, 10, (byte) 100 };
        int[] intArray17 = new int[] { 100, (short) 10, 10, 10, (byte) 100 };
        int[] intArray23 = new int[] { 100, (short) 10, 10, 10, (byte) 100 };
        int[] intArray29 = new int[] { 100, (short) 10, 10, 10, (byte) 100 };
        int[] intArray35 = new int[] { 100, (short) 10, 10, 10, (byte) 100 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 10, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 10, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        int[] intArray1 = new int[] { (byte) 10 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        int[] intArray3 = new int[] { 0, 0, '4' };
        int[] intArray7 = new int[] { 0, 0, '4' };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 52]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        int[] intArray3 = new int[] { (byte) 0, (short) 100, (short) 10 };
        int[] intArray7 = new int[] { (byte) 0, (short) 100, (short) 10 };
        int[] intArray11 = new int[] { (byte) 0, (short) 100, (short) 10 };
        int[] intArray15 = new int[] { (byte) 0, (short) 100, (short) 10 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        int[] intArray3 = new int[] { ' ', (short) 100, 0 };
        int[] intArray7 = new int[] { ' ', (short) 100, 0 };
        int[] intArray11 = new int[] { ' ', (short) 100, 0 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        int[] intArray2 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 100, (byte) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, 0, 0);
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
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        int[] intArray5 = new int[] { (short) -1, (byte) -1, '#', (byte) 100, ' ' };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, '#', (byte) 100, ' ' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        int[] intArray3 = new int[] { 100, ' ', (byte) 1 };
        int[] intArray7 = new int[] { 100, ' ', (byte) 1 };
        int[] intArray11 = new int[] { 100, ' ', (byte) 1 };
        int[] intArray15 = new int[] { 100, ' ', (byte) 1 };
        int[] intArray19 = new int[] { 100, ' ', (byte) 1 };
        int[] intArray23 = new int[] { 100, ' ', (byte) 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) '#', 0);
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
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, 100 };
        int[] intArray7 = new int[] { (short) 1, (byte) -1, 100 };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, 100 };
        int[] intArray15 = new int[] { (short) 1, (byte) -1, 100 };
        int[] intArray19 = new int[] { (short) 1, (byte) -1, 100 };
        int[] intArray23 = new int[] { (short) 1, (byte) -1, 100 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        int[] intArray3 = new int[] { (byte) 1, 'a', (-1) };
        int[] intArray7 = new int[] { (byte) 1, 'a', (-1) };
        int[] intArray11 = new int[] { (byte) 1, 'a', (-1) };
        int[] intArray15 = new int[] { (byte) 1, 'a', (-1) };
        int[] intArray19 = new int[] { (byte) 1, 'a', (-1) };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 97, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 97, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 97, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 97, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = new int[] { 100 };
        int[] intArray9 = new int[] { 100 };
        int[] intArray11 = new int[] { 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 1, 0);
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
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        int[] intArray3 = new int[] { (-1), (byte) 10, (byte) -1 };
        int[] intArray7 = new int[] { (-1), (byte) 10, (byte) -1 };
        int[] intArray11 = new int[] { (-1), (byte) 10, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        int[] intArray4 = new int[] { (byte) 10, (short) 100, (byte) 10, 100 };
        int[] intArray9 = new int[] { (byte) 10, (short) 100, (byte) 10, 100 };
        int[] intArray14 = new int[] { (byte) 10, (short) 100, (byte) 10, 100 };
        int[] intArray19 = new int[] { (byte) 10, (short) 100, (byte) 10, 100 };
        int[] intArray24 = new int[] { (byte) 10, (short) 100, (byte) 10, 100 };
        int[] intArray29 = new int[] { (byte) 10, (short) 100, (byte) 10, 100 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 100, 10, 100]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        int[] intArray3 = new int[] { 'a', (byte) 100, 1 };
        int[] intArray7 = new int[] { 'a', (byte) 100, 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        int[] intArray6 = new int[] { 'a', 1, (short) 1, 100, (byte) 10, (byte) 10 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        int[] intArray5 = new int[] { (short) 100, '#', (byte) -1, '4', (byte) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 52, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) 'a', (int) (short) -1);
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
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 1, (int) 'a');
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
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        int[] intArray2 = new int[] { (byte) 100, 1 };
        int[] intArray5 = new int[] { (byte) 100, 1 };
        int[] intArray8 = new int[] { (byte) 100, 1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int[] intArray5 = new int[] { (-1), (short) 100 };
        int[] intArray8 = new int[] { (-1), (short) 100 };
        int[] intArray11 = new int[] { (-1), (short) 100 };
        int[] intArray14 = new int[] { (-1), (short) 100 };
        int[] intArray17 = new int[] { (-1), (short) 100 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        int[] intArray4 = new int[] { (short) 100, ' ', (short) 10, (byte) 10 };
        int[] intArray9 = new int[] { (short) 100, ' ', (short) 10, (byte) 10 };
        int[] intArray14 = new int[] { (short) 100, ' ', (short) 10, (byte) 10 };
        int[] intArray19 = new int[] { (short) 100, ' ', (short) 10, (byte) 10 };
        int[] intArray24 = new int[] { (short) 100, ' ', (short) 10, (byte) 10 };
        int[] intArray29 = new int[] { (short) 100, ' ', (short) 10, (byte) 10 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 32, 10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 32, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) '#', (int) (short) 10);
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
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        int[] intArray6 = new int[] { 10, (short) 100, (byte) 10, 10, (short) 0, (short) -1 };
        int[] intArray13 = new int[] { 10, (short) 100, (byte) 10, 10, (short) 0, (short) -1 };
        int[] intArray20 = new int[] { 10, (short) 100, (byte) 10, 10, (short) 0, (short) -1 };
        int[] intArray27 = new int[] { 10, (short) 100, (byte) 10, 10, (short) 0, (short) -1 };
        int[] intArray34 = new int[] { 10, (short) 100, (byte) 10, 10, (short) 0, (short) -1 };
        int[] intArray41 = new int[] { 10, (short) 100, (byte) 10, 10, (short) 0, (short) -1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 10, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 10, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 100, 10, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 100, 10, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 100, 10, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 100, 10, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        int[] intArray3 = new int[] { 100, (byte) 100, (byte) 100 };
        int[] intArray7 = new int[] { 100, (byte) 100, (byte) 100 };
        int[] intArray11 = new int[] { 100, (byte) 100, (byte) 100 };
        int[] intArray15 = new int[] { 100, (byte) 100, (byte) 100 };
        int[] intArray19 = new int[] { 100, (byte) 100, (byte) 100 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        int[] intArray4 = new int[] { (-1), 0, 'a', (byte) 0 };
        int[] intArray9 = new int[] { (-1), 0, 'a', (byte) 0 };
        int[] intArray14 = new int[] { (-1), 0, 'a', (byte) 0 };
        int[] intArray19 = new int[] { (-1), 0, 'a', (byte) 0 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 97, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 0, 97, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 97, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 0, 97, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        int[] intArray4 = new int[] { (short) 0, (short) 0, (short) 1, (short) 100 };
        int[] intArray9 = new int[] { (short) 0, (short) 0, (short) 1, (short) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        int[] intArray6 = new int[] { ' ', 'a', (byte) -1, (byte) 0, (short) 0, '#' };
        int[] intArray13 = new int[] { ' ', 'a', (byte) -1, (byte) 0, (short) 0, '#' };
        int[] intArray20 = new int[] { ' ', 'a', (byte) -1, (byte) 0, (short) 0, '#' };
        int[] intArray27 = new int[] { ' ', 'a', (byte) -1, (byte) 0, (short) 0, '#' };
        int[] intArray34 = new int[] { ' ', 'a', (byte) -1, (byte) 0, (short) 0, '#' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 97, -1, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 97, -1, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 97, -1, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 97, -1, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 97, -1, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) ' ', (int) 'a');
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
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        int[] intArray3 = new int[] { (short) -1, (short) 10, (short) 10 };
        int[] intArray7 = new int[] { (short) -1, (short) 10, (short) 10 };
        int[] intArray11 = new int[] { (short) -1, (short) 10, (short) 10 };
        int[] intArray15 = new int[] { (short) -1, (short) 10, (short) 10 };
        int[] intArray19 = new int[] { (short) -1, (short) 10, (short) 10 };
        int[] intArray23 = new int[] { (short) -1, (short) 10, (short) 10 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        int[] intArray6 = new int[] { 'a', (-1), (byte) 0, '4', (byte) 100, 100 };
        int[] intArray13 = new int[] { 'a', (-1), (byte) 0, '4', (byte) 100, 100 };
        int[] intArray20 = new int[] { 'a', (-1), (byte) 0, '4', (byte) 100, 100 };
        int[] intArray27 = new int[] { 'a', (-1), (byte) 0, '4', (byte) 100, 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 0, 52, 100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 0, 52, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 0, 52, 100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 0, 52, 100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        int[] intArray3 = new int[] { (byte) 1, (byte) 1, (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1, (byte) 1, (byte) 1 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1, (byte) 1 };
        int[] intArray15 = new int[] { (byte) 1, (byte) 1, (byte) 1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        int[] intArray2 = new int[] { (short) 0, (short) -1 };
        int[] intArray5 = new int[] { (short) 0, (short) -1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        int[] intArray3 = new int[] { 0, (short) 0, (byte) -1 };
        int[] intArray7 = new int[] { 0, (short) 0, (byte) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        int[] intArray1 = new int[] { ' ' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        int[] intArray5 = new int[] { 10, (short) -1, (-1), 0, (byte) 0 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        int[] intArray4 = new int[] { '#', '#', (byte) 1, (byte) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 35, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { (byte) 0 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '4', (int) (short) 10);
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
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        int[] intArray4 = new int[] { (byte) 1, (short) 1, (byte) -1, (short) 10 };
        int[] intArray9 = new int[] { (byte) 1, (short) 1, (byte) -1, (short) 10 };
        int[] intArray14 = new int[] { (byte) 1, (short) 1, (byte) -1, (short) 10 };
        int[] intArray19 = new int[] { (byte) 1, (short) 1, (byte) -1, (short) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        int[] intArray5 = new int[] { '4', (-1), (short) 10, 0, 10 };
        int[] intArray11 = new int[] { '4', (-1), (short) 10, 0, 10 };
        int[] intArray17 = new int[] { '4', (-1), (short) 10, 0, 10 };
        int[] intArray23 = new int[] { '4', (-1), (short) 10, 0, 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, -1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, -1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, -1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        int[] intArray4 = new int[] { (byte) 0, 0, 1, 1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        int[] intArray6 = new int[] { 0, 0, (byte) 100, 0, (-1), (byte) 100 };
        int[] intArray13 = new int[] { 0, 0, (byte) 100, 0, (-1), (byte) 100 };
        int[] intArray20 = new int[] { 0, 0, (byte) 100, 0, (-1), (byte) 100 };
        int[] intArray27 = new int[] { 0, 0, (byte) 100, 0, (-1), (byte) 100 };
        int[] intArray34 = new int[] { 0, 0, (byte) 100, 0, (-1), (byte) 100 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 100, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        int[] intArray6 = new int[] { 100, 'a', 100, (short) 1, '#', (byte) 0 };
        int[] intArray13 = new int[] { 100, 'a', 100, (short) 1, '#', (byte) 0 };
        int[] intArray20 = new int[] { 100, 'a', 100, (short) 1, '#', (byte) 0 };
        int[] intArray27 = new int[] { 100, 'a', 100, (short) 1, '#', (byte) 0 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 97, 100, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 97, 100, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 97, 100, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 97, 100, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        int[] intArray2 = new int[] { (byte) 1, 0 };
        int[] intArray5 = new int[] { (byte) 1, 0 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        int[] intArray5 = new int[] { ' ', (short) 10, 10, (short) 10, (short) -1 };
        int[] intArray11 = new int[] { ' ', (short) 10, 10, (short) 10, (short) -1 };
        int[] intArray17 = new int[] { ' ', (short) 10, 10, (short) 10, (short) -1 };
        int[] intArray23 = new int[] { ' ', (short) 10, 10, (short) 10, (short) -1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 100, 0);
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
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        int[] intArray4 = new int[] { (short) 100, (byte) -1, 10, ' ' };
        int[] intArray9 = new int[] { (short) 100, (byte) -1, 10, ' ' };
        int[] intArray14 = new int[] { (short) 100, (byte) -1, 10, ' ' };
        int[] intArray19 = new int[] { (short) 100, (byte) -1, 10, ' ' };
        int[] intArray24 = new int[] { (short) 100, (byte) -1, 10, ' ' };
        int[] intArray29 = new int[] { (short) 100, (byte) -1, 10, ' ' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, -1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, -1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, -1, 10, 32]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        int[] intArray5 = new int[] { (short) 10, '#', (byte) 1, (short) 10, (short) 10 };
        int[] intArray11 = new int[] { (short) 10, '#', (byte) 1, (short) 10, (short) 10 };
        int[] intArray17 = new int[] { (short) 10, '#', (byte) 1, (short) 10, (short) 10 };
        int[] intArray23 = new int[] { (short) 10, '#', (byte) 1, (short) 10, (short) 10 };
        int[] intArray29 = new int[] { (short) 10, '#', (byte) 1, (short) 10, (short) 10 };
        int[] intArray35 = new int[] { (short) 10, '#', (byte) 1, (short) 10, (short) 10 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 35, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 35, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 35, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 35, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 35, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        int[] intArray5 = new int[] { 'a', (short) 1, 100, '4', (short) 1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1, 100, 52, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        int[] intArray4 = new int[] { (short) 1, '#', (short) 100, ' ' };
        int[] intArray9 = new int[] { (short) 1, '#', (short) 100, ' ' };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        int[] intArray2 = new int[] { (short) -1, (short) 0 };
        int[] intArray5 = new int[] { (short) -1, (short) 0 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        int[] intArray4 = new int[] { (-1), (byte) 0, 0, (byte) 10 };
        int[] intArray9 = new int[] { (-1), (byte) 0, 0, (byte) 10 };
        int[] intArray14 = new int[] { (-1), (byte) 0, 0, (byte) 10 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 1, (int) (short) 10);
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
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        int[] intArray5 = new int[] { (short) 1, (short) 1, (short) 1, 100, '#' };
        int[] intArray11 = new int[] { (short) 1, (short) 1, (short) 1, 100, '#' };
        int[] intArray17 = new int[] { (short) 1, (short) 1, (short) 1, 100, '#' };
        int[] intArray23 = new int[] { (short) 1, (short) 1, (short) 1, 100, '#' };
        int[] intArray29 = new int[] { (short) 1, (short) 1, (short) 1, 100, '#' };
        int[] intArray35 = new int[] { (short) 1, (short) 1, (short) 1, 100, '#' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, 1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1, 1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 1, 100, 35]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        int[] intArray5 = new int[] { 'a', 0, 100, '4', 10 };
        int[] intArray11 = new int[] { 'a', 0, 100, '4', 10 };
        int[] intArray17 = new int[] { 'a', 0, 100, '4', 10 };
        int[] intArray23 = new int[] { 'a', 0, 100, '4', 10 };
        int[] intArray29 = new int[] { 'a', 0, 100, '4', 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 100, 52, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        int[] intArray9 = new int[] { (short) 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 1, (int) (short) 100);
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
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray5 = new int[] { '#', (short) 100 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, '#', 0, 1 };
        int[] intArray11 = new int[] { (short) 100, (byte) 10, '#', 0, 1 };
        int[] intArray17 = new int[] { (short) 100, (byte) 10, '#', 0, 1 };
        int[] intArray23 = new int[] { (short) 100, (byte) 10, '#', 0, 1 };
        int[] intArray29 = new int[] { (short) 100, (byte) 10, '#', 0, 1 };
        int[] intArray35 = new int[] { (short) 100, (byte) 10, '#', 0, 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 10, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 10, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 10, (int) (short) 10);
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
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        int[] intArray4 = new int[] { (short) 100, 'a', 'a', (short) 0 };
        int[] intArray9 = new int[] { (short) 100, 'a', 'a', (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 97, 97, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 97, 97, 0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        int[] intArray3 = new int[] { (-1), 10, 1 };
        int[] intArray7 = new int[] { (-1), 10, 1 };
        int[] intArray11 = new int[] { (-1), 10, 1 };
        int[] intArray15 = new int[] { (-1), 10, 1 };
        int[] intArray19 = new int[] { (-1), 10, 1 };
        int[] intArray23 = new int[] { (-1), 10, 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        int[] intArray5 = new int[] { 10 };
        int[] intArray7 = new int[] { 10 };
        int[] intArray9 = new int[] { 10 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) '4', 1);
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
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        int[] intArray2 = new int[] { 0, 100 };
        int[] intArray5 = new int[] { 0, 100 };
        int[] intArray8 = new int[] { 0, 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (byte) 1, (int) 'a');
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
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, (short) 0, (short) -1, 10, (-1) };
        int[] intArray13 = new int[] { (byte) 100, (short) 100, (short) 0, (short) -1, 10, (-1) };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, 0, -1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, (short) 10, (short) 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) -1, (short) 0, (short) 10, (short) 10, (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 0, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, ' ', (-1), '#' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 32, -1, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        int[] intArray5 = new int[] { (short) 1, ' ', (byte) 0, (short) -1, 100 };
        int[] intArray11 = new int[] { (short) 1, ' ', (byte) 0, (short) -1, 100 };
        int[] intArray17 = new int[] { (short) 1, ' ', (byte) 0, (short) -1, 100 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 32, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 32, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        int[] intArray5 = new int[] { '#', (byte) 1, (byte) 10, (short) 100, (-1) };
        int[] intArray11 = new int[] { '#', (byte) 1, (byte) 10, (short) 100, (-1) };
        int[] intArray17 = new int[] { '#', (byte) 1, (byte) 10, (short) 100, (-1) };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) -1, 10);
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
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        int[] intArray5 = new int[] { 'a', 100, (byte) 10, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 'a', 100, (byte) 10, (short) 1, (byte) 100 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        int[] intArray3 = new int[] { (byte) 10, (short) 0, 100 };
        int[] intArray7 = new int[] { (byte) 10, (short) 0, 100 };
        int[] intArray11 = new int[] { (byte) 10, (short) 0, 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        int[] intArray2 = new int[] { 0, (short) -1 };
        int[] intArray5 = new int[] { 0, (short) -1 };
        int[] intArray8 = new int[] { 0, (short) -1 };
        int[] intArray11 = new int[] { 0, (short) -1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 1, (-1));
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
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        int[] intArray4 = new int[] { (-1), 1, ' ', (-1) };
        int[] intArray9 = new int[] { (-1), 1, ' ', (-1) };
        int[] intArray14 = new int[] { (-1), 1, ' ', (-1) };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        int[] intArray4 = new int[] { (byte) 0, (byte) 1, (byte) 10, (short) 100 };
        int[] intArray9 = new int[] { (byte) 0, (byte) 1, (byte) 10, (short) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        int[] intArray1 = new int[] { 'a' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        int[] intArray6 = new int[] { 0, 100, (byte) 10, (-1), (short) 100, 'a' };
        int[] intArray13 = new int[] { 0, 100, (byte) 10, (-1), (short) 100, 'a' };
        int[] intArray20 = new int[] { 0, 100, (byte) 10, (-1), (short) 100, 'a' };
        int[] intArray27 = new int[] { 0, 100, (byte) 10, (-1), (short) 100, 'a' };
        int[] intArray34 = new int[] { 0, 100, (byte) 10, (-1), (short) 100, 'a' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 10, -1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 10, -1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, 10, -1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 100, 10, -1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 100, 10, -1, 100, 97]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        int[] intArray3 = new int[] { 1, (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { 1, (byte) -1, (byte) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[] intArray5 = new int[] { 0 };
        int[] intArray7 = new int[] { 0 };
        int[] intArray9 = new int[] { 0 };
        int[] intArray11 = new int[] { 0 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) 'a', (int) '4');
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
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        int[] intArray2 = new int[] { (byte) 1, (byte) 0 };
        int[] intArray5 = new int[] { (byte) 1, (byte) 0 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) -1, 0);
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
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        int[] intArray4 = new int[] { 'a', 100, (short) 10, 0 };
        int[] intArray9 = new int[] { 'a', 100, (short) 10, 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        int[] intArray1 = new int[] { '#' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray2);
    }
}

